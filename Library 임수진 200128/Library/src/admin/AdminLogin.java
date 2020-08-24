package admin;

import java.util.ArrayList;
import java.util.Scanner;

import service.AdminUserService;
import vo.UserVO;
import admin.AdminLogin;
import date.Date;
import notice.Notice;
import data.UserDatabase;
import data.Session;
import dao.UserDao;

public class AdminLogin {
	
	private static AdminLogin instance;

	private void AdminLogin() {}

	public static AdminLogin getInstance() {
		if (instance == null) {
			instance = new AdminLogin();
		}
		return instance;
	}
	
	static Scanner s = new Scanner(System.in);

		

	}


