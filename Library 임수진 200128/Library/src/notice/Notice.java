package notice;

import java.util.Scanner;


public class Notice {
	public static void noticeall() {
		System.out.println();
		System.out.println("-------------------공지목록-----------------------");
		System.out
				.println("|   제목	  | 		내용 		   				  |    날짜   	   |  작성자    | ");
		System.out
				.println("| 설 휴무 공지 | 2020.01.24-26 (4일간) 휴무입니다.	  |  20200105  |  운영자    | ");
		System.out.println("------------------------------------------------");
	}

	public static void notice() {
		int a;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println();
			System.out
					.println("-------------------공지목록-----------------------");
			System.out
					.println("|   제목	  | 		내용 		   |   날짜      	|  작성자    | ");
			System.out
					.println("| 개강일         | 안녕   			   |  20200105  |  운영자    | ");
			System.out
					.println("------------------------------------------------");
			System.out.println("1.공지등록");
			System.out.println("2.공지수정및삭제");
			System.out.println("0.뒤로가기");
			a = Integer.parseInt(s.nextLine());

			switch (a) {
			case 1:
				noticeadd();
				break;
			case 2:
				noticemanage();
				break;
			case 0:
				break;
			}

		} while (a != 0);
	}

	static void noticeadd() {
		System.out.println("공지사항 추가해주세요.");
	}

	static void noticemanage() {
		Scanner s = new Scanner(System.in);

		int a;
		System.out.println();
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		System.out.println("0. 뒤로가기");
		a = Integer.parseInt(s.nextLine());

		do {
			switch (a) {
			case 1:
				System.out.println("수정하세요");

				break;
			case 2:
				System.out.println("삭제하세요");

				break;
			case 0:
				break;
			}

		} while (a != 0);

	}
	
	

}

