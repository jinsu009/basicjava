package bogang;

public abstract class Divide {
	
	private Multi multi;
	
	public void setMulti(Multi multi)
	{
		this.multi=multi;
	}
	
	
	
	public Multi getMulti() {
		return multi;
	}



	public abstract Object divide(Object o);

}
