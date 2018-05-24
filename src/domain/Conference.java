package domain;

import java.util.List;

public class Conference {

	private String initials;

	private Researcher[] researcher;

	public Conference(String initials, List<Researcher> researchers, List<Article> submittedArticles) {

	}

	public List<Researcher> getResearchers() {
		return null;
	}

	public List<Article> getSubmittedArticles() {
		return null;
	}

	public boolean isConferenceAllocated() {
		return false;
	}

	public boolean allArticlesHaveGrades() {
		return false;
	}

}
