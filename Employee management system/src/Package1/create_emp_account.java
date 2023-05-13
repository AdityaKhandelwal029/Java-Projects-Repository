package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
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

public class create_emp_account {

	public JFrame frame;
	private JTextField txtFsdf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_emp_account window = new create_emp_account();
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
	public create_emp_account() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Create account ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setBounds(665, 110, 245, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(509, 227, 85, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtFsdf = new JTextField();
		txtFsdf.setBorder(new LineBorder(SystemColor.desktop, 2));
		txtFsdf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFsdf.setBounds(769, 229, 350, 35);
		frame.getContentPane().add(txtFsdf);
		txtFsdf.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(509, 291, 114, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Department");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(509, 360, 155, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Salary in \u20B9");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1.setBounds(509, 427, 226, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(769, 293, 350, 35);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(769, 362, 350, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String CustomerName=txtFsdf.getText();
					String Address=textField.getText();
					String department=textField_1.getText();
					String salary=textField_2.getText();
					
					CustomerName=CustomerName.toLowerCase();
					Address=Address.toLowerCase();
					department=department.toLowerCase();
					
					CustomerName=CustomerName.substring(0,1).toUpperCase()+CustomerName.substring(1);
					Address=Address.substring(0,1).toUpperCase()+Address.substring(1);
					department=department.substring(0,1).toUpperCase()+department.substring(1);
						
					Connection con;
					Statement stmt,stmt2,stmt3;
					ResultSet rs,rs2;
					
					if(CustomerName.isEmpty()||Address.isEmpty()||department.isEmpty()||salary.isEmpty())
					{
						textField_3.setText("Please fill all required fields.");
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
						    String id;
						    int newid;
						    String query1;
						    String query2;
						    String query3;
						    try {
						    	     stmt=con.createStatement();							
							 	     query1="select count(id) from employeedata;";
								     rs=stmt.executeQuery(query1); // Execute query
								     rs.next();
								     id=rs.getString("count(id)");
								     if(id.equals("0"))
								     {
									      newid=Integer.parseInt(id);
									      newid=newid+1;
									     id=String.valueOf(newid);
								     }
								     else
								       {
									      stmt3=con.createStatement();
								          query3="select max(id) from employeedata;";
								          rs2= stmt3.executeQuery(query3); // Execute query
								          rs2.next();
								          id=rs2.getString("max(id)");
								          newid=Integer.parseInt(id);
								          newid=newid+1;
								          id=String.valueOf(newid);
								       }
								try {
									    stmt2=con.createStatement();
									    query2="Insert into employeedata values("+id+",'"+CustomerName+"',"+"'"+Address+"',"+"'"+department+"',"+salary+")";                                      					
									    int QueryOutput= stmt2.executeUpdate(query2);
									if(QueryOutput==1)
									{
										txtFsdf.setText(null);
										textField.setText(null);
										textField_1.setText(null);
										textField_2.setText(null);
										textField_3.setText("Account created successfully your Id no is "+id);
									}
									else
									{
										textField_3.setText("Error occurred while creating emp account !");
									}
								}
								catch(Exception e3)
								{
									textField_3.setText("Error occurred while creating emp account !");
									JOptionPane.showMessageDialog(null,"Error occurred !");
								}
								
						    }
						    catch(Exception e2)
							{
								textField_3.setText("Error occurred or Failed to get id");
								JOptionPane.showMessageDialog(null,"Error occurred !");
							}
					    }
						catch(SQLException e1)
						{
							textField_3.setText("Connection with database failed !");
							JOptionPane.showMessageDialog(null,"Connection with database failed !");
						}
						catch(Exception e1)
						{
							textField_3.setText("Unknown exception occurred  !");
							JOptionPane.showMessageDialog(null,"Error occurred !");
						}
				}
				}					
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(769, 429, 350, 35);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CustomerName=txtFsdf.getText();
				String Address=textField.getText();
				String department=textField_1.getText();
				String salary=textField_2.getText();

				CustomerName=CustomerName.toLowerCase();
				Address=Address.toLowerCase();
				department=department.toLowerCase();
				
				CustomerName=CustomerName.substring(0,1).toUpperCase()+CustomerName.substring(1);
				Address=Address.substring(0,1).toUpperCase()+Address.substring(1);
				department=department.substring(0,1).toUpperCase()+department.substring(1);
					
				Connection con;
				Statement stmt,stmt2,stmt3;
				ResultSet rs,rs2;
				
				if(CustomerName.isEmpty()||Address.isEmpty()||department.isEmpty()||salary.isEmpty())
				{
					textField_3.setText("Please fill all required fields.");
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
					    String id;
					    int newid;
					    String query1;
					    String query2;
					    String query3;
					    try {
					    	     stmt=con.createStatement();							
						 	     query1="select count(id) from employeedata;";
							     rs=stmt.executeQuery(query1); // Execute query
							     rs.next();
							     id=rs.getString("count(id)");
							     if(id.equals("0"))
							     {
								      newid=Integer.parseInt(id);
								      newid=newid+1;
								     id=String.valueOf(newid);
							     }
							     else
							       {
								      stmt3=con.createStatement();
							          query3="select max(id) from employeedata;";
							          rs2= stmt3.executeQuery(query3); // Execute query
							          rs2.next();
							          id=rs2.getString("max(id)");
							          newid=Integer.parseInt(id);
							          newid=newid+1;
							          id=String.valueOf(newid);
							       }
							try {
								    stmt2=con.createStatement();
								    query2="Insert into employeedata values("+id+",'"+CustomerName+"',"+"'"+Address+"',"+"'"+department+"',"+salary+")";                                      					
								    int QueryOutput= stmt2.executeUpdate(query2);
								if(QueryOutput==1)
								{
									txtFsdf.setText(null);
									textField.setText(null);
									textField_1.setText(null);
									textField_2.setText(null);
									textField_3.setText("Account created successfully your Id no is "+id);
								}
								else
								{
									textField_3.setText("Error occurred while creating emp account !");
								}
							}
							catch(Exception e3)
							{
								textField_3.setText("Error occurred while creating emp account !");
								JOptionPane.showMessageDialog(null,"Error occurred !");
							}
							
					    }
					    catch(Exception e2)
						{
							textField_3.setText("Error occurred or Failed to get id");
							JOptionPane.showMessageDialog(null,"Error occurred !");
						}
				    }
					catch(SQLException e1)
					{
						textField_3.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField_3.setText("Unknown exception occurred  !");
						JOptionPane.showMessageDialog(null,"Error occurred !");
					}
			}
		}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(755, 572, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(543, 668, 600, 50);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
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
		btnNewButton_1.setBounds(547, 751, 200, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(943, 751, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
