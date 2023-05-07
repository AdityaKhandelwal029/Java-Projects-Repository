package Check_balance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import Option_menu.Option_menu;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Check_balance {

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
					Check_balance window = new Check_balance();
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
	public Check_balance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().setBounds(new Rectangle(0, 0, 800, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABC Bank Private Ltd");
		lblNewLabel.setBounds(new Rectangle(225, 0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(225, 0, 360, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(323, 66, 150, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Check Account Balance portal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(225, 127, 360, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter account number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(78, 216, 280, 40);
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
							String name1= rs.getString("account_balance");
							textField_1.setText(" Current balance is ₹"+name1);
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
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(387, 220, 280, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCheck = new JButton("Check-balance");
		btnCheck.addActionListener(new ActionListener() {
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
						String name1= rs.getString("account_balance");
						textField_1.setText(" Current balance is ₹"+name1);
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
		btnCheck.setBounds(268, 325, 250, 50);
		frame.getContentPane().add(btnCheck);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(111, 414, 540, 70);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
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
		btnMainMenu.setBounds(66, 590, 250, 50);
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
		btnExit.setBounds(474, 590, 250, 50);
		frame.getContentPane().add(btnExit);
		frame.setBounds(new Rectangle(0, 0, 800, 800));
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
