package bogang;

public abstract class Minus {
	
	private Sum sum;
	
	public void setSum(Sum sum)
	{
		this.sum= sum;
	}
	
	
	
	public Sum getSum() {
		return sum;
	}



	public abstract Object minus(Object o);


}
