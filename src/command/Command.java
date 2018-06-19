package command;

import actions.SystemOperationsImpl;
import userinteraction.UserTextInteraction;
import actions.SystemOperations;

public abstract class Command implements UIAction {

	private SystemOperationsImpl systemOperationsImpl;

	private UserTextInteraction userTextInteraction;

	protected Command(SystemOperations systemOperation, UserTextInteraction userTextInteraction) {
		this.systemOperationsImpl = (SystemOperationsImpl)systemOperation;
		this.userTextInteraction = userTextInteraction;
	}
	
	protected Command(SystemOperations systemOperation) {
		this.systemOperationsImpl = (SystemOperationsImpl)systemOperation;
	}

	protected UserTextInteraction getUserTextInteraction() {
		return this.userTextInteraction;
	}

	protected SystemOperationsImpl getSystemOperationsImpl() {
		return this.systemOperationsImpl;
	}
	
	/**
	 * @see Command.UIAction#execute()
	 */
	public void execute() {

	}

}
