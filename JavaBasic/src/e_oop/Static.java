package e_oop;

public class Static {
	//static가 붙은건 클래스 변수/메소드라 칭한다.
	
	static int classVar;
	//클래스 변수
	int instanceVar;
	//인스텐스 변수
	
	static void classMethod(){
		//클래스 메소드
		
	}
	
	void instanceMethod(){
		//인스텐스 메소드
		
	}	
	
	public static void main (String[] args)
	{
		/*
		 * 2020-01-06
		 * 
		 * << static 사용 이유 >>
		 *  - 객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다. 
		 *  - 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 *  - static이 붙은 것 : class member(클래스 변수, 클래스 메서드)
		 *  - 클래스 멤버 : 메모리에 클래스가 저장될 때 같이 저장된다.
		 *  - static이 붙지 않은 것 : 인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)
		 *  - 인스턴스 멤버 : 메모리에 인스턴스가 저장될 때 같이 저장된다. 
		 */
		
		
		//static이 붙은 메서드 
		Math.random();
		System.out.println();
		
		System.out.println(ClassMember.classVar);
		//(클래스명.클래스메소드)
		ClassMember.classMethod();
		
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		 
		
//		System.out.println(cm1.classVar);
//		cm1.classMethod();
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		
	   ClassMember cm2 = new ClassMember();
	   
	   System.out.println("변경 전 ");
	   System.out.println("cm1 : " + cm1.instanceVar);
	   System.out.println("cm2 : " + cm2.instanceVar);
	   
	   cm2.instanceVar = "인스턴스 변수 변경";
	   //cm2에 있는 객체의 값을 변경 
	   
	   System.out.println("변경 전 ");
	   System.out.println("cm1 : " + cm1.instanceVar);
	   System.out.println("cm2 : " + cm2.instanceVar);
		
	   
	   System.out.println("변경 전");
	   System.out.println("classmember : " + ClassMember.classVar);
	   System.out.println("cm1 : " + cm1.classVar);
	   System.out.println("cm2 : " + cm2.classVar);
	   
	   ClassMember.classVar = "클래스 변수 변경";
	   
	   System.out.println("변경 후");
	   System.out.println("classmember : " + ClassMember.classVar);
	   System.out.println("cm1 : " + cm1.classVar);
	   System.out.println("cm2 : " + cm2.classVar);
	   
	   //static을 붙이면 객체의 값을 공유한다. 
	   
	   //*****
	   //객체생성을 사용하지 않고 사용하고 싶을때
	   //객체끼리 값을 공유하고 싶을때 사용
		
	   
	   
		
		
		/*
		System.out.println(Static.classVar);
		//클래스 호출 -> 클래스.클래스이름
		
		Static.classMethod();
			
		//tip. 이클립스 단축키
		//한줄이동 : alt + 방향키(위/아래)
		//한줄복사 : ctrl + alt + 방향키(위/아래)
		Static s1= new Static();
		Static s2= new Static();
		//객체 두개 생성
				
		System.out.println(s1.instanceVar);
		
		s1.instanceMethod();
		
		s1.instanceVar = 10;
		s2.instanceVar = 20;
		
		System.out.println(s1.instanceVar);
		System.out.println(s2.instanceVar);
		*/
		
		
	}

}








