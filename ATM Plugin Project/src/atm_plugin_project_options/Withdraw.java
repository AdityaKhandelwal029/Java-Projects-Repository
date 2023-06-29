package atm_plugin_project_options;
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

import atm_plugin_project_employeedata.Employeedata;

import java.util.*;
import java.io.*;
import java.sql.*;

@SuppressWarnings("unused")
public class Withdraw extends TitleAreaDialog{

	private Text AccountNo;
	private Text Userpin;
	private Text Amount;
	List<Employeedata> list;
	
	public Withdraw(Shell parentShell,List<Employeedata> list) {
		super(parentShell);
		this.list=list;
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL);
		// TODO Auto-generated constructor stub
	}
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Control contents = super.createContents(parent);
		setTitle("Withdraw amount");
		setMessage("Withdraw user amount", IMessageProvider.INFORMATION);
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
        userPinContainer(container);
        userAmountContainer(container);
        
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		return area;
	}
	private void userAccountnoContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Account no ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		AccountNo = new Text(container, SWT.BORDER);
		AccountNo.setLayoutData(datauserId);
		// userIdText.setText(userId);
		AccountNo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (AccountNo.getText().isEmpty()||Userpin.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
			}
		});
	}
	private void userPinContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("User Pin");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		Userpin = new Text(container, SWT.BORDER);
		Userpin.setLayoutData(datauserId);
		// userIdText.setText(userId);
		Userpin.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (AccountNo.getText().isEmpty()||Userpin.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
			}
		});
	}
	
	private void userAmountContainer(Composite container) {
		Label lbtEmpId = new Label(container, SWT.NONE);
		lbtEmpId.setText("Amount ");

		GridData datauserId = new GridData();
		datauserId.grabExcessHorizontalSpace = true;
		datauserId.horizontalAlignment = GridData.FILL;

		Amount = new Text(container, SWT.BORDER);
		Amount.setLayoutData(datauserId);
		// userIdText.setText(userId);
		Amount.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;
				if (AccountNo.getText().isEmpty()||Userpin.getText().isEmpty()||Amount.getText().isEmpty())                                  
				{
					getButton(IDialogConstants.OK_ID).setEnabled(false);
				} 
				else 
				{
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
			}
		});
	}
	protected void okPressed(){
		String userAccountnoInput=AccountNo.getText();
	     String userPinInput=Userpin.getText();
	     String depositeAmount=Amount.getText();
	     double newamount=Double.parseDouble(depositeAmount);
	     
	     Iterator<Employeedata> iterator = list.iterator();
	     boolean isvalidUser = false; 
	     while (iterator.hasNext())
	     {
				Employeedata listdata = iterator.next();
				if(listdata.getAccountno().equals(userAccountnoInput)&&listdata.getPin().equals(userPinInput))
				{
					double x=listdata.getBalance(); 
					if(x>=newamount)
					{
						x=x-newamount;
						listdata.setBalance(x);			
						isvalidUser=true; 
						MessageDialog.openInformation(getParentShell(), "Info", "Transaction successfull amount withdrawn");
						break;
					}
					else
					{
						isvalidUser=true;
						MessageDialog.openInformation(getParentShell(), "Info", "Current balance is not enough to make withdraw operation.");
					}
					
				}
	     }
	     if(isvalidUser==false)
	     {
	    	 MessageDialog.openInformation(getParentShell(), "Info", "Invalid user or record not found.");
	     }
	     AccountNo.setText("");
	     Userpin.setText("");
	     Amount.setText("");
	}
	
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		// super.createButtonsForButtonBar(parent);
		createButton(parent, IDialogConstants.OK_ID, "Withdraw", false);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}	
}
	