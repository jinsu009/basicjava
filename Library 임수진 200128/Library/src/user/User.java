package user;

import java.util.*;
import date.Date;

public class User {
	

		// 사용자 로그인 및
		static Scanner s = new Scanner(System.in);
		
		public static void userLogin() {

			System.out.println("아이디를 입력하세요>");
			String a = s.nextLine();
			System.out.println("비밀번호를 입력하세요>");
			a = s.nextLine();
			userMain();
		}

		static public void userMain() {
			int a;
			do {
				System.out.println();
				System.out.println("-------- User 로그인 되었습니다.-------");

				System.out.println("1.도서");
				System.out.println("2.열람실");
				System.out.println("0.로그아웃"); // 첫화면으로돌아가도록
				a = Integer.parseInt(s.nextLine());

				switch (a) {
				case 1:
					bookget();
					break;
				case 2:
					readingroom();
					break;
				case 0:
					System.out.println("로그아웃되었습니다.");
					break;
				}

			} while (a != 0);
		}

		
		static void readingroom() {
			System.out.println("----------------------------------------");
			System.out.println("|  1   |   2   |   3   |   4   |   5   |");
			System.out.println("----------------------------------------");
			System.out.println("좌석번호 입력해주세요.");
			System.out.println("1.선택 완료");
			System.out.println("2.취소");
		}

		
		static void bookget() {
			int a;
			do {
				System.out
						.println("-------------------도서목록-----------------------");
				System.out
						.println("|  도서코드      |   도서명       |   저자      |   대출여부    | ");
				System.out
						.println("------------------------------------------------");
				
				System.out.println("1.검색/대여");
				System.out.println("2.반납/연장");
				System.out.println("0.뒤로가기");
				a = Integer.parseInt(s.nextLine());
				switch (a) {

				case 1:
					new date.Date();
					break;
				case 2:

					break;
				case 0:

					break;

				}

			} while (a != 0);

		}
	
	}
	