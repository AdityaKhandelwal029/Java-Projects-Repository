package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class main_login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1615, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee management portal");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 1579, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(566, 281, 143, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2, true));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(784, 287, 350, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(566, 393, 143, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
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
						JOptionPane.showMessageDialog(null,"Login successfull !");
						try {
							String url="jdbc:mysql://localhost:3306/employeemanagementproject";
							String username1="root";
							String password1="12345";
							Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
							Connection con = DriverManager.getConnection(url, username1, password1);
							JOptionPane.showMessageDialog(null,"Connection successfull !");
							main_menu mainmenuframe=new main_menu();
							mainmenuframe.frame.setVisible(true);				
							frame.dispose();
							
						}
						catch(SQLException e1)
						{
							textField.setText(null);
							passwordField.setText(null);
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
						catch(Exception e1)
						{
							textField.setText(null);
							passwordField.setText(null);
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
					}
					else
					{
						textField.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
					}
				}
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new LineBorder(SystemColor.desktop, 2));
		passwordField.setBounds(784, 393, 350, 45);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				char[] userpassword=passwordField.getPassword();
				String temp=new String(userpassword);
				if(username.equals("admin")&&temp.equals("123"))
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login successfull !");
					try {
						String url="jdbc:mysql://localhost:3306/employeemanagementproject";
						String username1="root";
						String password1="12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
						Connection con = DriverManager.getConnection(url, username1, password1);
						JOptionPane.showMessageDialog(null,"Connection successfull !");
						main_menu mainmenuframe=new main_menu();
						mainmenuframe.frame.setVisible(true);				
						frame.dispose();
						
					}
					catch(SQLException e1)
					{
						textField.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
				}
				else
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
				}
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(777, 608, 150, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
