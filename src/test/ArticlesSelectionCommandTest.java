package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import actions.GradeAssignment;
import actions.SystemOperations;
import actions.SystemOperationsImpl;

import org.junit.Before;

import command.ArticlesSelectionCommand;
import data.Database;
import domain.Affiliation;
import domain.Article;
import domain.Conference;
import domain.Researcher;
import domain.SearchTopics;
import java.util.Arrays;
public class ArticlesSelectionCommandTest {
	
	private ArticlesSelectionCommand ascommand;
	private String printMessages;

	@Before
	public void setUp() {
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),st);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		Database data=new Database();
		data.save(conf1);
		SystemOperations sysOp=new SystemOperationsImpl(data);
		
		ascommand=new ArticlesSelectionCommand(sysOp);
		//printMessages="printAllConferences,askConference,alertUserGradeNeedRevision";
	}
	
	@Test
	public void testExecuteNoGrades() {
		printMessages="Conferências:\n"
				+ "(1)- mds\n"
				+ "Digite o número da conferência escolhida\n"
				+ "Alguns artigos ainda precisam ser avaliados.";
		System.setIn(new ByteArrayInputStream("1\n".getBytes()));
		//Scanner reader = new Scanner(System.in);  // Reading from System.in
		//int n = reader.nextInt();
		//System.out.println(n);
		
		// Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    // Print some output: goes to your special stream

	    ascommand.execute();
	    
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessages));

	}
	
	@Test
	public void testExecuteHighGrade() {
		
		printMessages="Conferências:\n"
				+ "(1)- mds\n"
				+ "Digite o número da conferência escolhida\n"
				+ "Artigos aceitos:\ncomo fazer unit tests\n"
				+ "Artigos rejeitados:";
		System.setIn(new ByteArrayInputStream("1\n".getBytes()));
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;
	    System.setOut(ps);
	    
	    Researcher res=new Researcher(123,"Res",new Affiliation(122,"aa"),new SearchTopics(132,"st"));
	    GradeAssignment gradeAssignment=new GradeAssignment(3,res);
	    
	    ascommand.execute();
	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessages));
		
	}

}
