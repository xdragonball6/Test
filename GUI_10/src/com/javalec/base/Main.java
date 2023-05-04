package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword;
	private JButton btnOK;
	private JTextField tfResult;
	private JLabel lblNewLabel_1;
	private JPasswordField pfPassword2;

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
		setTitle("Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getPfPassword());
		contentPane.add(getBtnOK());
		contentPane.add(getTfResult());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPfPassword2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(49, 48, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(122, 43, 91, 26);
		}
		return pfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(122, 183, 117, 29);
		}
		return btnOK;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(49, 224, 281, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(49, 77, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JPasswordField getPfPassword2() {
		if (pfPassword2 == null) {
			pfPassword2 = new JPasswordField();
			pfPassword2.setBounds(122, 72, 91, 26);
		}
		return pfPassword2;
	}
	

	//--Function--
	private void checkPassword() {
		char[] pass = pfPassword.getPassword();//password의 타입은 char[] 타입이다
		char[] pass2 = pfPassword2.getPassword();//password2를 입력해라
		
		String passString= new String(pass); //char[]배열을 String으로 문자열화
		String passString2= new String(pass2);
		if(passString.equals(passString2)) {
			tfResult.setText("두 비밀번호가 일치합니다");
		}else {
			tfResult.setText("비밀번호가 틀렸습니다 다시 입력해주세요");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//End
