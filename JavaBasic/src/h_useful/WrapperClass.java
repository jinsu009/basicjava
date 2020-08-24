package h_useful;

import java.util.*;

public class WrapperClass {
	//20.01.10
	public static void main(String[] args)
	{
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float 
		 * double : Double
		 * 
		 */
		//기본형타입을 클래스로 만든것

		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i+iw);
		System.out.println(Integer.MIN_VALUE + "~"+ Integer.MAX_VALUE);
		//integer가 저장할수 있는 최소값~최대값 표현
		
		System.out.println(i+ Integer.parseInt("20"));
		//integer.parseint 파라미트로 받은 문자열을 int로 형변환시켜줌
		
		
		System.out.println(i+String.valueOf(20));
		//파라미터로 받은 숫자를 스트링으로 변환시켜준다. 
		//문자열 10 + 문자열 20 = 출력값 1020
		
		System.out.println(i+Integer.valueOf("20"));
		//valueof = parseint
		
		//배열보단 collection을 사용한다. 
		//collection : 배열을 쉽게 사용? 
		
		new ArrayList(); //*****
		//객체생성
		//넣으면 넣을수록 길이가 늘어나거나 뺄수록 길이가 줄어든다. 
		//길이가 변하는 장점이 있다. 
		//웬만하면 같은타입을 넣는것이 좋다 
		//제네릭???? 12		new ArrayList<타입명>();
		//기본형타입은 넣을수 없다 만약 넣고싶다면 wrapperclass를 넣어주어야한다. 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(10);
		//오토박싱 : 기본형 타입이 wrapper클래스로 자동변환
		
		Integer integer = list.get(0);
		//인덱스번호에 해당되는 객체를 얻을 수 있다. 
		int i2 = list.get(0); 
		//언박싱 : wrapper클래스가 기본형 타입으로 자동 변환
	}

}