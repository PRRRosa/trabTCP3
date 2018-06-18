package userinteraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.*;

public class UserTextInteraction {

	public UserTextInteraction() {

	}

	public void printArticleList(List<Article> articles) {
		for(Article a : articles) {
			System.out.println("Titulo: " + a.getTitle() + " ID Autor: " + a.getAuthorId() + " ID: " + a.getId() + " Topico: " + a.getSearchTopic() + " Conferencia: " + a.getConferenceInitials()); 
		}
	}

	public void printReviewers(List<Researcher> reviewers) {
		for(Researcher r : reviewers) {
			System.out.println("ID: " + r.getResearcherID() + " Afiliacao: " + r.getAffiliation() + " Topicos: " + r.getSearchTopics());
		}
	}

	public void printAllConferences(List<Conference> conferences) {
		for(Conference c : conferences) {
			System.out.println("Sigla: " + c.getInitials() + " Pesquisadores: " + c.getResearchers());
			System.out.print("\tArtigos: ");
			for(Article a : c.getSubmittedArticles()) {
				System.out.print(a.getTitle() + " ");
			}
		}
	}

	public String readSelectedConfereceInitials(Scanner scan) {
		return readSelectedCommand(scan);
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

	public String readSelectedCommand(Scanner scan) {
		String op = scan.next();
		
		op = op.replaceAll("\n", "");
		op = op.replaceAll("\t", "");
		op = op.trim();
		return op;
	}

}
