import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login_Project {

	private JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Project window = new Login_Project();
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
	public Login_Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("         User Login Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(145, 35, 320, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLoginId = new JLabel("Login Id");
		lblLoginId.setForeground(SystemColor.desktop);
		lblLoginId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLoginId.setBounds(112, 115, 102, 36);
		frame.getContentPane().add(lblLoginId);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(112, 201, 102, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String username=textField.getText();
					@SuppressWarnings("deprecation")
					String password=passwordField_1.getText();
					if(username.equals("aditya") && password.equals("123"))
					{
						textField.setText(null);
						passwordField_1.setText(null);
						textField_1.setText("Login Successfull !");
						JOptionPane.showMessageDialog(null,"Login Successfull !");
					}
					else
					{
						textField.setText(null);
						passwordField_1.setText(null);
						textField_1.setText("Login Failed");
						JOptionPane.showMessageDialog(null,"Login Failed !");
					}
				}
			}
		});
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_1.setBounds(316, 202, 200, 40);
		frame.getContentPane().add(passwordField_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(316, 116, 200, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField_1.getText();
				if(username.equals("aditya") && password.equals("123"))
				{
					textField.setText(null);
					passwordField_1.setText(null);
					textField_1.setText("Login Successfull !");
					JOptionPane.showMessageDialog(null,"Login Successfull !");
				}
				else
				{
					textField.setText(null);
					passwordField_1.setText(null);
					textField_1.setText("Login Failed !");
					JOptionPane.showMessageDialog(null,"Login Failed !");
				}
			}
		});
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(123, 304, 124, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_1.setText(null);
				textField_1.setText(null);
			}
		});
		btnReset.setForeground(SystemColor.desktop);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(277, 304, 124, 36);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(SystemColor.desktop);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(411, 304, 124, 36);
		frame.getContentPane().add(btnExit);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(123, 253, 410, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
