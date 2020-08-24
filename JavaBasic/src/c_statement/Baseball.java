package c_statement;

import java.util.Scanner; 

public class Baseball {

	public static void main(String[] args) {
		//숫자야구 게임 만들기 
		//3자리의 중복되지않는 숫자를 발생시킨다 (1~9) ***
		//두번째자리에는 첫번째 자리에 들어갔던 수가 들어가서는 안된다.
		//숫자 맞추기 게임		
		
		//1~9사이의 랜덤 수를 발생시켜주는 method
		//사용자에게 세개의 숫자를 입력받는다.
		//사용자가 입력한 값과 정답을 비교해 SBO카운팅
		//3S인 경우 정답이므로 프로그램 종료
		
		Scanner s = new Scanner(System.in);
		
		int com1,com2,com3; //컴퓨터가 만든 세가지의 숫자가 저장될 변수 
		
		int h1 = 0, h2 = 0, h3 = 0;
		
		int strike;//자릿수와 숫자가 모두 일치할 경우
		int ball; //숫자만 일치하고 자릿수는 틀릴경우
		int out; //숫자와 자릿수가 모두 틀린경우
		int count=0;
		
		
		com1 = (int)(Math.random() * 9) +1; //com1에 1~9사이의 값을 랜덤으로 부여받는다.
		do
		{
			com2 = (int)(Math.random() * 9) +1;
		}while(com1==com2); 
		//com1과 com2의 값이 같으면 do안의 명령을 계속 반복해서 중복된값이 나오지 않도록 한다. 
		//com2에 값이 들어간 상태로 com1의 값과 비교해야 되기 때문에 do~while를 사용하는 것이 좋다.
		
		do
		{		
			com3 = (int)(Math.random()*9) +1;		
		}while(com3==com1||com3==com2); //com1/com2의 값과 com3의 값이 같으면 do안의 명령을 계속 반복해서 중복된값이 나오지 않도록 한다.
		
		System.out.println("컴퓨터가 만들어낸 값 : " + com1 + com2 + com3);
		
		
					
		do
		{
			strike = 0;
			ball = 0;
			out = 0; //변수 초기화
		
					
			System.out.println();
			System.out.println("세자리 숫자를 입력하세요 > (중복된숫자를 넣지 마세요)");
			int input = Integer.parseInt(s.nextLine());
			

				h3 = input % 10; //h3 에 1의 자리수 값을 넣어준다.
				h2 = (input/10) % 10;//h2에 2의 자리수 값을 넣어준다.
				h1 = (input/100) % 10;//h3에 3의 자리수 값을 넣어준다.
			
				//내가 입력한 수와 컴퓨터가 발생시킨 수를 비교한다.
				
					if(h1 == com1) 
					{
						strike ++;
				
					}
					else if(h1 == com2 || h1 == com3)
					{
						ball ++;
				
					}
					else 
					{
						out ++;
				
					}
					
				
					if(h2 == com2)
					{
						strike ++;
				
					}
					else if(h2 == com1 || h2 == com3)
					{
						ball ++;
				
					}
					else
					{
						out ++;
				
					}
			
					if(h3 == com3)
					{
						strike ++;
				
					}
					else if(h3 == com1 || h3 == com2)
					{
						ball ++;
				
					}
					else
					{
						out ++;
				
					}	
//					++count ;
					System.out.println("시도 횟수"  + ++count );
					System.out.println("S:" + strike + " B:" + ball + " O:" + out );
						

		}while(strike < 3); //strike가 3일경우 정답을 맞춘것이므로 do while문을 탈출한다.	
		

		System.out.println("정답입니다.");
		
		
		}

}
// 3개의 숫자를 하나로 인식하는것이 아니라 각각 인식하므로 중복된 값을 

// 두자리 숫자를 입력받았을 경우  --> "숫자 세개를 입력하세요"

// 중복된 숫자를 입력받았을 경우  --> "입력값이 잘못되었습니다." 를 출력해야하는데...

// 정답입력을 시도한 횟수  --> counting 위치를 어디로 잡아야 할까 

