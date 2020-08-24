package service;

import java.util.*;

import dao.UserDao;
import data.Session;
import vo.UserVO;

public class UserService {

	private static UserService instance;
	//UserService 를 instance변수로 선언
	
	private UserService() {} //생성자를 초기화 //private접근금지

	public static UserService getInstance() {
		if (instance == null)
			//값이 이미 있으면 null을 생성하지 않는다. 
		{
			instance = new UserService();//생성
		}
		return instance;
	}
	//객체를 생성하는 메소드, 생성자와 같은 기능, private을 써서 new를 못사용하므로 private을 사용하기 위해 생성자와같은기능을 하도록 메소드 선언 

	Scanner s = new Scanner(System.in);

	private UserDao userDao = UserDao.getInstance();
	//클래스 변수명 = 클래스.getInstance()
	//클래스 변수명 = new UserDao();....  //비슷한의미
	//재활용할려고

	public void join() {
		// 사용자 정보 입력

		UserVO user = new UserVO();
		//user는 일회용 그니까 new 로 선언

		System.out.println("아이디 : ");
		String id = s.nextLine();

		user.setId(id);
		//idsetting 
		//id = 내가 입력한 id의 값을 넣어두겠다.

		// 아이디중복검사
		UserVO userCheck = userDao.selectUser(user);
		//클래스명 변수명 = 클래스명.메소드명(값);
		//앞서넣었던 user값을 넣어서 메소드를 실행

		
		// 없으면 회원가입
		if (userCheck == null) 
		//같은게 하나도 없으니까 다시 등록
			{
			System.out.println("비밀번호 : ");
			String pw = s.nextLine();

			System.out.println("이름 : ");
			String name = s.nextLine();

			user.setPw(pw);
			user.setName(name);
			
			userDao.insertUser(user);
			System.out.println("가입해주셔서 감사합니다.");
			
		} 
		else {
			System.out.println("아이디 중복");
		}

		// 데이터베이스의 유저테이블에서 동일한 아이디가 있는지 찾아야한다. -- 'DAO'

	}

	// 회원가입
	// 데이터를 묶어서 보내면 파라미터를 여러개 사용하지않아도되는 간편함이 있다.
	// arraylist는 몇번 인덱스에 자료가 있는지 알기 어려움으로 hashmap을 이용한다.
	// 하지만 지금은 class를 사용!! (**데이터의 타입이 다를수도 있기때문에) --'VO'

	public void login() {
		
		//아이디, 비밀번호
		System.out.println("아이디 : ");
		String id = s.nextLine();
		System.out.println("비밀번호 : ");
		String pw = s.nextLine();
		
		UserVO user = new UserVO();
		user.setId(id);
		user.setPw(pw); 
		//user객체에 담는다.
		
		UserVO userCheck = userDao.selectUser(user);
		
		if(userCheck == null)
		{
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}
		else
		{
			System.out.println("로그인되었습니다.");
			System.out.println(userCheck.getName() + "님 환영합니다.");
			//session에 로그인된 유저를 저장 
			Session.loginUser = userCheck;
			
		}
	}

	// 로그인

	public void userList() {
		
		//회원전체의 목록을 가져와야한다. 
		
	ArrayList<UserVO> userList = userDao.selectUserList();
	
	//출력
	
	System.out.println("--------------------------------");
	System.out.println("번호\t아이디\t이름");
	System.out.println("--------------------------------");
	for(int i = 0; i<userList.size();i++)
	{
		UserVO user = userList.get(i);
		System.out.println(i+1+"\t"+user.getId()+"\t"+user.getName());
		//회원의 번호를 1번부터 시작하려고 i+1의 값을 넣은것이다
	}
	System.out.println("--------------------------------");

	}
	// 회원목록

}
