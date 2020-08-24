package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		/*[5-1] 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명하시오. .

		

		a. int[] arr[];
		b. int[] arr = {1,2,3,};
		c. int[] arr = new int[5];
		d. int[] arr = new int[5]{1,2,3,4,5};
		e. int arr[5];
		f. int[] arr[] = new int[3][];*/

		/*
		* a,f . 대괄호는 변수 앞에만 사용해준다.
		* d. 배열의 크기나 값 둘중 하나만 선언해야한다.
		*/
		
		// [5-2] 다음과 같은 배열이 있을 때, arr[3].length 의 값은 얼마인가 ?
		
		
		// [5-3] 배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오 .

//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//		for(int i =0; i<arr.length;i++)
//		{
//			sum += arr[i];
//			sum = sum + arr[i];
//		}
//		System.out.println("sum : " +sum);

		// [5-4] 2차원 배열 arr 에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오

		/*int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int total = 0;
		float avg = 0;
//		int count =0
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				total += arr[i][j];
//				count++;
			}
		}
		avg = (float)total/(arr.length*arr[0].length);
//		avg = total/(float)count;
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);*/
		
//		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//		로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
		
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0; i< ballArr.length;i++)
//		{
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//				tmp = ballArr[i];
//				ballArr[i] = ballArr[j];
//				ballArr[j] = tmp;
//		}
//		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//		
//		System.out.println(Arrays.toString(ballArr));
//		for(int i = 0; i<ball3.length;i++)
//		{
//			ball3[i] = ballArr[i];
//		}
//		for(int i=0;i<ball3.length;i++) 
//		{
//			System.out.print(ball3[i]);
//		}
		
		
		//[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. 
		//(1)에 알맞은 코드를 넣어서	프로그램을 완성하시오.
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("돈: " +money);
//		
//		for(int i = 0; i<coinUnit.length;i++)
//		{
//			System.out.println(coinUnit[i] + ":" + money/coinUnit[i]);
//			money = money%coinUnit[i];		
//		}
		
