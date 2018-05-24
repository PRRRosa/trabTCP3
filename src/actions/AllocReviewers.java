package actions;

import java.util.List;
import domain.Conference;
import domain.Researcher;
import domain.Article;

public class AllocReviewers {

	private List<Article> allocationGroup;

	private Conference selectedConference;

	private int numReviewers;

	public AllocReviewers(Conference selectedConference, int numReviewers) {

	}

	private void setAllocationGroup(List<Article> submittedArticles) {

	}

	private boolean validateCandidate(Researcher researcher) {
		return false;
	}

	private List<Researcher> selectCandidates(List<Researcher> researchers) {
		return null;
	}

	private void sortCandidates(List<Researcher> selectedCandidates) {

	}

	private void assignArticle(Researcher selectedCandidate, Article submittedArticle) {

	}

}
