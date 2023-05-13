package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.util.*;
import java.io.*;
import java.sql.*;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class list_all_emp_account {

	public JFrame frame;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_all_emp_account window = new list_all_emp_account();
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
	public list_all_emp_account() {
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
		
		JLabel lblNewLabel_1 = new JLabel("List all employees");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(662, 111, 565, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnList = new JButton("List All");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				    textField_1.setText("Loading...");
					try {
						stmt=con.createStatement();							
						String query="select *from employeedata";
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
		btnList.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnList.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnList.setBounds(720, 216, 200, 40);
		frame.getContentPane().add(btnList);
		
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
		btnNewButton_1.setBounds(256, 217, 200, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(1219, 217, 200, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLACK, 2));
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setBounds(449, 338, 752, 487);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(25);
		table.setRowMargin(2);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Emp.Id", "Name", "Address", "Department", "Salary"
			}
		));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBorder(new LineBorder(Color.BLACK, 2));
		textField_1.setBounds(579, 277, 500, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
