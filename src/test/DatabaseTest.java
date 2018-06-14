package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import data.Database;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import domain.Conference;
import domain.Affiliation;
import domain.Article;
import domain.Researcher;
import domain.SearchTopics;



public class DatabaseTest {

	@Before
	public void setUp() {
		Database data= new Database();

	}
	@Test
	public void testSaveConference() {
		Affiliation affiliation1= new Affiliation(123,"aa");
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",affiliation1,st);
		List<Researcher> resList = Arrays.asList(res);
		Article article=new Article(123,"como fazer unit tests",res,null,st);
		List<Article> articleList= Arrays.asList();
		Conference conf=new Conference("mds",resList,articleList);
		data.save(conf);
		
		
	}
	
	

}
