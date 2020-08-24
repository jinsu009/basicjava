package e_oop;

public class OOP {
	public static void main(String[] args){
		/*
		 * << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는 것.
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 *  
		 *  << 객체 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 *  - 메모리는 주소를 참조해서 주소 반환
		 *  - new 클래스명(); -> 객체가 저장된 메모리 주소 반환 *****
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *  - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수있다.
		 *  - 
		 */
		
		//객체생성 = 인스턴스화 = 다른 클래스를 호출 
		SampleClass sc = new SampleClass();
		//변수를 선언해서 클래스를 불러오는데
		//변수 타입은 호출하는 클래스 이름이다.
		
		sc.method1();
		sc.method2(5); // int 타입의 값 하나를 넘겨준다.
		
	
		System.out.println(sc.method3());
		
		String returnString = sc.method3();
		System.out.println(returnString); //호출하는 메소드에 return이 있을 때 호출하는 방식
		
		
		sc.method4(5, 15);
				
		int returnInt = sc.method4(5, 9);
		System.out.println(returnInt); //호출하는 메소드에 return이 있을 때 호출하는 방식
		
		sc.flowTest1();
		
		//ClassMaker의 객체를 생성하고 변수에 저장해주세요
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해보쟈
		
		ClassMaker cm = new ClassMaker();
		
		System.out.println();
		
		int re = cm.met1();
		System.out.println(re);
		//파라미터와 리턴 타입을 잘 봐줘야 한다. 
	
		cm.met2(6);
		
		int returnInt2 = cm.met3(6, 5);
		System.out.println(returnInt2);
		
		System.out.println(cm.met3(6, 5));
		
		//계산기
		Calculator ca = new Calculator();
		
		System.out.println();
		double ad = ca.add(123456,654321);
		
		System.out.println(ad);
		
		double mu = ca.mul(ad, 123456);
		System.out.println(mu);
		
		double di = ca.div(mu, 123456);
		System.out.println(di);
		
		double su = ca.sub(di, 654321);
		System.out.println(su);
		
		double res = ca.rest(su, 123456);
		System.out.println(res);
		
		//심리테스트 
		System.out.println();
		new SimLiTest().q1();	
		
		

		
		
		
		
	}

}















