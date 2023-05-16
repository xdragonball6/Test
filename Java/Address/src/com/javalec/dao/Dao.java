package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.javalec.dto.Dto;
import com.javalec.util.ShareVar;

public class Dao {

	// Field
	
	private final String url_mysql = ShareVar.DBName;
	private final String id_mysql = ShareVar.DBUser;
	private final String pw_mysql = ShareVar.DBPass;
	
	int seqno;
	String name;
	String telno;
	String address;
	String email;
	String relation;
	String conname;
	String codata;
	
	
	
	// Constructor
	public Dao() {
		// TODO Auto-generated constructor stub
	}

	public Dao(int seqno, String name, String telno, String relation) { //화면에 띄울것들만 적어준다.
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.relation = relation;
	}
	
	public Dao(String name, String telno, String address, String email, String relation) { // 이건 입력할때 사용하는 Constructor
		super();
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}

	public Dao(int seqno) {
		super();
		this.seqno = seqno;
	}
	
	
	
	

	public Dao(int seqno, String name, String telno, String address, String email, String relation) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
	}

	
	
	
	
	
	public Dao(String coname, String codata) {
		super();
		this.conname = coname;
		this.codata = codata;
	}

	// Method
	// 초기화면 검색 결과를 Table에서 불러오자

	public ArrayList<Dto> selectList(){ //화면에 무엇을 띄울지 배열로 함수를 정한거다.
		ArrayList<Dto> dtoList = new ArrayList<Dto>(); //Dto에서 받은 값을 dtoList라는 배열로 만들어주겠다는것이다.
		
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); 
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			while(rs.next()) { //읽을게 있으면 계속하고 그게 아니면 빠져나온다.
				int wkSeq= rs.getInt(1);
				String wkName=rs.getString(2);
				String wkTelno=rs.getString(3);
				String wkRelation=rs.getString(4);
				Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation); // Dto에 있는 constructor를 이용해 한번에 묶어주고
				dtoList.add(dto); //dtoList 배열에 넣어준것이다.
			}
			conn_mysql.close(); // 메소드를 호출하여 Statement 오브젝트를 닫으십시오. close를 해줘야 다른 사용자가 등록이 가능
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			}
		
		return dtoList; //반드시 return을 넣어줘야한다. 나를 부른놈에게 dtoList를 주겠다는 의미를 가지고 있다.
	}
	//dtoList.size 를 치면 몇개가 있는지 알 수 있다.
	
	public boolean insertAction() {  //boolean으로 해준 이유는 제대로 돌아가는지 확인하기 위한 작업
		PreparedStatement ps = null; // 자바 connector에 있는거, 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); 
			Statement stmt_mysql = conn_mysql.createStatement(); // 내 자바가 위에 url과 아이디 패스워드를 타고 useradress에 접근했다. 를 뜻한다.
			
			String query = "insert into userinfo (name, telno, address, email, relation)";
			String query1 = " values (?, ?, ?, ?, ?)"; // 한칸 띄고 시작하지 않으면 MySQL에서 에러가 뜬다.
			
			ps = conn_mysql.prepareStatement(query + query1); 
			ps.setString(1, name.trim()); // 전역 변수
			ps.setString(2, telno.trim());
			ps.setString(3, address.trim());
			ps.setString(4, email.trim());
			ps.setString(5, relation.trim());
			
			
			ps.executeUpdate(); 
			conn_mysql.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			return false;
			}
			return true;
			}
	
	public boolean deleteAction() { //눌렀을때 순서부터 정해. 1.데이터 베이스에서 없애고, 2.Inner_Table값을 초기화 한 뒤에 3.밑에 tf~~값을 비워준다.
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "delete from userinfo where seqno = ?";
			
			ps = conn_mysql.prepareStatement(query);
			ps.setInt(1, seqno);
			ps.executeUpdate(); 
			conn_mysql.close(); 
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
			}
			return true;
			}
		
	
	public boolean updateAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			String query = "update userinfo set name = ?, telno = ?, address = ?, email = ?, relation = ?";
			String query1 = " where seqno = ?";
			ps = conn_mysql.prepareStatement(query+query1);
			ps.setString(1, name.trim());
			ps.setString(2, telno.trim());
			ps.setString(3, address.trim());
			ps.setString(4, email.trim());
			ps.setString(5, relation.trim());
			ps.setInt(6, seqno);
			ps.executeUpdate(); 
			
			conn_mysql.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			return false;
			}
			return true;
			}
	
	public Dto tableClick() {
		Dto dto = null; //먼저 데이터를 비워놓고.
		String whereDefault = "select seqno, name, telno, address, email, relation from userinfo";
		String whereDefault1 = " where seqno =" + seqno;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); 
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault1);
			
			if(rs.next()) { //읽을게 있으면 계속하고 그게 아니면 빠져나온다.
				int wkSeq= rs.getInt(1);
				String wkName=rs.getString(2);
				String wkTelno=rs.getString(3);
				String wkAddress=rs.getString(4);
				String wkEmail=rs.getString(5);
				String wkRelation=rs.getString(6);
				
				dto = new Dto(wkSeq, wkName, wkTelno, wkAddress, wkEmail, wkRelation); // 데이터가 있을때 생성자를 만들어
			}
			conn_mysql.close(); 
			
		}catch(Exception e) {
			e.printStackTrace(); 
			}
		
		return dto; 
	}
	
	
	public ArrayList<Dto> conditionList(){ //검색할 때 쓸 녀석 검색은 selectList와 굉장히 비슷한 양상을 띄고 있다.
		ArrayList<Dto> dtoList = new ArrayList<Dto>(); 
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		String whereDefault1 = " where " + conname + " like '%" + codata + "%'"; // conname과 codata는 위에서 field에서 따로 만들어서 사용자에 만들 사용해줌
																				// main에서 conname과 codata가 뭔지 선언할 때 따로 넣어주면 된다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); 
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault1);
			
			while(rs.next()) { //읽을게 있으면 계속하고 그게 아니면 빠져나온다.
				int wkSeq= rs.getInt(1);
				String wkName=rs.getString(2);
				String wkTelno=rs.getString(3);
				String wkRelation=rs.getString(4);
				Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation); // Dto에 있는 constructor를 이용해 한번에 묶어주고
				dtoList.add(dto); //dtoList 배열에 넣어준것이다.
			}
			conn_mysql.close(); // 메소드를 호출하여 Statement 오브젝트를 닫으십시오. close를 해줘야 다른 사용자가 등록이 가능
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			}
		
		return dtoList; //반드시 return을 넣어줘야한다.
	}
	
	
}
