package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tfName;
	private JTextField tfTelno;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	private JButton btnNewButton;

	// Database 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE"; 
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	//final은 절대로 바뀌지 않는 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("주소록 등록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTfName());
		contentPane.add(getTfTelno());
		contentPane.add(getTfAddress());
		contentPane.add(getTfEmail());
		contentPane.add(getTfRelation());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(28, 24, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setBounds(28, 55, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소 :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_2.setBounds(28, 90, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편 :");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_3.setBounds(28, 127, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("관계 :");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_4.setBounds(28, 166, 61, 16);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(96, 19, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(96, 50, 177, 26);
		}
		return tfTelno;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(96, 87, 294, 26);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(96, 123, 172, 26);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(96, 161, 294, 26);
		}
		return tfRelation;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("입력");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i_chk = insertFieldCheck();
					if(i_chk==0) { //i_chk이 0일때 이상이 없는거라서 실행하면 되는거 즉 0이 아닐때 실행 안되게 하면 된다.
					insertAction();
					}
				}
			});
			btnNewButton.setBounds(295, 199, 117, 29);
		}
		return btnNewButton;
	}
	// Function
	
	private int insertFieldCheck() {
		int i = 0;
		String message="";
		if(tfName.getText().trim().length()==0) { //적힌 이름의 길이가 0이면
			i++; //i를 계속 더해줘
			message="성명을 ";
			tfName.requestFocus(); //requetFocus의 역할은 위에가 실행 되었을 때 커서를 그 위치에 가져다 주는 역할을 한다.
		}
		if(tfTelno.getText().trim().length()==0) {
			i++;
			message="전화번호를 ";
			tfTelno.requestFocus();
		}
		if(tfAddress.getText().trim().length()==0) {
			i++;
			message="주소를 ";
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().trim().length()==0) {
			i++;
			message="전자우편을 ";
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().trim().length()==0) {
			i++;
			message="관계를 ";
			tfRelation.requestFocus();
		}
		
		if(i > 0) {
			JOptionPane.showMessageDialog(null, message+"확인하세요!");
		}
		
		
		return i; // 문제가 없으면 i가 0인 상태로 쭉 내려올것이다.
	}
	
	
	
	private void insertAction() { 
		PreparedStatement ps = null; // 자바 connector에 있는거, 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 라이브러리 안에 패키지를 불러 쓰는것
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); //여기서 쓰기 위해서 위에서 정의 해 둔 것이다.
			Statement stmt_mysql = conn_mysql.createStatement(); // 내 자바가 위에 url과 아이디 패스워드를 타고 useradress에 접근했다. 를 뜻한다.
			
			String query = "insert into userinfo (name, telno, address, email, relation)";
			String query1 = " values (?, ?, ?, ?, ?)"; // 한칸 띄고 시작하지 않으면 MySQL에서 에러가 뜬다.
			
			ps = conn_mysql.prepareStatement(query + query1); //위에는 선언자일 뿐이고 실행은 ps가 하는것이다.
			ps.setString(1, tfName.getText().trim()); // 위에 첫번째 칸에 이름을 넣는 역할을 함 
			ps.setString(2, tfTelno.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim()); //trim은 빈칸을 없애주는 역
			
			//위에까지는 이렇게 하겠다고 정의 내린거고
			ps.executeUpdate(); // ps 메소드를 호출하여 SQL 조작을 수행하십시오. 이걸 넣어야 정의내린걸 수행하는 역할을 한다.
			conn_mysql.close(); // 메소드를 호출하여 Statement 오브젝트를 닫으십시오. close를 해줘야 다른 사용자가 등록이 가능
			
			
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 입력 되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// End
