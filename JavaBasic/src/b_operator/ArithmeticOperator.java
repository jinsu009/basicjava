package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
	/*
	 * <<산술연산자>>
	 * + : 더하기
	 * - : 빼기
	 * * : 곱하기 
	 * / : 나누기 --- 몫 만 
	 * % : 나머지 --- 몫을 제외한 나머지 
	 * 
	 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다. (같은 타입끼리만 연산이 가능)
	 * 
	 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		
		//*,/,% 연산자가 +,- 보다 연산의 우선순위가 높다.
		//연산의 우선순위가 같을경우 왼쪽부터 차례로 진행
		//50 - 5 - 5 - 1 - 30 - 1 = 29
		
		System.out.println(a);
		
		a = (int)(10 + 20.3);
		//int + double = 연산을 진행할수 없으므로 타입을 일치시켜 준다.
		//**** 표현범위가 작은쪽에서 큰쪽으로 형변환을 합니다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다. 
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		// int보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다. 
		// java에서는 최소한 4byte가 되어야 연산된다.
		
		long e1 = 100000 * 100000;
		System.out.println(e1);
		//int의 범위가 넘어서기 때문에 계산되지않는다. - overflow 발생 
		//둘중하나 혹은 두개다 long타입으로 변경 
		
		long e2 = 100000L * 100000;
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1);
		//int는 2.5 의 소수점을 표현하지 못해 결과값은 2.0이된다. 
		
		float f2 = 10 / 4f;
		System.out.println(f2);
		
		int f3 = 10 % 4; //10을 4로 나눈 나머지를 구하는 연산 
		System.out.println(f3);
		
		//정수 0으로는 나눌수 없다. --- runtime error
//		int g1 = 10 / 0; 
		float g2 = 10.0f / 0;
		System.out.println(g2);
		//결과값 = infinity(무한대)
		float g3 = 0/0f;
		System.out.println(g3);
		//결과값 = NAN(Not A Number)
		
		char h1 = 'A';
//		char h2 = h1 + 1;
		//char + int 이므로 한쪽은 형변환 char -> int 로 형변환
		char h2 = (char)(h1 + 1);
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
		//char -> int 형변환후 문자A 안에는 65라는 숫자가 내장되어 있다. 
		
		int h4 = '5'-'0';
		System.out.println(h4);
		
		//복합연산자 : 산술연산자와 대입연산자를 합해 연산식을 줄여서 표현할수 있다. 
		//주로 변수의값을 증가시킬때 사용

		 int i = 0;
		 
		 i = i + 1;
		 i += 1;
		 
		//더하는 값이 1인경우에는 더 줄일수 있다. *********
		 ++i; //전위형 : 변수가 참조되기 전 수행
		 i++; //후위형 : 변수가 참조된 후 수행
		 
		 i = 0;
		 System.out.println("++i = " + ++i);
		 i = 0;
		 System.out.println("i++ = " + i++);
		 System.out.println(i);
		 
		 i = i-1;
		 i -= 1;
		 --i;
		 i--;
		 
		 i = i * 2;
		 i *= 2;
		 
		 i = i /3;
		 i /= 3;
		 
		 i = i %4;
		 i %= 4;
		 
		 
		 //반올림
		 double round = 50.6;
		 System.out.println((int)(round + 0.5));
		 
		 //반올림하고 난 뒤 출력되는 소수점을 지우기 위해 int타입으로 형변환시켜준다.
		 //결과값을 형변환 해야하기 때문에 (round+0.5)를 같이 괄호로 묶어준다. 
		 
		 //소수점 둘째자리
		 double round1 = 50.65;
		 System.out.println((int)(round1 * 10 + 0.5) / 10.0);
		 //10을곱하여 소수점을 옮겨준다.
		 //다시 10으로 나눠서 소수점을 옮겨준다.
		 
		 //Q. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요 
		 //1. 123456 + 654321
		 //2. 1번의 결과값 * 123456
		 //3. 2번의 결과값 / 123456
		 //4. 3번의 결과값 - 654321
		 //5. 4번의 결과값 % 123456
		 
		 
//		int res = (int) (123456 + 654321);
//		System.out.println("결과값: " + res);
//		int res2 = (res * 123456);
//		System.out.println("결과값: " + res2);
//		int res3 = (res2 / 123456);
//		System.out.println("결과값: " + res3);
//		int res4 = (res3 - 654321);
//		System.out.println("결과값: " + res4);
//		int res5 = (res4 % 123456);
//		System.out.println("결과값: " + res5);
//		int 보다 큰 double , float 타입으로 진행
		
		double res =123456 + 654321;
		res *= 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println("결과값: " + res);
		
		//Q.3개의 int형 변수를 선언 및 초기화 한 후 합계와 편균을 구해주세요 (평균은 소수점 두째자리에서 반올림)
		
		int x = 12, y = 22, z = 53;
		int hap = x + y + z;
		int avg = hap / 3;
		double res002 = (double)((avg * 10 + 0.5) / 10.0) ;
		
		System.out.println("hap : " + hap);
		System.out.println("avg : " + avg);
		System.out.println("avg : " + res002);

		int n1 = 645;
		int n2 = 123;
		int n3 = 1234;
		
		int sum1 = n1 + n2 + n3;
		double avg2 = ((int)((sum1/3.0)*10 + 0.5)/10.0);
		System.out.println("합계 : " + sum1 + "/ 평균 : " + avg2);
		
		
		
	}

}
