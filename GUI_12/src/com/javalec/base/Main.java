package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.util.Share;

import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btnRegistration;
	private JLabel lblResult;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				checkStatus();
			}
		});
		setType(Type.UTILITY);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnRegistration());
		contentPane.add(getLblResult());
	}

	private JButton getBtnRegistration() {
		if (btnRegistration == null) {
			btnRegistration = new JButton("사용자 등록");
			btnRegistration.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					userRegistration();
				}
			});
			btnRegistration.setBounds(156, 102, 117, 29);
		}
		return btnRegistration;
	}
	//--Function--
	private void userRegistration() {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.setVisible(true); //false일때 이건 화면에서만 안보일뿐 뒤에는 뜸
		dispose(); //이건 지우는 역할을 함
	}

	private void checkStatus() {
		if(!Share.userid.equals("")) { //같지 않으면 #부정연산자#
			lblResult.setText(Share.userid+"/"+Share.password+"/"+Share.name);
			Share.userid=""; //이렇게 해야 다시 실행할때 새로 입력한 값을 읽어냄
		}
	}












	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(71, 179, 309, 16);
		}
		return lblResult;
	}
}//End
