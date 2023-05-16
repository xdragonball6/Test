package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Sum;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JButton btnSum;
	private JLabel lblNewLabel_1_1;
	private JTextField tfRSum;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 449, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getRdbtnNewRadioButton_2());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnSum());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTfRSum());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(38, 29, 49, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(93, 24, 89, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("전체");
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					plus();
				}
			});
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(196, 25, 59, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("짝수");
			rdbtnNewRadioButton_1.setSelected(true);
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(258, 25, 59, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("홀수");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(319, 25, 59, 23);
		}
		return rdbtnNewRadioButton_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(38, 59, 49, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(93, 54, 89, 26);
		}
		return tfNum2;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("계산하기");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					plus();
				}
			});
			btnSum.setBounds(189, 60, 117, 29);
		}
		return btnSum;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(38, 115, 32, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfRSum() {
		if (tfRSum == null) {
			tfRSum = new JTextField();
			tfRSum.setEditable(false);
			tfRSum.setBounds(93, 110, 130, 26);
			tfRSum.setColumns(10);
		}
		return tfRSum;
	}
	
	// Function
	public void plus() {
		int num1=Integer.parseInt(tfNum1.getText());
		int num2=Integer.parseInt(tfNum2.getText());
		String result="";
		Sum sum= new Sum(num1,num2);
		result=Integer.toString(sum.sum());
		tfRSum.setText(result);
	}
	
	
	
	
	
	
	
	
}//End
