package userinteraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.*;

public class UserTextInteraction {

	public UserTextInteraction() {

	}

	public void printArticleList(List<Article> articles) {

	}

	public void printReviewers(List<Researcher> reviewers) {

	}

	public void printAllConferences(List<Conference> conferences) {

	}

	public int readSelectedConfereceID() {
		return 0;
	}

	public int readNumberReviewers() {
		return 0;
	}

	public int readSelectedArticleID() {
		return 0;
	}

	public int readSelectedReviewerID() {
		return 0;
	}

	public int readGrade() {
		return 0;
	}

	public String readSelectedCommand() {
		Scanner scanner = new Scanner(System.in);
		String op = "";
		op = scanner.nextLine();
		
		scanner.close();
		return op;
	}

}
