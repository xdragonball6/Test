package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btnBee;
	private JLabel lblImage;
	private JButton btnCat;
	private JButton btnDog;
	private JButton btnFox;

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
		contentPane.add(getBtnBee());
		contentPane.add(getBtnCat());
		contentPane.add(getLblImage());
		contentPane.add(getBtnDog());
		contentPane.add(getBtnFox());
	}

	private JButton getBtnBee() {
		if (btnBee == null) {
			btnBee = new JButton("bee");
			btnBee.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					beeAction();
				}
			});
			btnBee.setBounds(37, 31, 117, 29);
		}
		return btnBee;
	}
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(249, 42, 168, 168);
		}
		return lblImage;
	}
	//Function
	private void beeAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/bee.png")));
		
	}
	private void catAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/cat.png")));
		
	}
	private void dogAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/dog.png")));
		
	}
	private void foxAction() {
		lblImage.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/fox.png")));
		
	}
	
	
	
	private JButton getBtnCat() {
		if (btnCat == null) {
			btnCat = new JButton("cat");
			btnCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					catAction();
				}
			});
			btnCat.setBounds(37, 82, 117, 29);
		}
		return btnCat;
	}
	private JButton getBtnDog() {
		if (btnDog == null) {
			btnDog = new JButton("dog");
			btnDog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dogAction();
				}
			});
			btnDog.setBounds(37, 136, 117, 29);
		}
		return btnDog;
	}
	private JButton getBtnFox() {
		if (btnFox == null) {
			btnFox = new JButton("fox");
			btnFox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					foxAction();
				}
			});
			btnFox.setBounds(37, 197, 117, 29);
		}
		return btnFox;
	}
}//End
