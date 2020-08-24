package service;

import java.util.*;

import vo.BookVO;
import dao.BookDao;
import dao.OutBookDao;
import service.AdminBookService;
import service.BookSearch;

public class Userbookservice {

	private static Userbookservice instance;
	
	private void Userbookservice(){}
	
	public static Userbookservice getInstance(){
		if (instance == null)
		{
			instance = new Userbookservice();
		}
		return instance;
	}

	
Scanner s = new Scanner(System.in);

private BookDao bookdao = BookDao.getInstance();

public void booklist(){	}



public void bookmain()  //사용자 도서 검색
{
	int a;
	Scanner s = new Scanner(System.in);
	
	AdminBookService.getInstance().booklist();
	
	
	do{
		System.out.println("---------1.도서--------------");
		System.out.println("1.대여");
		System.out.println("2.반납/연장");
		System.out.println("0.뒤로가기");
		System.out.println("-----------------------------");
		
		a = Integer.parseInt(s.nextLine());
		
		switch(a)
		{
		case 1 :
			bookget();
			break;
		case 2 :
			boreex();
			//책 반납 혹은 연장 메소드
			break;
		case 0 :
			break;
		}
	}while(a!=0);
}

public void bookget(){
	BookSearch.getInstance().booksearch();
	//booksearch 메소드를 불러와서 실행 .. 인데 이런식으로 하면 안될듯 
	
	//주환오빠 코드 인데 outbookdao 가 없어서 모르겠다. ㅠㅠ 
	
	/*int a;
	Scanner s = new Scanner(System.in);
	String z;
	System.out.println("수정 및 삭제할 도서의 코드를 입력하세요");
	z= s.nextLine();
	BookDao booklist = BookDao.getInstance();
	ArrayList<BookVO> blist = booklist.selectbooklist(); 
	// null값입력
	ArrayList<BookVO> getbook = new ArrayList<>();
	BookVO searchubook2 = new BookVO();
     
     for(int i = 0; i < bList.size(); i++){
        BookVO book = bList.get(i);
        String ser = book.getCode() + book.getCompany() + book.getTitle() + book.getWriter() + book.getPublish();
        boolean o = false;

        
        for (int j = 0; j < a.length(); j++) {
           o = false;
           if (a.substring(j, j + 1) == " ") {
              continue;
           }

           for(int k = 0; k < ser.length(); k++){
              if (a.subSequence(j, j + 1).equals(ser.substring(k, k + 1)))
		 {
                 o = true;
                 break;
              }
           }
           if(!o) break;
        }
        if(o) {
           sList.add(book);
           book = new BookVO();
        }
        
     }

     OutBookDao oDao = OutBookDao.getInstance();
     System.out.println("-----------------------------------------------------");
     System.out.println("번호\t도서명\t저자\t출판사\t도서코드\t출판일\t반납예정일");
     System.out.println("-----------------------------------------------------");
     for (int i = 0; i < sList.size(); i++) {
        BookVO book = sList.get(i);
        OutBookVO oBook = new OutBookVO();
        oBook = oDao.selectOutBook(book);
        if(oBook == null || oBook.getGiveDate()<returndate> == null){ // 수정
        System.out.println(i + 1 + "\t" + book.getTitle() + "\t"
              + book.getWriter() + "\t" + book.getCompany() + "\t"
              + book.getCode() + "\t" + book.getPublish() + "\t대여가능");
        }else{
        System.out.println(i + 1 + "\t" + book.getTitle() + "\t"
              + book.getWriter() + "\t" + book.getCompany() + "\t"
              + book.getCode() + "\t" + book.getPublish() + "\t"
              + oBook.getGiveDate());
        }
     }
     if (sList.size() != 0) {
        System.out.println("대여할 도서 번호를 입력하세요");
        int r = Integer.parseInt(s.nextLine());

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        BookVO rent = sList.get(r - 1);

        OutBookVO rentO = new OutBookVO();

        rentO.setOutCode(rent.getCode());

        rentO.setRentDate(sdf1.format(cal.getTime()));

        cal.add(Calendar.DAY_OF_MONTH, 14);

           rentO.setGiveDate(sdf1.format(cal.getTime()));

           try {
        rentO.setRenter(Session.loginUser.getUserName());
        } catch (Exception e) {
        }

        oDao.insertOutBook(rentO);
     }*/

	
	System.out.println("대출되었습니다.");
}
	
	
	public void boreex(){
		
		int a;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println();
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 반납");
		System.out.println("2. 연장");
		System.out.println("0. 뒤로가기");
		System.out.println("번호를 입력하세요 > ");
		a = Integer.parseInt(s.nextLine());
		
		switch(a)
		{
		case 1 :
			returnbook();
			break;
		case 2 :
			extendsbook();
			break;
		case 0 :
			break;
		}
		
		}while(a!=0);
		}
	
	public void returnbook()
	{
		System.out.println("반납할 도서를 입력하세요");
		//입력은 전부 코드로?
		
		
	}
	
	public void extendsbook()
	{
		System.out.println("반납을 연장할 도서를 입력하세요");
	}


}
