package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import domain.Affiliation;
import domain.Article;
import domain.Conference;
import domain.Researcher;
import domain.SearchTopics;
import userinteraction.UserTextInteraction;

public class UserTextInteractionTest {

	private UserTextInteraction userTextInteraction;
	
	@Before
	public void setUp() {
		userTextInteraction=new UserTextInteraction();
	}
	
	@Test
	public void testPrintArticleList() {
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),st);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),st);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		List<Article> articleList= Arrays.asList(article);
		String printMessage="ID:111 Nome:como fazer unit tests";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printArticleList(articleList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}
	
	@Test
	public void testPrintEmptyArticleList() {
		
		List<Article> articleList= new ArrayList<Article>();
		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printArticleList(articleList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}
	
	@Test
	public void testPrintNullArticleList() {
		

		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printArticleList(null);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}

	
	@Test
	public void testPrintReviewers() {
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),st);
		List<Researcher> researcherList= Arrays.asList(res);
		String printMessage="ID:122 Nome:Res";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printReviewers(researcherList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}
	
	@Test
	public void testPrintEmptyReviewers() {

		List<Researcher> researcherList=new ArrayList<Researcher>();
		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printReviewers(researcherList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}
	
	@Test
	public void testPrintNullReviewers() {
		

		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printReviewers(null);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
	}
	
	@Test public void testPrintConferences() {
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),st);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		List<Conference> confList=Arrays.asList(conf1);
		
		String printMessage="Nome:mds";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printAllConferences(confList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
		
	}
	
	@Test public void testPrintEmptyConferences() {

		List<Conference> confList=new ArrayList<Conference>();
		
		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printAllConferences(confList);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
		
	}
	
	@Test public void testPrintNullConferences() {		
		String printMessage="";
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;

	    System.setOut(ps);

	    userTextInteraction.printAllConferences(null);
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessage));
		
	}
	
	@Test 
	public void testReadSelectedConfereceID() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedConfereceID();
	    assertEquals(inputID,outputID);
		
	}
	@Test 
	public void testReadSelectedConfereceIDWrongCharacter() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("a\n1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedConfereceID();
	    assertEquals(inputID,outputID);
	}
	
	@Test 
	public void testReadNumberReviewers() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    int outputID=userTextInteraction.readNumberReviewers();
	    assertEquals(inputID,outputID);
		
	}
	@Test 
	public void testReadNumberReviewersWrongCharacter() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("a\n1\n".getBytes()));
	    int outputID=userTextInteraction.readNumberReviewers();
	    assertEquals(inputID,outputID);
	}
	
	@Test 
	public void testReadSelectedArticleID() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedArticleID();
	    assertEquals(inputID,outputID);
		
	}
	@Test 
	public void testReadSelectedArticleIDWrongCharacter() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("a\n1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedArticleID();
	    assertEquals(inputID,outputID);
	}
	
	@Test 
	public void testReadSelectedReviewerID() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedReviewerID();
	    assertEquals(inputID,outputID);
		
	}
	@Test 
	public void testReadSelectedReviewerIDWrongCharacter() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("a\n1\n".getBytes()));
	    int outputID=userTextInteraction.readSelectedReviewerID();
	    assertEquals(inputID,outputID);
	}
	
	@Test 
	public void testReadGrade() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    int outputID=userTextInteraction.readGrade();
	    assertEquals(inputID,outputID);
		
	}
	@Test 
	public void testReadGradeWrongCharacter() {
		int inputID=1;
	    System.setIn(new ByteArrayInputStream("a\n1\n".getBytes()));
	    int outputID=userTextInteraction.readGrade();
	    assertEquals(inputID,outputID);
	}
	
	@Test 
	public void testReadSelectedCommand() {
		String inputString="comando";
	    System.setIn(new ByteArrayInputStream("comando".getBytes()));
	    String outputString=userTextInteraction.readSelectedCommand();
	    assertEquals(inputString,outputString);
	}
	
	
}
