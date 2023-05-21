package Notepad_Project_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.border.LineBorder;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;

import java.awt.Rectangle;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Notepad_Project {

	protected static final Object NULL = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Notepad_Project window = new Notepad_Project();
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
	public Notepad_Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(245, 245, 220));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setForeground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Temp_eclipse_workspace\\Notepad Project\\src\\Notepad_Project_Package\\icons8-notepad-80.png"));
		frame.setBounds(100, 100, 1615, 875);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("                                                                                                                                                                                                                                    Notepad-Project-Application");
		
		JMenuBar menubar=new JMenuBar();
		menubar.setBounds(new Rectangle(0, 0, 0, 10));
		menubar.setBorder(new LineBorder(new Color(0, 0, 0)));
		menubar.setBackground(new Color(192, 192, 192));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1579, 792);
		frame.getContentPane().add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		UndoManager manager = new UndoManager();
		
		JTextArea textArea = new JTextArea();
		textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {  
            public void undoableEditHappened(UndoableEditEvent e) {  
            	manager.addEdit(e.getEdit());  
            }  
        });  
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_N && e.isControlDown()) {			
					textArea.setText("");
                }
				if (e.getKeyCode() == KeyEvent.VK_O && e.isControlDown())
				{			
					JFileChooser filechooser=new JFileChooser();
					FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
					filechooser.setAcceptAllFileFilterUsed(false);
					filechooser.addChoosableFileFilter(textfilter);
					int action=filechooser.showSaveDialog(null);
					if(action!=JFileChooser.APPROVE_OPTION)
					{
						return;
					}
					else
					{
						try
						{
							BufferedReader reader=new BufferedReader(new FileReader(filechooser.getSelectedFile()));
							textArea.read(reader,NULL);
						}
						catch(IOException ex)
						{
							ex.printStackTrace();
						}
					}
                }
				if (e.getKeyCode() == KeyEvent.VK_P && e.isControlDown()) 
				{			
					try {
						textArea.print();
					}
					catch(PrinterException ex)
					{
						Logger.getLogger(Notepad_Project.class.getName()).log(Level.SEVERE,null,ex);
						
					}
                }
				if(e.getKeyCode() == KeyEvent.VK_C && e.isControlDown())
				{
					textArea.cut();
				}
				if(e.getKeyCode() == KeyEvent.VK_S && e.isControlDown())
				{
					JFileChooser filechooser=new JFileChooser();
					FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
					filechooser.setAcceptAllFileFilterUsed(false);
					filechooser.addChoosableFileFilter(textfilter);
					int action=filechooser.showSaveDialog(null);
					if(action!=JFileChooser.APPROVE_OPTION)
					{
						return;
					}
					else
					{
						String filename=filechooser.getSelectedFile().getAbsolutePath().toString();
						if(!filename.contains("txt"))
						{
							filename=filename+".txt";
							try {
								BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
								textArea.write(writer);
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}
						}
					}
				}
				if(e.getKeyCode() == KeyEvent.VK_E && e.isControlDown())
				{
					JFileChooser filechooser=new JFileChooser();
					FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
					filechooser.setAcceptAllFileFilterUsed(false);
					filechooser.addChoosableFileFilter(textfilter);
					int action=filechooser.showSaveDialog(null);
					if(action!=JFileChooser.APPROVE_OPTION)
					{
						return;
					}
					else
					{
						String filename=filechooser.getSelectedFile().getAbsolutePath().toString();
						if(!filename.contains("txt"))
						{
							filename=filename+".txt";
							try {
								BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
								textArea.write(writer);
							}
							catch(IOException ex)
							{
								ex.printStackTrace();
							}
						}
					}
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_Z && e.isControlDown())
				{
					try {
						manager.undo();
					}
					catch(Exception e1)
					{
						
					}				
				}
				if(e.getKeyCode() == KeyEvent.VK_Y && e.isControlDown())
				{
					try {
						manager.redo();
					}
					catch(Exception e1)
					{
						
					}				
				}
			}
		});
		scrollPane.setViewportView(textArea);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		
		JMenu file= new JMenu("File");
		JMenuItem newoption=new JMenuItem("New              Ctrl+N");
		newoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			    textArea.setText("");
			}
		});
		
		JMenuItem openoption=new JMenuItem("Open             Ctrl+O");
		openoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser filechooser=new JFileChooser();
				FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
				filechooser.setAcceptAllFileFilterUsed(false);
				filechooser.addChoosableFileFilter(textfilter);
				int action=filechooser.showSaveDialog(null);
				if(action!=JFileChooser.APPROVE_OPTION)
				{
					return;
				}
				else
				{
					try {
						BufferedReader reader=new BufferedReader(new FileReader(filechooser.getSelectedFile()));
						textArea.read(reader,NULL);
					}
					catch(IOException ex)
					{
						ex.printStackTrace();
					}
				}
			}
		});
		JMenuItem saveoption=new JMenuItem("Save               Ctrl+S");
		saveoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser filechooser=new JFileChooser();
				FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
				filechooser.setAcceptAllFileFilterUsed(false);
				filechooser.addChoosableFileFilter(textfilter);
				int action=filechooser.showSaveDialog(null);
				if(action!=JFileChooser.APPROVE_OPTION)
				{
					return;
				}
				else
				{
					String filename=filechooser.getSelectedFile().getAbsolutePath().toString();
					if(!filename.contains("txt"))
					{
						filename=filename+".txt";
						try {
							BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
							textArea.write(writer);
						}
						catch(IOException ex)
						{
							ex.printStackTrace();
						}
					}
				}
				
			}
		});
		JMenuItem saveasoption=new JMenuItem("Save As...       Ctrl+S");
		saveasoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser filechooser=new JFileChooser();
				FileNameExtensionFilter textfilter=new FileNameExtensionFilter("Only Text Files(.txt)","txt");
				filechooser.setAcceptAllFileFilterUsed(false);
				filechooser.addChoosableFileFilter(textfilter);
				int action=filechooser.showSaveDialog(null);
				if(action!=JFileChooser.APPROVE_OPTION)
				{
					return;
				}
				else
				{
					String filename=filechooser.getSelectedFile().getAbsolutePath().toString();
					if(!filename.contains("txt"))
					{
						filename=filename+".txt";
						try {
							BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
							textArea.write(writer);
						}
						catch(IOException ex)
						{
							ex.printStackTrace();
						}
					}
				}
				
			}
		});
		JMenuItem printoption=new JMenuItem("Print               Ctrl+P");
		printoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					textArea.print();
				}
				catch(PrinterException ex)
				{
					Logger.getLogger(Notepad_Project.class.getName()).log(Level.SEVERE,null,ex);
					
				}
			}
		});
		JMenuItem exitoption=new JMenuItem("Exit                 Ctrl+E");
		exitoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		file.add(newoption);
		file.add(openoption);
		file.add(saveoption);
		file.add(saveasoption);
		file.add(printoption);
		file.add(exitoption);
		
		JMenu edit= new JMenu("Edit");
		JMenuItem undooption=new JMenuItem("Undo         Ctrl+Z");
		undooption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					manager.undo();
				} 
				catch (Exception ex) {
				}
			}
		});
		JMenuItem redooption=new JMenuItem("Redo          Ctrl+Y");
		redooption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					manager.redo();
				} 
				catch (Exception ex) {
				}
			}
		});
		JMenuItem cutoption=new JMenuItem("Cut             Ctrl+X");
		cutoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.cut();
			}
		});
		JMenuItem copyoption=new JMenuItem("Copy          Ctrl+C");
		copyoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.cut();
			}
		});
		JMenuItem pasteoption=new JMenuItem("Paste          Ctrl+V");
		pasteoption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.paste();
			}
		});
		JMenuItem selectalloption=new JMenuItem("Select all    Ctrl+A");
		selectalloption.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.selectAll();
			}
		});
		edit.add(undooption);
		edit.add(redooption);
		edit.add(cutoption);
		edit.add(copyoption);
		edit.add(pasteoption);
		edit.add(selectalloption);
		
		JMenu search= new JMenu("Search");
		search.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		JMenu view= new JMenu("View");
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		JMenu encoding= new JMenu("Encoding");
		encoding.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		JMenu language= new JMenu("Language");
		language.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		JMenu setting= new JMenu("Setting");
		setting.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		JMenu tools= new JMenu("Tools");
		tools.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Currently this feature is not availble.");
			}
		});
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(search);
		menubar.add(view);
		menubar.add(encoding);
		menubar.add(language);
		menubar.add(setting);
		menubar.add(tools);
		frame.setJMenuBar(menubar);
		frame.getContentPane().setLayout(null);		
				
	}
}
