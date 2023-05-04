package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame { // 전역 변수
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	
	private int count=0; // 환영 횟수
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	

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
		setTitle("GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 241);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 170, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfName());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayHello();
				}
			});
			btnNewButton.setBounds(86, 140, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swing Button Test");
			lblNewLabel.setBounds(69, 40, 165, 16);
		}
		return lblNewLabel;
	}
	// --Functions--
	private void displayHello() {
		String name = tfName.getText();
		count++;
		String str = "환영 합니다. : "; //syso 는 쓸 일이 없다
		JOptionPane.showMessageDialog(null, name+ "님!\n" + str + count);
	}
	









	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(48, 74, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(86, 69, 130, 29);
			tfName.setColumns(10);
		}
		return tfName;
	}
}//End