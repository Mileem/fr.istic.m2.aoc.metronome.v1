package command;

import observer.Controller;

public class MarkTempo implements Command {
	private Controller controller;
	
	public MarkTempo(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void execute() {
		this.controller.markTempo();

	}

}
