package command;

import observer.Controller;

public class MarkBar implements Command {
	private Controller controller;
	
	public MarkBar(Controller controller) {
		this.controller = controller;
	}


	@Override
	public void execute() {
		this.controller.markBar();

	}

}
