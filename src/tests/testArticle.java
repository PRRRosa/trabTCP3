package tests;
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
	Conference ConferenceTest;
	SearchTopics STAll;
	List<Researcher> Researchers;
	List<Article> Articles;
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
		AuthorTest = new Researcher(10,"Kurisu",AffiliationAll,STAll);
		Reviewer1 = new Researcher(9,"Alexis",AffiliationAll,STAll);
		Reviewer2 = new Researcher(8,"Arthur",AffiliationAll,STAll);
		Reviewer3 = new Researcher(7,"Magnum",AffiliationAll,STAll);
		Reviewer4 = new Researcher(6,"Mario",AffiliationAll,STAll);
		Reviewer5 = new Researcher(5,"Okabe",AffiliationAll,STAll);
		Reviewer6 = new Researcher(4,"Rintaro",AffiliationAll,STAll);
		Researchers.add(Reviewer1);
		Researchers.add(Reviewer2);
		Researchers.add(Reviewer3);
		Researchers.add(Reviewer4);
		Researchers.add(Reviewer5);
		Researchers.add(Reviewer6);
		Researchers.add(AuthorTest);
		GradeR3 = new Grade(3,Reviewer3);
	}
	@Test
	public void ConstructorArticle() {
		try {
			ArtigoTest = new Article(99,"Viagem no Tempo No Japão",AuthorTest,STAll);
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
			ArtigoTest = new Article(99,"Viagem no Tempo No Japão",AuthorTest,STAll);
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
			ArtigoTest = new Article(99,"Viagem no Tempo No Japão",AuthorTest,STAll);
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
			ArtigoTest = new Article(99,"Viagem no Tempo No Japão",AuthorTest,STAll);
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
