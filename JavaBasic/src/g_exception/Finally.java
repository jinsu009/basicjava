package g_exception;

import java.io.*;

public class Finally {
	
	public static void main(String[] args){
	
	//20-01-10
	
	/*
	 * 교재 - 434p
	 * << finally >>
	 * - 필요에 따라 try-catch 뒤에 finally를 추가 할 수 있다. 
	 * - finally는 예외의 발생 여부와 상관 없이 가장 마지막에 수행된다. 
	 *  
	 *  << 자동 자원 반환 (try-with-resource) >>
	 *  - try(변수 선언; 변수 선언){} catch(Exception e){}
	 *  - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면  try블럭 종료시 자동으로 반환된다. 
	 *
	 * - try의 {}이 실행이 되다 오류가 나면 그 밑으로는 전혀 실행되지 않는다. 
	 * 하지만 반드시 출력해야 할(실행해야할) 문장이 있으면 그것을  finally의 {}안에 입력해준다.
	 *
	 */
	
		FileInputStream fis = null; //파일읽기
		
		try {
			fis = new FileInputStream("file.txt");//사용 후 닫아줘야 하는 객체
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} finally
		{
			//예외 발생과 상관없이 반드시 처리해야 하는 내용을 넣어준다. 
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//예외 발생 : try -> catch -> finally
		//예외 미발생 : try -> finally
		
		//자동 자원 반환 (jdk1.7버전부터 사용이 가능)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt"))
		{
			//파일 쓰기 
			String str = "강아지는 멍멍멍 , 고양이는 냐옹냐옹";
			byte[] bytes = str.getBytes();
			for(int i = 0 ; i < bytes.length;i++)
			{
				fos.write(bytes[i]);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
