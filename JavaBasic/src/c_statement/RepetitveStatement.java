package c_statement;

import java.util.Scanner;

public class RepetitveStatement {

	public static void main(String[] args) {
		/*
		 * <<for문>>
		 * - for(int i = 1; i <= 10; i++) { }
		 * for문안에서 사용할 변수 초기화 .. 증감식 : 조건에 따라 변수를 증감시키다 조건을 충족하면 for문을 빠져나온다.
		 * - for(1부터 10까지 1씩 증가하면서 반복){ }
		 * 총 열번 반복이 될 것이다. 
		 * 
		 */
		
		System.out.println("1)");
		
		for(int i = 1; i <= 10; i++)
		{
			//for(초기화; 조건식; 증감식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화 (하나이상 넣을수 있다.)
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증감시켜 반복문을 제어한다.
			
			System.out.println(i + " 번째 반복" );
			
		}
		
		
		System.out.println("\n2)");
		int sum = 0; //1부터 10까지 합을 저장
		
		for(int i2 = 0; i2 <= 10; i2++) 
		{
			sum += i2;
		}
		System.out.println(sum);
		
		System.out.println("\n3)");
		int sum2 = 0;
		for(int i = 100; i >= 1; i--)
		{
			//100부터 1까지 1씩 감소하면서 반복한다.
			sum2 +=i;
		}
		System.out.println(sum2);
		
		//1부터 100까지 짝수의 합을 구해보자  *****
		System.out.println("\n4)");
		int sum3 = 0;
		for(int i = 0; i <=100; i+=2)
		{
			sum3 += i;
		}
		System.out.println(sum3);
		
		System.out.println("\n5)");
		int sum4 = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 ==0)
			{
				sum4 += i;
			}
		}
		System.out.println(sum4);
		
		
		//1부터 100까지 홀수의 합을 구해보자 
		System.out.println("\n5)");
		int sum5 = 0;
		for(int i = 0; i <= 100; i++)
		{
			if(i % 2 != 0)
			{
				sum5 += i;
			}
		}
		System.out.println(sum5);
