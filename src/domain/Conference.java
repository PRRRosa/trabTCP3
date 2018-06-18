package domain;

import java.util.List;

public class Conference {

	private String initials;

	private List<Researcher> researcher;
	
	private List<Article> submittedArticles;

	public Conference(String initials, List<Researcher> researchers, List<Article> submittedArticles) {
		this.initials = initials;
		this.researcher = researchers;
		this.submittedArticles = submittedArticles;
	}

	public List<Researcher> getResearchers() {
		return this.researcher;
	}

	public List<Article> getSubmittedArticles() {
		return this.submittedArticles;
	}

	public boolean isConferenceAllocated() {
		return false;
	}

	public boolean allArticlesHaveGrades() {
		return false;
	}
	
	public String getInitials() {
		return this.initials;
	}
}
