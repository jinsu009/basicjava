package data;

import java.util.ArrayList;

import vo.BookVO;



public class BookDatabase {
	private static BookDatabase instance;

	private BookDatabase() {
	};

	public static BookDatabase getInstance() {
		if (instance == null) {
			instance = new BookDatabase();
		}
		return instance;
	}

	public ArrayList<BookVO> booklist = new ArrayList<>();

	/* private String title; //책제목 private String writer; //저자 private String
	 * company; //출판사 private int code; //도서코드 private String publish; //출판일
	 */
	{

		BookVO book = new BookVO();

//		book = new BookVO();
//		book.setTitle("하이컷 Highcut");
//		book.setWriter("편집부");
//		book.setCompany("티온네트워크");
//		book.setCode(000001);
//		book.setPublish("20200128");
//		this.booklist.add(book);
		
		book = new BookVO();
		book.setTitle("철학이 필요한 순간");
		book.setWriter("스벤 브링크만");
		book.setCompany("다산초당 ");
		book.setCode(100001);
		book.setPublish("20190712");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("장회익의 자연철학 강의");
		book.setWriter("장회익");
		book.setCompany("청림출판");
		book.setCode(100002);
		book.setPublish("20190920");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("언어철학");
		book.setWriter("콜린 맥긴");
		book.setCompany("b");
		book.setCode(100003);
		book.setPublish("20191101");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("고요할수록 밝아지는 것들 ");
		book.setWriter("혜민");
		book.setCompany("수오서재");
		book.setCode(200001);
		book.setPublish("20181205");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("바디 : 우리 몸 안내서 ");
		book.setWriter("빌브라이슨");
		book.setCompany("까치(까치글방)");
		book.setCode(300001);
		book.setPublish("20200110");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("식물의 책 ");
		book.setWriter("이소영");
		book.setCompany("책읽는수요일");
		book.setCode(300002);
		book.setPublish("20191025");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("왜 우리는 살찌는가");
		book.setWriter("게리타우브스");
		book.setCompany("알마");
		book.setCode(300003);
		book.setPublish("20200106");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("고양이와 배우는 기발한 미술사");
		book.setWriter("니아굴드");
		book.setCompany("자유의길");
		book.setCode(400001);
		book.setPublish("20190310");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("우리말 문법론 ");
		book.setWriter("고영근,구본관");
		book.setCompany("집문당");
		book.setCode(500001);
		book.setPublish("20180220");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("해리포터와 마법사의 돌");
		book.setWriter("JK롤링");
		book.setCompany("블룸즈베리 퍼블리싱");
		book.setCode(800001);
		book.setPublish("20141218");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("우리가 빛의 속도로 갈 수 없다면");
		book.setWriter("김초엽");
		book.setCompany("허블");
		book.setCode(800002);
		book.setPublish("20190624");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("작가들의 비밀스러운 삶");
		book.setWriter("기욤뮈소");
		book.setCompany("밝은세상");
		book.setCode(800003);
		book.setPublish("20191121");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("설민석의 조선왕조실록");
		book.setWriter("설민석");
		book.setCompany("세계사");
		book.setCode(900001);
		book.setPublish("20160725");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("백범일지");
		book.setWriter("김구");
		book.setCompany("돌베개");
		book.setCode(900002);
		book.setPublish("20051105");
		this.booklist.add(book);

		book = new BookVO();
		book.setTitle("우린 너무 몰랐다");
		book.setWriter("김용옥");
		book.setCompany("통나무");
		book.setCode(900003);
		book.setPublish("20190128");
		this.booklist.add(book);

	}

}
