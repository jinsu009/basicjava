package data;

import java.io.IOException;
import java.util.*;

import vo.UserVO;

public class Database {

	
	//한번 생성한 데이터를 싱글턴패턴으로 만들어준다. ??
	
	private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() 
	{
		if(instance == null)
		{
			instance = new Database();
			
		}
		return instance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<>();
	//arraylist 유저테이블
	//UserVO의 뭉쳐있는 객체들이 tb_user이라는 arraylist에 저장 
	
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPw("12345");
		user.setName("관리자");
		tb_user.add(user);
		//한명의 유저가 테이블에 들어간다. 
	}
	
	
}
