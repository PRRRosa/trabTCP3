package domain;

import java.util.List;

public class Researcher {

	private int id;

	private String name;

	private String affiliation;

	private List<String> searchTopics;

	private List<Article> article;

	public Researcher(int id, String name, String affiliation, List<String> searchTopics) {
		this.id = id;
		this.name = name;
		this.affiliation = affiliation;
		this.searchTopics = searchTopics;
	}

	public int getResearcherID() {
		return this.id;
	}

	public List<String> getSearchTopics() {
		return this.searchTopics;
	}

	public String getAffiliation() {
		return this.affiliation;
	}

	public List<Article> getReviewedArticles() {
		return this.article;
	}

	public void setReviewedArticles(Article reviewedArticle) {
		this.article.add(reviewedArticle);
	}
	
}
