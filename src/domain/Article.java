package domain;

import actions.GradeAssignment;
import java.util.List;

public class Article {

	private int id;

	private String title;

	private int authorId;

	private String searchTopic;

	private List<Grade> grades;

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

	public double calculateAverage() {
		double sum = 0;
		int total = 0;
		
		for(Grade i : grades) {
			sum += i.getValue();
			total++;
		}
		
		return sum/total;
	}

	public boolean hasReceivedAllGrades() {
		return false;
	}

	public void saveGrade(Grade grade) {
		grades.add(grade);
	}

	public boolean checkArticleStatus() {
		return false;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getAuthorId() {
		return authorId;
	}

	public String getSearchTopic() {
		return searchTopic;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public GradeAssignment getGradeAssignment() {
		return gradeAssignment;
	}

	public List<Researcher> getReviewers() {
		return reviewers;
	}

	public String getConferenceInitials() {
		return conferenceInitials;
	}
}
