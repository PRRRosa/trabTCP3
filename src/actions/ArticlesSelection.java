package actions;

import java.util.List;
import domain.Conference;
import domain.Article;

public class ArticlesSelection {

	private List<Article> acceptedArticles;

	private List<Article> rejectedArticles;

	public ArticlesSelection(Conference conference) {

	}

	private void generateArticleLists(List<Article> submittedArticles) {

	}

	public List<Article> getAcceptedArticles() {
		return this.acceptedArticles;
	}

	public List<Article> getRejectedArticles() {
		return this.rejectedArticles;
	}

}
