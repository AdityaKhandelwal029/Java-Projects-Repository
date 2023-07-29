package typing_master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.io.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class loginPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
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
	public loginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1615, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Typing master application");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 1579, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(450, 286, 143, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2, true));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(696, 287, 350, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(450, 366, 143, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String username=textField.getText();
					char[] userpassword=passwordField.getPassword();
					String temp=new String(userpassword);
					if(username.equals("admin")&&temp.equals("123"))
					{
						textField.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(null,"Login successfull !");
						Menu menuframe=new Menu();
						menuframe.frame.setVisible(true);
						frame.dispose();
					}
					else
					{
						textField.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
					}
				}
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new LineBorder(SystemColor.desktop, 2));
		passwordField.setBounds(696, 367, 350, 45);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username=textField.getText();
				char[] userpassword=passwordField.getPassword();
				String temp=new String(userpassword);
				if(username.equals("admin")&&temp.equals("123"))
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login successfull !");
				}
				else
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				char[] userpassword=passwordField.getPassword();
				String temp=new String(userpassword);
				if(username.equals("admin")&&temp.equals("123"))
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login successfull !");
					Menu menuframe=new Menu();
					menuframe.frame.setVisible(true);
					frame.dispose();
				}
				else
				{
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Login Failed ! Try Again");
				}
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(450, 482, 614, 45);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		lblNewLabel_2.setBackground(SystemColor.activeCaption);
		lblNewLabel_2.setBounds(386, 220, 705, 376);
		frame.getContentPane().add(lblNewLabel_2);
	}
}