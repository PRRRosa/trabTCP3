package command;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import actions.SystemOperationsImpl;
import data.Database;
import userinteraction.UserTextInteraction;

public class PeerReviewSystem {
	//Tem a finalidade de mostrar o menu para o usuário (?)
	private HashMap<String,UIAction> commands;

	private SystemOperationsImpl systemOperations;

	private UserTextInteraction userTextInteraction;

	public PeerReviewSystem() {
		// Devemos aqui criar a base de dados e o systemOperations (acho que deve ser feito no main)
		this.systemOperations = new SystemOperationsImpl(new Database());
		this.commands = new HashMap<String, UIAction>();
		this.userTextInteraction = new UserTextInteraction();
		this.addCommand("alocar", new AllocReviewersCommand(this.systemOperations));
		this.addCommand("selecionar", new ArticlesSelectionCommand(this.systemOperations));
		this.addCommand("avaliar", new GradeAssignmentCommand(this.systemOperations, this.userTextInteraction));
	}


	public static void main(String[] args) {
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

		menu = menu.concat("Escolha uma das opções ou 'sair':");
		
		return menu;
	}

	public void createAndShowUI() {
		Scanner scanner = new Scanner(System.in);
		String op = "";
		ArrayList<String> commandList = new ArrayList<String>(commands.keySet());
		commandList.add("sair");
		while(!op.equals("sair")) {
			System.out.println(getMenu());
			op = "";
			while(!commandList.contains(op)) {
				op = userTextInteraction.readStr(scanner);
			}

			if(!op.equals("sair")) {
				commands.get(op).execute();
			}
		}
		scanner.close();
	}

}