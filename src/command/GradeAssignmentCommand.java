package command;

import java.util.Scanner;

import actions.SystemOperations;
import userinteraction.UserTextInteraction;

public class GradeAssignmentCommand extends Command {
	
	public GradeAssignmentCommand(SystemOperations systemOperation, UserTextInteraction userTextInteraction) {
		super(systemOperation, userTextInteraction);
	}

	public void execute() {
		getUserTextInteraction().printArticleList(getSystemOperationsImpl().getDatabase().getAllArticles());
		Scanner scan = new Scanner(System.in);
		int id = getUserTextInteraction().readInt(scan);
	}

	private boolean validateGrade(int grade) {
		return (grade>= -3 && grade <= 3);
	}

}
