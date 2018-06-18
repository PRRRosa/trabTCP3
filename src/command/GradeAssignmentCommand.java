package command;

import actions.SystemOperations;

public class GradeAssignmentCommand extends Command {

	public GradeAssignmentCommand(SystemOperations systemOperation) {
		super(systemOperation);
	}

	public void execute() {

	}

	private boolean validateGrade(int grade) {
		return false;
	}

}
