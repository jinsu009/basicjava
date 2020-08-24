package b_operator;

public class ComparisonOperator {
	
	public static void main(String[] args){
		/*
		 * <<비교연산자>>
		 * < : 작다 
		 * > : 크다
		 * <= : 작거나 같다
		 * >= : 크거나 같다 
		 * == : 같다
		 * != : 같지 않다.
		 * 
		 */
		
		//두개의 값을 비교 참과 거짓으로 결과를 낸다. 
		//boolean타입의 연산결과
		
		boolean b = 10 < 20;
		System.out.println(b);
		
		b = 10 < 20 - 15; //산술연산 수행후 비교연산이 수행된다. 
		System.out.println(b);
		
		b = 10 <= 10.0; //비교연산자도 이항연산자 이므로 타입이 일치해야 연산이 가능하다. 형변환후 비교한다.
		System.out.println(b);
		b = 65 >= 'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		b= 10.1f == 10.1; //결과값은 false가 나온다. 어째서 일까? 
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f);  
		System.out.printf("%22.20f%n", 10.1);
		//printf : format의 약자 .. 출력할 포맷을 정해준다. .. 22자리중 소수점 20자리를 표현해달라는 명령어  
		//%n은 줄바꿈 명령어
		//float 와 double  타입을 비교할때는 double를 float로 형변환 한다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할수있지만 등가비교는 모든 타입을 비교할수있다. 
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b);
		//string  = 참조형 타입 (실제값을 저장한 주소를 가진 타입)
		//abc가 저장된 주소를 비교하고있는 것
		b = "abc" == new String("abc");
		System.out.println(b);
		//new가 새로운 주소를 생성하므로 서로 저장된 주소가 달라 결과값이 false가 나온다. 
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 연산자로 내용을 비교할수 없다. 
		
		b = "abc" .equals(new String ("abc")); //equals를 사용하면 String의 내용을 비교할수있다.
		System.out.println(b);
		b = !"abc" .equals("ABC"); //같지 않다의 결과를 얻기위해서는 !(NOT)를 앞에 붙여준다. 
		
		//Q1.다음의 문장들을 코드로 작성해주세요
		//1보다 2가 큰가?
		boolean c = 1 < 2;
		System.out.println("1보다 2가 큰값인가요? : " + c);
		System.out.println(1 < 2); //***
		
		//Q2.0은 100보다 작거나 같은가?
		boolean c2 = 0 <= 100;
		System.out.println("0은 100보다 작거나 같나요?: " + c2);
		System.out.println(0 <= 100); //***
		
		//Q3. 3.14f와 3.14는 다른가.?
		System.out.println(3.14f != 31.4);
		
		//Q4. "남자"와 "여자"는 다른가?
		System.out.println("남자" != "여자"); /// xxxxx
		System.out.println(!"남자".equals("여자")); //**문자열 비교시에는 equals를 사용한다. 
		
		//복습해주기!! 
		
		
	}

}
