package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JTextField tfadress;
	private JLabel lblNewLabel_1;
	private JTextField tfREmail;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBox());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfadress());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfREmail());
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox(Email);
			comboBox.setBounds(315, 38, 133, 27);
		}
		return comboBox;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Email주소:");
			lblNewLabel.setBounds(20, 42, 65, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfadress() {
		if (tfadress == null) {
			tfadress = new JTextField();
			tfadress.setBounds(84, 37, 108, 26);
			tfadress.setColumns(10);
		}
		return tfadress;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("@");
			lblNewLabel_1.setBounds(194, 42, 16, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfREmail() {
		if (tfREmail == null) {
			tfREmail = new JTextField();
			tfREmail.setEnabled(false);
			tfREmail.setEditable(false);
			tfREmail.setBounds(213, 37, 101, 26);
			tfREmail.setColumns(10);
		}
		return tfREmail;
	}
	//-----Function-----
	String Email[]= {"naver.com","daum.com", "gmail.com", "icloud.com"};
	String result="";
	String adress=tfadress.getText();
	
	
	
	
	
	
	
	
	
	
}//End
