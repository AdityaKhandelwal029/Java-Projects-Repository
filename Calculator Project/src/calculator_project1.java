import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_project1 {

	private JFrame frame;
	private JTextField textField;
	
	double value1,value2;
	int operator=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_project1 window = new calculator_project1();
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
	public calculator_project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(58, 45, 322, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton.getText();
				textField.setText(num);
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(58, 152, 63, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.setBounds(58, 211, 63, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBackground(SystemColor.info);
		btnNewButton_2.setBounds(58, 270, 63, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBackground(SystemColor.info);
		btnNewButton_3.setBounds(58, 329, 63, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_4.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBackground(SystemColor.info);
		btnNewButton_4.setBounds(146, 152, 63, 48);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_5.getText();
				textField.setText(num);
			}
		});
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBackground(SystemColor.info);
		btnNewButton_5.setBounds(230, 152, 63, 48);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_6.getText();
				textField.setText(num);
			}
		});
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBackground(SystemColor.info);
		btnNewButton_6.setBounds(146, 211, 63, 48);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_7.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_7.setBackground(SystemColor.info);
		btnNewButton_7.setBounds(230, 211, 63, 48);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_8.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.setBackground(SystemColor.info);
		btnNewButton_8.setBounds(146, 270, 63, 48);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("3");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_9.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBackground(SystemColor.info);
		btnNewButton_9.setBounds(230, 270, 63, 48);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				value1=Double.parseDouble(temp);
				textField.setText("");
				operator=4;
			}
		});
		btnNewButton_10.setForeground(Color.BLACK);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBackground(SystemColor.info);
		btnNewButton_10.setBounds(320, 152, 63, 48);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				value1=Double.parseDouble(temp);
				textField.setText("");
				operator=3;
			}
		});
		btnX.setForeground(Color.BLACK);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBackground(SystemColor.info);
		btnX.setBounds(320, 211, 63, 48);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				value1=Double.parseDouble(temp);
				textField.setText("");
				operator=2;
			}
		});
		btnNewButton_12.setForeground(Color.BLACK);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBackground(SystemColor.info);
		btnNewButton_12.setBounds(320, 270, 63, 48);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_8_1 = new JButton("00");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_8_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8_1.setForeground(Color.BLACK);
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8_1.setBackground(SystemColor.info);
		btnNewButton_8_1.setBounds(146, 329, 63, 48);
		frame.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton(".");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_8_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8_2.setForeground(Color.BLACK);
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8_2.setBackground(SystemColor.info);
		btnNewButton_8_2.setBounds(230, 329, 63, 48);
		frame.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_12_1 = new JButton("+");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				value1=Double.parseDouble(temp);
				textField.setText("");
				operator=1;
			}
		});
		btnNewButton_12_1.setForeground(Color.BLACK);
		btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_1.setBackground(SystemColor.info);
		btnNewButton_12_1.setBounds(317, 329, 63, 48);
		frame.getContentPane().add(btnNewButton_12_1);
		
		JButton btnNewButton_12_2 = new JButton("C");
		btnNewButton_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText();
				if(num.length()>0)
				{
					String num1=num.substring(0,num.length()-1);
					textField.setText(num1);
				}
				else
				{
					textField.setText(num);
				}
			}
		});
		btnNewButton_12_2.setForeground(Color.BLACK);
		btnNewButton_12_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_2.setBackground(SystemColor.info);
		btnNewButton_12_2.setBounds(58, 388, 63, 48);
		frame.getContentPane().add(btnNewButton_12_2);
		
		JButton btnNewButton_12_3 = new JButton("CA");
		btnNewButton_12_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num="";
				textField.setText(num);
				value1=0;
				value2=0;
				operator=0;
			}
		});
		btnNewButton_12_3.setForeground(Color.BLACK);
		btnNewButton_12_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_3.setBackground(SystemColor.info);
		btnNewButton_12_3.setBounds(146, 388, 63, 48);
		frame.getContentPane().add(btnNewButton_12_3);
		
		JButton btnNewButton_12_4 = new JButton("%");
		btnNewButton_12_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=textField.getText();
				double value=Double.parseDouble(temp);
				value=value/100;
				temp=Double.toString(value);
				textField.setText(temp);
			}
		});
		btnNewButton_12_4.setForeground(Color.BLACK);
		btnNewButton_12_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_4.setBackground(SystemColor.info);
		btnNewButton_12_4.setBounds(230, 388, 63, 48);
		frame.getContentPane().add(btnNewButton_12_4);
		
		JButton btnNewButton_12_5 = new JButton("=");
		btnNewButton_12_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator==1)
				{
					value2=Double.parseDouble(textField.getText());
					value1=value1+value2;
					String str = Double.toString(value1);
					textField.setText(str);
				}
				if(operator==2)
				{
					value2=Double.parseDouble(textField.getText());
					value1=value1-value2;
					String str = Double.toString(value1);
					textField.setText(str);
				}
				if(operator==3)
				{
					value2=Double.parseDouble(textField.getText());
					value1=value1*value2;
					String str = Double.toString(value1);
					textField.setText(str);
				}
				if(operator==4)
				{
					value2=Double.parseDouble(textField.getText());
					value1=value1/value2;
					String str = Double.toString(value1);
					textField.setText(str);
				}
			}
		});
		btnNewButton_12_5.setForeground(Color.BLACK);
		btnNewButton_12_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12_5.setBackground(SystemColor.info);
		btnNewButton_12_5.setBounds(320, 388, 63, 48);
		frame.getContentPane().add(btnNewButton_12_5);
	}
}
