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
import typing_master.*;

@SuppressWarnings("unused")
public class Menu {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Consolas", Font.PLAIN, 24));
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
		
		JButton btnNewButton_1 = new JButton("Pratice");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PracticeMode PracticeModeframe=new PracticeMode();
				PracticeMode.frame.setVisible(true);
				JOptionPane.showMessageDialog(null,"Instructions : Please type the word's displayed.");
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(581, 449, 500, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Play");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PlayMode PlayModeframe=new PlayMode();
				PlayMode.frame.setVisible(true);
				JOptionPane.showMessageDialog(null,
						"Instructions : You will we getting time of 2 minutes. \n Please type the word's displayed in the given textfield. \n "
								+ "Result we declared on the basis of total word you type !");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1_1.setBounds(581, 301, 500, 55);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		lblNewLabel_1.setBounds(482, 225, 700, 352);
		frame.getContentPane().add(lblNewLabel_1);
	}
}