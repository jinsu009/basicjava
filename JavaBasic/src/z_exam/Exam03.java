package z_exam;

public class Exam03 {

	public static void main(String[] args) {
		//1.다음 연산의 결과를 적으시오 
//		
//				int x = 2;
//				int y = 5;
//				char c1 = 'A'; // 'A'의 문자코드는 65
//		
//				System.out.println(1 + x << 33); // *** 풀지 말기 
//				System.out.println(y >= 5 || x < 0 && x > 2); -- true
//				System.out.println(y += 10 - x++); --13 //후위연산이 있어서 x=3이저장된다.
		
//				System.out.println(x+=2); --5
//				System.out.println( !('A' <= c1 && c1 <='Z') ); --false
//				System.out.println('C'-c1); --2
//				System.out.println('5'-'0'); --5
//				System.out.println(c1+1); --66
//				System.out.println(++c1); --B
//				System.out.println(c1++); --B
//				System.out.println(c1); --C
				
				
//				2. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
//					사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
//					가 필요할 것이다. (1)에 알맞은 코드를 넣으시오. *****
//				int numOfApples = 120;   // 사과의 개수
//				int sizeOfBucket = 10;   // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//				int numOfBucket = ((numOfApples / sizeOfBucket) + 1); // 모든 사과를 담는데 필요한 바구니의 수
//				System.out.println("필요한 바구니의 수 :"+numOfBucket);  
//				*** 120일경우 바구니를 13개 출력하는 오류가 나타난다.  --> 삼항연산자를 이용해 풀도록 한다. 
//					
//				int numOfBucket	=	numOfApples % 10 == 0 ? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket) + 1 ;
//				System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
//				3. 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
//					자를 이용해서 (1)에 알맞은 코드를 넣으시오.
//					[Hint] 삼항 연산자를 두 번 사용하라.
//					int num = 10;
//					System.out.println();
//					System.out.println( num == 0 ? "0" : (num < 0 ? "음수" : "양수"));

//				4.아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
//					의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
//					시오.
//				int num1 = 999;
//				System.out.println();
//				System.out.println((num1/100) * 100);
				
//				5.아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//					값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
//				int num2 = 333;
//				System.out.println();
//				System.out.println(((num2/10) * 10) + 1);
//				
//				6. 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//				뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//				다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//				수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
//				[Hint] 나머지 연산자를 사용하라. *****
//				int num3 = 24;
//				System.out.println();
//				System.out.println(10 - (num3 % 10));
				
//				7. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//					5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//					셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
//				int f = 100;
//				float celcius = ((int)(5/9f * (f-32) * 100 + 0.5 )/ 100f); //접미사 f가 없으면 int로 계산된다. //int로 소수점 뒷자리수를 삭제해준다.
//				System.out.println();
//				System.out.println("Fahrenheit: " + f);
//				System.out.println("Celcius: " +celcius);
				
//				8.아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
				 
//				<변경전>		
//				byte a = 10;
//				byte b = 20;
//				byte c = a + b;
//				char ch = 'A';
//				ch = ch + 2;
//				float f = 3 / 2;
//				long l = 3000 * 3000 * 3000;
//				float f2 = 0.1f;
//				double d = 0.1;
//				boolean result = d==f2;
//		
//				<변경후>
//				byte a1 = 10;
//				byte b1 = 20;
//				byte ab = (byte)(a1 + b1);
//				int ab2 = a1+b1;
//				
//				char ch = 'A';
//				ch = (char)(ch + 2);
//				
//				float f1 = 3f / 2;
//				long l = 3000l * 3000 * 3000;
//				
//				float f2 = 0.1f;
//				double d = 0.1;
//				boolean result = (float)d == f2;
//				
//				double d2 = (double) 0.1;
//				
//				System.out.println();
//				System.out.println("c="+ab);
//				System.out.println("ch="+ch);
//				System.out.println("f="+f1);
//				System.out.println("l="+l);
//				System.out.println("result="+result);
//				System.out.println("c="+ab2);
				
//		
//				9.다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//				의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
//				
//				char ch2 = 'z';
//				boolean bb = ('a' <= 'z' && 'z' <= 'z') || ( 'A' <= 'z' && 'Z' <= 'z') || ('z' <=0 && 'z' > 0);
//				
//				System.out.println();
//				System.out.println(bb);
				
//				10.다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//				인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
//				들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오. *****
		
//			char ch3 = 'A';
//				
//			char lowerCase = (ch3 < 96 && ch3 <= 65) ? (char)(ch3+32)  : ch3;
//			System.out.println();
//			System.out.println("ch3: " +ch3);
//			System.out.println("ch3 to lowerCase : " +lowerCase);   
		
		 //ch3에들어가 있는 문자가 대문자일 경우에만 진행해야 하므로 
		// 대문자인지 확인후 참 이면 ch3+32가 진행되고 그렇지 않으면 ch3을 출력한다.
	}

}
