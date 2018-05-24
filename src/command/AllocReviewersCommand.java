package command;

import actions.SystemOperations;
import java.util.List;
import domain.Conference;

public class AllocReviewersCommand extends Command {

	public AllocReviewersCommand(SystemOperations systemOperation) {

	}

	public void execute() {

	}

	private boolean numReviewersValidation(int numReviewers) {
		return false;
	}

	private void printNotAllocatedConferences(List<Conference> notAllocatedConferences) {

	}

	private void printAllocationReport(Conference conference) {

	}

}
