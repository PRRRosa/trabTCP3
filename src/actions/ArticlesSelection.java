package actions;

import java.util.ArrayList;
import java.util.List;
import domain.Conference;
import domain.Article;

public class ArticlesSelection {

	private List<Article> acceptedArticles;

	private List<Article> rejectedArticles;

	public ArticlesSelection(Conference conference) {
		acceptedArticles=new ArrayList<Article>();
		rejectedArticles=new ArrayList<Article>();
		generateArticleLists(conference.getSubmittedArticles());
	}

	private void generateArticleLists(List<Article> submittedArticles) {
		for(int i=0;i<submittedArticles.size();i++) {
			if(submittedArticles.get(i).calculateAverage() >= 0) {
				acceptedArticles.add(submittedArticles.get(i));
			} else rejectedArticles.add(submittedArticles.get(i));
		}
	}

	public List<Article> getAcceptedArticles() {
		return acceptedArticles;
	}

	public List<Article> getRejectedArticles() {
		return rejectedArticles;
	}

}
