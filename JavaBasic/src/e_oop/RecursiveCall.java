package e_oop;

public class RecursiveCall {
	
	//2020-01-07
	
	/*
	 * << 재귀 호출 >>
	 * - 메서드 내에서 메서드 자신을 호출하는 것
	 * - 재귀호출을 하는 메서드를 재귀메서드라고 한다. 
	 * - 무한반복을 벗어나기 위한 조건이 있어야한다. 
	 */

	public static void main(String[] args)
	{
		//팩토리얼 : Q. 4! = 4 * 3 * 2 * 1   A.24
		
		int result = factorial(4);
		System.out.println(result);
		
		
	}
	
	/*
	 * <CallStack>
	 * 
	 * factorial(1) l --> 1 -->     1을 return ↓
	 * factorial(2) l --> 2*factorial(1) --> 2*1
	 * factorial(3) l --> 3*factorial(2) --> 3*2*1
	 * factorial(4) l --> 4*factorial(3) --> 4*3*2*1
	 * main()_____  l
	 *  
	 *  ↓
	 *  
	 * 				l --> 1 -->     1을 return ↓
	 * 	            l --> 2*factorial(1) --> 2*1
	 *  			l --> 3*factorial(2) --> 3*2*1
	 *  			l --> 4*factorial(3) --> 4*3*2*1
	 * main()_____  l
	 * 
	 * 불러들인다는 개념인가 
	 */

	private static int factorial(int i) {
		
		int result = 0;
		
		if(i == 1)
		{
			result = 1;
		}
		else {
			result = i * factorial(i-1);
		}
		
		return result;
	}
}