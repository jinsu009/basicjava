package h_useful;

public class MathClass {
	//20-01-10
	public static void main(String[] args)
	{
		
		/*
		 * round() : 반올림 .. 소수점 첫째자리에서 반올림  -> 가까운정수
		 * ceil() : 올림
		 * floor() : 내림
		 * abs() : 절대값
		 * random() : double 난수 발생 (0.0~1.0 미만)
		 */
	
		//math.randomclass  -- 제일 많이 사용했다
		//math.abs -- 행맨에서 사용!
		
		double d1 = 0.55;
		double d2 = -0.55;
		
		System.out.println(Math.round(d1)); //출력값 1
		System.out.println(Math.round(d2)); //출력값 -1
		
		System.out.println(Math.ceil(d1)); //출력값 1.0
		System.out.println(Math.ceil(d2)); //출력값 -0.0
		
		System.out.println(Math.floor(d1)); //출력값 0.0
		System.out.println(Math.floor(d2)); //출력값 -1.0
				
		System.out.println(Math.abs(d1)); //출력값 0.55
		System.out.println(Math.abs(d2)); //출력값 0.55	
		
		for(int i = 0; i<30; i++)
		{
			int random = getRandom(5,10);
			System.out.print(random + " ");
		}
	}
	
	public static int getRandom(int from, int to)
	{
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}
}
