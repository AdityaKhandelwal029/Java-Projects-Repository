package Package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu window = new main_menu();
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
	public main_menu() {
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
		
		JButton btnNewButton = new JButton("Create an emp. account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create_emp_account createframe=new create_emp_account();
				createframe.frame.setVisible(true);				
				frame.dispose();
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(386, 236, 325, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUpdateAnEmp = new JButton("Update an emp. account");
		btnUpdateAnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_emp_account updateframe=new update_emp_account();
				updateframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnUpdateAnEmp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdateAnEmp.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnUpdateAnEmp.setBounds(386, 413, 325, 50);
		frame.getContentPane().add(btnUpdateAnEmp);
		
		JButton btnSearchByDepartment = new JButton("Search emp by department");
		btnSearchByDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_by_department searchbydepartmentframe=new search_by_department();
				searchbydepartmentframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSearchByDepartment.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearchByDepartment.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSearchByDepartment.setBounds(386, 574, 325, 50);
		frame.getContentPane().add(btnSearchByDepartment);
		
		JButton btnDeleteAnEmp = new JButton("Delete an emp. account");
		btnDeleteAnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_emp_account deleteframe=new delete_emp_account();
				deleteframe.frame.setVisible(true);
				frame.dispose();			
			}
		});
		btnDeleteAnEmp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeleteAnEmp.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDeleteAnEmp.setBounds(941, 236, 325, 50);
		frame.getContentPane().add(btnDeleteAnEmp);
		
		JButton btnSearchAnEmp = new JButton("Search an emp. account");
		btnSearchAnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_emp_account searchframe=new search_emp_account();
				searchframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSearchAnEmp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearchAnEmp.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSearchAnEmp.setBounds(941, 413, 325, 50);
		frame.getContentPane().add(btnSearchAnEmp);
		
		JButton btnListAllEmployees = new JButton("List all employees");
		btnListAllEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_all_emp_account listallframe=new list_all_emp_account();
				listallframe.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnListAllEmployees.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnListAllEmployees.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnListAllEmployees.setBounds(941, 574, 325, 50);
		frame.getContentPane().add(btnListAllEmployees);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnLogout.setBounds(670, 732, 325, 50);
		frame.getContentPane().add(btnLogout);
	}

}
