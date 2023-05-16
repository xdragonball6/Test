package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField getTfAppend;
	private JButton btnAppend;
	private JComboBox cbFruit;
	private JTextField getTfFruit;
	private JButton getBtnAppend;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getGetTfAppend());
		contentPane.add(getCbFruit());
		contentPane.add(getGetTfFruit());
		contentPane.add(getGetBtnAppend());
	}
	private JTextField getGetTfAppend() {
		if (getTfAppend == null) {
			getTfAppend = new JTextField();
			getTfAppend.setBounds(57, 99, 130, 26);
			getTfAppend.setColumns(10);
		}
		return getTfAppend;
	}
	private JComboBox getCbFruit() {
		if (cbFruit == null) {
			cbFruit = new JComboBox();
			cbFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbFruit.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruit.setBounds(57, 30, 110, 27);
		}
		return cbFruit;
	}
	private JTextField getGetTfFruit() {
		if (getTfFruit == null) {
			getTfFruit = new JTextField();
			getTfFruit.setEditable(false);
			getTfFruit.setEnabled(false);
			getTfFruit.setBounds(193, 29, 130, 26);
			getTfFruit.setColumns(10);
		}
		return getTfFruit;
	}
		private JButton getGetBtnAppend() {
			if (getBtnAppend == null) {
				getBtnAppend = new JButton("Add");
				getBtnAppend.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						appendAction();
					}
				});
				getBtnAppend.setBounds(193, 99, 117, 29);
			}
			return getBtnAppend;
		}
	//---Function
	private void comboAction() {
		String strFuit = cbFruit.getSelectedItem().toString();
		getTfFruit.setText(strFuit);
	}
	
	private void appendAction() {
		String str = getTfAppend.getText();
		cbFruit.addItem(str);
	}
}//End
