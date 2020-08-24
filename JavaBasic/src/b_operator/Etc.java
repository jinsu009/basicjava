package b_operator;

public class Etc {

	public static void main(String[] args) {
		/*
		 * <<비트 연산자>>
		 * | (OR)	: 피연산자 중 한쪽이라도 값이 1이면 1을, 그 외는 0을 결과로 얻는다. **논리연산자와 헷갈리지말자. **더하기개념
		 * & (AND)	: 피연산자 중 양쪽이 모두 1이여야만 1을, 그 외는 0을 결과로 얻는다. **곱하기 개념  **논리연산자와 헷갈리지말자.
		 * ^ (XOR)	: 피연산자의 값이 서로 다를 때만 1을, 같을때는 0을 결과로 얻는다. * ^ : [캐럿]
		 * ~ (비트전환) : 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * <<(쉬프트)	: 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * >>(쉬프트)	: 피연산자의 각 자리를 오른쪽을 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다. 
		 *  1bit : 0 or 1
		 *  
		 * <<기타 연산자>>
		 * .(참조연산자) : 특정범위 내에 속해 있는 멤버를 지칭할 때 사용 예).equals
		 *  (type) : 형변환(casting)
		 *  ?(삼향연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장 *****
		 *  instanceof : 참조형타입 확인
		 */

		/*
		 * 10진수 -> 2진수 : 10진수의 값을 몫이 1이 될 때까지 2로 나눈다. 
		 * 예) 10/2 - 5 ....0 
		 * 		5/2 - 2...1
		 * 		2/2 - 1...0
		 * 		1
		 * 1010
		 */
		
		//15를 2진수로 만들어보자 
		/*
		 * 15/2 - 7...1
		 * 7/2  - 3...1
		 * 3/2 - 1...1
		 * 1
		 * 1111
		 */
		
		/* 
		 * 2진수 -> 10진수 : 각 자리에 1,2,4,8,16.... 을 곱한값을 더한다.
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8 + 2 = 10
		 */
		
		//1111을 10진수로 만들어 보자 
		/*
		 * 1111
		 * 8 4 2 1
		 * 8+4+2+1 = 15
		 */
		
		/*
		 * byte 
		 * 10 = 00001010
		 * 15 = 00001111
		 * 
		 * |(OR) :  00001111
		 * &(AND) : 00001010
		 * ^(XOR) : 00000101
		 * ~(비트연산) : 00001010 -> 11110101 **여덟개의 bit중 맨앞의 bit는 음수양수를 구분짓는다. 0:양수, 1:음수
		 * <<(쉬프트) : 00001010 -> 00010100 **빈칸은 0으로 채운다.
		 * >> : 00001010 -> 000000101
		 */
		
		System.out.println(10|15);
		System.out.println(10&15);
		System.out.println(10^15);
		System.out.println(~10); //출력값 : -11 
		System.out.println(10 << 1); //10을 왼쪽으로 한칸 이동시킨다. 출력값 : 20
		System.out.println(10 >> 1); //출력값 : 5
		
		// 삼항연산자에 대해 알아보자 *****
		
		int x = 10, y = 20;
		int res = (x < y) ? x : y;
		//t일경우 두번째 문장을 수행 ,즉 x가 res에 저장된다. 
		//int res = T ? x : y;
		//int res = x; ---연산결과
		System.out.println();
		System.out.println(res); 
		
		//점수가 60점 이상이면 합격 미만이면 불합격
		int score = 60;
		String res1 = 60 <= score  ? "합격" : "불합격";
		System.out.println();
		System.out.println(score + "점은" + res1 + "입니다.");
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자 
		int regNo = 1;
		String gender = (regNo == 1) ? "남자" : "여자"; //1이아닌 모든 숫자는 여자로 나오는 문제점이 발생한다.
		System.out.println();
		System.out.println("당신의 성별: " + gender + " 입니다.");		
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); //*****
		System.out.println();
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//1) 두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		int x1 = 3 , y1 = 5;
		int bigger = x1 < y1 ? y1 :x1 ; //교수님 방법
		System.out.println();
		System.out.println(bigger); //교수님 방법
		System.out.println(x1 >= y1 ?  x1 : y1 ); 
		
		//2) 변수에 저장된 수의 절대값을 출력해주세요. (0에서 얼만큼 떨어져있는지 생각해 보자 -5 -> 5, +5 -> 5 로 출력)
		int z = -19;
		int abs = z < 0 ? -z : z;
		System.out.println();
		System.out.println(abs);
		
		//3) 변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요 
		//그외의 숫자는 '확인불가'를 출력해 주세요 
		int idnum = 5;
		System.out.println();
		System.out.println((idnum == 1 || idnum == 3) ? "남자" :(idnum == 2 || idnum == 4 ? "여자" : "확인불가") );
		
		/*
		 * String gen = d == 1 || d == 3 ? "남자" : d == 2 || d == 4 ? "여자" : "확인불가";
		 * System.out.println("당신의 성별 " +gen);
		 */
		
	}
}