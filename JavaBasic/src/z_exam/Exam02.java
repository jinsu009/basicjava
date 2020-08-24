package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * [2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
		
				1 byte  2 byte  4 byte  8 byte
		논리형  	boolean
		문자형			 char
		정수형	byte	 short	int		long
		실수형					float	double
		 */
		
		/*
		 * [2-2] 주민등록번호를 숫자로 저장하고자 한다
		 *  이 값을 저장하기 위해서는 어떤 자료형(data type)을 선택해야 할까.
		 *   regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
		 *   
		 *   int regNo;
		 *   regNo = 9001012222222;
		 *   
		 *   
		 * */
		
		/*
		 * [2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		 * int i = 100;
		 * long l =100L;
		 * final float PI = 3.14f;
		 * 
		 * - 리터럴 : 100, 100L, 3.14f
		 * - 변수 : i l  ----pi = 상수 
		 * - 키워드 : int, long, float, final
		 * - 상수 : final float PI = 3.14f
		 */

		/*[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		 * a. int
		 * b. Byte
		 * c. double
		 * d. boolean
		 * 
		 *A.b  앞글자가 대문자인건 클래스 
		 * */
		
		/*[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
		 * System.out.println(“1” + “2”) → ( 12 )
		 * System.out.println(true + “”) → ( true )
		 * System.out.println(‘A' + 'B') → ( AB )---131
		 * System.out.println('1' + 2) → ( 12 )----오류
		 * System.out.println('1' + '2') → ( 12 )----오류 
		 * System.out.println('J' + “ava”) → ( Java )
		 * System.out.println(true + null) → ( 오류  )*/
		
		//문자열과 다른 타입을 연결할경우 문자열로 만들어 버려서 문자열이 출력된다. ????
		
		
//		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) ****** 키워드의 개념ㅠㅠ 
//				a. if -- 키워드 
//				b. True
//				c. NULL
//				d. Class
//				e. System
		// A.  b,c,d,e
//		
		//[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
//				a. $ystem
//				b. channel#5 --- 특수문자이기 때문에 
//				c. 7eleven ---숫자가 맨앞에 들어간 변수이름은 사용할수없다.
//				d. If
//				e. 자바
//				f. new --- 예약어 이므로 사용 x
//				g. $MAX_NUM
//				h. hello@com --- 특수문자이기 때문에 
		
		//A. c.7eleven d.If ---- a,d,g e   (달러는 사용가능 . 숫자가 맨앞에 들어간 변수이름은 사용할수없다. )
		
//		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
//				a. int
//				b. long
//				c. short
//				d. float
//				e. double
		//A. a.int d.float
		
		//참조형 변수 4byte
		
//		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
//				byte b = 10;
//				char ch = 'A';
//				int i = 100;
//				long l = 1000L;
		
//				a. b = (byte)i;
//				b. ch = (char)b;  ---x
//				c. short s = (short)ch; ----x
//				d. float f = (float)l; ---- 생략가능
//				e. i = (int)ch; ---생략가능
		//
		
		//작은값에서 큰값으로 바꿀때 형변환을 생략할수있다. *****
		//byte 크기로 표현할수 있는 범위 
		
		
//		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		//A. 0 ~  65535
//		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
//				a. byte b = 256; ---byte 표현범위 밖
//				b. char c = ''; ---아무것도 없는 문자는 존재하지 않는다. 
//				c. char answer = 'no';  ---문자타입은 반드시 한글자만 표현해야한다. 
//				d. float f = 3.14 ----접미사 f가 없으면 double타입으로 형변환을 해줘야 한다.
//				e. double d = 1.4e3f; ---타입은 맞지않지만 float에서 double로 형변환 할수있다.
		// 
		
		
//		[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
//				a. public static void main(String[] args)
//				b. public static void main(String args[])
//				c. public static void main(String[] arv)
//				d. public void static main(String[] args)
//				e. static public void main(String[] args)
		//A.a,b
		
//		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
//				a. boolean - false
//				b. char - '\u0000'
//				c. float - 0.0 ---접미사 f가 붙어야한다. 
//				d. int - 0
//				e. long - 0 ---접미사 l이 붙어야한다. 
//				f. String - "" ---참조형의 기본형은 = null 
		//
		//
		
			
	}

}
