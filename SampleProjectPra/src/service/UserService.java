package service;


import java.util.*;

import vo.UserVO;

import dao.UserDao;

import data.Session;


public class UserService {


//싱글톤패턴 

private static UserService instance;

//userservice를 instance변수로 선언


private UserService(){}

//생성자를 초기화한다.

public static UserService getInstance()

{

if(instance == null)

//값이 이미 존재할 경우 null을 생성하지 않는다.

{

instance = new UserService();

}

return instance;

}

//객체를 생성하는 메소드

//생성자와 같은 기능을 한다.

//private을 사용해 new를 쓰지 못하므로 private을 선언한 변수를 사용하기 위해

//생성자와 같은 기능을 하도록 메소드로 선언


Scanner s = new Scanner(System.in);


private UserDao userDao = UserDao.getInstance();

//접근권한자 클래스명 변수명 = 클래스명.getInstance();

//singleton패턴의 변수를 받기위해

public void join()

{

//회원가입의 기능이 있는 메소드

UserVO user = new UserVO();

//user변수는 지역변수로 일회용으로 사용하고 말거니까 new로 선언
System.out.println("아이디 : ");

String id = s.nextLine();

user.setId(id);
UserVO userCheck = userDao.selectUser(user);

//아이디 중복검사

//클래스명 변수명 = 클래스명.메소드명(값);

//앞서 넣었던 user의 값을 넣어서 userDao에 있는 메소드를 실행하겠다는 의미

//검사후 아이디가 없으면 회원가입을 한다.

if(userCheck == null)

//null같은게 없으니까 다시 등록

{

System.out.println("비밀번호를 입력하세요 : ");

String pw = s.nextLine();

System.out.println("닉네임을 입력하세요 : ");

String name = s.nextLine();
user.setPw(pw);

user.setName(name);

//user 안에 내가 입력한 pw값과 name값을 저장한다.
userDao.insertUser(user);

//userDao 클래스의 insertUser메소드에 user의 값을 저장


System.out.println("가입해주셔서 감사합니다.");

}

else

{

System.out.println("이미 사용중인 아이디 입니다.");

}

}

public void login()

{

//로그인기능이 담긴 메소드

System.out.println("아이디를 입력하세요 : ");

String id = s.nextLine();

System.out.println("비밀번호를 입력하세요 : ");

String pw = s.nextLine();
UserVO user = new UserVO();

user.setId(id);

user.setPw(pw);

UserVO userCheck = userDao.selectUser(user);

if(userCheck == null)

{

System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.");

}

else

{

System.out.println("로그인되었습니다.");

System.out.println(userCheck.getName() + "님 환영합니다.");

Session.loginUser = userCheck;

//session에 로그인된 user들을 저장 

}

}

public void userList()

{

//저장된 유저들의 정보를 출력하기위한 메소드

ArrayList<UserVO> userList = userDao.selectUserList();

System.out.println("--------------------------------");

System.out.println("번호\t아이디\t이름");

System.out.println("--------------------------------");

for(int i = 0; i < userList.size();i++)

{

UserVO user = userList.get(i);

System.out.println(i+1+"\t"+user.getId()+"\t"+user.getName());

//회원의 번호 , 아이디, 이름을 출력

}

System.out.println("--------------------------------");

}

}

