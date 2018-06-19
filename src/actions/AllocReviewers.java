package actions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import domain.Conference;
import domain.Researcher;
import domain.Article;

public class AllocReviewers {

	private List<Article> allocationGroup;

	private Conference selectedConference;

	private int numReviewers;

	public AllocReviewers(Conference selectedConference, int numReviewers) {
		this.selectedConference = selectedConference;
		this.numReviewers = numReviewers;
	}

	private void setAllocationGroup(List<Article> submittedArticles) {
		this.allocationGroup = submittedArticles;
	}

	private boolean validateCandidate(Researcher researcher, Article article) {
		List<Researcher> researchers = article.getReviewers();
		for (Researcher r : researchers) {
			if (r.getAffiliation().equals(researcher.getAffiliation())) {
				return false;
			}
			List<String> topics = r.getSearchTopics();
			for(String s : topics) {
				if(researcher.getSearchTopics().stream().anyMatch(str -> str.trim().equals(s))) {
					return false;
				}
			}	
		}
		if(researcher.getResearcherID() == article.getAuthorId()) {
			return false;
		}
		return true;
	}

	private List<Researcher> selectCandidates(List<Researcher> researchers, Article article) {
		List<Researcher> selectedList = new ArrayList();
		for (Researcher r : researchers) {
			if (validateCandidate(r,article)) {
				selectedList.add(r);
			}
		}
		return selectedList;
	}

	private void sortCandidates(List<Researcher> selectedCandidates) {
		
	}

	private void assignArticle(Researcher selectedCandidate, Article submittedArticle) {

	}

}
