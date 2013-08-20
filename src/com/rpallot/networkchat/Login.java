package com.rpallot.networkchat;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

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
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(122, 50, 50, 14);
		contentPane.add(lblName);
		
		txtServer = new JTextField();
		txtServer.setColumns(10);
		txtServer.setBounds(57, 120, 180, 20);
		contentPane.add(txtServer);
		
		lblServer = new JLabel("Server:");
		lblServer.setHorizontalAlignment(SwingConstants.CENTER);
		lblServer.setBounds(122, 100, 50, 14);
		contentPane.add(lblServer);
		
		lblPort = new JLabel("Port:");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setBounds(122, 150, 50, 14);
		contentPane.add(lblPort);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(57, 170, 180, 20);
		contentPane.add(txtPort);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(122, 200, 50, 14);
		contentPane.add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(57, 220, 180, 20);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String server = txtServer.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, server, port);
			}
		});
		btnLogin.setBounds(102, 290, 89, 23);
		contentPane.add(btnLogin);
	}
	
	private void login(String name, String address, int port) {
		dispose();
		System.out.println(name + ", " + address + ", " + port);
	}
	
}
