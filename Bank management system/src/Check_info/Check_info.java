package Check_info;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.mysql.cj.exceptions.RSAException;

import Option_menu.Option_menu;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Check_info {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_info window = new Check_info();
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
	public Check_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 900);
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
		
		JLabel lblNewLabel_2 = new JLabel("Account information portal");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(225, 137, 366, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter account number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(105, 188, 280, 40);
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
							String useraccountno1= rs.getString("account_no");
							String username1=rs.getString("name");
							String userfathername=rs.getString("father_name");
							String useraddress=rs.getString("address");
							String usergender=rs.getString("gender");
							String useraccounttype=rs.getString("account_type");
							String useraccountbalance=rs.getString("account_balance");	
							textField_7.setText("Account found");
							textField_1.setText(username1);
							textField_2.setText(userfathername);
							textField_3.setText(useraddress);
							textField_4.setText(usergender);
							textField_5.setText(useraccounttype);
							textField_6.setText(useraccountbalance);								                                                                                                       			
						}
						catch(SQLException e2)
						{
							textField_7.setText("Error occurred or result not found.");
							JOptionPane.showMessageDialog(null,"Error occurred !");
							textField_1.setText(null);
							textField_2.setText(null);
							textField_3.setText(null);
							textField_4.setText(null);
							textField_5.setText(null);
							textField_6.setText(null);	
						}
					}
					catch(SQLException e1)
					{
						textField_7.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
					catch(Exception e1)
					{
						textField_7.setText("Connection with database failed !");
						JOptionPane.showMessageDialog(null,"Connection with database failed !");
					}
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(416, 189, 280, 40);
		frame.getContentPane().add(textField);
		
		JButton btnCheckcurrentbalance = new JButton("Check-user-info");
		btnCheckcurrentbalance.addActionListener(new ActionListener() {
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
						String useraccountno1= rs.getString("account_no");
						String username1=rs.getString("name");
						String userfathername=rs.getString("father_name");
						String useraddress=rs.getString("address");
						String usergender=rs.getString("gender");
						String useraccounttype=rs.getString("account_type");
						String useraccountbalance=rs.getString("account_balance");	
						textField_7.setText("Account found");
						textField_1.setText(username1);
						textField_2.setText(userfathername);
						textField_3.setText(useraddress);
						textField_4.setText(usergender);
						textField_5.setText(useraccounttype);
						textField_6.setText(useraccountbalance);								                                                                                                       			
					}
					catch(SQLException e2)
					{
						textField_7.setText("Error occurred or result not found.");
						JOptionPane.showMessageDialog(null,"Error occurred !");
						
					}
				}
				catch(SQLException e1)
				{
					textField_7.setText("Connection with database failed !");
					JOptionPane.showMessageDialog(null,"Connection with database failed !");
				}
				catch(Exception e1)
				{
					textField_7.setText("Connection with database failed !");
					JOptionPane.showMessageDialog(null,"Connection with database failed !");
				}
				
			}
		});
		btnCheckcurrentbalance.setForeground(Color.BLACK);
		btnCheckcurrentbalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckcurrentbalance.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCheckcurrentbalance.setBounds(255, 253, 250, 50);
		frame.getContentPane().add(btnCheckcurrentbalance);
		
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
		btnMainMenu.setBounds(48, 800, 250, 50);
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
		btnExit.setBounds(486, 800, 250, 50);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(163, 432, 120, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Father's name");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(161, 483, 173, 40);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Address");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(163, 534, 120, 40);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Gender");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(163, 585, 120, 40);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Account type");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(163, 632, 156, 40);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Account balance");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4_1.setBounds(163, 683, 156, 40);
		frame.getContentPane().add(lblNewLabel_4_4_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(441, 435, 250, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(441, 484, 250, 40);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(441, 535, 250, 40);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_4.setBounds(441, 586, 250, 40);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_5.setBounds(441, 633, 250, 40);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_6.setBounds(441, 683, 250, 40);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_7.setBounds(143, 342, 502, 40);
		frame.getContentPane().add(textField_7);
	}
}
