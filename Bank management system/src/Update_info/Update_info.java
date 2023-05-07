package Update_info;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Option_menu.Option_menu;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Update_info {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_info window = new Update_info();
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
	public Update_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABC Bank Private Ltd");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(new Rectangle(225, 0, 0, 0));
		lblNewLabel.setBounds(225, 0, 360, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(323, 66, 150, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Account update portal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(247, 129, 360, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter account number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(80, 191, 280, 40);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String acc_no=textField.getText();
					Connection con;
					Statement stmt;
					ResultSet rs;
					try
					{
						String url="jdbc:mysql://localhost:3306/bankproject"; //
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="select *from bankdata where account_no="+acc_no;
							rs= stmt.executeQuery(query); // Execute query
							rs.next();
							String username1=rs.getString("name");
							String userfathername=rs.getString("father_name");
							String useraddress=rs.getString("address");
							String usergender=rs.getString("gender");
							String useraccounttype=rs.getString("account_type");
							textField_1.setText("Account found Please update details below ");
							textField_2.setText(username1);
							textField_3.setText(userfathername);
							textField_4.setText(useraddress);
							textField_5.setText(usergender);
							textField_6.setText(useraccounttype);							                                                                                                       			
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
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(393, 191, 280, 40);
		frame.getContentPane().add(textField);
		
		JButton btnCheck = new JButton("Check-account");
		btnCheck.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String acc_no=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; //
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="select *from bankdata where account_no="+acc_no;
						rs= stmt.executeQuery(query); // Execute query
						rs.next();
						String username1=rs.getString("name");
						String userfathername=rs.getString("father_name");
						String useraddress=rs.getString("address");
						String usergender=rs.getString("gender");
						String useraccounttype=rs.getString("account_type");	
						textField_1.setText("Account found Please update details below ");
						textField_2.setText(username1);
						textField_3.setText(userfathername);
						textField_4.setText(useraddress);
						textField_5.setText(usergender);
						textField_6.setText(useraccounttype);							                                                                                                       			
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
		btnCheck.setForeground(Color.BLACK);
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheck.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCheck.setBounds(232, 270, 250, 50);
		frame.getContentPane().add(btnCheck);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(93, 342, 540, 50);
		frame.getContentPane().add(textField_1);
		
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
		btnMainMenu.setBounds(62, 820, 250, 50);
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
		btnExit.setBounds(462, 820, 250, 50);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(156, 423, 120, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(345, 424, 250, 40);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Father's name");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(156, 475, 173, 40);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(345, 475, 250, 40);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("Address");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(156, 526, 120, 40);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_4.setBounds(345, 527, 250, 40);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_4_3 = new JLabel("Gender");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(156, 577, 120, 40);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_5.setBounds(345, 578, 250, 40);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_4_4 = new JLabel("Account type");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(156, 628, 156, 40);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String acc_no=textField.getText();
					String username1=textField_2.getText();
					String userfathername=textField_3.getText();
					String useraddress=textField_4.getText();
					String usergender=textField_4.getText();
					String useraccounttype=textField_5.getText();
					Connection con;
					Statement stmt;
					try
					{
						String url="jdbc:mysql://localhost:3306/bankproject"; //
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="update bankdata set name = '"+username1+"', father_name = '"+userfathername+"', address = '"+useraddress+"', gender = '"+usergender+"', account_type='"+useraccounttype+"' where account_no="+acc_no;                                                           
							int update=stmt.executeUpdate(query); // Execute query
							if(update==1)
							{
							   textField_1.setText("Account updated successfully. ");
							}
							else
							{
							   textField_1.setText("Account updation failed !");
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
						textField_1.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
				}
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_6.setBounds(345, 628, 250, 40);
		frame.getContentPane().add(textField_6);
		
		JButton btnMainMenu_1 = new JButton("Update account");
		btnMainMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc_no=textField.getText();
				String username1=textField_2.getText();
				String userfathername=textField_3.getText();
				String useraddress=textField_4.getText();
				String usergender=textField_4.getText();
				String useraccounttype=textField_5.getText();
				Connection con;
				Statement stmt;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; //
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="update bankdata set name = '"+username1+"', father_name = '"+userfathername+"', address = '"+useraddress+"', gender = '"+usergender+"', account_type='"+useraccounttype+"' where account_no="+acc_no;                                                           
						int update=stmt.executeUpdate(query); // Execute query
						if(update==1)
						{
						   textField_1.setText("Account updated successfully. ");
						}
						else
						{
						   textField_1.setText("Account updation failed !");
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
					textField_1.setText("Connection with database failed !");
					JOptionPane.showMessageDialog(null,"Connection with database failed !");
				}
				
			}
		});
		btnMainMenu_1.setForeground(Color.BLACK);
		btnMainMenu_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMainMenu_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnMainMenu_1.setBounds(232, 712, 250, 50);
		frame.getContentPane().add(btnMainMenu_1);
	}
}
