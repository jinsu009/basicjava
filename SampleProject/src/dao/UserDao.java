package dao;

import java.util.*;
import data.Database;
import vo.UserVO;

public class UserDao {

	private static UserDao instance;

	private UserDao() {
	}

	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();

		}
		return instance;
	}

	Database database = Database.getInstance();

	public UserVO selectUser(UserVO param) {
		// 파라미터로 받을 유저와 일치하는 것을 찾는다. ???
		
		UserVO rtnUser = null;
		// 지역변수니까 초기화 해준건다.

		for (int i = 0; i < database.tb_user.size(); i++) {
			UserVO user = database.tb_user.get(i);
			// int a = 1;

			boolean flag = true;

			// 1.id비교
			if (param.getId() != null)
			// 아이디가 null이아니면
			{
				if (!param.getId().equals(user.getId()))
				// 아이디가 일치하지않으면
				{
					flag = false;
					// flag=false로 선언
				}
			}

			// 2.pw비교
			if (param.getPw() != null) {
				if (!param.getPw().equals(user.getPw())) {
					flag = false;
				}
			}

			// 3.이름 비교
			if (param.getName() != null) {
				if (!param.getName().equals(user.getName())) {
					flag = false;
				}
			}

			// 4. if문의 조건식의 기본값은 false이다.
			// 넘기고넘기고 와서 현재 flag=true이다.(전부비교했을때 같은값이 없었다)
			// 아직도 flag가 true라면 if문실행
			if (flag) {
				rtnUser = user;
				// 같은 값을 돌려준다.
				break;
			}
		}

		return rtnUser; // 빈놈(null)을 놀려준다.
	}

	public void insertUser(UserVO user) 
	{
		database.tb_user.add(user);

	}
	// 신규유저값을 넣어준다.

	public ArrayList<UserVO> selectUserList() 
	{

		return database.tb_user;
	}
	// 데이터베이스에 담겨져있는 (이미있는 유저(기존회원))의 값을 반환

}
