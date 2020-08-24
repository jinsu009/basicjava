package z_exam;

import java.util.Scanner; 
 
public class Exam04 {
	public static void main(String[] args){
		
		//9,12,13 빼고 풀기
		
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//		않을 때 true인 조건식
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		
		/*
		 * 1. x > 10 && x < 20
		 * 
		 * 2. ch == '' || ch == '	' ***** 틀림
		 * 2. !(ch == '' || ch == '\t')----정답
		 * 
		 * 3. ch == 'x' && ch == 'X'
		 * 4. ch >= '0' && ch <= '9'  ***** 부등호 방향과 작은따옴표 주의
		 * 
		 * 5. (ch >= 'a' && ch <= 'z' )||( ch >= 'A' && ch < 'Z')
		 * 
		 * 6. year % 400 == 0 || year % 4 == 0 || year % 100 != 0 : true ***** 틀렸다
		 * 6. year%400==0||year%4==0&&year%100!=0 -----정답
		 * 
		 * 7. powerOn == false ***  모름 , 답지 참고
		 * 
		 * 8.  str.equals("yes") ***** 모름 , 답지 참고
		 */
		
		
//		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오. -- 73
		
//		int sum = 0;
//		for(int i = 1; i <= 20; i++)
//		{
//			if(i % 2 != 0 && i % 3 != 0)
//			{
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오. -- 220
		
//		int sum = 0;
//		int total = 0;
//		for(int i = 1; i<=10; i++)
//		{			
//				sum +=i ;		
//				total += sum;
//		}		
//		System.out.println(total);
		
		
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오. *****
		
//		int sum = 0; // 총합
//		int s = 1; //음수 양수
//		int hap = 0; // 1부터 계속 부호가 바뀌며 증가하는 값 i 를 저장
//		
//		for(int i = 1; sum<100; i++, s *=-1)//i++이 이루어진 후 s에 -1을 곱하여 음수로 변환시켜준다. 조건식 : 총합이 100을 넘을 경우 for문을 나간다.
//		{
//			hap = i * s; //1 * +1 -> i + 1, s*-1= -1 ,,, , 2 * -1
//			sum += hap;// 양수 1이 저장된다.
//			
//		}
//		 System.out.println(sum);
//		 System.out.println(hap);
		
		
		
//		[4-5] 다음의 for문을 while문으로 변경하시오.
		
//		for(int i=0; i<=10; i++) 
//		{
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
//		int i = 0;
//		while(i<=10)
//		{
//			int j = 0;
//			while(j <= i)
//			{				
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i ++;			
//		}
		
//		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는
//		프로그램을 작성하시오.
		
//		int i;
//		int j;
//		
//		for(i = 1; i <= 6; i++)
//		{
//			for(j = 1; j<= 6; j++)
//			{
//				if(i+j == 6)
//				{
//					System.out.println(i +  " + " + j  + " = " + (i+j));
//				}
//				
//			}
//		}
		
//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//		코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
//		
//		int value = ( /* (1) */ );
//		System.out.println("value:"+value);
//		
//		=>
//		int value = (int)(Math.random() * 6) +1;
//		System.out.println("value:"+value);		
		
		
//		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//			  0<=x<=10, 0<=y<=10 이다.
//		int x , y;
//		for(x = 0; x <= 10; x++)
//		{
//			for(y = 0; y <= 10; y++)
//			{
//				if(2 * x + 4* y == 10)
//				{
//					System.out.println( "x의 해 : " + x + " , y의 해 : " +y );			
//				}
//			}
//		}
		
//		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//		(1)에 알맞은 코드를 넣으시오.
//		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		
//		int num = 12345;
//		int sum = 0;
//		
//		while(num>0) //조건 : num이 0보다 크면 출력 
//		{
//			sum += num%10; //sum에 num을 10으로 나눈 나머지값을 저장
//			num /= 10; //num의 값을 10으로 나눈다 int타입이므로 1234.5 에서 1234만 저장된다.
//		}
//				
//		System.out.println("sum="+sum);
		
		
//		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
//		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
//		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
//		1과 1부터	시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//		System.out.print(num1+", "+num2); //for문 밖의 num1과 num2의 값을 출력
//		for (int i = 0 ; i < 8 ; i++ ) 
//		{
//			num3 = num1 + num2;
//			System.out.print(", "+num3); //for문 안의 num3부터 num10까지 출력
//			num1 = num2; //num1 값에 num2값을 대입
//			num2 = num3; //num2 값에 num3값을 대입
//		}
		
//		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 
//		1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
//		사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
//		사용자가 컴퓨터가 생각한 숫자를 맞추면	게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. 
//		(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		
//		int answer = (int)(Math.random() * 100) +1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		do
//		{
//		count++;
//		System.out.print("1과 100사이의 값을 입력하세요 :");
//		input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//		if(answer < input)
//			{
//				System.out.println(input + "보다 작습니다.");
//			}
//		else if(answer > input)
//			{
//				System.out.println(input + "보다 큽니다.");
//			}
//		else
//			{
//				System.out.println("정답입니다");
//			}
//		System.out.println("시도한 횟수 : " + count);
//		} while(true); // 무한반복문
		
		
//		[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. 
//		예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		[Hint] 나머지 연산자를 이용하시오. *****?? 이해 못함
		
//		int number = 12321;
//		int tmp = number;
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//		while (tmp != 0) 
//		{
//			result = result *10 + tmp%10; //10으로 나눈 나머지로 일의 자리의 숫자를 알수 있다. //10을 곱해줘야지만 십의자리 백의 자리 천의 자리에 차례로 들어가게 된다. 
//			tmp /= 10; //대신 10의 자리는 1의 자리를 없앤상태에서 구해야 하기 때문에  10으로 나눠주어서 int값이 저장되므로 소수점이 탈락되어 정수만 저장된다.
//		}
//		if (number == result)
//			System.out.println(number + "는 회문수 입니다.");
//		else
//			System.out.println(number + "는 회문수가 아닙니다.");
		
		
		//문제 12번
		
//		for(int i = 1; i <=9; i++)
//		{
//			for(int j = 1; j<=3; j++)
//			{
//				int x = j+1 +(i-1)/3 *3;
//				int y = i%3 == 0 ? 3 : i%3;
//				
//				if(x>9)
//				{
//					break;
//				}
//				System.out.print(x +"*"+y+"="+x*y+"\t");
//			}
//			System.out.println();
//			if(i%3 == 0)
//			{
//				System.out.println();
//			}
		
		for (int z = 2; z < 10; z += 3)
		// 234,567,89, 묶어서 출력하기위해 z=2부터 9까지 설정 ,,
		// z+=3 은 첫번째 줄이 4단에서 끝남으로 두번째줄 5단 세번째줄 8단을 출력하기위해 z에 3을더한다.
		{
			for (int i = 1; i < 4; i++) {
				for (int j = z; j <= z + 2 && j < 10; j++)
				// 2단부터 9단까지 출력해야하므로 j는 z의 값을 선언하고
				// j=2 일때 j가 4보다 작거나 같으며 10보다도 작을경우 (&& 둘다 t일경우 )
				// j의 값을 증가시키며 반복한다.
				{
					System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		// 234 567 89 따로 출력하는 법
		// for문 세번돌리기이이이이이
		
		// ...for문을 세번이 아니라 234 567 89 의 조건을 찾아
		// 돌릴수 있는 방법을 한번 더 생각해보자

			
			//문제 9
		
				String str = "12345";
				int sum = 0;
				for(int i = 0; i<str.length();i++)
				{
					sum = sum + str.charAt(i)-'0';

				}
				System.out.println("SUM: " + sum);
				
				
				//while문을 사용해서 각자리의 수를 더할 값을 직접 입력받아 합을 출력해보자
				int input;
				int result = 0;
				Scanner scan = new Scanner(System.in);
				System.out.println("숫자입력> ");
				input = scan.nextInt();
				while(input!=0)
				{
					result += input%10;
					input /= 10;
				}
				System.out.println("각 자리의 합 > " + result);
				
			//문제 13
//				String value = "12o34";
//				char ch = ' ';
//				boolean isNumber = true;
//				
//				for(int i =0;i<value.length();i++)
//				{
//					ch = value.charAt(i);
//					if(!(ch >= 0 && ch <9))
//					{
//						isNumber = false;
//					}
//					
//				}
//				
//				if(isNumber)
//				{
//					System.out.println(value + " 는 숫자입니다.");
//				}
//				else
//				{
//					System.out.println(value + " 는 숫자가 아닙니다." );
//				}
		}

	
}

