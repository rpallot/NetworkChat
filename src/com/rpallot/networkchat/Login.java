package com.rpallot.networkchat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName, txtServer, txtPort, txtPass;
	private JLabel lblServer, lblPort, lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setResizable(false);
		setTitle("Network Chat - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		setBounds(100, 100, 300, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(57, 70, 180, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(122, 50, 50, 14);
		contentPane.add(lblName);
		
		txtServer = new JTextField();
		txtServer.setColumns(10);
		txtServer.setBounds(57, 120, 180, 20);
		contentPane.add(txtServer);
		
		lblServer = new JLabel("Server:");
		lblServer.setBounds(122, 100, 50, 14);
		contentPane.add(lblServer);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(122, 150, 50, 14);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(57, 170, 180, 20);
		contentPane.add(txtPort);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(122, 200, 50, 14);
		contentPane.add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(57, 220, 180, 20);
		contentPane.add(txtPass);
	}
}
