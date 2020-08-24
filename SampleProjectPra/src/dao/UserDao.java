package dao;

import java.util.ArrayList;

import vo.UserVO;

import data.Database;

public class UserDao {

	private static UserDao instance;

	// 접근제한설정 static선언 클래스명 변수명

	// userdao를 instance변수로 선언

	private UserDao() {
	};

	public static UserDao getInstance() {

		if (instance == null)

			instance = new UserDao();

		return instance;

	}

	// 클래스명과 같으니까 생성자

	// getinstance() : singleton패턴을 이용한변수를 받아오기 위해 사용

	Database database = Database.getInstance();

	public UserVO selectUser(UserVO param)

	//

	{

		UserVO rtnUser = null;

		for (int i = 0; i < database.tb_user.size(); i++)

		{

			UserVO user = database.tb_user.get(i);

			boolean flag = true;

			// 1. id비교

			if (param.getId() != null)

			{

				if (!param.getId().equals(user.getId()))

				// user에서 가져온 id의 값과 param의 id값이 일치하지 않으면!

				{

					flag = false;

				}

			}

			// 2. pw비교

			if (param.getPw() != null)

			{

				if (!param.getPw().equals(user.getPw()))

				{

					flag = false;

				}

			}
			if (param.getName() != null)

			{

				if (!param.getName().equals(user.getName()))

				{

					flag = false;

				}

			}

			if (flag)

			{

				rtnUser = user;

				break;

			}

		}

		return rtnUser;
	}

	public void insertUser(UserVO user)

	{

		database.tb_user.add(user);

	}

	public ArrayList<UserVO> selectUserList() {

		return database.tb_user;

	}

}
