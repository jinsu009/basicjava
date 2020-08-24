package f_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod()
	{
		//상속받은 변수와 메소드를 사용할수 있다. 
		System.out.println(var); //상속받은 변수 
		int result = method(7,8); //상속받은 메소드
		System.out.println(result);
	} //메소드 생성

	
	//실행하기 위해서는 main method가 있어야 한다. 
	
	public static void main(String[] args)
	{
		SampleChild sc = new SampleChild();
		sc.childMethod();//childmethod 호출 (호출 : 가지고있는 내용을 실행하도록)
		
		System.out.println(sc.var);
		int result = sc.method(7, 8);
		System.out.println(result);
		
		sc.test(5); //test 메소드 호출
		//왜 null이 나오지?

		SampleParent sp = new SampleChild();
		//자식클래스의 객체가 저장된 주소가 sp에 담기는데 타입은 부모클래스
		
		//SampleParent -> 타입 (int,string...)
		//sp -> 변수명 
		//new Samplechild(); -> 생성자 선언
		
		//자식클래스의 객체를 부모클래스의 객체로 형변환이 된것이다. 
		//부모타입이 가지고 있는 멤버만 사용할 수 있다. 
		System.out.println("sp.var > "+sp.var);
		//부모타입은 부모타입을 호출 ?
		System.out.println("sc.var > "+sc.var);
		//자식타입의호출 은 자식타입을 호출 ?
		
		System.out.println("sp.method() > " + sp.method(5, 10));
		System.out.println("sc.method() > " + sc.method(5, 10));
		//오버라이딩을 하게 되면 부모클래스의 메소드는 무시된다. 
	}
	
	
	//오버라이딩 : 상속받은 메소드의 내용을 재정의 하는 것 
	@Override //오버라이딩이라는 것을 알려주기 위해 붙여준다. 
	// 어노테이션 : 골뱅이+()
	int method(int a, int b)//리턴타입 메서드명 파라미터 모두 같아야 한다. 
	{
		//부모클래스에 있는 메소드의 내용만 바꿔준다. 
		return a*b;
	}
	
	int var;
	
	void test(double var) //메소드
	{
		//지역변수 var , 전역변수 var , 부모클래스의 var 세개를 사용할수 있다.
		System.out.println(var); //지역변수(파라미터)
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될때 둘을 구분하기 위해 사용
		
		//메소드의 이름이 같을때도 사용할수 있다. 
		System.out.println(method(10,20)); //자식 클래스의 메소드
		System.out.println(super.method(10,30)); //부모클래스의 메소드
	}
	
	
	SampleChild() //생성자
	{
		super();
		//super()를 사용해 부모클래스의 객체도 생성한다. 
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
