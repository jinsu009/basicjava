package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	//20.01.10
	
	public static void main(String[] args)
	{
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^ : 뒷 문자로 시작
		 * $ : 앞 문자로 종료
		 * . : 임의의 문자 (줄바꿈 제외)
		 * * : 앞문자가 0개 이상
		 * + : 앞문자가 1개 이상
		 * ? : 앞문자가 없거나 1개
		 * [] : 문자의 집합이나 범위([a-z] : a부터 z까지 , [^a-z] : a부터 z가 아닌것 )
		 * {} : 앞 문자의 개수 ({2} : 2개 , {2,4} : 2개 이상 4개 이하)
		 * () : 그룹화 (1개의 문자처럼 인식)
		 * \ : OR연산
		 * \s : 공백, 탭, 줄바꿈 
		 * \S : 공백, 탭, 줄바꿈이 아닌 문자
		 * \w : 알파벳이나 숫자
		 * \W : 알파벳이나 숫자가 아닌 문자 (공백 특수문자)
		 * \d : 숫자
		 * \D : 숫자가 아닌 문자 
		 * (?i) : 뒷 문자의 대소문자 구분 안함 
		 * \ : 정규표현식에서 사용되는 특수문자 표현
		 */
	
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+"; //a~z,0~9까지
//		String regex = "\\w";  //역슬러시 2개씩 넣어줘야 한다. 
//		String regex = ".*"; //줄바꿈을 제외한 모든 문자 
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//아이디 , 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요 
		//5~20자의 영문소문자, 숫자와 특수기호 (-),(_)만 사용가능합니다.
		//아이디 : [a-z0-9_-]{5,20}
		//전화번호 :  ^0\\d{1,3}-\\d{3,4}-\\d{4}
		//이메일 주소 : [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?!)(com|net\org|([a-z]{2}\\.kr))$
		
		
		
		String ID = "abcdef123_-";
//		String PW = "abc123!";
		String PN = "010-2582-6549";
		String Email = "jinjin000@daum.com";
		String IDregex = "[a-z0-9]{5,20}\\_\\-";
//		String PWregex = "\\w\\D";
		String PNregex = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		String emailString = "[a-z0-9_-]{5,20}@\\w.com";
		
		Pattern p1 = Pattern.compile(IDregex);
		Matcher m1 = p1.matcher(ID);
		System.out.println(m1.matches());
		
//		Pattern p2 = Pattern.compile(PWregex);
//		Matcher m2 = p2.matcher(PW);
//		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(PNregex);
		Matcher m3 = p3.matcher(PN);
		System.out.println(m3.matches());
		
		Pattern p4 = Pattern.compile(PNregex);
		Matcher m4 = p4.matcher(Email);
		System.out.println(m3.matches());
		
		}

}
