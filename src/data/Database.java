package data;

import java.util.Map;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.ArrayList;

import domain.Conference;
import domain.Grade;
import domain.Article;
import domain.Researcher;

public class Database {

	private Map<String, Conference> conferences;

	private Map<Integer, Article> articles;

	private Map<Integer, Researcher> researchers;

	public Database() {
		this.initData();
	}

	public Database(boolean iniData) {
		if(iniData) {
			// Inicializa os pesquisadores
			save(new Researcher(1, "João", "UFRGS", asList("Software Product Lines", "Software Reuse", "Modularity")));
			save(new Researcher(2, "Ana", "USP", asList("Software Architecture", "Modularity", "Software Reuse")));
			save(new Researcher(3, "Manoel", "UFRGS", asList("Software Product Lines", "Software Testing")));
			save(new Researcher(4, "Joana", "UFRJ", asList("Software Product Lines", "Software Reuse", "Software Architecture", "Aspect-oriented Programming")));
			save(new Researcher(5, "Miguel", "UFRGS", asList("Software Architecture", "Software Testing", "Modularity")));
			save(new Researcher(6, "Beatriz", "UFRJ", asList("Software Testing", "Software Reuse", "Aspect-oriented Programming")));
			save(new Researcher(7, "Suzana", "UFRGS", asList("Aspect-oriented Programming", "Software Reuse", "Modularity")));
			save(new Researcher(8, "Natasha", "UFRJ", asList("Software Quality", "Software Product Lines", "Software Reuse", "Modularity")));
			save(new Researcher(9, "Pedro", "USP", asList("Aspect-oriented Programming", "Software Architecture")));
			save(new Researcher(10, "Carlos", "USP", asList("Software Testing", "Software Reuse", "Modularity")));
			
			//Inicializa os artigos
			save(new Article(1, "Coupling and Cohesion", 1, "SBES", "Modularity"));
			save(new Article(2, "Design Patterns", 6, "FSE", "Software Reuse"));
			save(new Article(3, "AspectJ", 7, "FSE", "Aspect-oriented Programming"));
			save(new Article(4, "Feature Model", 8, "FSE", "Software Product Lines"));
			save(new Article(5, "Architecture Recovery", 9, "FSE", "Software Architecture"));
			save(new Article(6, "Funcional Testing", 10, "FSE", "Software Testing"));
			save(new Article(7, "COTs", 6, "ICSE", "Software Reuse"));
			save(new Article(8, "Pointcut ", 7, "ICSE", "Aspect-oriented Programming"));
			save(new Article(9, "Product Derivation", 8, "ICSE", "Software Product Lines"));
			save(new Article(10, "Architecture Comformance", 9, "ICSE", "Software Architecture"));
			save(new Article(11, "Structural Testing", 10, "ICSE", "Software Testing"));
	
			//Seta as notas
			articles.get(1).saveGrade(new Grade(2, researchers.get(8)));
			articles.get(2).saveGrade(new Grade(2, researchers.get(7)));
			articles.get(2).saveGrade(new Grade(3, researchers.get(2)));
			articles.get(3).saveGrade(new Grade(-1, researchers.get(4)));
			articles.get(3).saveGrade(new Grade(1, researchers.get(6)));
			articles.get(4).saveGrade(new Grade(1, researchers.get(1)));
			articles.get(4).saveGrade(new Grade(0, researchers.get(3)));
			articles.get(5).saveGrade(new Grade(-3, researchers.get(4)));
			articles.get(5).saveGrade(new Grade(-3, researchers.get(5)));
			articles.get(6).saveGrade(new Grade(-1, researchers.get(3)));
			articles.get(6).saveGrade(new Grade(0, researchers.get(6)));
			
			// Inicializa as conferências (Resulvi não remover a lista de artigos das conferencias)
			save(new Conference("ICSE", asList(researchers.get(1), researchers.get(2), researchers.get(3), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
								asList(articles.get(7), articles.get(8), articles.get(9), articles.get(10), articles.get(11))));
			save(new Conference("FSE", asList(researchers.get(1), researchers.get(2), researchers.get(3), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
								asList(articles.get(2), articles.get(3), articles.get(4), articles.get(5), articles.get(6))));
			save(new Conference("SBES", asList(researchers.get(8), researchers.get(9), researchers.get(10), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
							asList(articles.get(1))));
		}
	}

	private void initData() {
		// Inicializa os pesquisadores
		save(new Researcher(1, "João", "UFRGS", asList("Software Product Lines", "Software Reuse", "Modularity")));
		save(new Researcher(2, "Ana", "USP", asList("Software Architecture", "Modularity", "Software Reuse")));
		save(new Researcher(3, "Manoel", "UFRGS", asList("Software Product Lines", "Software Testing")));
		save(new Researcher(4, "Joana", "UFRJ", asList("Software Product Lines", "Software Reuse", "Software Architecture", "Aspect-oriented Programming")));
		save(new Researcher(5, "Miguel", "UFRGS", asList("Software Architecture", "Software Testing", "Modularity")));
		save(new Researcher(6, "Beatriz", "UFRJ", asList("Software Testing", "Software Reuse", "Aspect-oriented Programming")));
		save(new Researcher(7, "Suzana", "UFRGS", asList("Aspect-oriented Programming", "Software Reuse", "Modularity")));
		save(new Researcher(8, "Natasha", "UFRJ", asList("Software Quality", "Software Product Lines", "Software Reuse", "Modularity")));
		save(new Researcher(9, "Pedro", "USP", asList("Aspect-oriented Programming", "Software Architecture")));
		save(new Researcher(10, "Carlos", "USP", asList("Software Testing", "Software Reuse", "Modularity")));
		
		//Inicializa os artigos
		save(new Article(1, "Coupling and Cohesion", 1, "SBES", "Modularity"));
		save(new Article(2, "Design Patterns", 6, "FSE", "Software Reuse"));
		save(new Article(3, "AspectJ", 7, "FSE", "Aspect-oriented Programming"));
		save(new Article(4, "Feature Model", 8, "FSE", "Software Product Lines"));
		save(new Article(5, "Architecture Recovery", 9, "FSE", "Software Architecture"));
		save(new Article(6, "Funcional Testing", 10, "FSE", "Software Testing"));
		save(new Article(7, "COTs", 6, "ICSE", "Software Reuse"));
		save(new Article(8, "Pointcut ", 7, "ICSE", "Aspect-oriented Programming"));
		save(new Article(9, "Product Derivation", 8, "ICSE", "Software Product Lines"));
		save(new Article(10, "Architecture Comformance", 9, "ICSE", "Software Architecture"));
		save(new Article(11, "Structural Testing", 10, "ICSE", "Software Testing"));

		//Seta as notas
		articles.get(1).saveGrade(new Grade(2, researchers.get(8)));
		articles.get(2).saveGrade(new Grade(2, researchers.get(7)));
		articles.get(2).saveGrade(new Grade(3, researchers.get(2)));
		articles.get(3).saveGrade(new Grade(-1, researchers.get(4)));
		articles.get(3).saveGrade(new Grade(1, researchers.get(6)));
		articles.get(4).saveGrade(new Grade(1, researchers.get(1)));
		articles.get(4).saveGrade(new Grade(0, researchers.get(3)));
		articles.get(5).saveGrade(new Grade(-3, researchers.get(4)));
		articles.get(5).saveGrade(new Grade(-3, researchers.get(5)));
		articles.get(6).saveGrade(new Grade(-1, researchers.get(3)));
		articles.get(6).saveGrade(new Grade(0, researchers.get(6)));
		
		// Inicializa as conferências (Resulvi não remover a lista de artigos das conferencias)
		save(new Conference("ICSE", asList(researchers.get(1), researchers.get(2), researchers.get(3), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
							asList(articles.get(7), articles.get(8), articles.get(9), articles.get(10), articles.get(11))));
		save(new Conference("FSE", asList(researchers.get(1), researchers.get(2), researchers.get(3), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
							asList(articles.get(2), articles.get(3), articles.get(4), articles.get(5), articles.get(6))));
		save(new Conference("SBES", asList(researchers.get(8), researchers.get(9), researchers.get(10), researchers.get(4), researchers.get(5), researchers.get(6), researchers.get(7)),
						asList(articles.get(1))));
	}

	public List<Conference> getAllConferences() {
		return new ArrayList<Conference>(conferences.values());
	}

	public List<Article> getAllArticles() {
		return new ArrayList<Article>(articles.values());
	}

	public List<Researcher> getAllResearchers() {
		return new ArrayList<Researcher>(researchers.values());
	}

	public void save(Conference conference) {
		this.conferences.put(conference.getInitials(), conference);
	}

	public void save(Article article) {
		this.articles.put(article.getId(), article);
	}

	public void save(Researcher researcher) {
		this.researchers.put(researcher.getReasercherID(), researcher);
	}

	public Conference getConference(String ConferenceInitials) {
		return conferences.get(ConferenceInitials);
	}

	public Article getArticle(int ArticleID) {
		return articles.get(ArticleID);
	}

	public Researcher getResearcher(int ResearcherID) {
		return researchers.get(ResearcherID);
	}
}