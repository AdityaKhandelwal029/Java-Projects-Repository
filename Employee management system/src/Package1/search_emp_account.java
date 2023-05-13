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

public class search_emp_account {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_emp_account window = new search_emp_account();
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
	public search_emp_account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
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
		
		JLabel lblNewLabel_1 = new JLabel("Search emp info");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(669, 114, 245, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee  id");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(496, 215, 170, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
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
					try
					{
						String url="jdbc:mysql://localhost:3306/employeemanagementproject";
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="select *from employeedata where id="+id_no;
							rs= stmt.executeQuery(query); // Execute query
							rs.next();
							String username1= rs.getString("name");
							String address=rs.getString("address");
							String department=rs.getString("department");
							String salary=rs.getString("salary");
							textField_1.setText("Account found");
							textField_2.setText(username1);
							textField_3.setText(address);
							textField_4.setText(department);
							textField_5.setText(salary);					                                                                                                       			
						}
						catch(SQLException e2)
						{
							textField_1.setText("Error occurred or result not found.");
							JOptionPane.showMessageDialog(null,"Error occurred !");
							textField_2.setText(null);
							textField_3.setText(null);
							textField_4.setText(null);
							textField_5.setText(null);	
							
						}
					}
					catch(SQLException e1)
					{
						textField_1.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField_1.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(784, 217, 350, 35);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(493, 300, 641, 50);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
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
						String query="select *from employeedata where id="+id_no;
						rs= stmt.executeQuery(query); // Execute query
						rs.next();
						String username1= rs.getString("name");
						String address=rs.getString("address");
						String department=rs.getString("department");
						String salary=rs.getString("salary");
						textField_1.setText("Account found");
						textField_2.setText(username1);
						textField_3.setText(address);
						textField_4.setText(department);
						textField_5.setText(salary);					                                                                                                       			
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
					textField_1.setText("Connection with database failed !");
					JOptionPane.showMessageDialog(null,"Connection with database failed !");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setBounds(726, 396, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(512, 479, 85, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(784, 481, 350, 35);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Address");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(511, 543, 114, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(784, 545, 350, 35);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Department");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1.setBounds(511, 612, 155, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_4.setBounds(784, 614, 350, 35);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Salary");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_2.setBounds(511, 679, 85, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_5.setBounds(784, 681, 350, 35);
		frame.getContentPane().add(textField_5);
		
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
		btnNewButton_1.setBounds(496, 757, 200, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(934, 757, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
