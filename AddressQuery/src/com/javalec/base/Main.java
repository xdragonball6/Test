package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqNo;
	private JLabel lblDlfma;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfName;
	private JTextField tfTelno;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	private JButton btnUpdate;
	private JButton btnDelete;

	// Database 환경 정의
		private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE"; 
		private final String id_mysql = "root";
		private final String pw_mysql = "qwer1234";
		private final DefaultTableModel Outer_Table = new DefaultTableModel(); //먼저 Outer_Table 을 선언해주고 밑에서 Inner_Table과 Outer_Table을 연결해줘야한다.
	
		
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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) { //Design에서 전체 클릭 후 activate 버튼을 누르고 window opened를 눌러준다. 이건 창이 떴을때 ~~해라 이럴때 쓴다.
				tableInit();
				searchAction();
			}
		});
		setTitle("주소록 수정 및 삭제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbSelection());
		contentPane.add(getTfSelection());
		contentPane.add(getBtnQuery());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfSeqNo());
		contentPane.add(getLblDlfma());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTfName());
		contentPane.add(getTfTelno());
		contentPane.add(getTfAddress());
		contentPane.add(getTfEmail());
		contentPane.add(getTfRelation());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnDelete());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setToolTipText("");
			cbSelection.setBounds(19, 31, 93, 25);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(111, 29, 156, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setBounds(283, 29, 117, 29);
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);
				}
			});
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 67, 371, 148);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) { // Inner_Table에 있는 무언가를 마우스로 클릭했을 때
					btnUpdate.setEnabled(true);
					btnDelete.setEnabled(true);
					tableClick();
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); // <<<<<<<<
		}
		return Inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sequence No");
			lblNewLabel.setBounds(48, 231, 86, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqNo() {
		if (tfSeqNo == null) {
			tfSeqNo = new JTextField();
			tfSeqNo.setEditable(false);
			tfSeqNo.setBounds(137, 226, 86, 26);
			tfSeqNo.setColumns(10);
		}
		return tfSeqNo;
	}
	private JLabel getLblDlfma() {
		if (lblDlfma == null) {
			lblDlfma = new JLabel("이름");
			lblDlfma.setBounds(48, 259, 86, 16);
		}
		return lblDlfma;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setBounds(48, 288, 86, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setBounds(48, 320, 86, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편");
			lblNewLabel_4.setBounds(48, 355, 86, 16);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계");
			lblNewLabel_5.setBounds(48, 395, 86, 16);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(137, 254, 130, 26);
		}
		return tfName;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setColumns(10);
			tfTelno.setBounds(137, 282, 130, 26);
		}
		return tfTelno;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(137, 315, 243, 26);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(137, 349, 243, 26);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(137, 387, 243, 26);
		}
		return tfRelation;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.setEnabled(false);
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					updateAction();
					tableInit();
					searchAction();
					clearColumn();
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);
				}
			});
			btnUpdate.setBounds(244, 464, 65, 29);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.setEnabled(false);
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteAction();
					tableInit();
					searchAction();
					clearColumn();
					btnUpdate.setEnabled(false);
					btnDelete.setEnabled(false);
				}
			});
			btnDelete.setForeground(Color.RED);
			btnDelete.setBounds(321, 464, 66, 29);
		}
		return btnDelete;
	}
	
	
	
	// Function
	
	private void tableInit() {
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount(); //Outer_Table에 몇개의 줄이 있는지
		for(int j=0; j<i; j++) {
			Outer_Table.removeRow(0); // 0 번째(첫번째) 있는걸 지운다 즉 모든 줄이 지워질때까지 계속 지운다. 
		}
		
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex = 0; //순서
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width); //폭을 30으로 정해준거다.
		
		
		vColIndex = 1; //이름
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 80;
		col.setPreferredWidth(width); 
		
		
		vColIndex = 2; //전화번호
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width); 
		
		vColIndex = 3; //관계
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width); 
		
		
		
	}
	
	private void searchAction() {
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 라이브러리 안에 패키지를 불러 쓰는것
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); //여기서 쓰기 위해서 위에서 정의 해 둔 것이다.
			Statement stmt_mysql = conn_mysql.createStatement(); // 내 자바가 위에 url과 아이디 패스워드를 타고 useradress에 접근했다. 를 뜻한다.
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault); //mysql에 데이터값을 가져온다.
			
			while(rs.next()) { //읽을게 있으면 계속하고 그게 아니면 빠져나온다.
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)}; //배열로 쭉 적어주고
				Outer_Table.addRow(qTxt); //한번에 seqno, name, telno, relation을 다 가져온다.
			}
			
			
			
			conn_mysql.close(); // 메소드를 호출하여 Statement 오브젝트를 닫으십시오. close를 해줘야 다른 사용자가 등록이 가능
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			}
	}
	
	private void tableClick() { // Inner_Table과 Outer_Table을 여기서 연결해준다
		int i = Inner_Table.getSelectedRow(); // 선택된 줄을 정수값으로 받기
		String wkSequence = (String) Inner_Table.getValueAt(i, 0); // i줄에 있는 0(즉 첫번째 값=순서)을 받아서 문자열로 바꾼다.
		//int도 가능하고 String도 가능하지만 보통 String으로 한다.
		
		String whereDefault = "select seqno, name, telno, address, email, relation from userinfo";
		String whereDefault1 = " where seqno = ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); 
			Statement stmt_mysql = conn_mysql.createStatement(); 
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault + whereDefault1+ wkSequence); 
			
			while(rs.next()) { 
				tfSeqNo.setText(rs.getString(1));
				tfName.setText(rs.getString(2));
				tfTelno.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
			}
			
			
			
			conn_mysql.close(); 
			
		}catch(Exception e) {
			e.printStackTrace(); 
			}
	}
	
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex(); //combobox에서 선택한걸 정수로 알려줌 ex)이름=0, 주소=1, 관계=2
		String conditionQueryColumn = "";
		switch(i) {
		case 0: //만약 콤보값에 0 즉 이름을 누르면 밑에가 실행되게 한다.
			conditionQueryColumn ="name";
			break; // break로 빠져나와야한다.
		case 1:
			conditionQueryColumn = "address";
			break;
		case 2:
			conditionQueryColumn= "relation";
			break;
		default:
			break;
		}
		
		tableInit(); //위에있는 tableInit을 실행 시킨다.
		clearColumn(); //밑에 clearCoulumn을 생성하고 선언한다.
		conditionQueryAction(conditionQueryColumn);
	}
	
	private void clearColumn() { //검색할 때는 Inner_Table값을 초기화 시켜주기 위해서 ""로 비워준다.
		tfSeqNo.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	private void conditionQueryAction(String conditionQueryColumn) { //
		String whereDefault = "select seqno, name, telno, relation from userinfo";
		String whereDefault1 = " where " + conditionQueryColumn + " like '%" + tfSelection.getText()+ "%'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); 
			Statement stmt_mysql = conn_mysql.createStatement(); 
			
			ResultSet rs = stmt_mysql.executeQuery(whereDefault + whereDefault1);
			
			while(rs.next()) { 
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt); 
			}
			
			
			
			conn_mysql.close(); 
			
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	private void deleteAction() { //눌렀을때 순서부터 정해. 1.데이터 베이스에서 없애고, 2.Inner_Table값을 초기화 한 뒤에 3.밑에 tf~~값을 비워준다.
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "delete from userinfo where seqno = ?";
			
			ps = conn_mysql.prepareStatement(query);
			ps.setInt(1, Integer.parseInt(tfSeqNo.getText()));
			ps.executeUpdate(); 
			conn_mysql.close(); 
			
			
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 삭제 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		
	}
	
	private void updateAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			String query = "update userinfo set name = ?, telno = ?, address = ?, email = ?, relation = ?";
			String query1 = " where seqno = ?";
			ps = conn_mysql.prepareStatement(query+query1);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelno.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.setInt(6, Integer.parseInt(tfSeqNo.getText()));
			ps.executeUpdate(); 
			
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText()+"님의 정보가 수정 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace(); // 개발할때만 쓰는 녀석이다. 에러가 뭐가 있는지 쭉 뜨는 녀석
			}
	}
	
	
	
	
	
	

} // End
