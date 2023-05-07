package main_login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import Option_menu.Option_menu;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

@SuppressWarnings("unused")
public class main_login {

    JFrame frame;
	private JTextField textField;
	private JTextField txtFgdg;
	private JPasswordField passwordField;
	public Connection con;
	public Statement stmt;
	public ResultSet rs;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_login window = new main_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(323, 66, 150, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAbcBankPrivate = new JLabel("ABC Bank Private Ltd");
		lblAbcBankPrivate.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblAbcBankPrivate.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblAbcBankPrivate.setBounds(225, 0, 360, 85);
		frame.getContentPane().add(lblAbcBankPrivate);
		
		JLabel lblNewLabel_1 = new JLabel("Login Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(136, 182, 100, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(136, 278, 120, 35);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(362, 182, 300, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				char[] userpassword=passwordField.getPassword();
				String temp=new String(userpassword);
				if(username.equals("admin")&&temp.equals("123"))
				{
					textField.setText(null);
					passwordField.setText(null);
					txtFgdg.setText("Login successfully Done");
					JOptionPane.showMessageDialog(null,"Login successfull !");
					try {
						String url="jdbc:mysql://localhost:3306/bankproject";
						String username1="root";
						String password1="12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
						con = DriverManager.getConnection(url, username1, password1);
						JOptionPane.showMessageDialog(null,"Connection successfull !");
						Option_menu Optionframe=new Option_menu();
						Optionframe.frame.setVisible(true);				
						frame.dispose();
					}
					catch(SQLException e1)
					{
						textField.setText(null);
						passwordField.setText(null);
						txtFgdg.setText("Signin failed unable to connect with database");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField.setText(null);
						passwordField.setText(null);
						txtFgdg.setText("Signin failed unable to connect with database");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
				}
				else
				{
					textField.setText(null);
					passwordField.setText(null);
					txtFgdg.setText("Signin failed please username or password");
					JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
				}
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(292, 384, 160, 56);
		frame.getContentPane().add(btnNewButton);
		
		txtFgdg = new JTextField();
		txtFgdg.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtFgdg.setHorizontalAlignment(SwingConstants.CENTER);
		txtFgdg.setBorder(new LineBorder(SystemColor.desktop, 2));
		txtFgdg.setBounds(177, 473, 450, 40);
		frame.getContentPane().add(txtFgdg);
		txtFgdg.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String username=textField.getText();
					char[] userpassword=passwordField.getPassword();
					String temp=new String(userpassword);
					if(username.equals("admin")&&temp.equals("123"))
					{
						textField.setText(null);
						passwordField.setText(null);
						txtFgdg.setText("Login successfully Done");
						JOptionPane.showMessageDialog(null,"Login successfull !");
						try {
							String url="jdbc:mysql://localhost:3306/bankproject";
							String username1="root";
							String password1="12345";
							Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
							con = DriverManager.getConnection(url, username1, password1);
							JOptionPane.showMessageDialog(null,"Connection successfull !");
							Option_menu Optionframe=new Option_menu();
							Optionframe.frame.setVisible(true);				
							frame.dispose();
						}
						catch(SQLException e1)
						{
							textField.setText(null);
							passwordField.setText(null);
							txtFgdg.setText("Signin failed unable to connect with database");
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
						catch(Exception e1)
						{
							textField.setText(null);
							passwordField.setText(null);
							txtFgdg.setText("Signin failed unable to connect with database");
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
					}
					else
					{
						textField.setText(null);
						passwordField.setText(null);
						txtFgdg.setText("Signin failed please username or password");
						JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
					}
				}
			}
		});
		passwordField.setBorder(new LineBorder(SystemColor.desktop, 2));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(362, 288, 300, 35);
		frame.getContentPane().add(passwordField);
	}
}
