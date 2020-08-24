package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import data.Session;

public class UserService {
	
	private static UserService instance;

	private UserService() {
	} 

	public static UserService getInstance() {
		if (instance == null)
		
		{
			instance = new UserService();// 생성
		}
		return instance;
	}
	
	public void usermain()
	{
		int a;
		Scanner s = new Scanner(System.in);
	do{	
		System.out.println();
		System.out.println("----user로그인----");
		System.out.println("1. 도서 서비스");
		System.out.println("2. 열람실 서비스");
		System.out.println("3. 마이페이지");
		System.out.println("0. 로그아웃");
		System.out.println("번호를 입력해 주세요 > ");
		
		a = Integer.parseInt(s.nextLine());
		
		switch(a)
		{
		case 1 : 
			Userbookservice.getInstance().bookmain();
			break;
		case 2 :
			//열람실
			break;
		case 3 :
			mypage();
			break;
		case 0 :
			System.out.println("로그아웃되었습니다.");
			break;
		}
		
	}while(a!=0);
	}
	
	public void mypage()
	{
		UserVO user = new UserVO();
			
		UserVO userCheck  = UserDao.getInstance().selectUser(user);
		UserDao userDao = UserDao.getInstance();
		
		for(int i=0; i<userDao.selectUserList().size(); i++){
			if(Session.loginUser.getUserID() == userDao.selectUserList().get(i).getUserID())
			{
				System.out.println("ID : "+userDao.selectUserList().get(i).getUserID()+"\n"
						+"PW : "+userDao.selectUserList().get(i).getUserPass() + "\n" 
						+"NAME : "+userDao.selectUserList().get(i).getUserName() + "\n" 
						+"PHONE"+userDao.selectUserList().get(i).getUserPhone() + "\n" 
						+"ADD : "+userDao.selectUserList().get(i).getUserAddress());		
			}
			
		}
	}

}
