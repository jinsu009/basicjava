package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {
	
	//200109	
	
	//interface : 상수 혹은 추상메소드만 가질수있다.
	
	//interface 의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	//'public static final' 생략가능
	int NUM2 = 2;
	
	//interface의 모든 메소드는 public abstract 제어자를 사용해야한다. 
	public abstract void method1();
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다. 
	void method2();
	
	//인터페이스도 부모역할만 하기 때문에 상속받을 자식을 만들어야 한다. 
}

class SampleImplement implements SampleInterface , SampleInterface2
{
	//interface -> implements
	//overriding 해줘야 한다. 
	
	@Override 
	public void method1()
	{
		System.out.println(NUM1);
	}
	//method1은 중복되었지만 하나만 출력된다. 
	@Override 
	public void method2()
	{
		System.out.println(SampleInterface.NUM2);
	}
	@Override
	public void method3() {
		System.out.println();		
	}
}


//인터페이스는 다중상속이 가능하다. 
//여러개의 인터페이스를 상속받을수 있다. 

//클래스는 하나만 상속받을 수 있는데 그이유는 같은이름의 메소드가 있으면 어느 메소드를 호출해야 할지 알수없다. 
//인터페이스는 여러개의 메소드를 상속받고 메소드의 이름이 중복되어도  내용이 없으니까 상관이 없다 
//retrun 타입이 다르면 인터페이스되지 않는다. 
//웹개발에서는 인터페이스를 많이 사용하지 않는다. 
interface SampleInterface2{
	void method1();
	void method3();
}