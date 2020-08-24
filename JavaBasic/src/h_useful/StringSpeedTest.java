package h_useful;

public class StringSpeedTest {
	
	//20-01-10
	//string 문자열을 다루기위한 클래스 --문자열을 바꾸기 위해서는 새로운 클래스를생성한다. 
	//객체를 계속 생성하기 때문에 속도가 느리다. 
	
	public static void main(String[] args)
	{
		/*String str="a";
		//실행되는 시간을 체크해보자
		long start = System.currentTimeMillis();
		for(int i = 0; i<200000; i++)
		{
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");*/
		
		
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i<200000; i++)
		{
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		//StringBuffer -->  .append 짝꿍
		//스트링을 많이 변경시킬상황이 온다면 이걸사용한다. 
		
		
		
		
	}

}
