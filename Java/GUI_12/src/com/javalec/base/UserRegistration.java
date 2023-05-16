package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import com.javalec.util.Share;

public class UserRegistration extends JDialog {
	private JButton btnOK;
	private JLabel lblNewLabel;
	private JTextField tfUserId;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JPasswordField tfPassword;
	private JTextField tfName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration dialog = new UserRegistration();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public UserRegistration() {
		setTitle("Menu");
		setBounds(100, 100, 359, 292);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnOK());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField_3());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_1_1());
		getContentPane().add(getTfPassword());
		getContentPane().add(getTextField_1_1());

	}

	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					okAction();
				}
			});
			btnOK.setBounds(155, 173, 117, 29);
		}
		return btnOK;
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User Id :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(69, 49, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTextField_3() {
		if (tfUserId == null) {
			tfUserId = new JTextField();
			tfUserId.setBounds(142, 44, 130, 26);
			tfUserId.setColumns(10);
		}
		return tfUserId;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setBounds(63, 77, 67, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Name :");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1_1.setBounds(69, 105, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBounds(142, 72, 130, 26);
		}
		return tfPassword;
	}
	private JTextField getTextField_1_1() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(142, 100, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	// Function
	private void okAction() {
		String userid = tfUserId.getText();
		String name = tfName.getText();
		char[] pass= tfPassword.getPassword();
		String password=new String(pass);
		
		Share.userid= userid; //공유할때는 new 선언을 할 필요 없음
		Share.name=name;
		Share.password=password;
		
		//화면 정리
		Main window = new Main(); //메인을 실행하고
		window.main(null);
		
		dispose();
	}
	
	
	
	
	
	
	
	
}//End
