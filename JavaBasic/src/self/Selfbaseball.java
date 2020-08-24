package self;
import java.util.Scanner;
public class Selfbaseball {
	public static void main(String[] args){
		
		int rad1,rad2,rad3;
		int st;
		int ba;
		int ou;
		int user1 =0 ,user2 =0 ,user3 =0;
		
		Scanner s = new Scanner(System.in);
		
		rad1 = (int)(Math.random()* 9+1);
		do
		{
			rad2 = (int)(Math.random()*9+1);
		}while(rad1 == rad2);
		
		do
		{
			rad3 = (int)(Math.random()*9+1);
		}while(rad3 == rad2 || rad3 == rad1);
		
		System.out.println("컴퓨터가 만들어낸 값 : " +rad1+rad2+rad3);
		
		int count = 0;
		
		do
		{
			
			st = 0;
			ba = 0;
			ou =0;
					
			System.out.println();
			System.out.println("중복하지 않은 세개의 숫자를 입력하세요 : ");
			int input = Integer.parseInt(s.nextLine());
			
			user3 = input%10;
			user2 = (input/10) % 10;
			user1 = (input/100) % 10; //***주의!!
			
			if(user1 == rad1)
			{
				st ++;
			}		
			else if(user1==rad2 || user1==rad3)
			{
				ba ++;
			}
			
			
			if(user2 == rad2)
			{
				st ++;
			}
			else if(user2==rad1 || user2==rad3)
			{
				ba ++;
			}
			
			
			if(user3 == rad3)
			{
				st ++;
			}
			else if(user3==rad1 || user3==rad2)
			{
				ba ++;
			}
			
			ou = 3 - st - ba;
			
			System.out.println();
			System.out.println("S: " +st + " B: " + ba + " O: " + ou );
			System.out.println("시도한 횟수 : " + ++count);
			
		}while(st<3);
		
		System.out.println();
		System.out.println("정답입니다.");
		
		
		
	}

}
