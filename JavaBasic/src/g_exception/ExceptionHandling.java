package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class ExceptionHandling {
	
	public static void main(String[] args)
	{
		//20-01-10
		/*
		 * << 에러 >>
		 * - 컴파일에러 : 컴파일 할 때 발생되는 에러 (빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와는 다르게 동작 (버그)
		 * - 런타임 에러 : 실행시에 발생되는 에러 (우리가 처리할 에러)
		 * 
		 * << 런타임 에러 >>
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다. 
		 * - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리가능)
		 * 
		 * << 예외 >>
		 * - 모든 예외는 Exception 클래스의 자식 클래스 이다. 
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지않는다. (unchecked 예외)
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다. (checked 예외)
		 * 
		 * << 예외처리(try-catch) >>
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다. 
		 * - try { } catch(Exception e) { }
		 * - try 블럭안의 내용을 실행중 예외가 발생하면 catch로 넘어간다. 
		 * - catch의 () 안에는 처리할 예외를 지정해 줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을경우 예외는 처리되지 않는다.  
		 */
		
		try{
		int result = 10 / 0;
		System.out.println(result);
		//정수는 0으로 나눌수 없다. 실행하면 당연히 error이 발생 : runtime error
		//에러가 발생했을때 객체가 생성이 된다. ?? 
		//에러를 잘 읽을수 있어야한다. 
		}
		catch(ArithmeticException | IndexOutOfBoundsException e)
		{ //|를 통해 여러가지 예외를 처리 할 수 있다. 
		//예외를 파라미터로 받아준다.
			//예외 발생시 발생한 예외와 일치하는 catch 블럭이 수행되고 
			//일치하는 catch가 없는 경우 예외는 처리되지 않는다. 
			e.printStackTrace();
			//에러메세지 출력
			}
		//예외가 발생되면 try의 프린트는 넘어가고 catch로 넘어간다. 
		//e.printStackTrace();
		//에러메세지 출력를 출력해준다. 
		catch(NullPointerException e)
		{
			
		}//catch는 이어붙여서 사용할수잇다. 
		catch(Exception e)
		{
			//예상치 못한 예외를 처리 할 수 있다. 
			//모든 예외를 한번에 처리할 수 있다.
			//자주사용된다. 
		}
		
		test1(); //메소드 호출
		
		
		
		}

	private static void test1() {
		test2(); //메소드 호출
		
	}

	private static void test2() {
//		System.out.println(10/0);
		
	
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//클래스 생성
		
		
	}
	}
