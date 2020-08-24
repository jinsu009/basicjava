package e_oop;

public class ClassMaker2 {
	//2020-01-06
	
	//메서드 밖에서는 선언과 초기화를 동시에 할 수밖에 없다. 
	
	//전역변수 하나를 선언하고 명시적으로 초기화 
	
	int a = 20;
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해서 초기화 해주세요 
	{
		a = 20;
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요 
	ClassMaker2(int a)
	{
		this.a = a;
	}

	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요
	ClassMaker2()
	{
		this(500);
	}
	
	public static void main(String[] args)
	{
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.a);
		//객체생성할때 호출할때 사용하는 것이  생성자다 
		
		//main메소드에는 static가 붙어있기때문에 객체를 또 선언해 줘야 한다. 
		//static이 붙은애가 먼저 메모리에 올라간다. 
		//static이 붙지 않은 애를 사용하기 위해서는 메모리에 올려서 사용한다. 
	
	}
	//객체생성을 하게 되면 클래스 안에 있는 변수가  초기화가 되어있을 경우 
	
}
