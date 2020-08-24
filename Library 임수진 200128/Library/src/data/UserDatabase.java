package data;

import java.util.ArrayList;

import vo.UserVO;

public class UserDatabase {
	
	 /*private boolean UserType; //회원권한                  0번 인덱스
	    private String userID; //사용자아이디                1번 인덱스  
	    private String userPass; //사용자 비밀번호        2번 인덱스
	    private String userName; //사용자 실명              3번 인덱스
	    private String userPhone; //사용자 휴대전화      4번 인덱스
	    private String userAddress; //사용자 주소        5번 인덱스
	    */	
	
	private static UserDatabase instance;
	private UserDatabase(){};
	
	public static UserDatabase getInstance()
	{
		if(instance == null)
		{
			instance = new UserDatabase();
		}
		return instance;
	}

	public static ArrayList<UserVO> user = new ArrayList<>();
	
	{
		UserVO user = new UserVO();   
	     user.setUserType(true);	
	     //setusertype는 boolean타입이므로 true/false 입력
	     user.setUserID("admin");
	     user.setUserPass("12345");
	     user.setUserName("관리자");
	     user.setUserPhone("010-1234-5678");
	     user.setUserAddress("대전 광역시 중구 대흥동");
	     this.user.add(user);
	     
	     user = new UserVO();
	     user.setUserType(false);
	     user.setUserID("ddj5432");
	     user.setUserPass("1234");
	     user.setUserName("동동주");
	     user.setUserPhone("010-9876-5432");
	     user.setUserAddress("대전 광역시 유성구 봉명동 987-7");
	     this.user.add(user);
	     
	     user = new UserVO();
	     user.setUserType(false);
	     user.setUserID("ldb1572");
	     user.setUserPass("1234");
	     user.setUserName("이동백");
	     user.setUserPhone("010-1231-1572");
	     user.setUserAddress("대전 광역시 유성구 지족동 123-1");
	     this.user.add(user);
	     
	     user = new UserVO();
	     user.setUserType(false);
	     user.setUserID("kth5564");
	     user.setUserPass("1234");
	     user.setUserName("김태희");
	     user.setUserPhone("010-4121-5564");
	     user.setUserAddress("대전 광역시 대덕구 대덕대로 12");
	     this.user.add(user);
	     
	     user = new UserVO();
	     user.setUserType(false);
	     user.setUserID("kth0012");
	     user.setUserPass("1234");
	     user.setUserName("김태희");
	     user.setUserPhone("010-5167-0012");
	     user.setUserAddress("대전광역시 유성구 은구비로 100-223");
	     this.user.add(user);
	     
	     user = new UserVO();
	     user.setUserType(false);
	     user.setUserID("kdw4567");
	     user.setUserPass("1234");
	     user.setUserName("강동원");
	     user.setUserPhone("010-5674-4567");
	     user.setUserAddress("대전광역시 유성구 대학로163번길 67");
	     this.user.add(user);

	}


}
