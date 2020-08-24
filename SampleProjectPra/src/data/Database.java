
package data;

import java.util.*;

import vo.UserVO;

//vo패키지의 uservo클래스를 불러들인다.

public class Database {

//싱글톤패턴..???

private static Database instance;

//접근권한자 static설정 클래스이름 변수명

//database를 instance로 선언

private Database(){};

//객체초기화? 생성자초기화?
public static Database getInstance()

{

if(instance == null)

//조건에 충족하면 instance에 database의 값을 새롭게 저장

instance = new Database();
return instance;

}

public ArrayList<UserVO> tb_user = new ArrayList<>();

	{
	UserVO user = new UserVO();
	user.setId("admin");
	user.setPw("1234");
	user.setName("관리자");
	tb_user.add(user);
	
	//arraylist 에 새로운 회원을 입력
	user = new UserVO();
	user.setId("jinsu");
	user.setPw("12345");
	user.setName("진수");
	tb_user.add(user);
	

}

}