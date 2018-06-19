package command;

import java.util.Scanner;

import actions.GradeAssignment;
import actions.SystemOperations;
import domain.Article;
import domain.Researcher;
import userinteraction.UserTextInteraction;

public class GradeAssignmentCommand extends Command {
	
	public GradeAssignmentCommand(SystemOperations systemOperation, UserTextInteraction userTextInteraction) {
		super(systemOperation, userTextInteraction);
	}

	public void execute() {
		getUserTextInteraction().printArticleList(getSystemOperationsImpl().getDatabase().getAllArticles());
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID do artigo: ");
		int idArticle = getUserTextInteraction().readInt(scan);
		Article gradedArticle = getSystemOperationsImpl().getDatabase().getArticle(idArticle);
		getUserTextInteraction().printReviewers(gradedArticle.getReviewers());
		
		System.out.println("ID do pesquisador: ");
		int idResearcher = getUserTextInteraction().readInt(scan);
		Researcher reviewer = getSystemOperationsImpl().getDatabase().getResearcher(idResearcher);
		
		int grade = -4;
		System.out.println("Nota [-3, 3]: ");
		while(!validateGrade(grade)) {
			grade = getUserTextInteraction().readInt(scan);
		}
		new GradeAssignment(grade, reviewer, gradedArticle);
	}

	private boolean validateGrade(int grade) {
		return (grade>= -3 && grade <= 3);
	}

}
