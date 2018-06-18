package domain;

import java.util.Iterator;
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


	public boolean allArticlesHaveGrades() {
		for(Iterator<Article> articles = this.submittedArticles.iterator(); articles.hasNext();) {
			Article listArticle = articles.next();
			if(!(listArticle.getGrades().size() == listArticle.getReviewers().size())) {
				return false;
			}
		}
		return true;
	}
	
	public String getInitials() {
		return this.initials;
	}
}
