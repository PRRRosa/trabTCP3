package data;

import java.util.Map;
import java.util.List;
import domain.Conference;
import domain.Article;
import domain.Researcher;

public class Database {

	private Map<int, Conference> conferences;

	private Map<int, Article> articles;

	private Map<int, Researcher> researchers;

	public Database() {

	}

	public Database(boolean iniData) {

	}

	private void initData() {

	}

	public List<Conference> getAllConferences() {
		return null;
	}

	public List<Article> getAllArticles() {
		return null;
	}

	public List<Researcher> getAllResearchers() {
		return null;
	}

	public List<Conference> getNotAllocatedConferences() {
		return null;
	}

	public void save(Conference conference) {

	}

	public void save(Article article) {

	}

	public void save(Researcher researcher) {

	}

	public Conference getConference(int ConferenceID) {
		return null;
	}

	public Article getArticle(int ArticleID) {
		return null;
	}

	public Researcher getResearcher(int ReseracherID) {
		return null;
	}

}
