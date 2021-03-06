package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	 //abstract 추상클래스와 추상메소드 -- 교재 347p
	//구체적인 내용이 없다.	

	//200109	
	
	//일반적인 메소드
	void method()//타입 메소드명 (파라미터) --> 선언부
	{
		//구현부
		
	}
	
	//추상 메소드 : 선언부만 있고 구현부는 없는 메소드
	//추상메소드임을 알려주기 위해 타입앞에 abstract를 붙인다. 
	//추상메소드를 사용하기 위해 클래스명 앞에도 abstract를 붙여준다.
	//실행할수없는 메소드가 포함되어있기 때문에 추상클래스자체는 실행시킬수없다. 
	//추상클래스는 오로지 부모클래스의 역할만 한다. 
	abstract void abstractMethod(); //abstract 타입 메소드명();
}


//상속받을 클래스 생성
class SampleAbstractChild extends SampleAbstractParent{
	//왜 error? : 추상클래스가 메소드를 물려줬는데 그 메소드중에 추상 메소드가 있다. 
	//그래서 자식도 추상메소드를 소유하게 되는데 그렇기때문에 
	//자식도 추상클래스가 되어버렸다. 
	//그래서 오버라이딩으로 내용을 만들어준다. *****
	
	/*
	 * 추상메소드를 상속받으면 반드시 구현해야 한다. 
	 * 상속받은 추상메소드를 추상메소드로 남겨두려면 클래스를 추상클래스로 변경해야한다.
	 *
	 */
	@Override
	void abstractMethod()
	{
		
	}
	
	//왜 만드는 걸까 ??
	//추상클래스는 직접사용할수없고 부모역할을 하는 클래스
	//부모클래스는 언제 만들지 ? : 클래스 여러개 만드는데 여러개의 클래스들간의 공통된 메소드/내용이 있을때 공통된 부분을 따로 추출한다.
	//그것을 부모클래스로 만들고 상속받게 만든다. 
	//공통된 클래스가 있으니까 추상메소드를 만들었을텐데 
	//공통된 메소드는 있지만 클래스마다 내용이 다를때 
	//클래스가 메소드를 상속받아 직접내용을 구현하기 위해 사용한다. 
	
	
	
}