//		for(int i = 1; i <= 100; i +=2)
//		{
//			sum5 += i;
//		}
		
		//구구단을 출력해봅시다
		/*
		 * 2 * 1 = 2
		 * 2 * 3 = 6
		 * ....
		 */
		//1~9까지 증가하는 변수 하나를 만든다.
		//2씩 증가하는 다른 변수를 만든다.
		//패턴을 찾아 반복문을 만든다. *****
		System.out.println("\n6)");
		for(int i = 1; i <= 9; i++)
		{
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		//7단을 출력해보자 
		System.out.println("\n7)");
		for(int i = 1; i <= 9; i++)
		{
			System.out.println("7 * " + i + " = " + i * 7);
		}
		
		//단수를 입력받아 구구단에 해당하는 단을 출력해보자
//		System.out.println("\n8)");
//		
//		Scanner s = new Scanner(System.in);
//		
//		
//			System.out.println("숫자를 입력하세요> (1~9)");
//			int input2 = Integer.parseInt(s.nextLine());
//			
//			for(int j = 1; j <= 9; j++)
//			{
//				System.out.println(input2 + " * " + j + " = " + input2 * j);
//			}
			
		
		
		
		//선생님
	/*
	 * 	Scanner s = new Scanner(System.in);
	 * 
	 *  System.out.println("몇단을 출력할까요?");
	 *  int dan = Integer.parseInt(s.nextLine());
	 *  
	 *  for(int i = 1; i <= 9 ; i++)
	 *  {
	 *  	System.out.println(dan + "*" + i + "=" + i * dan);
	 *  }
	 */
		
		//2~9단 까지 구구단 전체 출력하기
		System.out.println("\n9)");
		
		for(int i = 1; i<= 9; i++)
		{
			for(int j = 1; j<= 9; j++)
			{
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
			
		//선생님
//		for(int j = 2; j <= 9 ; j ++)
//		{
//			for(int i = 1; i <= 9; i++)
//			{
//				System.out.println(j + "*" +i + "=" +  i * j);
//			}
//		}
//		
		
		//구구단 전체의 짝수단 홀수줄만 출력하세요
		System.out.println("\n10)");
		
		for(int i = 1; i <= 9 ; i++)
		{
			if(i % 2 ==0)
			{
				for(int j = 1; j <= 9; j++)
				{
					if(j % 2 != 0 )
					{
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				
			}
			
		}
		
		//구구단 전체를 가로로 출력
		/*
		 * 2*1=2	3*1=3	4*1=4
		 * 2*2=4	3*2=6	4*2=8
		 * ...
		 */
		System.out.println("\n11)");
		
		for(int j = 1; j<= 9; j++)
		{
			for(int i = 1; i<= 9; i++)
			{
				System.out.print(i + " * " + j + " = " + i * j +""+ "\t");
				//t = tab
				//for문에서 또 for문 사용할때는 다른 변수를 사용해야한다.(주로 알아보기 쉽게 알파벳순을 선호한다.)
				
			}
			System.out.println();
			//'sysout' - 입력후 ctrl + space 단축키 사용
			
		}
		
		
		//
		System.out.println("\n12)");
		
		for(int i = 1; i <=5 ; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//삼각형 모양으로 별을 출력해보자
		System.out.println("\n13)");
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j<=i; j++) //j는 1~i 수행된다. 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역삼각형 모양으로 별을 출력해보자 
		System.out.println("\n14)");
		for(int i = 10; i > 0; i--) //범위를 잘 지정해주자  *****
		{
			for(int j = 1; j<=i; j++) //j는 1~i 수행된다. 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * <<while>>
		 * - while(조건식){}
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을때 사용한다.
		 * - 사용자가 반복문을 종료하고 싶을때 종료한다. 
		 */
		
//		Scanner s = new Scanner(System.in);
//		
//		while(true)
//		{
//			System.out.println("몇단을 출력할까요? (종료 : 0)");
//			int dan = Integer.parseInt(s.nextLine());
//			
//			if(dan==0)
//			{
//				System.out.println("종료되었습니다.");
//				break; //가까운 반복문하나를 탈출한다.
//			}
//			
//			for(int i = 1; i<=9; i++)
//			{
//				System.out.println(dan + " * " + i + " = "+ i * dan);
//			}
//		}
		
		
		/*
		 * <<do-while문>>
		 * - do{ }while(조건식);
		 * {} 안의 내용을 한번 수행후  while를 수행한다.
		 * - 최소한 한번의 수행을 보장한다.
		 */
		
		//숫자 맞추기 게임
//		System.out.println("\n15)");
//		
//		int answer = (int)(Math.random() * 100) +1; //1~100사이의 랜덤 수를 발생시켜주는 method
//		int input = 0;
//		
//		Scanner s = new Scanner(System.in);
//		
//		do
//		{
//			System.out.println("1~100 사이의 수를 입력하세요 > ");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input)
//			{
//				System.out.println(input + "보다 작습니다.");
//			}
//			else if(answer > input)
//			{
//				System.out.println(input + "보다 큽니다.");
//			}
//			else
//			{
//				System.out.println("정답입니다");
//			}
//		}
//		while(input != answer); //';'을 붙여야한다.
//		//정답이 아닌경우 do를 계속 반복해야 한다.
		
		//이름붙은 반복문
		System.out.println("\n16)");
		
		outer : for(int i = 2; i <= 9; i++) //(2)
		{
			for(int j = 1; j <= 9; j++) //현재 (1)break가 빠져나가게 되는 반복문
			{
				if(j==5) // *5는 출력되지않는다.
				{
//					break; //가장 가까운 반복문 하나를 빠져나간다. (1)
//					break outer;//outer라는 이름의 반복문을 빠져나간다. (2)
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다. (3) j=5 인상태를 벗어나서 j=6~9까지 재수행
					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다. (4) j=5일때 바깥의 for문으로 넘어가서 실행
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}



















