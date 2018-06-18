package command;

import java.util.Scanner;
import java.util.Map;
import java.util.List;
import static java.util.Arrays.asList;
import java.util.ArrayList;

import actions.SystemOperationsImpl;
import data.Database;
import userinteraction.UserTextInteraction;

public class PeerReviewSystem {
	//Tem a finalidade de mostrar o menu para o usuário (?)
	private Map<String,UIAction> commands;

	private SystemOperationsImpl systemOperations;

	private UserTextInteraction userTextInteraction;

	public PeerReviewSystem() {
		// Devemos aqui criar a base de dados e o systemOperations (acho que deve ser feito no main)
		this.systemOperations = new SystemOperationsImpl(new Database());
		this.addCommand("alocar", new AllocReviewersCommand(this.systemOperations));
		this.addCommand("selecionar", new ArticlesSelectionCommand(this.systemOperations));
		this.addCommand("avaliar", new GradeAssignmentCommand(this.systemOperations));
		this.userTextInteraction = new UserTextInteraction();
	}

	public void main() {
		PeerReviewSystem system = new PeerReviewSystem();
		
		system.createAndShowUI();
	}

	public void addCommand(String key, Command command) {
		this.commands.put(key, command);
	}

	public String getMenu() {
		String menu = "Menu de opções:\n";
		List<String> commandList = new ArrayList<String>(commands.keySet());
		
		for(String c : commandList) {
			menu = menu.concat(c);
			menu = menu.concat("\n");
		}

		menu = menu.concat("Escolha uma das opções ou 'sair':\n");
		
		return menu;
	}

	public void createAndShowUI() {
		getMenu();
		String op = "";
		List<String> commandList = new ArrayList<String>(commands.keySet());
		commandList.add("sair");
		
		while(!commandList.contains(op)) {
			op = userTextInteraction.readSelectedCommand();
		}
		
		if(op != "sair") {
			commands.get(op).execute();
		}
	}

}