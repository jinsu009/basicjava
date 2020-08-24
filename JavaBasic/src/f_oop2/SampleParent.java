package f_oop2;

public class SampleParent extends Object{

	//(상속 사용형식) extends 상속받을클래스명
	//object는 입력하지 않아도 컴파일러가 자동으로 해준다.
	
	String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent() //생성자 선언
	{
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b) //메소드 선언
	{
		return a+b;
	}
	
}
