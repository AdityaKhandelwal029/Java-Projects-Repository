package typing_master;
import java.util.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PracticeMode {
	 static JFrame frame;
	 public static int int_random;
	 public static JTextField textField;
	 public static JTextField textField_1;
	 public static String outputValue="";
	 public static String[] inputValues=new String[] {"ABCDEFGHIJKLM","NOPQRSTUVWXYZ","abcdefghijlm","nopqrstuvwxyz","0123456789","`!@#$%^&*()","[],.aa","qwertyuiop","asdfghjkl","zxcvbnm","qwer",
			 "tyuiop","asdfg","hjkl,","zxcv","bnm<>?","q w e r t    y u i o p","a s d f g    h j k l ,","z x c v    b n m <> ?","aa ss dd ff jj kk ll","ad ad jk jk ad ad jk jk",
			 "afsd afsd j,kl j,kl","dsak dsak jkfl jkfl","ajsk dfl,? jaks laks","add add add add","lkka kdsf? ksja sjff","add ads adds all","sasl dljf llja kkad","ad faff ll fa aka as",
			 "ee ii ee ii","aeil aeil siek siek","+}+} +}+} $h%f $h%f","EEEc EEEc rUiC rUiC","wrRk UOfe CnwE aEoF","UNESCO UNESCO UNESCO UNESCO",
			 "Kissin Caicos Nora Eldon Nilsen","Lucien Wilsonian Jodi WA Keenan",
			 "Frauenfeld Eli Londonise Californian Afrikaner Disraeli Odin Clarendon",
			 "Kuril Corriedale Louisiana Noel Conrad RNA Liriodendron Doreen Dan",
			 "Like a Dear Friend. O Lord. London in UK. Oakland, and Ken.",
			 "And no one else will know. Our decision was a .could confide.",
			 "EkCr .Wdj esuo cFaL btS8 BL.4 M597 4Ex< btS8 BL.4 M597 4Ex<",
			 "Donaldson Dial Landon Nd Douala Ceres btS8 BL.4 M597 4Ex<",
			 "13579 13579 24680 24680 Afrikaner Disraeli Odin Clarend",
			 "Writing in the month of January 1903, to 1905. June 6, 1916.",
			 "Here are 7,000,000 comrades in an revolutionary movement.",
			 "The man had gone into Alaska with At 5,70 must be 350,000,000.",
			 "I like him 6 tin biscuit, 4 bag rice24 tin It was somewhere day.",
			 "privatization Mesozoic zinnia Giza weatherize _last level cleared","Hello World!"};	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					PracticeMode window = new PracticeMode();
					PracticeMode.frame.setVisible(true);
					JOptionPane.showMessageDialog(null,"Instructions : Please type the word's displayed.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PracticeMode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Consolas", Font.PLAIN, 30));
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
		
		JButton btnNewButton = new JButton("Main menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Menu Menuframe=new Menu();
				Menuframe.frame.setVisible(true);
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(1165, 83, 290, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Restart");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				@SuppressWarnings("unused")
				Random rand = new Random(); 
			    int upperbound = 50;
				int_random = rand.nextInt(upperbound); 
				String temp=inputValues[int_random];
				textField_1.setText(temp);	
				textField.setText(null);
				JOptionPane.showMessageDialog(null,"Instructions : Please type the word's displayed.");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setBounds(133, 83, 290, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Practice Mode ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_2.setBounds(564, 83, 490, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3_2 = new JButton("`");
		btnNewButton_3_2.setForeground(Color.BLACK);
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2.setBounds(282, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_4_2 = new JButton("1");
		btnNewButton_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_4_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_4_2.setBounds(347, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_4_2);
		
		JButton btnNewButton_3_4 = new JButton("2");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_4.setBounds(410, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("3");
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_5.setBounds(475, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("4");
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_6.setBounds(540, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("5");
		btnNewButton_3_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_7.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_7.setBounds(605, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("6");
		btnNewButton_3_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_8.setBounds(670, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("7");
		btnNewButton_3_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_9.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_9.setBounds(735, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("8");
		btnNewButton_3_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_10.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_10.setBounds(800, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_10);
		
		JButton btnNewButton_3_11 = new JButton("9");
		btnNewButton_3_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_11.setBounds(865, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_11);
		
		JButton btnNewButton_3_12 = new JButton("0");
		btnNewButton_3_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_12.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_12.setBounds(930, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_12);
		
		JButton btnNewButton_3_13 = new JButton("-");
		btnNewButton_3_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13.setBounds(995, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_13);
		
		JButton btnNewButton_3_13_1 = new JButton("=");
		btnNewButton_3_13_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_1.setBounds(1060, 491, 55, 50);
		frame.getContentPane().add(btnNewButton_3_13_1);
		
		JButton btnNewButton_3_13_2 = new JButton("backspace");
		btnNewButton_3_13_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3_13_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_2.setBounds(1125, 491, 134, 50);
		frame.getContentPane().add(btnNewButton_3_13_2);
		
		JButton btnNewButton_3_2_1 = new JButton("tab");
		btnNewButton_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1.setBounds(282, 552, 93, 50);
		frame.getContentPane().add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_3_1 = new JButton("Q");
		btnNewButton_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_3_1.setBounds(385, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_4_1 = new JButton("W");
		btnNewButton_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_4_1.setBounds(450, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_4_1);
		
		JButton btnNewButton_3_5_1 = new JButton("E");
		btnNewButton_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_5_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_5_1.setBounds(515, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_5_1);
		
		JButton btnNewButton_3_6_1 = new JButton("R");
		btnNewButton_3_6_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_6_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_6_1.setBounds(580, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_6_1);
		
		JButton btnNewButton_3_7_1 = new JButton("T");
		btnNewButton_3_7_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_7_1.setBounds(645, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_7_1);
		
		JButton btnNewButton_3_8_1 = new JButton("Y");
		btnNewButton_3_8_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_8_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_8_1.setBounds(710, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_8_1);
		
		JButton btnNewButton_3_9_1 = new JButton("U");
		btnNewButton_3_9_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_9_1.setBounds(775, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_9_1);
		
		JButton btnNewButton_3_10_1 = new JButton("I");
		btnNewButton_3_10_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_10_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_10_1.setBounds(840, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_10_1);
		
		JButton btnNewButton_3_11_1 = new JButton("O");
		btnNewButton_3_11_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_11_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_11_1.setBounds(905, 552, 55, 50);
		frame.getContentPane().add(btnNewButton_3_11_1);
		
		JButton btnNewButton_3_12_1 = new JButton("P");
		btnNewButton_3_12_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_12_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_12_1.setBounds(970, 556, 55, 50);
		frame.getContentPane().add(btnNewButton_3_12_1);
		
		JButton btnNewButton_3_13_3 = new JButton("[");
		btnNewButton_3_13_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_3.setBounds(1035, 556, 55, 50);
		frame.getContentPane().add(btnNewButton_3_13_3);
		
		JButton btnNewButton_3_13_1_1 = new JButton("]");
		btnNewButton_3_13_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_1_1.setBounds(1100, 556, 55, 50);
		frame.getContentPane().add(btnNewButton_3_13_1_1);
		
		JButton btnNewButton_3_13_2_1 = new JButton("\\");
		btnNewButton_3_13_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_2_1.setBounds(1165, 556, 94, 50);
		frame.getContentPane().add(btnNewButton_3_13_2_1);
		
		JButton btnNewButton_3_2_1_1 = new JButton("Caps lock");
		btnNewButton_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1_1.setBounds(282, 613, 118, 50);
		frame.getContentPane().add(btnNewButton_3_2_1_1);
		
		JButton btnNewButton_3_3_1_1 = new JButton("A");
		btnNewButton_3_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_3_1_1.setBounds(410, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_3_1_1);
		
		JButton btnNewButton_3_4_1_1 = new JButton("S");
		btnNewButton_3_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_4_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_4_1_1.setBounds(475, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_4_1_1);
		
		JButton btnNewButton_3_5_1_1 = new JButton("D");
		btnNewButton_3_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_5_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_5_1_1.setBounds(540, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_5_1_1);
		
		JButton btnNewButton_3_6_1_1 = new JButton("F");
		btnNewButton_3_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_6_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_6_1_1.setBounds(605, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_6_1_1);
		
		JButton btnNewButton_3_7_1_1 = new JButton("G");
		btnNewButton_3_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_7_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_7_1_1.setBounds(670, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_7_1_1);
		
		JButton btnNewButton_3_8_1_1 = new JButton("H");
		btnNewButton_3_8_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_8_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_8_1_1.setBounds(735, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_8_1_1);
		
		JButton btnNewButton_3_9_1_1 = new JButton("J");
		btnNewButton_3_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_9_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_9_1_1.setBounds(800, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_9_1_1);
		
		JButton btnNewButton_3_10_1_1 = new JButton("K");
		btnNewButton_3_10_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_10_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_10_1_1.setBounds(865, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_10_1_1);
		
		JButton btnNewButton_3_11_1_1 = new JButton("L");
		btnNewButton_3_11_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_11_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_11_1_1.setBounds(930, 613, 55, 50);
		frame.getContentPane().add(btnNewButton_3_11_1_1);
		
		JButton btnNewButton_3_12_1_1 = new JButton(";");
		btnNewButton_3_12_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_12_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_12_1_1.setBounds(995, 617, 55, 50);
		frame.getContentPane().add(btnNewButton_3_12_1_1);
		
		JButton btnNewButton_3_13_3_1 = new JButton("'");
		btnNewButton_3_13_3_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_3_1.setBounds(1060, 617, 55, 50);
		frame.getContentPane().add(btnNewButton_3_13_3_1);
		
		JButton btnNewButton_3_13_2_1_1 = new JButton("Enter");
		btnNewButton_3_13_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1)
				{
					btnNewButton_3_13_2_1_1.setBackground(Color.GREEN);
					outputValue=textField.getText();
					if(outputValue.equals(inputValues[int_random]))
					{
						JOptionPane.showMessageDialog(null,"Correct !");
						Random rand = new Random(); 
					    int upperbound = 50;
						int_random = rand.nextInt(upperbound); 
						String temp=inputValues[int_random];
						textField_1.setText(temp);	
						textField.setText(null);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect input !");
						Random rand = new Random(); 
					    int upperbound = 50;
						int_random = rand.nextInt(upperbound); 
						String temp=inputValues[int_random];
						textField_1.setText(temp);	
						textField.setText(null);
					}
				}
			}
		});
		btnNewButton_3_13_2_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		btnNewButton_3_13_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_2_1_1.setBounds(1125, 617, 134, 50);
		frame.getContentPane().add(btnNewButton_3_13_2_1_1);
		
		JButton btnNewButton_3_2_1_1_1 = new JButton("Shift");
		btnNewButton_3_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1_1_1.setBounds(282, 674, 141, 50);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1);
		
		JButton btnNewButton_3_3_1_1_1 = new JButton("Z");
		btnNewButton_3_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_3_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_3_1_1_1.setBounds(435, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_3_1_1_1);
		
		JButton btnNewButton_3_4_1_1_1 = new JButton("X");
		btnNewButton_3_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_4_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_4_1_1_1.setBounds(500, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_4_1_1_1);
		
		JButton btnNewButton_3_5_1_1_1 = new JButton("C");
		btnNewButton_3_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_5_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_5_1_1_1.setBounds(565, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_5_1_1_1);
		
		JButton btnNewButton_3_6_1_1_1 = new JButton("V");
		btnNewButton_3_6_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_6_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_6_1_1_1.setBounds(630, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_6_1_1_1);
		
		JButton btnNewButton_3_7_1_1_1 = new JButton("B");
		btnNewButton_3_7_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_7_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_7_1_1_1.setBounds(695, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_7_1_1_1);
		
		JButton btnNewButton_3_8_1_1_1 = new JButton("N");
		btnNewButton_3_8_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_8_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_8_1_1_1.setBounds(760, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_8_1_1_1);
		
		JButton btnNewButton_3_9_1_1_1 = new JButton("M");
		btnNewButton_3_9_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_9_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_9_1_1_1.setBounds(825, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_9_1_1_1);
		
		JButton btnNewButton_3_10_1_1_1 = new JButton(",");
		btnNewButton_3_10_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_10_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_10_1_1_1.setBounds(890, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_10_1_1_1);
		
		JButton btnNewButton_3_11_1_1_1 = new JButton(".");
		btnNewButton_3_11_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_11_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_11_1_1_1.setBounds(955, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_11_1_1_1);
		
		JButton btnNewButton_3_12_1_1_1 = new JButton("/");
		btnNewButton_3_12_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_12_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_12_1_1_1.setBounds(1020, 674, 55, 50);
		frame.getContentPane().add(btnNewButton_3_12_1_1_1);
		
		JButton btnNewButton_3_13_2_1_1_1 = new JButton("Shift");
		btnNewButton_3_13_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_2_1_1_1.setBounds(1085, 674, 174, 50);
		frame.getContentPane().add(btnNewButton_3_13_2_1_1_1);
		
		JButton btnNewButton_3_2_1_1_1_1 = new JButton("Ctrl");
		btnNewButton_3_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_2_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1_1_1_1.setBounds(282, 737, 213, 50);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_1);
		
		JButton btnNewButton_3_2_1_1_1_1_1 = new JButton("Space");
		btnNewButton_3_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_2_1_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1_1_1_1_1.setBounds(564, 737, 381, 50);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_1_1);
		
		JButton btnNewButton_3_2_1_1_1_1_2 = new JButton("Ctrl");
		btnNewButton_3_2_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_2_1_1_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_2_1_1_1_1_2.setBounds(1046, 735, 213, 50);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_1_2);
		
		JButton btnNewButton_3_13_2_1_1_1_1 = new JButton("Exit");
		btnNewButton_3_13_2_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3_13_2_1_1_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_3_13_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3_13_2_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_3_13_2_1_1_1_1.setBounds(1328, 737, 100, 50);
		frame.getContentPane().add(btnNewButton_3_13_2_1_1_1_1);	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setBounds(228, 448, 1090, 377);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_A)
				{
					btnNewButton_3_3_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_B)
				{
					btnNewButton_3_7_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_C)
				{
					btnNewButton_3_5_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_D)
				{
					btnNewButton_3_5_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_E)
				{
					btnNewButton_3_5_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_F)
				{
					btnNewButton_3_6_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_G)
				{
					btnNewButton_3_7_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_H)
				{
					btnNewButton_3_8_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_I)
				{
					btnNewButton_3_10_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_J)
				{
					btnNewButton_3_9_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_K)
				{
					btnNewButton_3_10_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_L)
				{
					btnNewButton_3_11_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_M)
				{
					btnNewButton_3_9_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_N)
				{
					btnNewButton_3_8_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_O)
				{
					btnNewButton_3_11_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_P)
				{
					btnNewButton_3_12_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_Q)
				{
					btnNewButton_3_3_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_R)
				{
					btnNewButton_3_6_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_S)
				{
					btnNewButton_3_4_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_T)
				{
					btnNewButton_3_7_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_U)
				{
					btnNewButton_3_9_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_V)
				{
					btnNewButton_3_6_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_W)
				{
					btnNewButton_3_4_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_X)
				{
					btnNewButton_3_4_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_Y)
				{
					btnNewButton_3_8_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_Z)
				{
					btnNewButton_3_3_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_0)
				{
					btnNewButton_3_12.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_1)
				{
					btnNewButton_3_4_2.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_2)
				{
					btnNewButton_3_4.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_3)
				{
					btnNewButton_3_5.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_4)
				{
					btnNewButton_3_6.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_5)
				{
					btnNewButton_3_7.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_6)
				{
					btnNewButton_3_8.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_7)
				{
					btnNewButton_3_9.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_8)
				{
					btnNewButton_3_10.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_9)
				{
					btnNewButton_3_11.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_CAPS_LOCK)
				{
					btnNewButton_3_2_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
					btnNewButton_3_13_2.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_SHIFT)
				{
					btnNewButton_3_2_1_1_1.setBackground(Color.GREEN);
					btnNewButton_3_13_2_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_CONTROL)
				{
					btnNewButton_3_2_1_1_1_1.setBackground(Color.GREEN);
					btnNewButton_3_2_1_1_1_1_2.setBackground(Color.GREEN);
			    }
				if(e.getKeyCode()==KeyEvent.VK_TAB)
				{
					btnNewButton_3_2_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_SEMICOLON)
				{
					btnNewButton_3_12_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_PERIOD)
				{
					btnNewButton_3_11_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_COMMA)
				{
					btnNewButton_3_10_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_BACK_SLASH)
				{
					btnNewButton_3_13_2_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_SLASH)
				{
					btnNewButton_3_12_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET)
				{
					btnNewButton_3_13_3.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET)
				{
					btnNewButton_3_13_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_BACK_QUOTE)
				{
					btnNewButton_3_2.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_QUOTE)
				{
					btnNewButton_3_13_3_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_EQUALS)
				{
					btnNewButton_3_13_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_MINUS)
				{
					btnNewButton_3_13.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE)
				{
					btnNewButton_3_2_1_1_1_1_1.setBackground(Color.GREEN);
				}
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					btnNewButton_3_13_2_1_1.setBackground(Color.GREEN);
					outputValue=textField.getText();
					if(outputValue.equals(inputValues[int_random]))
					{
						JOptionPane.showMessageDialog(null,"Correct !");
						Random rand = new Random(); 
					    int upperbound = 50;
						int_random = rand.nextInt(upperbound); 
						String temp=inputValues[int_random];
						textField_1.setText(temp);	
						textField.setText(null);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect input !");
						Random rand = new Random(); 
					    int upperbound = 50;
						int_random = rand.nextInt(upperbound); 
						String temp=inputValues[int_random];
						textField_1.setText(temp);	
						textField.setText(null);
					}
				}	
			}
		});
		textField.setToolTipText("Output text");
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField.setBounds(228, 371, 1090, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setToolTipText("Input to type");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setBorder(new LineBorder(Color.BLACK, 2));
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(228, 187, 1090, 130);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		Random rand = new Random(); 
	    int upperbound = 50;
		int_random = rand.nextInt(upperbound); 
		String temp=inputValues[int_random];
		textField_1.setText(temp);	
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addKeyListener(new KeyAdapter() {
		});
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_2.setBounds(133, 137, 1320, 699);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
