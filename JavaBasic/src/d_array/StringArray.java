package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	public static void main(String[] args){
		
		//배열은 크기를 변경할수 없다. --> 더 큰 배열 생성후 복사...
		//string으로 문자배열을 선언 --> char타입이 저장되어 있다.
		//length 등의 기능을 묶어놓은것 
		
		String s = new String("ABCD"); //참조형 타입을 초기화 하는 방법
		String str = "ABCD"; //String 은 new를 생략하고 간단하게 초기화 할 수 있다.
		
		char[] charArray = str.toCharArray();
		//string class에 있는 배열
		System.out.println(charArray);
		//char배열은 주소가 아닌 내용이 출력된다.
		
		/*
		 * <<String>>
		 *  - equals() : 문자열의 내용이 같은지 확인한다. //'=='는 주소를 비교하게 된다.
		 *  - length() : 문자열의 길이를 반환한다. //주로 반복문에서 많이 사용한다.
		 *  - charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다. //괄호안에 인덱스 번호를 넘겨주면 인덱스에 있는 문자 하나를 반환
		 *  - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다. //괄호안의 값을 하나 또는 두개를 넣어주고 보통은 두개의 값을 넣어 그 인덱스 범위 안의 값을 반환
		 *  - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다. 
		 *  - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
		
		for(int i = 0; i < str.length(); i++) //문자열의 길이만큼 반복하고 싶을 때 사용
		{
			System.out.println(str.charAt(i));
		}
		
		String revStr = "";//str을 거꾸로 저장할 변수
		//뒤에서부터 한글자 씩 가져와서 새로운 변수에 더한다.
		//ABCD
		
		for(int i = str.length()-1; i >= 0; i--)
		{	
			revStr += str.charAt(i);
		}
		System.out.println("rev: " + revStr);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		//넘겨주는 값 : 파라미터
		//substring : 파라미터로 값을 넘겨준다.
		System.out.println(sub1); 
		
		String sub2 = str.substring(5,8); //5번 인덱스 부터 8번 인덱스 전까지 잘라서 반환한다. 5,6,7 출력
		System.out.println(sub2);
		
		str = "치킨 피자 돈가스 떡볶이";
		int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다.
		System.out.println(idx);
		
		idx = str.indexOf("짜장면");
		System.out.println(idx); //해당되는 문자열이 없는 경우 -1을 반환한다.
		
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 500원"
		};
		//길이가 다른 문자열만 반환하고 싶을때 
		
		for(int i = 0; i<menus.length; i++)
		{
			String name = menus[i].substring( 0,menus[i].indexOf(" "));//(시작인덱스 , 끝나는 인덱스)
			//모든 문자는 마지막에 공백이 있기 때문에 공백까지만 자르면 원하는 글자를 반환한다.
			System.out.println(name);
			
			//가격만 분리 시켜서 int형 변수에 담아 주세요 
			
			int price = Integer.parseInt(menus[i].substring(menus[i].indexOf(" ") +1 ,menus[i].indexOf("원")));
			System.out.println(price + "원");
		}
		
		str = "123456789";
		str = str.replace("3","짝");
		System.out.println("replace : " + str);
		str = str.replace("6","짝");
		System.out.println("replace : " + str);
		str = str.replace("9","짝");
		System.out.println("replace : " + str);
		
		
		String pn = "010-2345-6789";
		//하이픈(-)을 제거해서 출력해주세요.
		pn = pn.replace("-", "");
		System.out.println("-제거: " + pn);
		
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요
		//예) 1234567 -> 1,234,567
		
		/*String num = "123456789";
		String dan = "";
		String com = ",";
		
		for(int i = num.length()-3; i>=0; i=i-3)
		{
			if(i % 3 == 0 && i != num.length())
			{
				dan = com + num.charAt(i);
			}
		  dan = dan + num.charAt(i);		
		}
		System.out.println(dan);*/
		
		/*Scanner ss = new Scanner(System.in);
		System.out.println("숫자를 입력> ");
		String num = ss.nextLine();
		String newnum = "";
		int cnt = 0;
		for(int i = num.length()-1; i>=0; i--)
		{
			newnum = num.charAt(i) + newnum;
			cnt++;
			if(cnt % 3 ==0 && cnt != num.length())
			{
				newnum = ","+newnum;
			}
		}
		System.out.println(newnum);*/
		
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요> ");
		String number = sc.nextLine();
		String newNumber="";  //String 변수 선언 후 초기화 시킨것 (String의 기본값은 null이다.)
		int count = 0;
		for(int i = number.length()-1;i>=0; i--)
		{
			newNumber = number.charAt(i) + newNumber;
			count++;
			if(count %3==0&&count!=number.length())
			{
				newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);*/
		
		
	}

}
