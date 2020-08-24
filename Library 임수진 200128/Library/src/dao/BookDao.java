package dao;

import java.util.*;
import vo.BookVO;
import data.BookDatabase;


public class BookDao {// 싱글톤 객체생성해서 다른테이블에서 부를수 있게 해주는것

	private static BookDao instance;

	private BookDao() {
	}

	public static BookDao getInstance() {
		if (instance == null) {
			instance = new BookDao();

		}
		return instance;
	}

	BookDatabase database = BookDatabase.getInstance();

	public void insertBook(BookVO book) {
		database.booklist.add(book);
	}

	public ArrayList<BookVO> selectbooklist() {
		return database.booklist;
	}
	public void delbook(BookVO book){
		database.booklist.remove(book); //도서제거 
	}
	public BookVO selectbook(BookVO book) {
		for(int i = 0; i < database.booklist.size(); i++){
			if(book.getCode() == database.booklist.get(i).getCode()){
				return database.booklist.get(i);
			}
		}
		return null;

		
	}
}
