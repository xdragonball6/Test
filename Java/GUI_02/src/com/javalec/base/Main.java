package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.funtion.Calc;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JButton btnAdd;
	private JButton btnX;
	private JButton btnSub;
	private JButton btnDiv;
	private JTextField tfNum3;
	private JTextField tfNum4;
	private JLabel lblNewLabel_2;
	private JTextField tfResult;
	private JTextField tfCalc;

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
		setTitle("두개의 숫자 가감승제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 254);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 219, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnX());
		contentPane.add(getBtnSub());
		contentPane.add(getBtnDiv());
		contentPane.add(getTfNum3());
		contentPane.add(getTfNum4());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfResult());
		contentPane.add(getTfCalc());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자1:");
			lblNewLabel.setBounds(42, 40, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField(); 
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(98, 35, 102, 32);
			tfNum1.setColumns(10);
			}
		return tfNum1;
		}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자2:");
			lblNewLabel_1.setBounds(42, 76, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(98, 68, 102, 32);
		}
		return tfNum2;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.setForeground(new Color(255, 38, 0));
			btnAdd.setBackground(Color.WHITE);
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add");
				}
			});
			btnAdd.setBounds(212, 35, 50, 21);
		}
		return btnAdd;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.setForeground(new Color(4, 50, 255));
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("mul");
				}
			});
			btnX.setBounds(212, 71, 50, 21);
		}
		return btnX;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.setForeground(new Color(255, 38, 0));
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub");
				}
			});
			btnSub.setBounds(275, 35, 50, 21);
		}
		return btnSub;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.setForeground(new Color(4, 50, 255));
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("div");
				}
			});
			btnDiv.setBounds(275, 71, 50, 21);
		}
		return btnDiv;
	}
	private JTextField getTfNum3() {
		if (tfNum3 == null) {
			tfNum3 = new JTextField();
			tfNum3.setForeground(new Color(18, 50, 196));
			tfNum3.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum3.setEnabled(false);
			tfNum3.setEditable(false);
			tfNum3.setBounds(43, 168, 83, 32);
			tfNum3.setColumns(10);
		}
		return tfNum3;
	}
	private JTextField getTfNum4() {
		if (tfNum4 == null) {
			tfNum4 = new JTextField();
			tfNum4.setForeground(new Color(0, 51, 204));
			tfNum4.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum4.setEnabled(false);
			tfNum4.setEditable(false);
			tfNum4.setColumns(10);
			tfNum4.setBounds(143, 168, 89, 32);
		}
		return tfNum4;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("=");
			lblNewLabel_2.setBounds(235, 172, 21, 24);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setForeground(new Color(255, 0, 0));
			tfResult.setEnabled(false);
			tfResult.setEditable(false);
			tfResult.setBounds(257, 168, 72, 32);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JTextField getTfCalc() {
		if (tfCalc == null) {
			tfCalc = new JTextField();
			tfCalc.setEnabled(false);
			tfCalc.setEditable(false);
			tfCalc.setBackground(new Color(234, 219, 143));
			tfCalc.setBounds(122, 172, 26, 24);
			tfCalc.setColumns(10);
		}
		return tfCalc;
	}
	//-----Function-----
	public void calc(String part) {
		int num1=Integer.parseInt(tfNum1.getText());
		int num2=Integer.parseInt(tfNum2.getText());
		tfNum3.setText(tfNum1.getText());
		tfNum4.setText(tfNum2.getText());
		
		String result="";
		String plus="+";
		String minus="-";
		String mul="X";
		String div="/";
		Calc calc = new Calc(num1,num2);
		if (part.equals("add")) {
			result=Integer.toString(calc.add());
		}else if(part.equals("sub")) {
			result=Integer.toString(calc. sub());
		}else if(part.equals("mul")) {
			result=Integer.toString(calc.mul());
		}else
			result=Float.toString((float) calc.div());

		if(part.equals("add")) {
			tfCalc.setText(plus);
		}else if(part.equals("sub")) {
			tfCalc.setText(minus);
		}else if(part.equals("mul")) {
			tfCalc.setText(mul);
		}else {
			tfCalc.setText(div);
		}
		
		tfResult.setText(result);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}//End
