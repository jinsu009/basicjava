package a_variable;


//import 단축키 : ctrl + shift + O 
import java.util.Scanner;




public class Variable {
	
	
	//int a; ...전역변수

	public static void main(String[] args) {
		//변수(variable)에대해 알아보자
		/*<<변수>>
		 * 하나의 데이터를 저장할수있는메모리상의 공간
		 * 
		 * 사용가능한 기본형 데이터의 종류 
		 * 정수 : byte (1)(-127~128), short (2), int (4), long (8)  //뒤로갈수록 표현할수있는 숫자의 범위가 늘어남
		 * 실수 : float (4), double (8) //지수와 가수를 나누어서 표현하므로 굉장히 큰 범위를 표현할수있다. 
		 * 문자 : char (2) 문자하나
		 * 논리 : boolean (1) 참과거짓 (T/F)
		 * 
		 * byte	: -2^7 ~ 2^7-1
		 * short : -2^15 ~ 2^15-1
		 * int : -2^31 ~ 2^31-1
		 * long : -2^63 ~ 2^63-1
		 * 
		 * char : 0 ~ 2^16
		 * 
		 * 타입의 크기와 표현범위는 자바의 정석 29p참조
		 * 데이터를 사용하기위해서는 어떤종류의 데이터를 사용할 것인지 그것의 이름은 무엇인지 알려줘야 한다. 
		 * 명명규칙 : 자바의 정석 25~26쪽 참조
		 * 
		 */
		
		//변수선언방법 : 데이터타입  + 변수이름(변수이름은 전부 달라야한다.)
		
		byte dbyte;
		char echar;
		
		//모든 기본형 타입을 사용하여 8개의 변수 선언하기
		
		int aint;
		short bshort;
		long clong;
		float xfloat = 0;
		double ydouble;
		boolean zboolean;
		
		//선언한 이후 변수를 사용할때는 변수의 이름으로 사용
		//변수에 값을 저장하지 않으면 변수의 값을 참조할수없다. 
		
		
		//System.out.println(aint); //컴파일error 
		
		//값을 저장하기 위해 대입연산자를 사용 
		//=(대입연산자) : 오른쪽의 값을 왼쪽(변수)에 저장
		
//		
//		 * dbyte = 127; //타입에 맞는값을 저장 
//		 * bshort = 30000;
//		 * aint = 20;
//		 * clong = 900L; //long 접미사 : L 대소문자상관없지만 long타입을쓰기위해선 반드시 넣어야한다. 
//		 * xfloat = 3.14f; //접미사 : f
//		 * ydouble = 3.14d; //접미사 : d 생략가능
//		 * echar = '가'; //char 은 문자하나만 표현가능
//		 * zboolean = true;
//		 
//		
//		//초기화 : 처음으로 변수의 값을 선언하는 것 
//		
//		System.out.println(aint);
//		
//		aint = 30; 
//		System.out.println(aint);
//		aint = 30+40;
//		System.out.println(aint);
//		aint = bshort;
//		System.out.println(aint);
//		
//		//위에서 초기화한 변수에 새로운값을 저장하고 출력해보자 
//		
//		dbyte = 120; //타입에 맞는값을 저장 
//		bshort = 20000;
//		aint = 10;
//		clong = 800L; //long 접미사 : L 대소문자상관없지만 long타입을쓰기위해선 반드시 넣어야한다. 
//		
//		xfloat = 3.08f; //접미사 : f
//		ydouble = 3.09d; //접미사 : d 생략가능
//		
//		echar = '나'; //char 은 문자하나만 표현가능
//		zboolean = true;
//		
//		System.out.println();
//		System.out.println(aint);
//		System.out.println(bshort);
//		System.out.println(clong);
//		System.out.println(dbyte);
//		System.out.println(xfloat);
//		System.out.println(ydouble);
//		System.out.println(xfloat);
//		
//		
//		System.out.println(echar);
//		System.out.println(zboolean);
		
		//String : 여러개의 문자를 편리하게 사용하기위한 클래스,, 참조형타입 
		//문자열 : ""(큰따옴표)로 감싸진 글자
		
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "apple"; //new를 생략하고 간단한 명령어로 작성할수있다. 
		System.out.println(_String);
		
		
		
		
		
		
		
		/*
		 * <<리터럴의 종류>>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 :'가' , 'a' , '0' //문자는 반드시 값을 입력해야한다.
		 * 문자열 : "가나다" , "abc" , "123" "," "(공백)" //문자열은 아무것도 없어도 괜찮다.
		 * 그 외 : true, false, null(값이 없다.)
		 * 
		 * <<참조형 타입>>
		 * 기본형타입을 제외한 모든 타입(배열-여러개의 값을 한번에 묶어서 사용,클래스)
		 * ex)) string, abc, variable
		 * 값이 변수에 저장되지않고 따로 저장되며 , 그 주소가 변수에 저장된다.
		 * 변수의 크기는 4byte이다.
		 * */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값. =0 bytetype
		//메소드 안에 있는 변수 - 지역변수  
		//메소드 밖에 있는 변수 - 전역변수 (값을 저장하지않아도 사용가능---기본값)
		
		/*
		 * byte=0;
		 * short =0;
		 * int = 0;
		 * long = 0l;
		 * float =0.0f; 
		 * double = 0.0; 
		 * char = '\u0000';//'' 기본값은 공백으로 표현이 된다. .....역슬러시u 는 unicode를 표현할수있는기능 
		 * boolean = false; *****
		 * string = null;
		 * unicode - 	
		 */
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		dbyte = 127;
		aint = 128;
		dbyte =(/*변환하고 싶은 타입 작성*/ byte)aint; //형변환 : 데이터 타입을 변환하는 것 
		
		System.out.println(dbyte); //overflow 발생 : 범위 밖의 값을 표현하지 못함 128->-128
		
		dbyte = -128;
		aint = -129;
		dbyte = (byte)aint;
		System.out.println(dbyte); //underflow 발생 : -129 -> 127
		
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다. 
		
		// 표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다. 
		//그러므로 형변환을 생락할 수 있다. 
		
		aint = dbyte;
		clong = aint;
		ydouble = aint;
		ydouble = xfloat;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해보자 (3번 이상)
		
		bshort = dbyte;
		clong = bshort;
		xfloat = aint;
		
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해보자 (3번이상)
		
		dbyte = (byte)bshort;
		aint = (int)ydouble;
		aint = (int)clong;
		

		/*
		 * <<상수>>
		 * 값을 한번 저장하면 변경할수없는 저장공간
		 * final int MAX_NUMBER; //상수에서는 변수와 구별하기위해 대문자만 사용한다.
		 * 리터럴에 의미를 부여하기위해 사용한다.
		 * */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10; //초기화
		//MAX_NUMBER = 100; // 컴파일에러 발생 
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in); //상단에 스캐너의 위치지정 'import~~'
				 
	 	System.out.println("문자열을 입력하세요>");
		String input1 = s.nextLine(); //사용자의 입력 대기 후 입력값을 반환 하여 변수에 저장할수 있다. *****
		System.out.println("입력받은 문자열 : " + input1);
			
		System.out.println("숫자를 입력하세요>");
		int input2 = Integer.parseInt(s.nextLine()); //******
		System.out.println("입력받은 숫자 " + input2);
		//여덟가지 기본형타입 과 크기 *****
		//변수선언,형변환 하는 방법 ****
	  
		
		//문자열을 입력받고 입력받은 문자열을 출력해보자 
		
//		System.out.println("문자열을 입력하세요 > ");
//		String input3 = s.nextLine();
//		System.out.println("입력받은 문자열 : " + input3);
//		
//		System.out.println("숫자를 입력하세요 > ");
//		String input4 = s.nextLine();
//		System.out.println("입력받은 숫자 : " + input4);
//		
		
		
		
	}

}
