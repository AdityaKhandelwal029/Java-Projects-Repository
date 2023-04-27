import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Registation_Form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registation_Form window = new Registation_Form();
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
	public Registation_Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 628, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(80, 53, 125, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFathersName.setBounds(80, 94, 162, 30);
		frame.getContentPane().add(lblFathersName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(80, 135, 125, 30);
		frame.getContentPane().add(lblAddress);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(265, 53, 300, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(265, 102, 300, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(265, 148, 300, 70);
		frame.getContentPane().add(textField_2);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(80, 245, 125, 30);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(262, 252, 75, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(178, 11, 224, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFemale.setBounds(339, 250, 90, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOther.setBounds(431, 250, 75, 23);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblDob = new JLabel("Date of birth");
		lblDob.setHorizontalAlignment(SwingConstants.LEFT);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(80, 301, 125, 30);
		frame.getContentPane().add(lblDob);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(265, 308, 50, 25);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"January ", "February", "March", "April ", "May ", "June", "July ", "August", "September", "October", "November ", "December"}));
		comboBox_1.setBounds(339, 308, 107, 25);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_2.setBounds(456, 307, 75, 25);
		frame.getContentPane().add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I accept and agree terms and conditions");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(80, 367, 390, 35);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tf=textField.getText();
				String tf1=textField_1.getText();
				String tf2=textField_2.getText();				
				if(tf.isEmpty()||tf1.isEmpty()||tf2.isEmpty())
				{
					textField_3.setText("Please fill all required fields.");
				}
				else
				{
					boolean c1=rdbtnNewRadioButton.isSelected();
					boolean c2=rdbtnFemale.isSelected();
					boolean c3=rdbtnOther.isSelected();
					if(c1==true||c2==true||c3==true)
					{
						if(chckbxNewCheckBox.isSelected())
						{
							textField_3.setText("Form submitted successfully.");
						}
						else
						{
							textField_3.setText("Please accept terms and conditions.");
						}
					}
					else
					{
						textField_3.setText("Please select gender.");
					}
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(226, 489, 150, 39);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBackground(SystemColor.inactiveCaption);
		textField_3.setBounds(114, 433, 400, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
