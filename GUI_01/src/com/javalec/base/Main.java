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
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JButton btnAddition;
	private JLabel lblNewLabel_1_1;
	private JTextField tfResult;
	private JButton btnSubtraction;

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
		setTitle("덧셈과 뺄셈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 215);
		contentPane = new JPanel();
		contentPane.setToolTipText("덧셈과 뺄셈");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfNum1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfNum2());
		contentPane.add(getBtnAddition());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTfResult());
		contentPane.add(getBtnSubtraction());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1:");
			lblNewLabel.setBounds(33, 24, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(77, 19, 75, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2:");
			lblNewLabel_1.setBounds(33, 54, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(77, 49, 75, 26);
		}
		return tfNum2;
	}
	private JButton getBtnAddition() {
		if (btnAddition == null) {
			btnAddition = new JButton("Addition");
			btnAddition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("add"); {
						
					}
				}
			});
			btnAddition.setBounds(164, 19, 98, 29);
		}
		return btnAddition;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("결과:");
			lblNewLabel_1_1.setBounds(33, 88, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(77, 83, 185, 26);
		}
		return tfResult;
	}
	private JButton getBtnSubtraction() {
		if (btnSubtraction == null) {
			btnSubtraction = new JButton("Subtraction");
			btnSubtraction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc("sub"); { //"sub"와 같은걸 Parameter라고 부른다
						
					}
				}
			});
			btnSubtraction.setBounds(164, 49, 98, 29);
		}
		return btnSubtraction;
	}
	// ---Functions---
	private void calc(String part) {
		int num1=Integer.parseInt(tfNum1.getText()); //입력된 문자를 숫자로 만들어주고
		int num2=Integer.parseInt(tfNum2.getText());
		String result=""; //syso와 하는 역할이 같
		Calc calc =new Calc(num1, num2);
		
		if(part.equals("add")) {
			result=Integer.toString(calc.add()); //만약 버튼을 눌렀을때 "add"가 실행되면 패키지에 있는 add를 사용해서 값을 나타내고
		}else {
			result=Integer.toString(calc.sub());// 그게 아니면 자연스럽게 "sub"가 실행되면서 패키지에 있는 sub를 사용해서 값을 나타낸다
	}
		tfResult.setText(result); //결과 텍스트 칸에 위에 result 값을 불러온다.
	
//	private void addition() {
//		int num1=Integer.parseInt(tfNum1.getText()); //입력된 문자를 숫자로 만들어주고
//		int num2=Integer.parseInt(tfNum2.getText());
//		String result = Integer.toString(num1+num2); //숫자로 만들어 더해준 뒤 다시 문자로 만들어준다
//		tfResult.setText(result);		
		//위의 걸 한줄로 만들어주면 
		//tfResult.setText(Integer.toString(
		//				Integer.parseInt(tfNum1.getText())+
		//				Integer.parseInt(tfNum2.getText()))
		//                )
//		Calc calc =new Calc(num1, num2);
//		String result=Integer.toString(calc.add());
//		tfResult.setText(result);
		
		
		
//		}
//	private void subtraction() {
//		int num1=Integer.parseInt(tfNum1.getText()); //입력된 문자를 숫자로 만들어주고
//		int num2=Integer.parseInt(tfNum2.getText());
//		String result2= Integer.toString(num1-num2);
//		tfResult.setText(result2);
//		Calc calc =new Calc(num1, num2);
//		String result=Integer.toString(calc.sub());
//		tfResult.setText(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
} //End
