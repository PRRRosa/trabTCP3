package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import actions.ArticlesSelection;
import domain.Affiliation;
import domain.Article;
import domain.Conference;
import domain.Grade;
import domain.Researcher;
import domain.SearchTopics;

public class ArticlesSelectionTest {

	private ArticlesSelection articlesSelection;
	
	
	@Test
	public void testConstruct() {
		SearchTopics st=new SearchTopics(122,"st");
		List<SearchTopics> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),stl);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),stl);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		Grade grade1=new Grade(3,res2);
		article.saveGrade(grade1);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		articlesSelection=new ArticlesSelection(conf1);
		assertTrue(true);
	}
	
	@Test
	public void testNullConference() {
		articlesSelection=new ArticlesSelection(null);
		assertTrue(true);
	}
	
	@Test
	public void testNullConferenceGetSelected() {
		articlesSelection=new ArticlesSelection(null);
		List<Article> selectedArticles=articlesSelection.getAcceptedArticles();
		assertTrue(selectedArticles.isEmpty());
	}
	@Test
	public void testNullConferenceGetRejected() {
		articlesSelection=new ArticlesSelection(null);
		List<Article> rejectedArticles=articlesSelection.getRejectedArticles();
		assertTrue(rejectedArticles.isEmpty());
	}
	
	@Test
	public void testGetAcceptedArticle() {
		SearchTopics st=new SearchTopics(122,"st");
		List<SearchTopics> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),stl);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),stl);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		Grade grade1=new Grade(3,res2);
		article.saveGrade(grade1);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		articlesSelection=new ArticlesSelection(conf1);
		List<Article> selectedArticles=articlesSelection.getAcceptedArticles();
		assertEquals(selectedArticles.get(0),article);
	}
	
	@Test
	public void testGetAcceptedArticlesRejected() {
		SearchTopics st=new SearchTopics(122,"st");
		List<SearchTopics> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),stl);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),stl);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		Grade grade1=new Grade(-3,res2);
		article.saveGrade(grade1);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		articlesSelection=new ArticlesSelection(conf1);
		List<Article> selectedArticles=articlesSelection.getAcceptedArticles();
		assertTrue(selectedArticles.isEmpty());
	}
	
	@Test
	public void testGetRejectedArticle() {
		SearchTopics st=new SearchTopics(122,"st");
		List<SearchTopics> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),stl);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),stl);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		Grade grade1=new Grade(-3,res2);
		article.saveGrade(grade1);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		articlesSelection=new ArticlesSelection(conf1);
		List<Article> rejectedArticles=articlesSelection.getRejectedArticles();
		assertEquals(rejectedArticles.get(0),article);
	}
	
	@Test
	public void testGetRejectedArticleEmpty() {
		SearchTopics st=new SearchTopics(122,"st");
		List<SearchTopics> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),stl);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),stl);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		Grade grade1=new Grade(3,res2);
		article.saveGrade(grade1);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		articlesSelection=new ArticlesSelection(conf1);
		List<Article> rejectedArticles=articlesSelection.getRejectedArticles();
		assertTrue(rejectedArticles.isEmpty());
	}

}
