package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class search_by_department {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_by_department window = new search_by_department();
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
	public search_by_department() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1615, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee management portal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(10, 11, 1579, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search emp info  by department");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(575, 115, 565, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Department");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(496, 215, 170, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					String department=textField.getText();
					Connection con;
					Statement stmt;
					ResultSet rs;
					try
					{
						String url="jdbc:mysql://localhost:3306/employeemanagementproject";
						String username = "root"; // MySQL credentials
						String password = "12345";
						Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
					    con = DriverManager.getConnection(url, username, password);	
						try {
							stmt=con.createStatement();							
							String query="select *from employeedata where department='"+department+"'";
							rs= stmt.executeQuery(query); // Execute query
							textField_1.setText("Loading... Records Please wait.");
							DefaultTableModel model=(DefaultTableModel) table.getModel();
							model.setRowCount(0);
						    while(rs.next())
						    {
						    	String id=rs.getString("id");
						    	String name=rs.getString("name");
						    	String address=rs.getString("address");
						    	String department1=rs.getString("department");
						    	String salary=rs.getString("salary");
						    	model.addRow(new Object[] {id,name,address,department1,salary});		    	
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
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField.setBounds(784, 217, 350, 35);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.desktop, 2));
		textField_1.setBounds(493, 300, 641, 50);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String department=textField.getText();
				Connection con;
				Statement stmt;
				ResultSet rs;
				try
				{
					String url="jdbc:mysql://localhost:3306/employeemanagementproject";
					String username = "root"; // MySQL credentials
					String password = "12345";
					Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
				    con = DriverManager.getConnection(url, username, password);	
					try {
						stmt=con.createStatement();							
						String query="select *from employeedata where department='"+department+"'";
						rs= stmt.executeQuery(query); // Execute query
						DefaultTableModel model=(DefaultTableModel) table.getModel();
						model.setRowCount(0);
					    while(rs.next())
					    {
					    	String id=rs.getString("id");
					    	String name=rs.getString("name");
					    	String address=rs.getString("address");
					    	String department1=rs.getString("department");
					    	String salary=rs.getString("salary");
					    	model.addRow(new Object[] {id,name,address,department1,salary});		    	
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setBounds(726, 396, 200, 40);
		frame.getContentPane().add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		scrollPane.setBorder(new LineBorder(Color.BLACK, 2));
		scrollPane.setBounds(496, 457, 629, 349);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setRowMargin(2);
		table.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		table.setRowHeight(25);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Emp.Id", "Name", "Address", "Department", "Salary"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(227);
		table.getColumnModel().getColumn(2).setPreferredWidth(256);
		table.getColumnModel().getColumn(3).setPreferredWidth(203);
		table.getColumnModel().getColumn(4).setPreferredWidth(126);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setSurrendersFocusOnKeystroke(true);
		
		JButton btnNewButton_1 = new JButton("Main menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_menu mainframe=new main_menu();
				mainframe.frame.setVisible(true);				
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setBounds(433, 396, 200, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(1022, 396, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
