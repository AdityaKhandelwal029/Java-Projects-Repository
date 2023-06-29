package atm_plugin_project_labelprovider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import atm_plugin_project_employeedata.*;

public class Accountnolabel extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		Employeedata account =(Employeedata)element;
		
		return String.valueOf(account.getAccountno());
	}
}