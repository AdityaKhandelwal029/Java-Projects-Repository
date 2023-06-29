package atm_plugin_project.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import atm_plugin_project_options.Main_Menu;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;

@SuppressWarnings("unused")
public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		/*MessageDialog.openInformation(
				window.getShell(),
				"ATM Application",
				"Hello, Eclipse world");*/
		Main_Menu obj = new Main_Menu(window.getShell());
		obj.open();
		
		return null;
	}
}
