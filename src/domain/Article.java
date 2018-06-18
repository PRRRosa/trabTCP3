package domain;

import actions.GradeAssignment;
import java.util.List;

public class Article {

	private int id;

	private String title;

	private Researcher author;

	private SearchTopics searchTopics;

	private Grade[] grades;

	private GradeAssignment gradeAssignment;
	
	private Conference conference;

	public Article(int id, String title, Researcher author, Conference conference, SearchTopics searchTopic) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.searchTopics = searchTopic;
		this.conference = conference;
		
	}

	public Conference getConference() {
		return this.conference;
	}

	public SearchTopics getSearchTopic() {
		return this.searchTopics;
	}

	public List<Researcher> getReviewers() {
		return null;
	}

	public void setReviewers(Researcher reviewer) {

	}

	public double calculateAverage() {
		return 0;
	}

	public boolean hasReceivedAllGrades() {
		return false;
	}

	public void saveGrade(Grade grade) {

	}

	public boolean checkArticleStatus() {
		return false;
	}

}
