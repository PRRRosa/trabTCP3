package userinteraction;

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
			System.out.print("\tArtigos: ");
			for(Article a : c.getSubmittedArticles()) {
				System.out.print(a.getTitle() + " ");
				System.out.println("Sigla: " + c.getInitials() + " Pesquisadores: " + c.getResearchers());
			}
		}
	}

	public int readInt(Scanner scan) {
		return scan.nextInt();
	}

	public String readStr(Scanner scan) {
		String op = scan.next();
		
		op = op.replaceAll("\n", "");
		op = op.replaceAll("\t", "");
		op = op.trim();
		return op;
	}

}
