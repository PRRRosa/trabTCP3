package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import actions.SystemOperations;
import actions.SystemOperationsImpl;
import command.AllocReviewersCommand;
import data.Database;
import domain.Affiliation;
import domain.Article;
import domain.Conference;
import domain.Researcher;
import domain.SearchTopics;

public class GradeAssignmentCommandTest {

	private AllocReviewersCommand arcommand;
	private String printMessages;

	@Before
	public void setUp() {
		SearchTopics st=new SearchTopics(122,"st");
		Researcher res=new Researcher(123,"Res",new Affiliation(123,"aa"),st);
		Researcher res2=new Researcher(124,"Res2",new Affiliation(121,"ab"),st);
		Article article=new Article(111,"como fazer unit tests",res,null,st);
		article.setReviewers(res2);
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
		printMessages="Artigos:\n"
				+ "(1)- como fazer unit tests\n"
				+ "Digite o número do artigo a ser avaliado.\n"
				+ "Revisores disponíveis:"
				+ "(1)- Res2"
				+ "Digite o número do revisor escolhido\n"
				+ "Digite a nota a ser atribuída ao artigo.\n";
		System.setIn(new ByteArrayInputStream("1\n3\n".getBytes()));

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
