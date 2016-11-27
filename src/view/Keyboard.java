package view;

import application.Main;
import command.Command;
import command.MarkBar;
import command.MarkTempo;
import invoker.Engine;
import invoker.MetronomeEngine;
import javafx.fxml.FXML;
import observer.Controller;
import observer.ControllerImplements;

public class Keyboard {
	private Main mainApplication;
	private Engine engine;
	
	public Keyboard() {
	Controller controller = new ControllerImplements();
		
		Command markTempo = new MarkTempo(controller);
		Command markBar = new MarkBar(controller);
		
		this.engine = new MetronomeEngine();
		this.engine.setMarkTempo(markTempo);
		this.engine.setMarkBar(markBar);

	}
	
	public void setMainApplication(Main mainApplication) {
		this.mainApplication = mainApplication;
	}

	@FXML
	private void handleButtonTempo() {
		System.out.println("test");
		this.engine.markTempo();
	}
}
