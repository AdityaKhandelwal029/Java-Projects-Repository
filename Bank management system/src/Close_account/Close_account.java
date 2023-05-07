package Close_account;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Option_menu.Option_menu;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Close_account {

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
					Close_account window = new Close_account();
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
	public Close_account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(0, 0, 800, 800));
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
		
		JLabel lblNewLabel_2 = new JLabel("Close bank account portal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(237, 127, 348, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter account number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(69, 204, 280, 40);
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
						String url="jdbc:mysql://localhost:3306/bankproject"; 
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="select account_balance from bankdata where account_no="+acc_no;
							rs= stmt.executeQuery(query); // Execute query
							rs.next();
							String name1= rs.getString("account_balance");
							textField_1.setText("Account exists Current balance is ₹"+name1);
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
		textField.setBounds(418, 204, 280, 40);
		frame.getContentPane().add(textField);
		
		JButton btnCheckstatus = new JButton("Check-status");
		btnCheckstatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc_no=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; 
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="select account_balance from bankdata where account_no="+acc_no;
						rs= stmt.executeQuery(query); // Execute query
						rs.next();
						String name1= rs.getString("account_balance");
						textField_1.setText("Account exists Current balance is ₹"+name1);
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
		btnCheckstatus.setForeground(Color.BLACK);
		btnCheckstatus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckstatus.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCheckstatus.setBounds(237, 317, 250, 50);
		frame.getContentPane().add(btnCheckstatus);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(112, 432, 500, 55);
		frame.getContentPane().add(textField_1);
		
		JButton btnClose = new JButton("Close-user-account");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc_no=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; 
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="delete from bankdata where account_no="+acc_no;
						int update= stmt.executeUpdate(query); // Execute query
						if(update==1)
						{
							textField_1.setText("User account deleted successfully.");
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
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClose.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnClose.setBounds(237, 560, 250, 50);
		frame.getContentPane().add(btnClose);
		
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
		btnMainMenu.setBounds(60, 672, 250, 50);
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
		btnExit.setBounds(448, 672, 250, 50);
		frame.getContentPane().add(btnExit);
		frame.setBounds(new Rectangle(799, 8, 800, 800));
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
