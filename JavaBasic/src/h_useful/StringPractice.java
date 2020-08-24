package h_useful;

import java.util.*;

public class StringPractice {
	//20.01.10

	public static void main(String[] args)
	{
		//String(String s)
		String s1 = new String("Hello");
		System.out.println(s1);
		
		//String(char[] value)
		char[] c = {'H','e','l','l','o'};
		String s2 = new String(c);
		System.out.println(c);
		
		//String(StringBuffer buf)
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(s3);
		
		//char charAt(int index)
		String s4 = "Hello";
		String n = "0123456789";
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		System.out.println("charAt> " + c2);
		System.out.println("charAt> " + c3);
		
		//int compareTo(String str)
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.print(i+"\t"+i2+"\t"+i3+"\n");
		
		//string concat(String str)
		String s5 = "hello";
		String s6 = s5.concat(" world");
		System.out.println(s6);
		
		//boolean contains(CharSequence s)
		String s7 = "abcdefg";
		boolean b1 = s7.contains("bc");
//		String s7 = "abcdefg";
//		boolean b1 = s7.contains("bc d");
		System.out.println(b1);
						
		//boolean endWith(String suffix)
		String file = "hello.text";
		boolean b2 = file.endsWith("txt");
		
		//boolean equals(Object obj)
		String s8 = "hello";
		boolean b3 = s8.equals("HELLO");
		boolean b4 = s8.equals("hello");
		System.out.println(b3+","+b4);
		
		//boolean equalsIgnoreCase(String str)
		String s9 = "hello";
		boolean b5 = s9.equalsIgnoreCase("hello");
		boolean b6 = s9.equalsIgnoreCase("HELLO");
		
		//int indexOf(int ch) -- 주어진 문자가 문자열에 존재하는지 확인하여 index를 알려준다. 못찾으면 -1 반환
		String s10 = "hello";
		int idx1 = s10.indexOf('o');
		int idx2 = s10.indexOf('k');
		System.out.println(idx1 + "," + idx2 );
		
		//int indexOf(int ch, int pos) -- 주어진 문자가 문자열에 존재하는 지정된 위치부터 확인하여 위치를 알려준다. 
		String s11 = "hello";
		int idx3 = s11.indexOf('e',0);
		int idx4 = s11.indexOf('o',2);
		System.out.println(idx3+","+idx4);
		
		//int indexOf(String str) -- 주어진 문자열이 존재하는지 확인하여 그위치를 알려준다. 없으면 -1을 반환한다. 
		String s12 = "ABCDEFG";
		int idx5 = s12.indexOf("CD");
		System.out.println(idx5);
		
		//String intern() -- 문자열을 상수풀에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을경우 그 문자열의 주소값을 반환한다.
		String s13 = new String("abc");
		String s14 = new String("abc");
		boolean b7 = (s13==s14);
		boolean b8 = s13.equals(s14);
		boolean b9 = (s13.intern() == s14.intern());
		System.out.println(b7+","+b8+","+b9);
		
		//int lastIndexOf(int ch) -- 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치를 알려준다. 찾지못하면 -1반환
		String s15 = "java.lang.Object";
		int idx6 = s15.lastIndexOf('.');
		int idx7 = s15.indexOf('.');
		System.out.println(idx6 + "," +idx7);
		
		//int lastIndexOf(String str)
		String s16 = "java.lang.java";
		int idx8 = s16.lastIndexOf("java");
		int idx9 = s16.indexOf("java");
		System.out.println(idx8 +","+idx9);
		
		//int length() --문자열의 길이를 알려준다.
		String s17 = "hello";
		int length = s17.length();
		System.out.println(length);
		
		//String replace(char old, char new) -- 문자열중의 문자를 새로운 문자로 바꾼 문자열을 반환한다.
		String s18 = "hello";
		String s19 = s18.replace('h', 'c');
		System.out.println(s19);
		
		//String replace(CharSequence old, CharSequence new) -- 문자열 중의 문자열을 새로운 문자열로 모두 바꾼후 문자열을 반환
		String s20 = "hellollo";
		String s21 = s20.replace("ll","LL");
		System.out.println(s21);
		
		//String replaceAll(String regex, String replacement) -- 문자열중에서 지정되 문자열과 일치하는 것을 새로운 문자열로 모두 변경
		String s22 = "aabbaabb";
		String r1 = s22.replaceAll("bb","BB");
		System.out.println(r1);
	
		//String replaceFirst(String regex, String replacement) --문자열 중에서 지정된 문자열과 일치하는 것 중, 첫번째 것만 새로운 문자열로 변경
		String s23 = "AABBAABB";
		String r2 = s23.replaceFirst("BB", "bb");
		System.out.println(r2);
		
		//String[] split(String regex) -- 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다. 
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		
		//String[] split(String regex, int limit) -- 문자열을 지정된 분리자로 나누어 문자배열에 담아 반환한다. 단, 문자열 전체를 지정된 수(limit)로 자른다.
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split("", 2);
		System.out.println(Arrays.toString(arr2));
		
		//boolean startWith(String prefix) -- 주어진 문자열로 시작하는지 검사
		String s24 = "java.lang.Object";
		boolean b10 = s24.startsWith("java");
		boolean b11 = s24.startsWith("lang");
		System.out.println(b10+","+b11);
		
		//String substring(int begin)
		//String substring(int begin, int end)
		//주어진 시작위치부터 끝위치에 포함된 문자열을 얻는다. 이때 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		String s25 = "java.lang.Object";
		String z = s25.substring(10);
		String y = s25.substring(5,9);
		System.out.println(z +","+y);
		
		//String toLowerCase() -- string인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환한여 반환
		String s26 = "HELLO";
		String s27 = s26.toLowerCase();
		System.out.println(s26+ " 대문자 -> 소문자 > " + s27);
		
		//String toString() -- string인스턴스에 저장되어 있는 문자열을 반환한다.
		String s28 = "hello";
		String s29 = s28.toString();
		System.out.println(s29);
		
		//String toUpperCase() -- string인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환
		String s30 = "hello";
		String s31 = s30.toUpperCase();
		System.out.println(s30 + "소문자 -> 대문자 > " + s31);
		
		//String trim() --문자열의 왼쪽끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이때 문자열 중간에 있는 공백은 제거되지않는다. 
		String s32 = "a hello world  z";
		String s33 = s32.trim();
		System.out.println(s33);
	
		//지정된 값을 문자열로 변환하여 반환, 참조변수의 경우 tostring을 호출한 결과를 반환
		String boolean_b = String.valueOf(true);
		String char_c = String.valueOf('a');
		String int_i = String.valueOf(100);
		String long_l = String.valueOf(100L);
		String float_f = String.valueOf(10f);
		String double_d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		
		System.out.println(boolean_b);
		System.out.println(char_c);
		System.out.println(int_i);
		System.out.println(long_l);
		System.out.println(float_f);
		System.out.println(double_d);
		System.out.println(dd);
		System.out.println(date);
		
		
		
		
	}
}
