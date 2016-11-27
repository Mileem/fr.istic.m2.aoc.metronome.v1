package invoker;

import command.Command;

public class MetronomeEngine implements Engine {
	private Command MarkTempo;
	private Command MarkBar;
	private Command UpdateTempo;
	
	@Override
	public void setMarkTempo(Command c) {
		this.MarkTempo = c;
		
	}
	@Override
	public void setMarkBar(Command c) {
		this.MarkBar = c;
		
	}
	@Override
	public void setUpdateTempo(Command c) {
		this.UpdateTempo = c;
		
	}
	@Override
	public void markTempo() {
		if(this.MarkTempo != null) {
			this.MarkTempo.execute();
		}
		
	}
	@Override
	public void markBar() {
		if(this.MarkBar != null) {
			this.MarkBar.execute();
		}
		
	}
	@Override
	public void updateTempo(Command c) {
		if(this.UpdateTempo != null) {
			this.UpdateTempo.execute();
		}
		
	}
	@Override
	public void attach() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detach() {
		// TODO Auto-generated method stub
		
	}



	


}
