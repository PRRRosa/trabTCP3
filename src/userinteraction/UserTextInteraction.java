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
			System.out.print("Sigla: " + c.getInitials() + " Pesquisadores: ");
			for(Researcher r : c.getResearchers()) {
				if(r != c.getResearchers().get(c.getResearchers().size()-1)) {
					System.out.print(r.getResearcherID() + ", ");	
				}
				else {
					System.out.print(r.getResearcherID());
				}
			}
			System.out.print("\tArtigos: ");
			Article last = c.getSubmittedArticles().get(c.getSubmittedArticles().size() - 1);
			for(Article a : c.getSubmittedArticles()) {
				if(a != last) {
					System.out.print(a.getTitle() + ", ");	
				}
				else {
					System.out.print(a.getTitle());
				}
			}
			System.out.println("");
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
