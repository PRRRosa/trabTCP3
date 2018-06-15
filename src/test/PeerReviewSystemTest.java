package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import actions.SystemOperations;
import actions.SystemOperationsImpl;
import command.Command;
import command.GradeAssignmentCommand;
import command.PeerReviewSystem;
import data.Database;

public class PeerReviewSystemTest {
	private PeerReviewSystem peerReviewSystem;
	@Before
	public void setUp() {
		peerReviewSystem=new PeerReviewSystem();
	}

	@Test
	public void testAddCommand() {
		Database data=new Database();
		SystemOperations sysOp=new SystemOperationsImpl(data);
		Command command=new GradeAssignmentCommand(sysOp);
		peerReviewSystem.addCommand("teste", command);
	}
	
	@Test
	public void testShowMenu() {
		Database data=new Database();
		SystemOperations sysOp=new SystemOperationsImpl(data);
		Command command=new GradeAssignmentCommand(sysOp);
		peerReviewSystem.addCommand("teste", command);
		
		String expectedOutString="(1)- teste\n";
	    String outString =peerReviewSystem.getMenu();
	    
	    assertEquals(expectedOutString,outString);
	}
	
	@Test
	public void testCreateAndShowUI() {
		String printMessages="(1)-Alocar revisores\n"
				+ "(2)- Dar nota a um artigo\n"
				+ "(3)- Selecionar artigos";
		
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    PrintStream old = System.out;
	    System.setOut(ps);

	    peerReviewSystem.createAndShowUI();
	    

	    System.out.flush();
	    System.setOut(old);
	    
	    assertEquals(baos.toString(),printMessages);
	
	

}