//		[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면,
//		‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 
//		지불할 돈이 충분히 있으면, 거스름돈을 지불	한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
//		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		
/*//		if (args.length != 1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//			}
			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//			int money = Integer.parseInt(args[0]);
			int money = 2430;  
			//사용자가 임의로 넣어주자 
			
			System.out.println("money=" + money);
			int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
			int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
			for (int i = 0; i < coinUnit.length; i++) {
//			* (1) 아래의 로직에 맞게 코드를 작성하시오. 1. 금액(money)을 동전단위로 나눠서 필요한 동전의
//			* 개수(coinNum)를 구한다. 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면
//			* 배열 coin에 있는 만큼만 뺀다.) 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			int coinNum = 0;
			coinNum = money/coinUnit[i]; 
						
			for(int j = 0; j<coin.length;j++)
			{
			coin[j] -= coinNum;
			}
			System.out.println(coinUnit[i] + "원: " + coinNum);
			}

			if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
			}*/

			// [5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
			// 을 찍어서 그래프를 그리는 프로그램이다. (1)~(2) 에 알맞은 코드를 넣어서 완성하시오 . 

			/*int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
			int[] counter = new int[4];
			for(int i=0; i < answer.length;i++) 
			{
			(1) 알맞은 코드를 넣어 완성하시오. 

			counter[answer[i]-1]++;
			//answer[0]=1 => 1-1=0 => counter[0]++ => 1의 갯수를 저장할 0번째 인덱스를 1증가시킨다.
			//answer[1]=4 => 4-1=3 => counter[3]++ => 4의 갯수를 저장할 3번째 인덱스를 1증가시킨다.
			}

			for(int i=0; i < counter.length;i++) 
			{
			(2) 알맞은 코드를 넣어 완성하시오. 
			System.out.print(counter[i]);
			for(int j = 0 ; j<counter[i];j++)
			{
			System.out.print("*");
			}

			//counter배열안에 있는 값만큼 *의 갯수를 출력하도록한다.
			//counter[0]=3이므로 0부터3까지 *을 출력하게된다.
			System.out.println();

			}*/

			// [5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.

			/*char[][] star = { 
			{ '*', '*', ' ', ' ', ' ' },
			{ '*', '*', ' ', ' ', ' ' }, 
			{ '*', '*', '*', '*', '*' },
			{ '*', '*', '*', '*', '*' }
			};

			char[][] result = new char[star[0].length][star.length];
			for (int i = 0; i < star.length; i++)
			{
			for (int j = 0; j < star[i].length; j++)
			{
			System.out.print(star[i][j]);
			}
			System.out.println();
			}
			System.out.println();
		
			//회전시켜 출력하는 for문
			for (int i = 0; i < star.length; i++)
			{
			for (int j = 0; j < star[i].length; j++)
			{
			int a = j;
			//회전하려는 배열의 크기중 열의 크기를 int a 에 저장시킨다.
			int b = (star.length-1)-i; //*****
			//배열의 행의 길이에서 -1을 하면 오류가난다. 
			//-i를 추가시켰더니 오류가 안남 왜지? 

			result[a][b] = star[i][j];
			//배열 result에 열과행을 회전시킨값으로 크기를 선언하고 
			//star의 값들을 넣어준다. 

			//1.a에 열의 크기j를 저장
			//2.b에 길이 -1-행의길이(0~4)까지 뺀값을 저장
			//3.result[j][i] = star[i][j]의 값을 차례로 저장

			}
			}
			for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
			System.out.print(result[i][j]);
			}
			System.out.println();
			}*/


			
			// [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
			// (1)에 알맞은 코드를 넣어서 완성하시오. 

			/* char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
			':', ',', '.', '/' };
			// 0 1 2 3 4 5 6 7 8 9
			char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
			String src = "abc123";
			String result = "";

			//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
			for (int i = 0; i < src.length(); i++) 
			{
			char ch = src.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
			result += abcCode[i];
			//답:result += abcCode[ch-'a']
			}

			else if(ch >= '0' && ch <= '9')
			{
			result += numCode[i-2];
			//-2를 하지않으면 'rty'가 나온다.
			//답:result += abcCode[ch-'0']
			//아스키코드때문에 빼주는건가?

			}

			}

			System.out.println("src:" + src);
			System.out.println("result:" + result);*/

		// [5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 
		// 의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
		// 에 알맞은 코드를 넣어서 완성하시오.

			/*int[][] score = { 
			{ 100, 100, 100 }, 
			{ 20, 20, 20 }, 
			{ 30, 30, 30 },
			{ 40, 40, 40 }, 
			{ 50, 50, 50 } 
			};

			int[][] result = new int[score.length + 1][score[0].length + 1];
			for (int i = 0; i < score.length; i++) 
			{
			for (int j = 0; j < score[i].length; j++)
			{
			result[i][j] = score[i][j];
			//result값에 score값 넣기
			//행의 길이 표현방법과 열의 길이 표현방법은 다르다.!!!!
			
			result[i][result[0].length-1] += score[i][j];
			//열 = 0번째 행의 길이(4) - 1 
			//result[i][0행의 길이 -1]
			//result[0][3] => score의 값을 저장

			result[result.length-1][j] += score[i][j];
			//행 = 행의 길이(4)-1
			//result[3][j]
			//result[3][0]~result[3][2]
			}

			result[result.length-1][result[0].length-1] += result[i][result[0].length-1];
			//배열[3][5]에 마지막행 또는 마지막 열의 값을 넣어주면 된다.
			//result[3-1][3-1] += result[0][2]~result[3][2] 

			}

			for (int i = 0; i < result.length; i++) 
			{
			for (int j = 0; j < result[i].length; j++)
			{
			System.out.print(" "+result[i][j]);
			}
			System.out.println();

			}*/

			// [5-12] 예제 5-23을 변경하여 아래와 같은 결과가 나오도록 하시오.
			
			/*String[][] words = {
					{"chair","의자"}, // words[0][0], words[0][1] 
					{"computer","컴퓨터"}, // words[1][0], words[1][1] 
					{"integer","정수"} // words[2][0], words[2][1] 
					};
					int score = 0; //추가
										Scanner scanner = new Scanner(System.in);

					for(int i=0;i<words.length;i++) 
					{
					System.out.printf("Q %d의 %s 뜻은?", i+1, words[i][0]);  
					String tmp = scanner.nextLine();
					
					if(tmp.equals(words[i][1])) 
					{
					System.out.printf(" 정답입니다.%n%n"); 
					score++; //추가
					} 
					else
					{
					System.out.printf(" 틀렸습니다.정답은 %s 입니다.%n%n",words[i][1]); 
					}
					}
					System.out.printf("전체 문제 %d 중 %d문제 맞추셨습니다.%n",words.length, score); //추가
*/
			
			// [5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 . 
			// 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.
			//교재
			/*String[] words = { "television", "computer", "mouse", "phone" };
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < words.length; i++) 
			{
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			
			for(int j = 0; j<question.length;j++)
			{
			int index = (int)(Math.random()*question.length);

			char tmp = question[i];
			question[i] = question[index];
			question[index] = tmp;
			}
			
			System.out.print("Q " + (i + 1) + "의정답을입력하세요.>" + new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
			System.out.print(" 맞았습니다.%n%n");
			else
			System.out.print(" 틀렸습니다.%n%n");
			}*/
			
		//다른사람이 푼것
		/*	String[] words = { "television", "computer", "mouse", "phone" };
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < words.length; i++) 
			{
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			
			for(int  j =0;j<words.length;j++)
			{
			int idx = (int)(Math.random()*question.length);
			char tmp;
			
			tmp = question[j];
			question[j] = question[idx];
			question[idx] = tmp;
			}
			//for문을 사용해서 문제의 길이만큼 회전시켜 알파벳순서를 섞어놓는다.
					
			System.out.print("Q " + (i + 1) + "의정답을입력하세요.>" + new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
			System.out.println(" 맞았습니다.");
			else
			System.out.println(" 틀렸습니다.");
			}	
			*/
		
		
		/*
		 * [5-1]
		 * d,e
		 * 
		 * [5-2]
		 * 2
		 * 
		 * [5-4]카운트를 추가 
		 * 
		 * [5-7] 이상한 프린트문 삭제하고 다시해보기 결과가 이상하게 출력된다.
		 * 
		 * 5,6,7,12,13 다시 해보기
		 */		
	}

}
