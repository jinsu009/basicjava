package g_exception;

import java.io.*;

public class ThrowException {
	
	public static void main(String[] args)
	{
		//20-01-10
		
		/*
		 * << 예외 발생시키기 >>
		 * - throw new Exception();
		 * - throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬수 있다.
		 */
		
	
		IOException ioe = new IOException(); //객체생성
		
		try {
			throw ioe;
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		throw new NullPointerException();
//		System.out.println("이 밑으로는 수행되지 않는다. 예외처리를 해주기 전까지는 ...");
		
		//thorw 객체를 넘겨준다.(new 객체명) 
	}

}
