package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Main extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnFruits;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField tfFruits;
	private JCheckBox Apple;
	private JCheckBox Banana;

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
		setType(Type.UTILITY);
		setTitle("\u0010CheckBox/Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRbKBS());
		contentPane.add(getRbMBC());
		contentPane.add(getBtnBroad());
		contentPane.add(getTfBroad());
		contentPane.add(getBtnFruits());
		contentPane.add(getTfFruits());
		contentPane.add(getApple());
		contentPane.add(getBanana());
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setSelected(true);
			rbKBS.setBounds(193, 34, 70, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(193, 69, 70, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(170, 104, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(180, 145, 100, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruits.setBounds(41, 104, 117, 29);
		}
		return btnFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setColumns(10);
			tfFruits.setBounds(51, 145, 100, 26);
		}
		return tfFruits;
	}
	private JCheckBox getApple() {
		if (Apple == null) {
			Apple = new JCheckBox("Apple");
			Apple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			Apple.setBounds(30, 34, 128, 23);
		}
		return Apple;
	}
	private JCheckBox getBanana() {
		if (Banana == null) {
			Banana = new JCheckBox("Banana");
			Banana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			Banana.setBounds(30, 69, 128, 23);
		}
		return Banana;
	}
	// Function
	private void broadCheck() {
		if(rbKBS.isSelected()) {//is로 시작하는 것들은 전부 boolean 즉 true false로 나온다
			tfBroad.setText("KBS");
		}
		
		if(rbMBC.isSelected()) {
			tfBroad.setText("MBC");
		}
	}
	
	private void fruitCheck() {
		
		tfFruits.setText("Nothing");
		
		if(Apple.isSelected()) {
			tfFruits.setText("Apple");
		}
		if(Banana.isSelected()) {
			tfFruits.setText("Banana");
		}
		if(Apple.isSelected() && Banana.isSelected()) {
			tfFruits.setText("Apple&Banana");
		}
	}
	
	
	
	
	
	
} // End
