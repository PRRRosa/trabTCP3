package command;

import actions.SystemOperationsImpl;
import userinteraction.UserTextInteraction;
import actions.SystemOperations;

public abstract class Command implements UIAction {

	private SystemOperationsImpl systemOperationsImpl;

	private UserTextInteraction userTextInteraction;

	protected Command(SystemOperations systemOperation, UserTextInteraction userTextInteraction) {

	}


	/**
	 * @see Command.UIAction#execute()
	 */
	public void execute() {

	}

}
