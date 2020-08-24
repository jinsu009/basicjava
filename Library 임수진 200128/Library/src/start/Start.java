package start;

import java.text.*;
import java.util.*;
import notice.Notice;
import service.AdminUserService;

public class Start {

	public static void main(String[] args) {
		
		new Start().day();
    		
		new Start().library();

	}
	
	public void day()
	{
		 DateFormat sdFormat = new SimpleDateFormat("yyyy.MM.dd");
         Date nowDate = new Date();
         String today = sdFormat.format(nowDate);
         System.out.println(today);
	}

	void library() {
		Scanner s = new Scanner(System.in);
		
		AdminUserService admin = AdminUserService.getInstance();

		int menu;

		do {
			System.out.println();
			System.out.println("인재도서관 입니다. 무엇을 도와드릴까요?");
			System.out.println("최신 공지사항"); 
			System.out.println("최신 공지사항 짧게 출력하도록 ***");
			System.out.println("베스트셀러(미완)");
			System.out.println("---------------------------------");
			System.out.println("1. 관리자 로그인");
			System.out.println("2. 회원 로그인");
			System.out.println("3. 공지사항");
			System.out.println("0. 종료");
			System.out.println("---------------------------------");
			System.out.println("번호를 입력하세요 >");

			menu = Integer.parseInt(s.nextLine());

			switch (menu)
			{
			case 1: // 관리자 로그인
				admin.getInstance().userlogin();
				break;
			case 2: // 회원 로그인
				admin.getInstance().userlogin();
				break;
			case 3: // 공지사항 확인
				break;
			case 0: // 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}

		} while (menu != 0);

	}
	
	
}
