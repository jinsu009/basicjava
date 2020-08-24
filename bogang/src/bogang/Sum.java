package bogang;

public abstract class Sum {
	
	private Input input;
	
	// 캡슐화
	
	public void setInput(Input input)
	{
		this.input=input;
	}
	
	
	
	public Input getInput() {
		return input;
	}



	public abstract Object sum(Object o);
}
