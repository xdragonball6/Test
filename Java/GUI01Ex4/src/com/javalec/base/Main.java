package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.Calculation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfStartNum;
	private JLabel lblNewLabel_1;
	private JTextField tfEndNum;
	private JLabel lblNewLabel_1_1;
	private JTextField tfSum;
	private JRadioButton rbAll;
	private JRadioButton rbEven;
	private JRadioButton rbOdd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnCalc;

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
		setBounds(100, 100, 367, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfStartNum());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfEndNum());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTfSum());
		contentPane.add(getRbAll());
		contentPane.add(getRbEven());
		contentPane.add(getRbOdd());
		contentPane.add(getBtnCalc());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작숫자");
			lblNewLabel.setBounds(37, 38, 49, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfStartNum() {
		if (tfStartNum == null) {
			tfStartNum = new JTextField();
			tfStartNum.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') { //만약 0~9사이의 숫자가 들어오면 가져와라 문자를
					
					}else { 
						JOptionPane.showConfirmDialog(null, "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE); //만약 그렇지 않은 무언가가 들어온다면 에러를 내보내라
						tfStartNum.setText("");
					}
				}
			});
			tfStartNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfStartNum.setBounds(83, 33, 67, 26);
			tfStartNum.setColumns(10);
		}
		return tfStartNum;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝숫자");
			lblNewLabel_1.setBounds(37, 66, 49, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfEndNum() {
		if (tfEndNum == null) {
			tfEndNum = new JTextField();
			tfEndNum.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					
					}else {
						JOptionPane.showConfirmDialog(null, "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfEndNum.setText("");
					}
				}
			});
			tfEndNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfEndNum.setColumns(10);
			tfEndNum.setBounds(83, 66, 67, 26);
		}
		return tfEndNum;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("합계");
			lblNewLabel_1_1.setBounds(37, 112, 49, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfSum() {
		if (tfSum == null) {
			tfSum = new JTextField();
			tfSum.setEditable(false);
			tfSum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSum.setColumns(10);
			tfSum.setBounds(83, 107, 138, 26);
		}
		return tfSum;
	}
	private JRadioButton getRbAll() {
		if (rbAll == null) {
			rbAll = new JRadioButton("전체");
			rbAll.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation();
				}
			});
			buttonGroup.add(rbAll);
			rbAll.setSelected(true);
			rbAll.setBounds(162, 34, 54, 23);
		}
		return rbAll;
	}
	private JRadioButton getRbEven() {
		if (rbEven == null) {
			rbEven = new JRadioButton("짝수");
			rbEven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation();
				}
			});
			buttonGroup.add(rbEven);
			rbEven.setBounds(221, 34, 54, 23);
		}
		return rbEven;
	}
	private JRadioButton getRbOdd() {
		if (rbOdd == null) {
			rbOdd = new JRadioButton("홀수");
			rbOdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calculation();
				}
			});
			buttonGroup.add(rbOdd);
			rbOdd.setBounds(277, 34, 54, 23);
		}
		return rbOdd;
	}
	private JButton getBtnCalc() {
		if (btnCalc == null) {
			btnCalc = new JButton("계산하기");
			btnCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Boolean check = checkField();
					if(check) {
						calculation();
					}else {
						JOptionPane.showConfirmDialog(null,
								"숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnCalc.setBounds(158, 61, 117, 29);
		}
		return btnCalc;
	}
	//--Function
	private Boolean checkField() {
		boolean check;
		if(tfStartNum.getText().equals("") || tfEndNum.getText().equals("")) { //만약 첫번째 값과 두번째 값이 아무값도 넣어지지 않는다면 실패하게 만든다 그게 아니면 성공
			check = false;
		}else {
			check = true;
		}
		return check;
	}
	
	private void calculation() {
		String part="";
		Calculation calculation;
		int num1=Integer.parseInt(tfStartNum.getText());
		int num2=Integer.parseInt(tfEndNum.getText());
		
		if(rbAll.isSelected()) part= "all"; //라디오버튼 rbAll은 "all"파트로 선택 되었다
		if(rbEven.isSelected()) part="even";//라디오버튼 rbEven은 "even"파트로 선택 되었다
		if(rbOdd.isSelected()) part="odd";//라디오버튼 rbOdd는 "odd"파트로 선택 되었다
		
		if(num1>num2) {
			calculation = new Calculation(part, num2, num1);
			}else {
			calculation = new Calculation(part, num1, num2);
			}
		tfSum.setText(Integer.toString(calculation.action()));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//End
