package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calculater;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JComboBox comboBox;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnNewButton;
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
		setBounds(100, 100, 412, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTfNum1());
		contentPane.add(getComboBox());
		contentPane.add(getTfNum2());
		contentPane.add(getTfResult());
		contentPane.add(getBtnNewButton());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(32, 37, 70, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox(calc);
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			comboBox.setBounds(114, 38, 70, 27);
		}
		return comboBox;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setColumns(10);
			tfNum2.setBounds(187, 37, 70, 26);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEnabled(false);
			tfResult.setEditable(false);
			tfResult.setBounds(314, 37, 81, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("=");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			btnNewButton.setBounds(255, 37, 47, 29);
		}
		return btnNewButton;
	}
	// Function
	String[] calc= {"+","-","*","/"};
	
	private void result() {
	int num1=Integer.parseInt(tfNum1.getText()); //첫번째로 입력된 숫자(문자열)를 num1인 실수로 바꿔준다
	int num2=Integer.parseInt(tfNum2.getText()); //두번째로 입력된 숫자(문자열)를 num2인 실수로 바꿔준다
	String result; //결과값
	String selectedItem = comboBox.getSelectedItem().toString(); // 콤보 박스 안에 값을 불러오는 역할을 함
	Calculater calculater =new Calculater(num1, num2);//Calculater 패키지를 불러온다
	if (selectedItem.equals("+")) { //만약 콤보 박스 안에 값이 +와 같다면
		result=Integer.toString(calculater.add()); //Calculater의 add를 실행한다
	}else if(selectedItem.equals("-")) {
		result=Integer.toString(calculater. sub());
	}else if(selectedItem.equals("*")) {
		result=Integer.toString(calculater.mul());
	}else {
		result=calculater.div();
	}
	tfResult.setText(result); //결과 창에 result값을 집어 넣는다
}
	
}//End
