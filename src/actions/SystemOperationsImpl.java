package actions;

import data.Database;
import domain.Article;
import command.PeerReviewSystem;
import domain.Conference;
import domain.Researcher;

public class SystemOperationsImpl implements SystemOperations{

	private Database database;

	private Article article;

	private PeerReviewSystem peerReviewSystem;

	public SystemOperationsImpl(Database database) {

	}

	public AllocReviewers allocReviewers(Conference selectedConference, int numReviewers) {
		return null;
	}

	public GradeAssignment gradeAssignment(int value, Researcher reviewer) {
		return null;
	}

	public ArticlesSelection articlesSelection(Conference conference) {
		return null;
	}

	public Database getDatabase() {
		return null;
	}

}
