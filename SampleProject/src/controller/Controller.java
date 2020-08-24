package controller;

import java.util.*;

import service.UserService;
import vo.UserVO;


public class Controller {
	public static void main(String[] args) 
	{
		/*
		 * 2/3 발표!!!!!!!
		 * 조 소개 > 주제 소개> 주제 선정 배경 > 프로그램 구조 > 시연
		 * 발표자 1명, 도우미 1명
		 * 
		 * Controller : 메뉴선택
		 * Service : 메뉴 기능 수행
		 * Dao : 데이터베이스 접속
		 * VO : 데이터를 담는 클래스 
		 */
		
		new Controller().start();
	}
	
	UserService userService = UserService.getInstance();
	
	
	 void start() 
	 {
		 Scanner s = new Scanner(System.in);
		 
		 int menu;
		 
		 do{
			 System.out.println("------메뉴------");
			 System.out.println("1. 회원가입");
			 System.out.println("2. 로그인");
			 System.out.println("3. 회원목록");
			 System.out.println("0. 프로그램 종료");
			 System.out.println("----------------");
			 System.out.println("메뉴에 해당하는 번호 입력 > ");
			 		
			 menu = Integer.parseInt(s.nextLine());
			 //nextLine => 값을 string으로 준다. 
			 
			 switch(menu) //서비스에 있는 메소드 호출
			 {
			 case 1: //회원가입
				 userService.join();
				 break;
			 case 2: //로그인
				 userService.login();
				 break;
			 case 3: //회원목록
				 userService.userList();
				 break;
			 case 0: //프로그램 종료
				 System.out.println("프로그램 종료");
				 break;
			 }			 
		 }while(menu != 0);
		 //menu == 0 일동안 dowhile이 돌아간다. 
		 
	 } //메소드 생성

}
