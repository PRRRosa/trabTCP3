package domain;

import java.util.List;

public class Researcher {

	private int id;

	private String name;

	private Affiliation affiliation;

	private SearchTopics[] searchTopics;

	private Affiliation affiliation;

	private SearchTopics[] searchTopics;

	private Article article;

	public Researcher(int id, String name, Affiliation affiliation, SearchTopics searchTopics) {

	}

	public int getReasercherID() {
		return 0;
	}

	public List<SearchTopics> getSearchTopics() {
		return null;
	}

	public Affiliation getAffiliation() {
		return null;
	}

	public List<Article> getReviewedArticles() {
		return null;
	}

	public void setReviewedArticles(Article reviewedArticle) {

	}

}
