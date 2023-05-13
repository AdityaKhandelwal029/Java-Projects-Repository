package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
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

public class delete_emp_account {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_emp_account window = new delete_emp_account();
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
	public delete_emp_account() {
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
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(10, 11, 1579, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Delete account ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(665, 110, 245, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee  id");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(547, 225, 170, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_no=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				if(id_no.isEmpty())
				{
					textField_1.setText("Please enter employee id.");
				}
				else
				{
					try
					{
						String url="jdbc:mysql://localhost:3306/employeemanagementproject";
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="select name from employeedata where id="+id_no;
							rs= stmt.executeQuery(query); // Execute query
							rs.next();
							String name1= rs.getString("name");
							textField_1.setText("Account exists employee name is "+name1+".");
						}
						catch(SQLException e2)
						{
							textField_1.setText("Error occurred or result not found.");
							JOptionPane.showMessageDialog(null,"Error occurred !");
						}
					}
					catch(SQLException e1)
					{
						textField_1.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField_1.setText("Unknown exception occurred  !");
						JOptionPane.showMessageDialog(null,"Error occurred !");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setBounds(791, 412, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Main menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_menu mainframe=new main_menu();
				mainframe.frame.setVisible(true);				
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setBounds(547, 560, 200, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(988, 560, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_no=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				try
				{
					String url="jdbc:mysql://localhost:3306/employeemanagementproject"; 
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="delete from employeedata where id="+id_no;
						int update= stmt.executeUpdate(query); // Execute query
						if(update==1)
						{
							textField.setText(null);
							textField_1.setText("User account deleted successfully.");
						}
						else
						{
							textField_1.setText("Deletion failed !");
						}
					}
					catch(SQLException e2)
					{
						textField_1.setText("Error occurred or result not found.");
						JOptionPane.showMessageDialog(null,"Error occurred !");
					}
				}
				catch(SQLException e1)
				{
					textField_1.setText("Connection with database failed !");
					JOptionPane.showMessageDialog(null,"Connection with database failed !");
				}
				catch(Exception e1)
				{
					textField_1.setText("Unknown exception occurred  !");
					JOptionPane.showMessageDialog(null,"Error occurred !");
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1_1.setBounds(766, 560, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String id_no=textField.getText();
					Connection con;
					Statement stmt;
					ResultSet rs;
					if(id_no.isEmpty())
					{
						textField_1.setText("Please enter employee id.");
					}
					else
					{
						try
						{
							String url="jdbc:mysql://localhost:3306/employeemanagementproject";
							String username = "root"; // MySQL credentials
							String password = "12345";
							Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
						    con = DriverManager.getConnection(url, username, password);	
							try {
								stmt=con.createStatement();							
								String query="select name from employeedata where id="+id_no;
								rs= stmt.executeQuery(query); // Execute query
								rs.next();
								String name1= rs.getString("name");
								textField_1.setText("Account exists employee name is "+name1+".");
							}
							catch(SQLException e2)
							{
								textField_1.setText("Error occurred or result not found.");
								JOptionPane.showMessageDialog(null,"Error occurred !");
							}
						}
						catch(SQLException e1)
						{
							textField_1.setText("Connection with database failed !");
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
						catch(Exception e1)
						{
							textField_1.setText("Unknown exception occurred  !");
							JOptionPane.showMessageDialog(null,"Error occurred !");
						}
					}
				}
			}
		});
		textField.setBorder(new LineBorder(Color.BLACK, 2));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(850, 225, 350, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.BLACK, 2));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setBounds(547, 326, 653, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}
