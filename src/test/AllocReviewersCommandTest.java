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

import actions.GradeAssignment;
import actions.SystemOperations;
import actions.SystemOperationsImpl;
import command.AllocReviewersCommand;
import command.ArticlesSelectionCommand;
import data.Database;
import domain.Affiliation;
import domain.Article;
import domain.Conference;
import domain.Researcher;


public class AllocReviewersCommandTest {

	private AllocReviewersCommand arcommand;
	private String printMessages;

	@Before
	public void setUp() {
		String st="st";
		List<String> stl = new ArrayList();
		stl.add(st);
		Researcher res=new Researcher(123,"Res","aa",stl);
		Article article=new Article(111,"como fazer unit tests",res.getResearcherID(),null,st);
		List<Researcher> resList = Arrays.asList(res);
		List<Article> articleList= Arrays.asList(article);
		Conference conf1=new Conference("mds",resList,articleList);
		Database data=new Database();
		data.save(conf1);
		SystemOperations sysOp=new SystemOperationsImpl(data);
		
		arcommand=new AllocReviewersCommand(sysOp);
		//printMessages="printAllConferences,askConference,alertUserGradeNeedRevision";
	}
	
	@Test
	public void testExecute() {
		printMessages="Confer�ncias:\n"
				+ "(1)- mds\n"
				+ "Digite o n�mero de reviewers a serem usados\n"
				+ "Digite o n�mero da confer�ncia escolhida\n";
		System.setIn(new ByteArrayInputStream("1\n2\n".getBytes()));

	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;
	    System.setOut(ps);

	    arcommand.execute();
	    

	    System.out.flush();
	    System.setOut(old);
	    
	    assertTrue(baos.toString().equals(printMessages));

	}

}
