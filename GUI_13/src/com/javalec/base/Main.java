package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calc;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfHeight;
	private JTextField tfWeight;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JButton btnCalc;
	private JLabel IblResult;

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
		setBounds(100, 100, 308, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfHeight());
		contentPane.add(getTfWeight());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getBtnCalc());
		contentPane.add(getIblResult());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장) :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(57, 47, 51, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("몸무게 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setBounds(57, 75, 51, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfHeight() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.setBounds(113, 42, 101, 26);
			tfHeight.setColumns(10);
		}
		return tfHeight;
	}
	private JTextField getTfWeight() {
		if (tfWeight == null) {
			tfWeight = new JTextField();
			tfWeight.setColumns(10);
			tfWeight.setBounds(113, 70, 101, 26);
		}
		return tfWeight;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("cm");
			lblNewLabel_2.setBounds(217, 47, 35, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Kg");
			lblNewLabel_2_1.setBounds(217, 75, 35, 16);
		}
		return lblNewLabel_2_1;
	}
	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			btnCalc.setBounds(102, 108, 117, 29);
		}
		return btnCalc;
	}
	private JLabel getIblResult() {
		if (IblResult == null) {
			IblResult = new JLabel("");
			IblResult.setBounds(38, 171, 233, 16);
		}
		return IblResult;
	}
	//--Function--
	private void calc() {
	    String result="";
	    double height=Integer.parseInt(tfHeight.getText());
	    int weight=Integer.parseInt(tfWeight.getText());
	    double bmi=(weight/ ((height/100)*(height/100)));
	    Calc calc=new Calc(height,weight);
	    
	    String message="";
	    if (bmi>=30) {
	    	message = "고도비만";
		    } else if (bmi>=25) {
		        message = "비만";
		    } else if (bmi>=23) {
		        message = "과체중";
		    } else if (bmi>=18.5) {
		        message = "정상체중";
		    } else {
		        message = "저체중";
		    }
		
	    result="귀하의 bmi 지수는 "+String.format("%.2f",bmi)+"이고 "+message+"입니다.";
	    IblResult.setText(result);
	}
	
	
	
	
	
	
	
	
	
}//End
