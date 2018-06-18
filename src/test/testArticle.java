package test;
import  domain.*;
import actions.*;
import command.GradeAssignmentCommand;
import data.Database;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;
public class testArticle {
	Article ArtigoTest;
	Researcher AuthorTest;
	Affiliation AffiliationAll;
	Researcher Reviewer1;
	Researcher Reviewer2;
	Researcher Reviewer3;
	Researcher Reviewer4;
	Researcher Reviewer5;
	Researcher Reviewer6;
	Conference conferenceTest;
	SearchTopics STAll;
	List<Researcher> Researchers;
	List<Article> Articles;
	List<SearchTopics> stl;
	Grade GradeLessThanMin;
	Grade GradeGreaterThanMax;
	Database DB;
	GradeAssignmentCommand GradeAssigCom;
	GradeAssignment GradAssig;
	Grade GradeR3;
	Grade notaR4;
	Grade notaR5;
	Grade notaR6;
	GradeAssignment GraAssig;
	@Before
	public void setUp() throws Exception{
		
		
		AffiliationAll =new Affiliation(10,"UFRGS");
		STAll = new SearchTopics(10,"Viagem No Tempo");
		Researchers = new ArrayList<Researcher>();
		stl = new ArrayList();
		stl.add(STAll);
		AuthorTest = new Researcher(10,"Kurisu",AffiliationAll,stl);
		Reviewer1 = new Researcher(9,"Alexis",AffiliationAll,stl);
		Reviewer2 = new Researcher(8,"Arthur",AffiliationAll,stl);
		Reviewer3 = new Researcher(7,"Magnum",AffiliationAll,stl);
		Reviewer4 = new Researcher(6,"Mario",AffiliationAll,stl);
		Reviewer5 = new Researcher(5,"Okabe",AffiliationAll,stl);
		Reviewer6 = new Researcher(4,"Rintaro",AffiliationAll,stl);
		Researchers.add(Reviewer1);
		Researchers.add(Reviewer2);
		Researchers.add(Reviewer3);
		Researchers.add(Reviewer4);
		Researchers.add(Reviewer5);
		Researchers.add(Reviewer6);
		Researchers.add(AuthorTest);
		GradeR3 = new Grade(3,Reviewer3);
		conferenceTest=new Conference("aaa",new ArrayList<Researcher>(),new ArrayList<Article>());
	}
	@Test
	public void ConstructorArticle() {
		try {
			ArtigoTest = new Article(99,"Viagem no Tempo No Jap�o",AuthorTest,conferenceTest,STAll);
		}
		catch(Exception e) {
			assert false;
		}
		finally {
			assert true;
		}
		
	}
	@Test
	public void TestFiveResearchers() {
		try {
			ArtigoTest = new Article(99,"Viagem no Tempo No Jap�o",AuthorTest,conferenceTest,STAll);
			ArtigoTest.setReviewers(Reviewer1);
			ArtigoTest.setReviewers(Reviewer2);
			ArtigoTest.setReviewers(Reviewer3);
			ArtigoTest.setReviewers(Reviewer4);
			ArtigoTest.setReviewers(Reviewer5);
		}
		catch(Exception e) {
			assert false;
		}
		finally {
			assert true;
		}
			
	}
	@Test
	public void TestTwoResearchers() {
		try {
			ArtigoTest = new Article(99,"Viagem no Tempo No Jap�o",AuthorTest,conferenceTest,STAll);
			ArtigoTest.setReviewers(Reviewer1);
			ArtigoTest.setReviewers(Reviewer2);
		}
		catch(Exception e) {
			assert false;
		}
		finally {
			assert true;
		}
	}
	@Test
	public void hasReceivedAllGrades() {
		try {
			ArtigoTest = new Article(99,"Viagem no Tempo No Jap�o",AuthorTest,conferenceTest,STAll);
			ArtigoTest.setReviewers(Reviewer3);
			ArtigoTest.saveGrade(GradeR3);
		}
		catch(Exception e) {
			assert false;
		}
		finally {
			assert true;
		}
	}
	
	
}
