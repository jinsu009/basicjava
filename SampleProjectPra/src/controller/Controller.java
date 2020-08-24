package controller;

import java.util.*;

import service.UserService;


public class Controller {
	//메인을 담을 콘트롤러 클래스 생성
	//사용할 변수들을 저장할 vo클래스생성 - 변수설정 -getset메소드 생성
	//Database에서 회원들을 저장할 배열을 설정하고 관리자(admin)값을 넣어준다.
	//UserDao에서 id와 pw,name을 매칭
	//userservice에서 회원가입,로그인,회원목록을 출력하는 기능을 하는 메소드 생성

	
	public static void main(String[] args) 

	{

	new Controller().start();

	}

	UserService userService = UserService.getInstance();
	void start()

	{

	Scanner s = new Scanner(System.in);
	int a;
	do

	{

	System.out.println("----메뉴----");

	System.out.println("1.회원가입");

	System.out.println("2.로그인");

	System.out.println("3.회원목록");

	System.out.println("0.프로그램 종료");

	System.out.println("-----------");

	a = Integer.parseInt(s.nextLine());

	switch(a)

	{

	case 1 : 

	userService.join();

	break;

	case 2 :

	userService.login();

	break;

	case 3 :

	userService.userList();

	break;

	case 0 : 

	System.out.println("프로그램 종료");

	break;

	}

	}while(a!=0);

	}



}
