package command;

import actions.SystemOperations;
import java.util.List;
import domain.Article;

public class ArticlesSelectionCommand extends Command {

	public ArticlesSelectionCommand(SystemOperations systemOperation) {
		super(systemOperation);
	}

	public void execute() {

	}

	private void alertUserGradeNeedRevision() {

	}

	private void printAcceptedArticles(List<Article> articles) {

	}

	private void printRejectedArticles(List<Article> articles) {

	}

}
