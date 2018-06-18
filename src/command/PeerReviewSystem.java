package command;

import java.util.Map;
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
		this.addCommand("alocar", AllocReviewersCommand);
		this.addCommand("selecionar", ArticlesSelectionCommand);
		this.addCommand("avaliar", GradeAssignmentCommand);
		this.systemOperations = new SystemOperationsImpl(new Database());
	}

	public static void main() {
		
	}

	public void addCommand(String key, Command command) {
		this.commands.put(key, command);
	}

	public String getMenu() {
		int option = 0;
		while(option <= 3) {
			
		}
		return null;
	}

	public void createAndShowUI() {

	}

}
