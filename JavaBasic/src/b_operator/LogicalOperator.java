package b_operator;

public class LogicalOperator {
	public static void main(String[] args){
		/*
		 * <<논리 연산자>>
		 * &&(AND)	: 피연산자 둘다  true이면 true를 결과로 얻는다.
		 * ||(OR)	: 피연산자 중 하나라도 true이면 true를 결과로 얻는다.
		 * !(NOT)	:  피연산자가 true이면 false를 false면 true를 결과로 얻는다.
		 * -- 피연산자로 boolean만 혀용한다
		 * 
		 */
		
		boolean b;
		
		int a = 6;
		
		//a가 0초과이고 10이하인가?
		b = 0<a && a<=10;
		// true && true 
		//&& =>  true
		System.out.println("1 " +b);
		
		//a가 2의 배수이거나 3의 배수인가?
		b = a % 2 == 0 || a % 3 ==0;
		System.out.println();
		System.out.println("2 "+b);
		
		//a가 2의 배수이거나 3의 배수이고 10이하인가?
		b = (a % 2 == 0 || a % 3 == 0) && a <= 10; 
		//논리연산이 두개가 있을경우 
		//&&가 우선순위가 높기때문에 괄호로 우선순위를 정한다.
		System.out.println();
		System.out.println("3 " +b);
		
		char c = 'l'; //소문자 : L
		//c는 숫자인가?
		b = '0' <= c && c <= '9';
		System.out.println();
		System.out.println("4 " +b);
		
		//c는 영문소문자인가??
		b = 'a' <= c && c<='z';
		System.out.println();
		System.out.println("5 " +b);
		
		//c는 영문자인가??
		//소문자와 대문자를 다 포함시켜야 한다.
		b = ('a' <= c && c <= 'z') || ( 'A' <= c && 'Z' <= c);
		System.out.println();
		System.out.println("6 " +b);
		
		//논리연산자는 효율적인 연산을 한다. 
		//왼쪽의 피연산자에게 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;
		b = true && false;
		b = false && true; //오른쪽은 실행되지않는 코드로 경고창이 뜬다. 
		b = false && false;
		
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		
		//주의해야할 경우
		int d = 10;
		b = d < 10 && 0 < d++; // 이문장을 시도한 뒤 d가 1 증가하는 것을 의도한것이다.
								//그러나 왼쪽에서 f가 나올경우 오른쪽은 확인하지 않는다. 그러므로 d의 출력값은 10이 나오게 된다. 
		System.out.println();
		System.out.println("7 " +d);
		
		
		b = !b; //b가 t이면 f를 f 이면 t를 저장한다.
		b = !(10<20);
		System.out.println();
		System.out.println("8 " +b);
		
		//산술,비교,논리 연산자를 혼합하여 사용
		//산술 > 비교 > 논리 순으로 수행된다. 
		int x= 1, y = 2;
		b = x +3 * y > y-2 || x < 3 && y <= 5;
		System.out.println();
		System.out.println("9 " +b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1) x가 2의 배수이고 10보다 작은가?
		b = x % 2 == 0 && x < 10;
		System.out.println();
		System.out.println("1) " +b);
		
		//2) x가 2의 배수이거나 3의 배수이거나 5의 배수인가?
		b = x % 2 == 0 || x % 3 == 0 || x % 5 == 0;
		System.out.println();
		System.out.println("2) " +b);
		
		//
		
		
	}

}
