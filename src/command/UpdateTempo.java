package command;

import observer.Controller;

public class UpdateTempo implements Command {
	
	private Controller controller;
	
	public UpdateTempo (Controller controller) {
		this.controller = controller;
	}

	@Override
	public void execute() {
		this.controller.updateTempo();
	}

}
