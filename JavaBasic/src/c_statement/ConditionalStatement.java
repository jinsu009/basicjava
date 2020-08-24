package c_statement;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		/*
		 * <<if문>>
		 * -if : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. 
		 * if(조건){}
		 * -else if : 다수의 조건이 필요할때 if뒤에 추가한다.
		 * -else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 * -boolean타입의 조건문이 온다.
		 */
		
		int a = 10;
//		int b = 90;
		
		if(a < 100)
		{
			System.out.println("조건식의 연산결과가 t이면 수행된다.");
//			System.out.println(a+b);
			
		}
		
		if(a<10){
			System.out.println("조건식의 연산결과가 f이면 수행되지않는다.");
		}
		
		
		int regNo = 5; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1){
			gender = "남자";
		}
		else if(regNo == 2){
			gender = "여자";
		} 
		//if블럭뒤에 else if로 조건을 추가할 수 있다.
		//조건식이 아무리 많아도 true인 결과값만 출력된다.
		else if(regNo == 3){
			gender = "남자";
		} 
		else if(regNo == 4){
			gender = "여자";
		} 
		else {
			gender = "불확실";
		} 
		//true인 조건식이 하나도 없을경우 수행됨
		//else는 조건식을 적지않는다. *****
		//else가 들어가지 않을경우 아무것도 실행되지 않고 결과값은 null이 출력된다.
		
		System.out.println();
		System.out.println(gender);
		
		
		//논리연산자를 사용해서 조건을 묶어준다. ***
		//실행코드가 한문장일 경우 {}을 생략해 줄 수 있다. ***
		
		int regNo2 = 4;
		String gender2 = null; 
		
		if(regNo2 == 1 || regNo2 ==3)
			gender2 = "남자";
		
		else if(regNo2 == 2 || regNo2 == 4)
			gender2 = "여자";

		else 
			gender2 = "불확실";
				
		System.out.println();
		System.out.println(gender2);
		
		
		//점수에 등급을 부여하는 코딩
		int score = 55;
		String grade = null;
		
		if(score >=90)
			grade = "A";
		else if(score >= 80 && score < 90)
			grade = "B";
		else if(score >= 70 && score < 80)
			grade ="C";
		else if(score >= 60 && score < 70) //굳이 score를 미만인 조건까지 기술할 필요는 없다.
			grade = "D";
		else 
			grade = "F";
		
		System.out.println();
		System.out.println(score + "점수에 해당하는 등급은 : " +grade + " 입니다.");
		
		
		//A+ 와  A- 등급을 나눠보자 	
		//if문을 중첩하여 사용해보자  
		//블럭오류 주의 ***** 짝을 맞춰주자		
		int score2 = 100;
		String grade2 = null;
		
		if(score2 >= 90)
		{
			grade2 = "A";
			if(score2 >= 97 )
			{
				grade2 += "+";
			}
			else if(score2 <= 93)
			{
				grade2 += "-";
			}
			
		}
		else if(score2 >= 80)
		{
			grade2 = "B";
			if(score2 >= 87 )
			{
				grade2 += "+";
			}
			else if(score2 <= 83)
			{
				grade2 += "-";
			}
		}
		else if(score2 >= 70)
		{
			grade2 ="C";
			if(score2 >= 77 )
			{
				grade2 += "+";
			}
			else if(score2 <= 73)
			{
				grade2 += "-";
			}
		}
		else if(score2 >= 60)
		{
			grade2 = "D";
			if(score2 >= 67 )
			{
				grade2 += "+";
			}
			else if(score2 <= 63)
			{
				grade2 += "-";
			}
		}
		else 
			grade2 = "F";
		
		System.out.println();
		System.out.println(score2 + "점수에 해당하는 등급은 : " +grade2 + " 입니다.");
	
	/*
	 * <<Switch문>>
	 * - 조건식고 일치하는 case문 이후의 문장을 수행한다.
	 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다. *****
	 * - 정수와 문자열만 사용하므로 제약이 많이 따른다.
	 *  (사용형식)
	 *  switch(조건식){
	 *  case 1 : 
	 *  break
	 *  	:
	 *  default :
	 *  	}
	 */
		
		int regNo3 = 5;
		String gender3 = null;
		switch(regNo3)
		{
		case 1 : case 3 :
			gender3 = "남자";
			break;
		case 2 : case 4 : //case를 추가해줄때는 옆에 써준다.
			gender3 = "여자";
			break;
			default :
				gender3 = "확인불가";
				//default : 조건식이 하나도 만족하지 않을경우 출력, if문에서의 else와 같은 역할을 한다.
				//항상 마지막에 와주어야 한다.
				//마지막에 있으므로 굳이 break를 넣어주지 않아도 된다. 
		}
		//case 1 에 break가 없다면 1을 지나쳐 case 2 의 break를 통해 결과값은 "여자"가 된다.
		
		System.out.println();
		System.out.println("당신의 성별: " +gender3);
		
		//switch를 이용한 성적나누기 *****
		int score3 = 99;
		String grade3 = null;
		
//		교수님께서 하신 것
		switch(score3 / 10)
		{		
		case 9 : case 10 :
			grade3 = "A";
			break;
		case 8 :
			grade3 = "B";
			break;
		case 7 :
			grade3 = "C";
			break;
		case 6 :
			grade3 = "D";
			break;
			
		default :
			grade3 = "F";
		}
			
			System.out.println();
			System.out.println("당신의 등급: " + grade3);
		
//	내가한 것
//		int score4 = score3 / 10;
//		
//		switch(score4)
//		{
//		
//		case 9 :
//			grade3 = "A";
//			break;
//		case 8 :
//			grade3 = "B";
//			break;
//		case 7 :
//			grade3 = "C";
//			break;
//		case 6 :
//			grade3 = "D";
//			break;
//			
//		default :
//			grade3 = "F";
//		
//		}
//		System.out.println();
//		System.out.println("당신의 등급: " + grade3);
		
		//예) 숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
//			
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요 >> ");
//		
//		String input2 = s.nextLine();
//		//입력받은 숫자를 int로 변환시키고 input2안에 입력시킨다.
//		
//		if(input2 == 0)
//		{			
//			
//			System.out.println("입력받은 숫자는 0입니다.");
//		}
//		else if(input2 != 0)
//		{
//			System.out.println("입력받은 숫자는 0이 아닙니다.");
//		}
//		
		//선생님 
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력해주세요");
//		int input = Integer.parseInt(s.nextLine());
//		
//		if(input == 0)
//		{
//			System.out.println("입력받은 숫자는 0입니다.");
//		}
//		else
//		{
//			System.out.println("입력받은 숫자는 0이 아닙니다. .");
//		}
//		
		//예2) 숫자를 입력받아 그 숫자가 홀수 인지 짝수인지 출력하세요 

		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int input2 = Integer.parseInt(s.nextLine()); 

		if( input2 % 2 == 0){
			System.out.println("짝수");
			
		}
		else 
			
			
		{
			System.out.println("홀수");
		}
	}

}
