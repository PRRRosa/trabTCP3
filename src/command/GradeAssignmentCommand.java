package command;

import actions.SystemOperations;

public class GradeAssignmentCommand extends Command {

	public GradeAssignmentCommand(SystemOperations systemOperation) {
		super(systemOperation);
	}

	public void execute() {

	}

	private boolean validateGrade(int grade) {
		if(grade>= -3 && grade <= 3) {
			return true;
		}
		return false;
	}

}
