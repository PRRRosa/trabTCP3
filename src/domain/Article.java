package domain;

import actions.GradeAssignment;
import java.util.List;

public class Article {

	private int id;

	private String title;

	private int authorId;

	private String searchTopic;

	private Grade[] grades;

	private GradeAssignment gradeAssignment;
	
	private List<Researcher> reviewers;
	
	private String conferenceInitials;

	public Article(int id, String title, int author, String conference, String searchTopic) {
		this.id = id;
		this.title = title;
		this.authorId = author;
		this.searchTopic = searchTopic;
		this.conferenceInitials = conference;
		
	}

	public String getConferenceInitials() {
		return this.conferenceInitials;
	}

	public String getSearchTopic() {
		return this.searchTopic;
	}

	public List<Researcher> getReviewers() {
		return this.reviewers;
	}

	public void setReviewers(Researcher reviewer) {
		this.reviewers.add(reviewer);
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

	public int getId() {
		return id;
	}
}
