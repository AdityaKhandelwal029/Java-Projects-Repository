package atm_plugin_project_options;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import java.util.*;
import java.awt.HeadlessException;
import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.cj.jdbc.*;
import atm_plugin_project_employeedata.*;

@SuppressWarnings("unused")
public class Create_Account extends TitleAreaDialog{
	
	private Text userAccountnoText;
	private Text userNameText;
	private Text userAddressText;
	private Text userEmailText;
	private Text userMobileText;
	private Text userBalanceText;
	private Text userPinText;
	List<Employeedata> list;

	public Create_Account(Shell parentShell,List<Employeedata> list) {
		super(parentShell);
		this.list=list;
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Control contents = super.createContents(parent);
		setTitle("Create Account");
		setMessage("Create new account.", IMessageProvider.INFORMATION);
		return contents;
	}
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		userAccountnoContainer(container);
		userNameContainer(container);
		userAddressContainer(container);
		userEmailContainer(container);
		userMobileContainer(container); 
		userBalanceContainer(container);
		userPinContainer(container);

		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		return area;
	}
	private void userAccountnoContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Account no");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userAccountnoText = new Text(container, SWT.BORDER);
		userAccountnoText.setLayoutData(datauserId);
		userAccountnoText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});
	}
	private void userNameContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Name      ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userNameText = new Text(container, SWT.BORDER);
		userNameText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});
	}
	private void userAddressContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Address   ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userAddressText = new Text(container, SWT.BORDER);
		userAddressText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userAddressText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});	
	}
	private void userEmailContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Email     ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userEmailText = new Text(container, SWT.BORDER);
		userEmailText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userEmailText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});	
	}
	private void userMobileContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Mobile    ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userMobileText = new Text(container, SWT.BORDER);
		userMobileText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userMobileText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});	
	}
	private void userBalanceContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Balance   ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userBalanceText = new Text(container, SWT.BORDER);
		userBalanceText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userBalanceText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});	
	}
	
	private void userPinContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Pin   ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		userPinText = new Text(container, SWT.BORDER);
		userPinText.setLayoutData(datauserId);
		// userIdText.setText(userId);
		userPinText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (userAccountnoText.getText().isEmpty()||userNameText.getText().isEmpty()||userAddressText.getText().isEmpty()||userEmailText.getText().isEmpty()||userMobileText.getText().isEmpty()||userBalanceText.getText().isEmpty()||userPinText.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else if (text.getText().length() >= 1) 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				}
			}
		});	
	}
	
	
	@SuppressWarnings("resource")
	protected void okPressed(){
		// TODO Auto-generated method stub
		String useraccountno=userAccountnoText.getText();
		String userNameInput = userNameText.getText();
		String userAddressInput = userAddressText.getText();
		String userEmailInput = userEmailText.getText();
		String userMobilenoInput = userMobileText.getText();
		String userBalanceInput = userBalanceText.getText();
		String userPin=userPinText.getText();
		double userBalanceInput2=Double.parseDouble(userBalanceInput);
		
		Employeedata atmdata=new Employeedata(useraccountno,userNameInput,userAddressInput,userEmailInput,userMobilenoInput,userBalanceInput2,userPin);
		list.add(atmdata);
		MessageDialog.openInformation(getParentShell(), "Info" ,"Account Created successfully !");
		userAccountnoText.setText("");
	    userNameText.setText("");
	    userAddressText.setText("");
		userEmailText.setText("");
		userMobileText.setText("");
		userBalanceText.setText("");
		userPinText.setText("");
	}
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		// super.createButtonsForButtonBar(parent);
		createButton(parent, IDialogConstants.OK_ID, "Create Account", false);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}
	
}
