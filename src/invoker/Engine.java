package invoker;

import command.Command;

public interface Engine {
	
	public void setMarkTempo(Command c);
	
	public void setMarkBar(Command c);
	
	public void setUpdateTempo(Command c);
	
	public void markTempo();
	
	public void markBar();
	
	public void updateTempo(Command c);
	

	/**
	 * Attach frequency
	 */
	public void attach();
	
	/**
	 * Detach frequency
	 */
	public void detach();
}
