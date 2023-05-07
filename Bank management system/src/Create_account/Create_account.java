package Create_account;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Option_menu.Option_menu;

import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import main_login.main_login;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
@SuppressWarnings("unused")
public class Create_account {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_account window = new Create_account();
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
	public Create_account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(0, 0, 850, 950));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 29));
		frame.setBounds(new Rectangle(0, 0, 800, 1200));
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 825, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABC Bank Private Ltd");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(225, 0, 360, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(323, 66, 150, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create New  Account");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(260, 127, 300, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(84, 180, 172, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(335, 184, 350, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Father's Name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(84, 242, 172, 35);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Address");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(84, 299, 172, 35);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(335, 253, 350, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(335, 310, 350, 100);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Gender");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(84, 429, 172, 35);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(338, 439, 120, 35);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnFemale.setBounds(460, 439, 120, 35);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnOther.setBounds(582, 439, 120, 35);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Type Of Account");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1_1_1_1.setBounds(84, 494, 172, 35);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Saving");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxNewCheckBox.setBounds(335, 504, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxCurrent = new JCheckBox("Current");
		chckbxCurrent.setFont(new Font("Tahoma", Font.BOLD, 18));
		chckbxCurrent.setBounds(466, 504, 97, 23);
		frame.getContentPane().add(chckbxCurrent);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("I accepts terms and conditions");
		chckbxNewCheckBox_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String CustomerName=textField.getText();
					String CustomerFatherName=textField_1.getText();
					String Address=textField_2.getText();
					@SuppressWarnings("unused")
					String Gender="";
					@SuppressWarnings("unused")
					String AccountType="";
					
					Connection con;
					Statement stmt,stmt2;
					ResultSet rs;
					
					if(CustomerName.isEmpty()||CustomerFatherName.isEmpty()||Address.isEmpty())
					{
						textField_3.setText("Please fill all required fields.");
					}
					else
					{
						if(rdbtnNewRadioButton.isSelected()||rdbtnFemale.isSelected()||rdbtnOther.isSelected())
						{
							
							if(rdbtnNewRadioButton.isSelected())
							{
								Gender="Male";
								rdbtnFemale.setSelected(false);
								rdbtnOther.setSelected(false);
							}
							if(rdbtnFemale.isSelected())
							{
								Gender="Female";
							}
							if(rdbtnOther.isSelected())
							{
								Gender="Other";
							}
							
							if(chckbxNewCheckBox.isSelected()||chckbxCurrent.isSelected())
							{
								
								if(chckbxNewCheckBox.isSelected())
								{
									AccountType="Saving Account";
									chckbxCurrent.setSelected(false);
								}
								if(chckbxCurrent.isSelected())
								{
									AccountType="Current Account";
								}				
								if(chckbxNewCheckBox_1.isSelected())
								{
									try
									{
										String url="jdbc:mysql://localhost:3306/bankproject"; //
										String username = "root"; // MySQL credentials
										String password = "12345";
										Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
									    con = DriverManager.getConnection(url, username, password);	
									    String accountnum;
									    int newaccountnum;
									    String query1;
									    String query2;
										try {
											stmt=con.createStatement();							
											query1="select count(account_no) from bankdata";
											rs= stmt.executeQuery(query1); // Execute query
											rs.next();
											accountnum= rs.getString("count(account_no)");
											newaccountnum=Integer.parseInt(accountnum);
											newaccountnum=newaccountnum+1;
											try {
												stmt2=con.createStatement();
												query2="Insert into bankdata values("+newaccountnum+",'"+CustomerName+"',"+"'"+CustomerFatherName+"',"+"'"+Address+"',"+"'"+Gender+"',"+"'"+AccountType+"',"+0+")";                                          
												
												int QueryOutput= stmt2.executeUpdate(query2);
												if(QueryOutput==1)
												{
													
													textField.setText(null);
													textField_1.setText(null);
													textField_2.setText(null);
													rdbtnNewRadioButton.setSelected(false);
													rdbtnFemale.setSelected(false);
													rdbtnOther.setSelected(false);
													chckbxNewCheckBox.setSelected(false);
													chckbxCurrent.setSelected(false);
													chckbxNewCheckBox_1.setSelected(false);
													textField_3.setText("Account created successfully your account no is "+newaccountnum);
												}
												else
												{
													textField_3.setText("Error occurred !");
												}
											}
											catch(Exception e3)
											{
												textField_3.setText("Error occurred or result not found.");
												JOptionPane.showMessageDialog(null,"Error occurred !");
											}
										}
										catch(Exception e2)
										{
											textField_3.setText("Error occurred or result not found.");
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
										textField_3.setText("Connection with database failed !");
										JOptionPane.showMessageDialog(null,"Connection with database failed !");
									}
								}
								else
								{
									textField_3.setText("Please accept terms and conditions");
								}
							}
							else
							{
								textField_3.setText("Please select account type.");
							}
						}
						else
						{
							textField_3.setText("Please select gender.");
						}
					}
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_1.setBounds(198, 574, 360, 25);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(95, 623, 550, 40);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			private Connection con;

			public void actionPerformed(ActionEvent e) {
				
				String CustomerName=textField.getText();
				String CustomerFatherName=textField_1.getText();
				String Address=textField_2.getText();
				@SuppressWarnings("unused")
				String Gender="";
				@SuppressWarnings("unused")
				String AccountType="";
				
				Connection con;
				Statement stmt,stmt2;
				ResultSet rs;
				
				if(CustomerName.isEmpty()||CustomerFatherName.isEmpty()||Address.isEmpty())
				{
					textField_3.setText("Please fill all required fields.");
				}
				else
				{
					if(rdbtnNewRadioButton.isSelected()||rdbtnFemale.isSelected()||rdbtnOther.isSelected())
					{
						
						if(rdbtnNewRadioButton.isSelected())
						{
							Gender="Male";
							rdbtnFemale.setSelected(false);
							rdbtnOther.setSelected(false);
						}
						if(rdbtnFemale.isSelected())
						{
							Gender="Female";
						}
						if(rdbtnOther.isSelected())
						{
							Gender="Other";
						}
						
						if(chckbxNewCheckBox.isSelected()||chckbxCurrent.isSelected())
						{
							
							if(chckbxNewCheckBox.isSelected())
							{
								AccountType="Saving Account";
								chckbxCurrent.setSelected(false);
							}
							if(chckbxCurrent.isSelected())
							{
								AccountType="Current Account";
							}				
							if(chckbxNewCheckBox_1.isSelected())
							{
								try
								{
									String url="jdbc:mysql://localhost:3306/bankproject"; //
									String username = "root"; // MySQL credentials
									String password = "12345";
									Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
								    con = DriverManager.getConnection(url, username, password);	
								    String accountnum;
								    int newaccountnum;
								    String query1;
								    String query2;
									try {
										stmt=con.createStatement();							
										query1="select count(account_no) from bankdata";
										rs= stmt.executeQuery(query1); // Execute query
										rs.next();
										accountnum= rs.getString("count(account_no)");
										newaccountnum=Integer.parseInt(accountnum);
										newaccountnum=newaccountnum+1;
										try {
											stmt2=con.createStatement();
											query2="Insert into bankdata values("+newaccountnum+",'"+CustomerName+"',"+"'"+CustomerFatherName+"',"+"'"+Address+"',"+"'"+Gender+"',"+"'"+AccountType+"',"+0+")";                                          
											
											int QueryOutput= stmt2.executeUpdate(query2);
											if(QueryOutput==1)
											{
												
												textField.setText(null);
												textField_1.setText(null);
												textField_2.setText(null);
												rdbtnNewRadioButton.setSelected(false);
												rdbtnFemale.setSelected(false);
												rdbtnOther.setSelected(false);
												chckbxNewCheckBox.setSelected(false);
												chckbxCurrent.setSelected(false);
												chckbxNewCheckBox_1.setSelected(false);
												textField_3.setText("Account created successfully your account no is "+newaccountnum);
											}
											else
											{
												textField_3.setText("Error occurred !");
											}
										}
										catch(Exception e3)
										{
											textField_3.setText("Error occurred or result not found.");
											JOptionPane.showMessageDialog(null,"Error occurred !");
										}
									}
									catch(Exception e2)
									{
										textField_3.setText("Error occurred or result not found.");
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
									textField_3.setText("Connection with database failed !");
									JOptionPane.showMessageDialog(null,"Connection with database failed !");
								}
							}
							else
							{
								textField_3.setText("Please accept terms and conditions");
							}
						}
						else
						{
							textField_3.setText("Please select account type.");
						}
					}
					else
					{
						textField_3.setText("Please select gender.");
					}
				}
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(294, 687, 150, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRetry = new JButton("Retry");
		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnOther.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxCurrent.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
			}
		});
		btnRetry.setForeground(Color.BLACK);
		btnRetry.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRetry.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnRetry.setBounds(26, 764, 200, 50);
		frame.getContentPane().add(btnRetry);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Option_menu optionframe=new Option_menu();
				optionframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnMainMenu.setForeground(Color.BLACK);
		btnMainMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMainMenu.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnMainMenu.setBounds(294, 764, 200, 50);
		frame.getContentPane().add(btnMainMenu);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.setBounds(555, 764, 200, 50);
		frame.getContentPane().add(btnExit);
	}
}
