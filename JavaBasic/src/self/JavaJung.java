package self;

import java.util.Scanner;



public class JavaJung {
	public static void main(String[] args)
	{
		int a = 1993;
		int b = 28;
		System.out.printf("연도: %d %n나이 : %d" , a,b);
		
		int x = 100;
		int y = 200;
		System.out.printf("%n덧셈 : %d",(x+y));
		System.out.printf("%n뺄셈 : %d",(x-y));
		System.out.printf("%n곱셈 : %d",(x*y));
		
		float z = (float) 22.35;
		int r = 33;
		System.out.printf("%n덧셈 : %f",(z+r));
		System.out.printf("%n뺄셈 : %f",(z-r));
		System.out.printf("%n곱셈 : %f",(z*r));
		System.out.println();
		
		int c = 50;
		int d = 33;
		int temp = 0;
		
		System.out.println(c+","+d);
		
		temp = c;
		c = d;
		d = temp;
		
		System.out.println(c+","+d);
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("정수를 입력하세요> ");
//		String input = s.nextLine();
//		int num = Integer.parseInt(input);//*****입력받은 내용을 input타입의 값 여기서는 int 타입으로 전환 
//		System.out.println("입력한 값 : " + num);
		
		
		//가위바위보 게임
		//가위:1 바위:2 보:3
		//사용자에게입력받은 수를 컴퓨터가 랜덤하게 만든수와 비교 
		Scanner s = new Scanner(System.in);
//		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 골라주세요 ");
//		int input = s.nextInt();
//		
//		int com = (int) ((Math.random()*3)+1);
//		
//		System.out.println("당신은 " + input +" 입니다.");
//		System.out.println("컴퓨터는 " + com + " 입니다.");
//		if((input-com==-1)||(input-com==2))
//		{
//			System.out.println("당신이 졌습니다.");
//		}
//		if((input-com ==-2)||(input-com==1))
//		{
//			System.out.println("당신이 이겼습니다.");
//		}
//		else if(input==com)
//		{
//			System.out.println("무승부입니다.");
//		}
		
//		switch(input-com)
//		{
//		case -1 : case 2:
//			System.out.println("당신이 졌습니다.");
//			break;
//		case -2 : case 1:
//			System.out.println("당신이 이겼습니다.");
//			break;
//		case 0 :
//			System.out.println("무승부 입니다.");
//			break;
//		}
		
		System.out.println("주민번호를 입력하세요 > (010102-1234567)");
		String regNo = s.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender)
		{
		case '1' : case '3' :
			System.out.println("남성");
			break;
		case '2' : case '4' : //문자타입은 ''로 감싸준다.
			System.out.println("여성");
			break;
		default :
			System.out.println("확인불가");
			break;
		}
		
		
		
		
		
		
		
		
	}

}
