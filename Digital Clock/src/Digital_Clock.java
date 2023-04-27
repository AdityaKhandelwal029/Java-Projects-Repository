import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Digital_Clock {

	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digital_Clock window = new Digital_Clock();
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
	public Digital_Clock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("         Digital Clock");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(154, 11, 267, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(230, 251, 146, 52);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(155, 95, 300, 50);
		Calendar cal=new GregorianCalendar();
		int day1 =cal.get(Calendar.DAY_OF_MONTH);
		int  month=cal.get(Calendar.MONTH)+1;
		int year =cal.get(Calendar.YEAR);
		String x="Today's date - "+Integer.toString(day1)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
		lblNewLabel_1.setText(x);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(154, 172, 300, 50);
		
		Thread clock = new Thread()
		{ 
		    public void run()
			{
			    try{
					for(;;)
					{
						Calendar time=new GregorianCalendar();
						int second=time.get(Calendar.SECOND); 
						int minute=time.get(Calendar.MINUTE);
						int hour=time.get(Calendar.HOUR);
						String x1="Current time - "+Integer.toString(hour)+":"+Integer.toString(minute)+":"+Integer.toString(second);
						lblNewLabel_2.setText(x1);
					    sleep(1000);
					}
				}
				catch(InterruptedException e)
				{ 
				    
				}
			}
		};	
		clock.start();
		frame.getContentPane().add(lblNewLabel_2);
	}
}
