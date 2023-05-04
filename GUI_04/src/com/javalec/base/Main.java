package com.javalec.base;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.SumResult;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lbResult;
	private JButton btnOK;
	private JTextField textField;

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
		setBounds(100, 100, 450, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getBtnOK());
		contentPane.add(getLbResult());
		contentPane.add(getBtnOK());
		contentPane.add(getTextField());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("단단위 입력 숫자(0~9)");
			lblNewLabel.setBounds(26, 27, 123, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(167, 22, 205, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}

	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("");
			lbResult.setBounds(141, 78, 191, 16);
		}
		return lbResult;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					All("good"); {
						
					}
				}
			});
			btnOK.setBounds(384, 22, 64, 29);
		}
		return btnOK;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBackground(new Color(237, 238, 236));
			textField.setBounds(167, 106, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}

	//-----Function-----
	public void All(String part) {
	int num1=Integer.parseInt(tfNum1.getText());
	String result="";
	SumResult sumResult =new SumResult(num1);
	if(part.equals("good"))
		result="모르겠네"+sumResult;
		textField.setText(result);
	}
	
	
	
	
	
	
	
	
	
}//End
