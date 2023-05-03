package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.javalec.dao.Dao;
import com.javalec.dto.Dto;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbInsert;
	private JRadioButton rbUpdate;
	private JRadioButton rbDelete;
	private JRadioButton rbQuery;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JTextField tfSeqno;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfName;
	private JTextField tfTelno;
	private JTextField tfEmail;
	private JTextField tfAddress;
	private JTextField tfRelation;
	private JButton btnOK;
	private JScrollPane scrollPane;
	private JTable innerTable;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_6;
	private JTextField tfCount;

	
	
	// Table
		private final DefaultTableModel outerTable = new DefaultTableModel();
		String message="";
		private Object clearColumn;
	
	
	
	
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
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
				screenPartition();
			}
		});
		setTitle("주소록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbInsert());
		contentPane.add(getRbUpdate());
		contentPane.add(getRbDelete());
		contentPane.add(getRbQuery());
		contentPane.add(getCbSelection());
		contentPane.add(getTfSelection());
		contentPane.add(getBtnQuery());
		contentPane.add(getTfSeqno());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTfName());
		contentPane.add(getTfTelno());
		contentPane.add(getTfEmail());
		contentPane.add(getTfAddress());
		contentPane.add(getTfRelation());
		contentPane.add(getBtnOK());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getTfCount());
	}
	private JRadioButton getRbInsert() {
		if (rbInsert == null) {
			rbInsert = new JRadioButton("입력");
			rbInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			buttonGroup.add(rbInsert);
			rbInsert.setBounds(21, 18, 60, 23);
		}
		return rbInsert;
	}
	private JRadioButton getRbUpdate() {
		if (rbUpdate == null) {
			rbUpdate = new JRadioButton("수정");
			rbUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			buttonGroup.add(rbUpdate);
			rbUpdate.setBounds(82, 18, 60, 23);
		}
		return rbUpdate;
	}
	private JRadioButton getRbDelete() {
		if (rbDelete == null) {
			rbDelete = new JRadioButton("삭제");
			rbDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			buttonGroup.add(rbDelete);
			rbDelete.setBounds(143, 18, 60, 23);
		}
		return rbDelete;
	}
	private JRadioButton getRbQuery() {
		if (rbQuery == null) {
			rbQuery = new JRadioButton("검색");
			rbQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbQuery.setSelected(true);
			buttonGroup.add(rbQuery);
			rbQuery.setBounds(205, 18, 60, 23);
		}
		return rbQuery;
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(25, 53, 73, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(104, 52, 191, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setEnabled(false);
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnQuery.setBounds(307, 52, 88, 29);
		}
		return btnQuery;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(125, 239, 54, 26);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq NO :");
			lblNewLabel.setBounds(31, 244, 54, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(31, 278, 91, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(31, 311, 91, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(31, 345, 91, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(31, 379, 91, 16);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setBounds(31, 413, 91, 16);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(125, 273, 99, 26);
		}
		return tfName;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setColumns(10);
			tfTelno.setBounds(125, 306, 140, 26);
		}
		return tfTelno;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(125, 374, 172, 26);
		}
		return tfEmail;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setColumns(10);
			tfAddress.setBounds(125, 340, 270, 26);
		}
		return tfAddress;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setColumns(10);
			tfRelation.setBounds(125, 408, 270, 26);
		}
		return tfRelation;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPartition();
				}
			});
			btnOK.setEnabled(false);
			btnOK.setBounds(278, 446, 117, 29);
		}
		return btnOK;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 92, 366, 135);
			scrollPane.setViewportView(getInnerTable());
		}
		return scrollPane;
	}
	private JTable getInnerTable() {
		if (innerTable == null) {
			innerTable = new JTable();
			innerTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			innerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			innerTable.setModel(outerTable);
		}
		return innerTable;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Count :");
			lblNewLabel_6.setBounds(232, 241, 61, 16);
		}
		return lblNewLabel_6;
	}
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setEditable(false);
			tfCount.setHorizontalAlignment(SwingConstants.TRAILING);
			tfCount.setColumns(10);
			tfCount.setBounds(291, 239, 54, 26);
		}
		return tfCount;
	}
	
	// Function
	
	//화면의 Table 정리
	private void tableInit() {
		outerTable.addColumn("순서");
		outerTable.addColumn("이름");
		outerTable.addColumn("전화번호");
		outerTable.addColumn("관계");
		outerTable.setColumnCount(4);
		
		int i = outerTable.getRowCount(); //Outer_Table에 몇개의 줄이 있는지
		for(int j=0; j<i; j++) {
			outerTable.removeRow(0); // 0 번째(첫번째) 있는걸 지운다 즉 모든 줄이 지워질때까지 계속 지운다. 
		}
		
		innerTable.setAutoResizeMode(innerTable.AUTO_RESIZE_OFF);
		
		int vColIndex = 0; //순서
		TableColumn col = innerTable.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width); //폭을 30으로 정해준거다.
		
		
		vColIndex = 1; //이름
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 80;
		col.setPreferredWidth(width); 
		
		
		vColIndex = 2; //전화번호
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width); 
		
		vColIndex = 3; //관계
		col = innerTable.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width); 
	}
	
	// DB의 Table에서 화면의 Table에 들어갈 정보 가져오기
	private void searchAction() {
		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.selectList();
		int listCount=dtoList.size();
		
		for(int i = 0; i < listCount; i++) { //첫번째가 0부터기 때문에 i가 listCount보다 작거나 큰게 아니라 작아야한다.
			String temp= Integer.toString(dtoList.get(i).getSeqno()); //맨 밑에있는 열을 가져오고 그중에 Seqno의 값을 가져온다. 그리고 그걸 문자열로 바꿔준다.
			String[] qTxt = {temp, dtoList.get(i).getName(), dtoList.get(i).getTelno(), dtoList.get(i).getRelation()};
			outerTable.addRow(qTxt);
		}
		tfCount.setText(Integer.toString(listCount)); // Count에 들어갈 녀석
	}
	
	private void screenPartition() {
		// 검색일 경우
		if(rbQuery.isSelected()) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnOK.setVisible(false);
			btnQuery.setEnabled(true);
		}
		// 입력일 경우
		if(rbInsert.isSelected()) {
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnOK.setVisible(true);
			btnOK.setEnabled(true);
			btnQuery.setEnabled(false);
			}
		// 삭제 또는 수정일 경우.
		if(rbDelete.isSelected()) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnOK.setVisible(true);
			btnOK.setEnabled(true);
			btnQuery.setEnabled(false);
			}
		if(rbUpdate.isSelected()) {
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnOK.setVisible(true);
			btnOK.setEnabled(true);
			btnQuery.setEnabled(false);
			}
		}
	
	
	private int insertFieldCheck() { // 필드가 비어있는지 아닌지 체크하기 위한것
		int i = 0;
		
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
		return i; // 문제가 없으면 i가 0인 상태로 쭉 내려올것이다.
	}
	
	private void insertAction() { // 라디오버튼 입력을 눌렀을때 사용할 녀석
		String name = tfName.getText();
		String telno = tfTelno.getText();
		String address = tfAddress.getText();
		String email = tfEmail.getText();
		String relation = tfRelation.getText();
		
		Dao dao = new Dao(name, telno, address, email, relation); //생성자를 통해서 만들어주는 방법이다.
		boolean result = dao.insertAction();
		
		if(result == true) {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 입력 되었습니다.", "주소록 정보",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "입력 중 문제가 발생했습니다. \n 관리자에게 문의하세요!", "주소록 정보",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void tableClick() {
		int i = innerTable.getSelectedRow(); // 선택된 줄을 정수값으로 받기
		String wkSequence = (String) innerTable.getValueAt(i, 0);
		int wkSeqno = Integer.parseInt(wkSequence);
		
		// Dao에 의뢰한다.
		Dao dao = new Dao(wkSeqno);
		Dto dto = dao.tableClick(); //Dto 타입이니 받을때도 Dto 타입으로 받는다.
		
		tfSeqno.setText(Integer.toString(dto.getSeqno()));
		tfName.setText(dto.getName());
		tfTelno.setText(dto.getTelno());
		tfAddress.setText(dto.getAddress());
		tfEmail.setText(dto.getEmail());
		tfRelation.setText(dto.getRelation());
	}
	
	
	
	private void deleteAction() {
		int seqno = Integer.parseInt(tfSeqno.getText());
		Dao dao = new Dao(seqno);
		
		boolean result = dao.deleteAction();
		if(result == true) {
		JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 삭제되었습니다.", "주소록 정보", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "삭제하는데 실패했습니다. \n 관리자에게 문의하세요!", "주소록 정보",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	private void updateAction() {
		int seqno = Integer.parseInt(tfSeqno.getText());
		String name = tfName.getText();
		String telno = tfTelno.getText();
		String address = tfAddress.getText();
		String email = tfEmail.getText();
		String relation = tfRelation.getText();
		Dao dao = new Dao(seqno, name, telno, address, email, relation);
		boolean result = dao.updateAction();
		
		if(result == true) {
			JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + tfName.getText() + "님의 정보가 수정 되었습니다.", "주소록 정보", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + "입력 중 문제가 발생했습니다. \n 관리자에게 문의하세요!", "주소록 정보",JOptionPane.ERROR_MESSAGE);
			}
	}
	
	private void clearColumn() { //검색할 때는 Inner_Table값을 초기화 시켜주기 위해서 ""로 비워준다.
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	
	
	
	private void actionPartition() {
		// 입력인 경우
		if(rbInsert.isSelected()) {
			int i_chk=insertFieldCheck();
			if(i_chk==0) {
				insertAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else
				JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + message + "확인하세요!", "주소록 정보",JOptionPane.INFORMATION_MESSAGE); //데이터가 없을때 뜨는 다이아로그
			}
		if(rbDelete.isSelected()) {
			int i_chk=insertFieldCheck();
			if(i_chk==0) {
				deleteAction();
				tableInit();
				searchAction();
				clearColumn();
			}
		}
		if(rbUpdate.isSelected()) {
			int i_chk=insertFieldCheck();
			if(i_chk==0) {
				updateAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else
				JOptionPane.showMessageDialog(this, "주소록 정보 입력!\n" + message + "확인하세요!", "주소록 정보",JOptionPane.INFORMATION_MESSAGE); //데이터가 없을때 뜨는 다이아로그
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
		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
		
	}
	
	private void conditionQueryAction(String conditionQueryColumn) {
		Dao dao = new Dao(conditionQueryColumn, tfSelection.getText());
		ArrayList<Dto> dtoList = dao.conditionList();
		int listCount = dtoList.size();
			
		for(int i=0; i<listCount; i++) {
			String temp = Integer.toString(dtoList.get(i).getSeqno());
			String[] qTxt = {temp, dtoList.get(i).getName(), dtoList.get(i).getTelno(), dtoList.get(i).getRelation()};
			outerTable.addRow(qTxt);			
		}tfCount.setText(Integer.toString(listCount));
	}
	
	
	
} // End
