package e_oop; //현재 클래스가 저장된 패키지 위치를 알려 줌.

import java.util.Scanner; //다른 패키지에 있는 클래스의 위치를 알려준다. 
//import는 package와 class사이에 위치해야한다.


public class SampleClass {
	//클래스 이름의 맨 앞글자는 항상 대문자 
	
	int field = 10; //전역변수(field) : 클래스 전체 영역에서 사용하는 변수 
	//따로 초기화하지않아도 기본값으로 초기화가 된다

	
	/*
	 * - 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * - 리턴타입 메서드명(파라미터){}
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야 하는 결과물
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * 
	 */
	
	//메서드 선언
	void method1() 
	//리턴타입: 메소드를 호출했을 때 내가 얻게 되는 결과물, 그 값의 타입을 적어준다.
	//void = nothing , 돌려줄것이 없다.
	
	//메소드 이름은 소문자로 시작한다. 
	//메소드에는 무조건 소괄호가 있다. (파라미터)를 소괄호 안에 적어준다. 
	{
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	void method2(int parameter)
	{
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	//이 메소들 호출하기 위해서는 반드시 int타입의 값을 받아야 한다. 
	
	String method3()
	{
		//return타입이 string인 경우 string타입의 무언가를 넘겨받는다.
		
		return "명령 수행 후 결과물을 돌려주는 메서드";
		//return : 메서드를 종료시키고 결과물을 돌려준다.
		//리턴타입이 없는 메서드에서는 메서드를 종료시킨다.
	}
	
	int method4(int a, int b) //,로 연결해서 여러가지 파라미터를 선언할수있다.
	{
		System.out.println(a+","+b+" 를 사용해 명령을 수행하고 결과물을 돌려주는 메소드");
		return a+b;
	}
	
	void flowTest1()
	{
		System.out.println("flowTest1 시작 : 1"); //이문장은 가장 처음에 시작한다. 문장의 실행순서에 번호를 붙여보자
		flowTest3(); //같은 클래스에 있는 메소드 호출은 이름만 써줘도 된다. flow3으로 이동
		System.out.println("flowTest1 종료: 6");
	}
	
	void flowTest2()
	{
		System.out.println("flowTest2 시작: 3");
		System.out.println("flowTest2 종료: 4");
	}
	
	void flowTest3()
	{
		System.out.println("flowTest3 시작: 2");
		flowTest2(); //flow2으로 이동
		System.out.println("flowTest3 종료: 5");
	}
	
	//flowTest1(flowTest3(flowTest2));
	

}