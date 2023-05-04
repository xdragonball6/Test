package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Sum;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JButton btnSum;
	private JLabel lblNewLabel_2;
	private JTextField tfSum;

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
		setBounds(100, 100, 412, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnSum());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfSum());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(43, 29, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(43, 71, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(113, 24, 94, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(113, 66, 94, 26);
		}
		return tfNum2;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("합계 구하기");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
				}
			});
			btnSum.setBounds(219, 24, 117, 29);
		}
		return btnSum;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(229, 71, 37, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSum.setEnabled(false);
			tfSum.setEditable(false);
			tfSum.setBounds(267, 66, 130, 26);
			tfSum.setColumns(10);
		}
		return tfSum;
	}
	//------Function-------
	public void pplus(String part) {
		int num1=Integer.parseInt(tfNum1.getText());
		int num2=Integer.parseInt(tfNum2.getText());
		Sum sum = new Sum(num1,num2);
		String result;
		result=sum.sum();
		tfSum.setText(result);
	}
	
	
	
	
	
	
	
	
} // End
