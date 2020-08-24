package f_oop2;

public final class Singleton {
	
	//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
	//객체들간에 객체를 공유하기 위해 사용한다. 
	//클래스자체를 공유하기 위해서 사용
	
	private static Singleton instance;
	
	private Singleton()
	{
				
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}//null일때 한번만 생성된다. 
		return instance;
	}
	//객체가 필요할때는 getInstance를 호출한다. 
	
	//다른클래스에 있는 객체도 공유할수있으므로 굉장히 많이 사용된다. 
	
	
}
