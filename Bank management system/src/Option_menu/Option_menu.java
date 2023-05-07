package Option_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import Check_balance.Check_balance;
import Check_info.Check_info;
import Close_account.Close_account;
import Create_account.Create_account;
import Transaction.Transaction;
import Update_info.Update_info;
import main_login.main_login;

import java.awt.Color;

@SuppressWarnings("unused")
public class Option_menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option_menu window = new Option_menu();
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
	public Option_menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABC Bank Private Ltd");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(225, 0, 360, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(323, 66, 150, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create an account");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Create_account createaframe=new Create_account();
				createaframe.frame.setVisible(true);
				frame.dispose();	
			}
		});
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBounds(83, 151, 250, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUpdateInformation = new JButton("Update information");
		btnUpdateInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_info updateframe=new Update_info();
				updateframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnUpdateInformation.setForeground(Color.BLACK);
		btnUpdateInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdateInformation.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnUpdateInformation.setBounds(83, 255, 250, 50);
		frame.getContentPane().add(btnUpdateInformation);
		
		JButton btnTransaction = new JButton("Transaction");
		btnTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction transactionframe=new Transaction();
				transactionframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnTransaction.setForeground(Color.BLACK);
		btnTransaction.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTransaction.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnTransaction.setBounds(83, 356, 250, 50);
		frame.getContentPane().add(btnTransaction);
		
		JButton btnCheckInformation = new JButton("Check balance");
		btnCheckInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check_balance checkframe=new Check_balance();
				checkframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCheckInformation.setForeground(Color.BLACK);
		btnCheckInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckInformation.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCheckInformation.setBounds(428, 151, 250, 50);
		frame.getContentPane().add(btnCheckInformation);
		
		JButton btnCloseAnAccount = new JButton("Close an account");
		btnCloseAnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Close_account closeframe=new Close_account();
				closeframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCloseAnAccount.setForeground(Color.BLACK);
		btnCloseAnAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCloseAnAccount.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCloseAnAccount.setBounds(428, 255, 250, 50);
		frame.getContentPane().add(btnCloseAnAccount);
		
		JButton btnC = new JButton("Check information");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check_info checkframe=new Check_info();
				checkframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnC.setForeground(Color.BLACK);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnC.setBounds(428, 356, 250, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnExit.setBounds(225, 459, 332, 50);
		frame.getContentPane().add(btnExit);
	}
}
