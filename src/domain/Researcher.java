package domain;

import java.util.List;

public class Researcher {

	private int id;

	private String name;

	private Affiliation affiliation;

	private List<SearchTopics> searchTopics;

	private List<Article> article;

	public Researcher(int id, String name, Affiliation affiliation, List<SearchTopics> searchTopics) {
		this.id = id;
		this.name = name;
		this.affiliation = affiliation;
		this.searchTopics = searchTopics;
	}

	public int getReasercherID() {
		return this.id;
	}

	public List<SearchTopics> getSearchTopics() {
		return this.searchTopics;
	}

	public Affiliation getAffiliation() {
		return this.affiliation;
	}

	public List<Article> getReviewedArticles() {
		return this.article;
	}

	public void setReviewedArticles(Article reviewedArticle) {
		this.article.add(reviewedArticle);
	}

}
