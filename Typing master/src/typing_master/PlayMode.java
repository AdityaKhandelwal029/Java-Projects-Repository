package typing_master;

import java.util.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

@SuppressWarnings("unused")
public class PlayMode extends TimerTask {
	static JFrame frame;
	public static int int_random;
	public static JTextField textField;
	// public static JTextArea textArea;
	public static String outputValue = "";
	public static String[] inputValues = new String[] {
			"An apple is an edible fruit produced by an apple tree (Malus domestica).\r\n"
					+ "Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. \r\n"
					+ "The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today.\r\n"
					+ "Apples have been grown for thousands of years in Asia and Europe and were brought to European colonists.\r\n"
					+ "Apples have religious and mythological significance in many cultures, including European Christian tradition.\r\n"
					+ "Apples grown from seed tend to be very different from those of their parents,  frequently lacks desired,\r\n"
					+ "characteristics. Generally, apple cultivars are propagated by clonal grafting onto rootstocks.\r\n",

			"A mango is an edible stone fruit produced by the tropical tree Mangifera indica.\r\n"
					+ "It is believed to have originated in southern Asia, particularly in eastern India, Bangladesh, and the Andaman Islands.\r\n"
					+ "M.indica has been cultivated in South and Southeast Asia since ancient times resulting in two types of modern mango cultivars.\r\n"
					+ "The Indian type and the Southeast Asian type.\r\n"
					+ "Other species in the genus Mangifera also produce edible fruits that are also called mangoes.\r\n"
					+ "The majority of which are found in the Malesian ecoregion.",

			"A banana is an elongated, edible fruit botanically a berry produced by several kinds of large herbaceous.\r\n"
					+ "Flowering plants in the genus Musa.In some countries bananas used for cooking may be called plantains.\r\n"
					+ "Distinguishing them from dessert bananas. \r\n"
					+ "The fruit is variable in size color and firmness but is usually elongated and curved.\r\n"
					+ "With soft flesh rich in starch covered with a rind which may be green yellow red purple or brown when ripe. \r\n"
					+ "The fruits grow upward in clusters near the top of the plant.",

			"A grape is a fruit botanically a berry of the deciduous woody vines of the flowering plant genus Vitis. \r\n"
					+ "Grapes are a non-climacteric type of fruit generally occurring in clusters.\r\n"
					+ "The cultivation of grapes began perhaps 8000 years ago and the fruit has been used as human food over history.\r\n"
					+ "Eaten fresh or in dried form (as raisins currants and sultanas) grapes also hold cultural significance in many parts of the world. \r\n"
					+ "Particularly for their role in winemaking.Other grape-derived products include various types of jam juice vinegar and oil.",

			"Blueberries are a widely distributed and widespread group of perennial flowering plants with blue or purple berries. \r\n"
					+ "They are classified in the section Cyanococcus within the genus Vaccinium. \r\n"
					+ "Vaccinium also includes cranberries, bilberries, huckleberries and Madeira blueberries.\r\n"
					+ "Commercial blueberries both wild lowbush and cultivated are all native to North America. \r\n"
					+ "The highbush varieties were introduced into Europe during the 1930s." };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayMode window = new PlayMode();
					PlayMode.frame.setVisible(true);
					JOptionPane.showMessageDialog(null,
							"Instructions : You will we getting time of 2 minutes. \n Please type the word's displayed in the given textfield. \n "
									+ "Result we declared on the basis of total word you type !");
					// window.result();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
		 
public PlayMode() {
//****************************************************************************************************************************************************************************************
	
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
			Menu Menuframe = new Menu();
			Menuframe.frame.setVisible(true);
			frame.dispose();
		}
	});

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(228, 187, 1090, 130);
	frame.getContentPane().add(scrollPane);

	JTextArea textArea = new JTextArea();
	textArea.setBackground(Color.LIGHT_GRAY);
	textArea.setToolTipText("Input text");
	textArea.setForeground(new Color(0, 0, 0));
	textArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
	textArea.setBorder(new LineBorder(Color.BLACK, 2, true));
	textArea.setBounds(228, 371, 1090, 45);
	textArea.setColumns(10);
	scrollPane.setViewportView(textArea);
	Random rand = new Random();
	int upperbound = 5;
	int_random = rand.nextInt(upperbound);
	String temp = inputValues[int_random];
	textArea.setText(temp);

	btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
	btnNewButton.setBounds(1165, 83, 290, 43);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnNewButton_2 = new JButton("Play Mode ");
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
	btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	btnNewButton_2.setBounds(564, 83, 490, 43);
	frame.getContentPane().add(btnNewButton_2);

	JButton btnNewButton_1 = new JButton("Restart");
	btnNewButton_1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			@SuppressWarnings("unused")
			Random rand = new Random();
			int upperbound = 5;
			int_random = rand.nextInt(upperbound);
			String temp = inputValues[int_random];
			textArea.setText(temp);
			textField.setText(null);
			JOptionPane.showMessageDialog(null,
					"Instructions : You will we getting time of 2 minutes. \n Please type the word's displayed in the given textfield. \n "
							+ "Result we declared on the basis of total word you type !");
			
			btnNewButton_2.setText("Play Mode");
			
			ActionListener ticktock = new ActionListener() {
			      public void actionPerformed(ActionEvent evnt) 
			       {
			    	  JOptionPane.showMessageDialog(null," ********** Time up ********** !! ");
			    	  btnNewButton_2.setText("Result");
			    	  String wordCount=textField.getText();
			  		  int TotalWordCount=0;  
			  	      char ch[]= new char[wordCount.length()];     
			          for(int i=0;i<wordCount.length();i++)  
			            {  
			                  ch[i]= wordCount.charAt(i);  
			                  if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
			                  	TotalWordCount++;  
			            }
			              textArea.setText("The string output is = "+TotalWordCount);
			              textField.setText(null);
			       }
			  };
			  
			    Timer timer = new Timer(120000 ,ticktock); 
			    timer.setRepeats(false);
			    timer.start();	 	
		}
	});

	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
	btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	btnNewButton_1.setBounds(133, 83, 290, 43);
	frame.getContentPane().add(btnNewButton_1);
	
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
			if (e.getClickCount() == 1) {
				btnNewButton_3_13_2_1_1.setBackground(Color.GREEN);
			}
		}
	});
	btnNewButton_3_13_2_1_1.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {

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
			if (e.getKeyCode() == KeyEvent.VK_A) {
				btnNewButton_3_3_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_B) {
				btnNewButton_3_7_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_C) {
				btnNewButton_3_5_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				btnNewButton_3_5_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_E) {
				btnNewButton_3_5_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_F) {
				btnNewButton_3_6_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_G) {
				btnNewButton_3_7_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_H) {
				btnNewButton_3_8_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_I) {
				btnNewButton_3_10_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_J) {
				btnNewButton_3_9_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_K) {
				btnNewButton_3_10_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_L) {
				btnNewButton_3_11_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_M) {
				btnNewButton_3_9_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_N) {
				btnNewButton_3_8_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_O) {
				btnNewButton_3_11_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_P) {
				btnNewButton_3_12_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_Q) {
				btnNewButton_3_3_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_R) {
				btnNewButton_3_6_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				btnNewButton_3_4_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_T) {
				btnNewButton_3_7_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_U) {
				btnNewButton_3_9_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_V) {
				btnNewButton_3_6_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_W) {
				btnNewButton_3_4_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_X) {
				btnNewButton_3_4_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_Y) {
				btnNewButton_3_8_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_Z) {
				btnNewButton_3_3_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_0) {
				btnNewButton_3_12.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_1) {
				btnNewButton_3_4_2.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_2) {
				btnNewButton_3_4.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_3) {
				btnNewButton_3_5.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_4) {
				btnNewButton_3_6.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_5) {
				btnNewButton_3_7.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_6) {
				btnNewButton_3_8.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_7) {
				btnNewButton_3_9.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_8) {
				btnNewButton_3_10.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_9) {
				btnNewButton_3_11.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
				btnNewButton_3_2_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				btnNewButton_3_13_2.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				btnNewButton_3_2_1_1_1.setBackground(Color.GREEN);
				btnNewButton_3_13_2_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
				btnNewButton_3_2_1_1_1_1.setBackground(Color.GREEN);
				btnNewButton_3_2_1_1_1_1_2.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_TAB) {
				btnNewButton_3_2_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
				btnNewButton_3_12_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
				btnNewButton_3_11_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_COMMA) {
				btnNewButton_3_10_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
				btnNewButton_3_13_2_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_SLASH) {
				btnNewButton_3_12_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
				btnNewButton_3_13_3.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
				btnNewButton_3_13_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_QUOTE) {
				btnNewButton_3_2.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_QUOTE) {
				btnNewButton_3_13_3_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_EQUALS) {
				btnNewButton_3_13_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_MINUS) {
				btnNewButton_3_13.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				btnNewButton_3_2_1_1_1_1_1.setBackground(Color.GREEN);
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				btnNewButton_3_13_2_1_1.setBackground(Color.GREEN);
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

	JLabel lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.addKeyListener(new KeyAdapter() {
	});
	lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	lblNewLabel_2.setBounds(133, 137, 1320, 699);
	frame.getContentPane().add(lblNewLabel_2);
		
//***************************************************************************************************************************************************************************************
			
		ActionListener ticktock = new ActionListener() {
		      public void actionPerformed(ActionEvent evnt) 
		       {
		    	  JOptionPane.showMessageDialog(null," ********** Time up ********** !! ");
		    	  btnNewButton_2.setText("Result");
		    	  String wordCount=textField.getText();
		  		  int TotalWordCount=0;  
		  	      char ch[]= new char[wordCount.length()];     
		          for(int i=0;i<wordCount.length();i++)  
		            {  
		                  ch[i]= wordCount.charAt(i);  
		                  if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
		                  	TotalWordCount++;  
		            }
		              textArea.setText("The string output is = "+TotalWordCount);
		              textField.setText(null);
		       }
		  };
		  
		    Timer timer = new Timer(120000 ,ticktock); 
		    timer.setRepeats(false);
		    timer.start();	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
//	public static void initialize(int game_time) {
//		
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
