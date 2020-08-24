package service;

import java.util.*;

import vo.BookVO;
import vo.UserVO;
import dao.BookDao;
import dao.UserDao;

public class AdminBookService {

	private static AdminBookService instance;

	// UserService 를 instanceBookService변수로 선언

	private AdminBookService() {
	} // 생성자를 초기화 //private접근금지

	public static AdminBookService getInstance() {
		if (instance == null)
		// 값이 이미 있으면 null을 생성하지 않는다.
		{
			instance = new AdminBookService();// 생성
		}
		return instance;
	}

	Scanner s = new Scanner(System.in);

	private BookDao bookDao = BookDao.getInstance();

	// ArrayList<BookVO> bookList = bookDao.selectbooklist();
	// bookvo 객체생성//그 값을 파라미터로 넘겨준다

	// 출력
	public void booklist() {
		ArrayList<BookVO> booklist = bookDao.selectbooklist();

		System.out.println("--------------------------------");
		System.out.println("도서코드\t도서명\t\t\t저자\t\t출판일\t\t출판사");
		System.out.println("--------------------------------");
		for (int i = 0; i < booklist.size(); i++) {
			BookVO book = booklist.get(i);
			System.out.printf("%-6s\t", book.getCode());// 도서코드
			System.out.printf("%-30s\t", book.getTitle());// 제목
			System.out.printf("%-15s\t", book.getWriter());// 저자
			System.out.printf("%-15s\t", book.getPublish());// 출판일
			System.out.printf("%-20s\n", book.getCompany());// 출판사
			}
		System.out.println("--------------------------------");
	}

	public void bookS() {
		int a;
		Scanner s = new Scanner(System.in);

		do {
			
			booklist();
			
			System.out.println();
			System.out.println("------메뉴------");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서수정 및 삭제");
			System.out.println("0. 뒤로가기");
			System.out.println("----------------");
			System.out.println("메뉴에 해당하는 번호 입력 > ");

			a = Integer.parseInt(s.nextLine());

			switch (a) {
			case 1:
				bookjoin();
				break;
			case 2:
				booksearch();
				break;
			case 0:
				break;
			}
		} while (a != 0);

	}

	public void bookjoin() { // 책추가

		BookVO booklist = new BookVO();

		System.out.println("도서코드 : ");
		int code = Integer.parseInt(s.nextLine());
		booklist.setCode(code);


		System.out.println("도서명 : ");
		String title = s.nextLine();
		booklist.setTitle(title);

		System.out.println("저자 : ");
		String writer = s.nextLine();
		booklist.setWriter(writer);

		System.out.println("출판일 : (YYYY.MM.DD)");
		String publish = s.nextLine();
		booklist.setPublish(publish);

		System.out.println("출판사 : ");
		String company = s.nextLine();
		booklist.setCompany(company);

		BookDao.getInstance().insertBook(booklist);
	}

	public void booksearch() // 책검색 검색안에 수정 및 삭제기능
	{	
		//검색할 도서의 코드를 입력받고 
		//해당 도서에 대한 정보가 출력되면
		//해당도서의 정보를 수정할것인지 삭제할것인지 do{switch case: }while; 사용하여 선택
		//수정해야할부분
		//도서코드가 맞지않아도 도서정보가 출력 ;;;
		int a;
		String z;
		Scanner s = new Scanner(System.in);
		
		System.out.println("수정 및 삭제할 도서의 코드를 입력하세요");
		z= s.nextLine();
		
		BookDao booklist = BookDao.getInstance();
		ArrayList<BookVO> blist = booklist.selectbooklist(); 
		ArrayList<BookVO> searchbook = new ArrayList<>();
		BookVO searchubook2 = new BookVO();
		
		searchubook2.setCode(Integer.parseInt(z));
		searchubook2 = booklist.selectbook(searchubook2);
		
		if(searchubook2 != null)
		{
			System.out.println();
			System.out.println("도서명 : " + searchubook2.getTitle() + "\n"
					+ "저자 : " +searchubook2.getWriter() + "\n" 
					+ "출판사 :" +searchubook2.getCompany()+ "\n"
					+ "도서코드 :" +searchubook2.getCode() + "\n"
					+"출판일 : " +searchubook2.getPublish());	
		
		
		
		
		do {
			System.out.println();
			System.out.println("------도서 수정------");
			System.out.println("1. 도서정보 수정");
			System.out.println("2. 도서정보 삭제");
			System.out.println("0. 뒤로가기");
			System.out.println("----------------");
			System.out.println("메뉴에 해당하는 번호 입력 > ");

			a = Integer.parseInt(s.nextLine());
			
			switch (a) {
			case 1:
				do {
					System.out.println();
					System.out.println("무엇을 수정하시겠습니까?");
					System.out.println("1.도서명 수정");
					System.out.println("2.도서저자 수정");
					System.out.println("3.도서출판사 수정");
					System.out.println("4.도서코드 수정");
					System.out.println("5.도서출판일 수정");
					System.out.println("0.뒤로가기");
					System.out.println("----------------");
					System.out.println("메뉴에 해당하는 번호 입력 > ");
					a = Integer.parseInt(s.nextLine());
					System.out.println("변경할 내용을 입력하세요");
					switch (a) {
					case 1:
						titleedit(searchubook2);
						break;
					case 2:
						wriedit(searchubook2);
						break;
					case 3:
						comedit(searchubook2);
						break;
					case 4:
						codeedit(searchubook2);
						break;
					case 5:
						pubedit(searchubook2);
						break;
					case 0:
						break;
					}
					System.out.println("수정된 도서명 : " + searchubook2.getTitle() + "\n"
							+ "수정된 저자 : " +searchubook2.getWriter() + "\n" 
							+ "수정된 출판사 :" +searchubook2.getCompany()+ "\n"
							+ "수정된 도서코드 :" +searchubook2.getCode() + "\n"
							+"수정된 출판일 : " +searchubook2.getPublish());
				} while (a != 0);
				break;
			case 2:
			   delbook(searchubook2);
			   return;
			case 0:
				break;
			}
		} while (a != 0);
		}
		
		else
		{
			System.out.println("검색결과가 없습니다.");
			return;
		}
		
	}
	
	public void titleedit(BookVO searchubook2)
	{
		String b1;
		b1 = s.nextLine();
		searchubook2.setTitle(b1);
		System.out.println("수정되었습니다.  도서명 : " + searchubook2.getTitle());
	}
	public void wriedit(BookVO searchubook2)
	{
		String b2;
		b2 = s.nextLine();
		searchubook2.setWriter(b2);
		System.out.println("수정되었습니다.  저자 : " + searchubook2.getWriter());
	}
	public void comedit(BookVO searchubook2)
	{
		String b3;
		b3 = s.nextLine();
		searchubook2.setCompany(b3);
		System.out.println("수정되었습니다.  출판사 : "+ searchubook2.getCompany());
	}
	public void codeedit(BookVO searchubook2)
	{
		// 도서코드는 int타입이므로 case문안에서 따로 선언
		int b4;
		b4 = (Integer.parseInt(s.nextLine()));
		searchubook2.setCode(b4);
		System.out.println("수정되었습니다.  도서코드 : " + searchubook2.getCode());
	}
	public void pubedit(BookVO searchubook2)
	{
		String b5;
		b5 = s.nextLine();
		searchubook2.setPublish(b5);
		System.out.println("수정되었습니다.  출판일: "+ searchubook2.getPublish());
	}
	public void delbook(BookVO searchbook)
	{
		   
			BookDao.getInstance().delbook(searchbook);
			System.out.println("삭제되었습니다.");
						
	}

	
}
