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
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import atm_plugin_project_employeedata.Employeedata;
import atm_plugin_project_labelprovider.*;

import java.util.*;
import java.io.*;
import java.sql.*;

@SuppressWarnings("unused")
public class ShowAllAccount extends TitleAreaDialog{

	List<Employeedata> list;
	TableViewer tableviewer;
	public ShowAllAccount(Shell parentShell,List<Employeedata> list) {
		super(parentShell);
		this.list=list;
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL);
		// TODO Auto-generated constructor stub
	}
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Control contents = super.createContents(parent);
		setTitle("User info");
		setMessage("Show All user details", IMessageProvider.INFORMATION);
		return contents;
	}
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        
		GridData gridData = new GridData();


		tableviewer = new TableViewer(area, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		TableViewerColumn column1 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column1.getColumn().setWidth(150);
		column1.getColumn().setText("Account no");
        column1.setLabelProvider(new Accountnolabel());

		TableViewerColumn column2 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column2.getColumn().setWidth(150);
		column2.getColumn().setText("Name");
	    column2.setLabelProvider(new Namelabel());

		TableViewerColumn column3 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column3.getColumn().setWidth(150);
		column3.getColumn().setText("Address");
		column3.setLabelProvider(new Addresslabel());

		TableViewerColumn column4 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column4.getColumn().setWidth(150);
		column4.getColumn().setText("Email");
		column4.setLabelProvider(new Emaillabel());
		
		TableViewerColumn column5 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column5.getColumn().setWidth(150);
		column5.getColumn().setText("Mobile");
		column5.setLabelProvider(new Mobilelabel());

		TableViewerColumn column6 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column6.getColumn().setWidth(150);
		column6.getColumn().setText("Balance");
		column6.setLabelProvider(new Balancelabel());

		TableViewerColumn column7 = new TableViewerColumn(tableviewer, SWT.CENTER | SWT.BORDER);
		column7.getColumn().setWidth(150);
		column7.getColumn().setText("Pin");
		column7.setLabelProvider(new Pinlabel());
         
		Table table = tableviewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableviewer.setContentProvider(new ArrayContentProvider());

		tableviewer.setInput(list);

		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		tableviewer.getControl().setLayoutData(gridData);	
		new Label(container, SWT.NONE);
		return area;
	}
	protected void okPressed(){
		
	}
	
	/*protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		// super.createButtonsForButtonBar(parent);
		createButton(parent, IDialogConstants.OK_ID, "OK", true);
		getButton(IDialogConstants.OK_ID).setEnabled(true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}	*/
}
	