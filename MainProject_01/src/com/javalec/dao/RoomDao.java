package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.dto.CabinetDto;
import com.javalec.util.ShareVar;

public class RoomDao {

	// Field
	String productid = ShareVar.id;
	private final String url_mysql = ShareVar.DBNAME;
	private final String id_mysql = ShareVar.DBUSER;
	private final String pw_mysql = ShareVar.DBPASS;
	
	
	
	
	
	
	// Constructor
	public RoomDao() {
		// TODO Auto-generated constructor stub
	}
	

	
	// Method
	
	public int getRoomStatus() {

		int roomStatus = 0;
		String query = "select status from product where productid = 'StudyRoom01';" ;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				roomStatus = rs.getInt(1);
			}
			conn_mysql.close(); // 다른 사람도 사용할 수 있게끔 DB접근을 종료한다!
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roomStatus;
	}
	
	public ArrayList<CabinetDto> getRoomPriceTable() {
		ArrayList<CabinetDto> RoomDtos = new ArrayList<>();
        
		String query = "SELECT pricecategory, timeprice, calctime FROM pricetable Where pricecategory like 'Room%' ORDER BY calctime ASC";
        try {

            // 데이터베이스 연결
            Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();

            // PreparedStatement 생성
			ResultSet rs = stmt_mysql.executeQuery(query);

            while (rs.next()) {
                // 각 컬럼에서 데이터 추출
                String priceCategory = rs.getString(1);
                int timeprice = rs.getInt(2);
                int calctime = rs.getInt(3);

                // CabinetDto 객체 생성
                CabinetDto cabinetDto = new CabinetDto(priceCategory, timeprice, calctime);

                // ArrayList에 CabinetDto 객체 추가
                RoomDtos.add(cabinetDto);
            }

            conn_mysql.close(); // 다른 사람도 사용할 수 있게끔 DB접근을 종료한다!
        } catch (Exception e) {
            e.printStackTrace();
        }

        return RoomDtos;
    }

}
