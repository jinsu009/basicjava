package h_useful;

import java.text.*;
import java.util.*;

public class DateClass {
	//20.01.10
	
	public static void main(String[] args) {
		Date today = new Date();
		//현재 날짜가 저장된다. 
		
		
		System.out.println(today);
		
		//날짜 -> 출력할 포맷을 정해주고 -> 문자열로 만들어서 출력
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a");
		//대문자 HH :24시간 기준 //소문자 hh : 12시간 기준 ,, a : 오전 오후 출력
		
		System.out.println(sdf1.format(today)); //***형식 중요 
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열을 date객체로 만드는 방법!!
		//문자열 -> 문자열의 포맷 작성 -> date객체로 만들어 날짜
		String str = "2020년 1월 11일";
		
		SimpleDateFormat sdf5 =  new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			//str변수 왜 사용??
			
			System.out.println();
			System.out.println(sdf5.format(today));
			System.out.println();

		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		
		//날짜계산을 해보자!!
		Calendar cal = Calendar.getInstance();
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2020, 0, 10); 
		//2020-01-10 (월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 3);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		System.out.println(sdf3.format(cal.getTime()));
		
	}

}
