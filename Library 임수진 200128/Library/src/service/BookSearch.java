package service;

import java.util.*;
import vo.BookVO;
import dao.BookDao;

public class BookSearch {
	
	private static BookSearch instance;

	// UserService 를 instanceBookService변수로 선언

	private BookSearch() {
	} // 생성자를 초기화 //private접근금지

	public static BookSearch getInstance() {
		if (instance == null)
		// 값이 이미 있으면 null을 생성하지 않는다.
		{
			instance = new BookSearch();// 생성
		}
		return instance;
	}
	public void booksearch() // 책검색 검색안에 수정 및 삭제기능
	{
		//검색할 도서의 코드를 입력받고 
		//해당 도서에 대한 정보가 출력되면
		//해당도서의 정보를 수정할것인지 삭제할것인지 do{switch case: }while; 사용하여 선택
		//수정해야할부분
		int a;

		Scanner s = new Scanner(System.in);
		
		String z;
		
		System.out.println("도서의 코드를 입력하세요");
		z= s.nextLine();
		
		BookDao booklist = BookDao.getInstance();

		ArrayList<BookVO> blist = booklist.selectbooklist(); 
		// null값입력
		
		ArrayList<BookVO> searchbook = new ArrayList<>();
		
		BookVO searchubook2 = new BookVO();
		//serachubook2를 for문밖에서 변수선언..?
		
		for (int i = 0; i < blist.size(); i++)
		// 모든 user가 저장된 길이동안 for문 실행
		{
			searchubook2 = blist.get(i);
			// searchubook2에 user의 모든 값들을 저장
			String ser = searchubook2.getTitle() 
							+ searchubook2.getWriter()  
							+ searchubook2.getCompany()
							+ searchubook2.getCode() 
							+ searchubook2.getPublish();
			boolean o = false;

			for (int j = 0; j < z.length(); j++)
			// 내가 입력한 문자열의 길이만큼 for문 실행
			{
				o = false;

				if (z.substring(j, j + 1) == " ")
				// 만약 내가 입력한 문자열에 null이 있다면 반복문 계속 수행
				{
					continue;
				}

				for (int k = 0; k < ser.length(); k++)
				// ser의 길이만큼 반복문 실행
				{
					if (z.substring(j, j + 1).equals(ser.substring(k, k + 1)))
					// 내가 입력한 문자열을 substring으로 추출하고 ser에 저장된 문자열과 하나하나 비교
					// 조건에 맞으면 o에 true를 입력
					{
						o = true;
						break;
					}
				}
				if (!o)
					break;
			}
			if (o) {
				searchbook.add(searchubook2);
			}
		}

		System.out.println("도서명 : " + searchubook2.getTitle() + "\n"
				+ "저자 : " +searchubook2.getWriter() + "\n" 
				+ "출판사 :" +searchubook2.getCompany()+ "\n"
				+ "도서코드 :" +searchubook2.getCode() + "\n"
				+"출판일 : " +searchubook2.getPublish());
	}

}
