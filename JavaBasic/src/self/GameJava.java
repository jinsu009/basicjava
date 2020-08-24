package self;

import java.util.*;
import java.io.*;

public class GameJava {
	//단어 맞추기
			/*
			 * 1. 배열에  문제로 출제할 단어를 저장시켜놓는다. 
			 * 2. 문제로 배열에서 임의로 단어가 선택된다.
			 * 3. 선택된 단어의 문자열의 수만큼 '-'이 표시된다.
			 * 4. 정답에 들어있는 단어가 맞으면 '-' 대신에 정답의 문자열을 출력한다. 
			 * 5. 똑같은 문자열을 입력하였을경우 "입력하신 문자입니다."를 출력한다. 
			 * 5-1. 정답인 단어와 내가 입력했던문자를 저장해서 비교할수 있어야 한다. 
			 * 6. 정답이 틀렸을경우만 count되어서 failed 누적시킨다. --switch문을 사용
			 * ** StringBuffer -> String 를 사용해도 좋다. 
			 * ** Random r = (int)(Math.random()) 사용해도 좋다. 
			 */
	
	/*
	 * 예외처리를 무조건적으로 쓸수밖에 없다
	 * StringBuffer -> .append 사용 
	 * BufferedReader
	 * InputStreamReader
	 */
	/*
	 * 대문자와 소문자를 같은 문자로 취급하지 않는다. 정답에 a가 들어있을때 A를 넣으면 오답처리가 된다. 
	 */
		public static void main(String[] args) throws IOException
			{
				Hangman hangman = new Hangman();
				
				int result = hangman.playGame();
				
				System.out.println();
				if(result <= 3)
				{
					System.out.println("참잘해써요 ");
				}
				else if(result <= 4 )
				{
					System.out.println("잘했어요");
				}
				else 
				{
					System.out.println("분발하세요");
				}
			} //메인메소드 ... 정답을 몇번만에 맞췄는지 result에 누적시켜 그 조건에 맞는 print문 출력
}
class Hangman{
				
				String hiddenString;
				StringBuffer outputString;
				StringBuffer inputString;
				int remaind; //맞춰야할 문자열 - 남아있는 문자의 수 
				int failed; //실패한 횟수 
				
						
				public Hangman()
				{
					Random r = new Random();
					int random = r.nextInt(3);
					if (random == 0)
					{
						hiddenString = "rabbit";
					}
					else if (random == 1)
					{
						hiddenString = "crocodile";
					}
					else if (random == 2)
					{
						hiddenString = "hippopotamus";
					}
				}//생성자 선언 words배열에서 문제로 출제할 단어를 랜덤으로 추출한다
				
			public int playGame() throws IOException 
			{
				outputString = new StringBuffer();
	
				for(int i = 0 ; i<hiddenString.length();i++)
				{
					outputString.append('-');  //hiddenString 만큼 '-'를 출력
				}
				inputString = new StringBuffer();
				
				remaind = hiddenString.length();
				failed = 0;
				
				System.out.println("단어 (" + hiddenString.length()+ ") 글자" + outputString);
				
				drawMan(); //교수대를 그리는 메소드 호출?
				
				do{
					checkChar(readChar());
					System.out.println("단어 (" + hiddenString.length() + ") 글자" + outputString);
					drawMan(); //문자입력에 따른 교수대 출력
				}while((remaind > 0)&&(failed<6));
				
				
				return failed;
			} //메소드 : 리턴값을 반환해준다. 
			
			
			public char readChar() throws IOException{
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.println("문자를 입력하세요 > ");
//				Scanner sc = new Scanner(System.in);
				
				user = in.readLine(); //키보드로 한줄 입력
				
				return user.charAt(0); //입력받은 문자열중 첫번째 것을 반환
			}//문자열을 입력받고 그 중 첫번째 문자를 반환하는 기능을 가지고 있다. .. 무엇을 입력하든 첫 번째 글자만 반환하는 것이다. 
			
			public void checkChar(char guess)
			{
				boolean already = false;
				
				for(int i = 0; i <inputString.length();i++)
				{
					if(inputString.charAt(i) ==  guess)
					{
						System.out.println("이미 입력한 문자입니다. 다시 입력하세요 ");
						already = true;
					}
				}
				
				if(!already)
				{
					inputString.append(guess); //입력한 문자들의 모임에 추가 
					
					boolean success = false;
					
					for(int i = 0; i<hiddenString.length();i++)
					{
						if(hiddenString.charAt(i)==guess) //문제에 해당하는 문자가 있는지 조사
						{							
							outputString.setCharAt(i, guess);
							//문제에 해당하는 문자가 있으면 '-'를 문자로 변경
							//setCharAt(a,b) -> a와 b의 문자열을 비교 
							
							remaind--; //맞출문자수 1감소 
							
							success = true; //입력한문자가 문제가 있음을 표시 
						}
						
					}
					if(!success)
					{
						failed++;
					} //입력한 문자가 문제에 없으면 failed를 증가해서 drawman을 출력한다. 
				}
				
			}//접근제한자 타입 메소드명 (변수타입 변수명)
			
			public void drawMan()
			{
				switch(failed)
				{
				case 0 :
					System.out.println("┌────────┐");
					System.out.println("│         ");
					System.out.println("│         ");
					System.out.println("│         ");
					break;
				case 1 :
					System.out.println("┌────────┐");
					System.out.println("│        0 ");
					System.out.println("│         ");
					System.out.println("│         ");
					break;
				case 2 :
					System.out.println("┌─────────");
					System.out.println("│        0 ");
					System.out.println("│        │ ");
					System.out.println("│         ");
					break;
				case 3 :
					System.out.println("┌────────┐");
					System.out.println("│        0 ");
					System.out.println("│      / │ ");
					System.out.println("│         ");
					break;
				case 4 :
					System.out.println("┌────────┐");
					System.out.println("│        0 ");
					System.out.println("│      / │/ ");
					System.out.println("│         ");
					break;
				case 5 :
					System.out.println("┌────────┐");
					System.out.println("│        0 ");
					System.out.println("│      / │/ ");
					System.out.println("│       /  ");
					break;
				case 6 :
					System.out.println("┌────────┐");
					System.out.println("│        0 ");
					System.out.println("│      / │/ ");
					System.out.println("│       / / ");
					break;			
				
				}
			}
}//문제를 배열에서 추출할 Hangman 클래스 생성