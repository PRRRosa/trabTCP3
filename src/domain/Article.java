package domain;

import actions.GradeAssignment;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private int id;

	private String title;

	private int authorId;

	private String searchTopic;

	private ArrayList<Grade> grades;

	private GradeAssignment gradeAssignment;
	
	private ArrayList<Researcher> reviewers;
	
	private String conferenceInitials;
	
	private boolean isAllocated;

	public Article(int id, String title, int author, String conference, String searchTopic) {
		this.id = id;
		this.title = title;
		this.authorId = author;
		this.searchTopic = searchTopic;
		this.conferenceInitials = conference;
		this.isAllocated = false;
		
		this.grades = new ArrayList<Grade>();
	}

	public double calculateAverage() {
		double sum = 0;
		int total = 0;

		if(hasReceivedAllGrades()) {
			for(Grade i : grades) {
				sum += i.getValue();
				total++;
			}
			return sum/total;
		}
		return -1;
		
	}

	public boolean hasReceivedAllGrades() {
		if(!(this.grades.size() == this.reviewers.size())) {
			return false;
		}
		return true;
	}

	public void saveGrade(Grade grade) {
		grades.add(grade);
	}

	public boolean checkArticleStatus() {
		if(calculateAverage() >= 0 )
			return true;
		else return false;
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
	
	public boolean isArticleAllocated() {
		return this.isAllocated;
	}
	
	public void setArticleAllocated(boolean allocation) {
		this.isAllocated = allocation;
	}
}
