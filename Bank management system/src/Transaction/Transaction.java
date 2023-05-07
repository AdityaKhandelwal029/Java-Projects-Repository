package Transaction;

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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Transaction {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	int currentbalance_1;
	int newbalance_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction window = new Transaction();
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
	public Transaction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 1100);
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
		
		JLabel lblNewLabel_2 = new JLabel("Transaction portal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(266, 127, 300, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter account number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(80, 209, 280, 40);
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
							String query="select account_balance from bankdata where account_no="+acc_no;
							rs= stmt.executeQuery(query); // Execute query
							rs.next();
							String currentbalance= rs.getString("account_balance");
							textField_1.setText(" Current balance is ₹"+currentbalance);	
							currentbalance_1=Integer.parseInt(currentbalance);
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
		textField.setBounds(421, 209, 280, 40);
		frame.getContentPane().add(textField);
		
		JButton btnCheckcurrentbalance = new JButton("Check-current-balance");
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
						String query="select account_balance from bankdata where account_no="+acc_no;
						rs= stmt.executeQuery(query); // Execute query
						rs.next();
						String currentbalance= rs.getString("account_balance");
						textField_1.setText(" Current balance is ₹"+currentbalance);	
						currentbalance_1=Integer.parseInt(currentbalance);
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
		btnCheckcurrentbalance.setForeground(Color.BLACK);
		btnCheckcurrentbalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckcurrentbalance.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCheckcurrentbalance.setBounds(266, 308, 250, 50);
		frame.getContentPane().add(btnCheckcurrentbalance);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(131, 409, 500, 57);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Enter amount");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(122, 521, 159, 40);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_2.setBounds(352, 521, 280, 40);
		frame.getContentPane().add(textField_2);
		
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
		btnMainMenu.setBounds(31, 796, 250, 50);
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
		btnExit.setBounds(451, 796, 250, 50);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Debit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc_no1=textField.getText();
				String debitamount=textField_2.getText();
				newbalance_1=Integer.parseInt(debitamount);
				currentbalance_1=currentbalance_1-newbalance_1;
				String temp=String.valueOf(currentbalance_1);
				Connection con1;
				Statement stmt1;
				ResultSet rs1;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; //
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con1 = DriverManager.getConnection(url, username, password);	
				    try {
				    	stmt1=con1.createStatement();
				    	String query1="update bankdata set account_balance="+temp+" where account_no="+acc_no1;
				    	int update=stmt1.executeUpdate(query1);
				    	if(update==1)
				    	{
				    		textField_3.setText("Transaction successful current balance is ₹ "+temp);
				    	}
				    	else
				    	{
				    		textField_3.setText("Transaction unsuccessful");
				    	}
				    	
				    }
				    catch(SQLException e2)
				    {
				    	textField_3.setText("Error occurred");
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
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(131, 618, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCredit = new JButton("Credit");
		btnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc_no1=textField.getText();
				String debitamount=textField_2.getText();
				newbalance_1=Integer.parseInt(debitamount);
				currentbalance_1=currentbalance_1+newbalance_1;
				String temp=String.valueOf(currentbalance_1);
				Connection con1;
				Statement stmt1;
				ResultSet rs1;
				try
				{
					String url="jdbc:mysql://localhost:3306/bankproject"; //
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con1 = DriverManager.getConnection(url, username, password);	
				    try {
				    	stmt1=con1.createStatement();
				    	String query1="update bankdata set account_balance="+temp+" where account_no="+acc_no1;
				    	int update=stmt1.executeUpdate(query1);
				    	if(update==1)
				    	{
				    		textField_3.setText("Transaction successful current balance is ₹ "+temp);
				    	}
				    	else
				    	{
				    		textField_3.setText("Transaction unsuccessful");
				    	}
				    	
				    }
				    catch(SQLException e2)
				    {
				    	textField_3.setText("Error occurred");
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
		});
		btnCredit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCredit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCredit.setBounds(481, 618, 150, 40);
		frame.getContentPane().add(btnCredit);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_3.setBounds(131, 704, 500, 57);
		frame.getContentPane().add(textField_3);
	}

}
