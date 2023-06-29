package atm_plugin_project_options;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import atm_plugin_project_employeedata.*;

@SuppressWarnings("unused")
public class Main_Menu extends TitleAreaDialog
{

	List<Employeedata> list = new ArrayList<Employeedata>();
	Employeedata atmdata1=new Employeedata("1","Aditya Khandelwal","Pune","akhandelwal592@gmail.com","9557264931",100,"0000");
	
	public Main_Menu(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
		setShellStyle(SWT.MAX | SWT.RESIZE | SWT.APPLICATION_MODAL);
		list.add(atmdata1);
	}
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		Control contents = super.createContents(parent);

		setTitle("ATM Application");
		setMessage("Welcome to ATM Application.", IMessageProvider.INFORMATION);
		return contents;
	}
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(composite, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Button checkBalance = new Button(container, SWT.NONE);
		checkBalance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		checkBalance.setText("Check Balance");
		CheckBalance(checkBalance);

		Button withdraw = new Button(container, SWT.NONE);
		withdraw.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		withdraw.setText("WithDraw");
		Withdraw(withdraw);

		Button deposit = new Button(container, SWT.NONE);
		deposit.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		deposit.setText("Deposit");
		Deposit(deposit);

		Button changePin = new Button(container, SWT.NONE);
		changePin.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		changePin.setText("Change Pin");
		ChangePin(changePin);

		Button createAccount = new Button(container, SWT.NONE);
		createAccount.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		createAccount.setText("Create Account");
		CreateAccount(createAccount);

		Button showDetails = new Button(container, SWT.NONE);
		showDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		showDetails.setText("Show Account Details");
		ShowDetails(showDetails);
		
		Button showAllDetails = new Button(container, SWT.NONE);
		showAllDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		showAllDetails.setText("Show All Account Details");
		ShowAllDetails(showAllDetails);


		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		return composite;
	}

	private void ShowDetails(Button showDetails) {
		// TODO Auto-generated method stub
		showDetails.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				 Show_details showDetailsDialog = new Show_details(getParentShell(),list);
				 showDetailsDialog.open();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	private void ChangePin(Button changePin) {
		// TODO Auto-generated method stub
		changePin.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				Change_Pin changePinDialog = new Change_Pin(getParentShell(),list);
			    changePinDialog.open();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void Deposit(Button deposit) {
		// TODO Auto-generated method stub
		deposit.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				Deposite depositDialog = new Deposite(getParentShell(),list);
				depositDialog.open();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	private void Withdraw(Button withdraw) {
		// TODO Auto-generated method stub
		withdraw.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				Withdraw withdrawDialog = new Withdraw(getParentShell(),list);
				withdrawDialog.open();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	private void CheckBalance(Button checkBalance) {
		// TODO Auto-generated method stub
		checkBalance.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				Check_Balance checkBalanceDialog = new Check_Balance(getParentShell(),list);
				 checkBalanceDialog.open();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	private void CreateAccount(Button createAccount) {
		createAccount.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

				Create_Account createAccountDialog = new Create_Account(getParentShell(),list);
				createAccountDialog.open();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
	}
	private void ShowAllDetails(Button showAllDetails) {
		// TODO Auto-generated method stub
		showAllDetails.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				 ShowAllAccount showDetailsDialog = new ShowAllAccount(getParentShell(),list);
				 showDetailsDialog.open();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

	}
	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		super.okPressed();
	}

	@Override
	protected void cancelPressed() {
		// TODO Auto-generated method stub
		super.cancelPressed();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub
		// super.createButtonsForButtonBar(parent);
		
		createButton(parent,0,IDialogConstants.OK_LABEL ,true);

		createButton(parent,1,IDialogConstants.CANCEL_LABEL ,true);
	}
}