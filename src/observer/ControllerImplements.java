package observer;

import invoker.Engine;
import invoker.MetronomeEngine;

public class ControllerImplements implements Controller {
	private Engine engine;
	
	public ControllerImplements() {
		this.engine = new MetronomeEngine();
	}

	@Override
	public void markTempo() {
		System.out.println("Marque le tempo");
		
	}

	@Override
	public void markBar() {
		System.out.println("Marque la mesure");
		
	}

	@Override
	public void updateTempo() {
		System.out.println("Modifie le tempo");
		
	}

}
