package self;

import java.util.*;

public class BookStore {
	
	public static void main(String[] args)
	{		
		Customer c = new Customer(); //손님을 메인에서 생성
		Book b = new Harry(); 
		//book타입변수에 harry를 넣는다. 
		
		
		System.out.println("소지금 " + c.money + " 원");
		
		
		b.info();
		c.buy(b);
		
		b = new Kim();
		b.info();
		c.buy(b);
		
		c.showItem();
		
		System.out.println("잔여금 " + c.money + " 원");

	}

}

class Book
{
	String title;
	String writer;
	int price;
	
	Book(String title, String writer, int price)
	{
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	void info()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("도서명 : " + title +"저자 : " + writer + "금액 : " + price + " 원");
		System.out.println("---------------------------------------------------------------");
	}
}//책의 정보를 출력할 크래스 생성

//책마다 클래스 생성

class Harry extends Book
{
	Harry()
	{
		super("해리포터와 마법사의 돌","조앤 k 롤링",7000);
	}//book에 값을 넘겨줄 메소드 생성
}

class Kim extends Book
{
	Kim()
	{
		super("82년생 김지영","조남주",11000);
	}
}

//고객생성
class Customer 
{	
	Scanner s = new Scanner(System.in);
	
	String a;
	
	int money = 30000; 
	//손님이 가지고있을 돈을 초기화
	
	Book[] item = new Book[10];
	//장바구니 생성 널널하게 열개정도 담을수있도록
	
	void buy(Book b)
	{
		//부모클래스 book을 타입으로 선언
		//자동으로 형변환이 된다. 
		
		
			System.out.println("책을 구매하시겠습니까? (Y/N)");
			a = s.nextLine();
			
			if(a.equalsIgnoreCase("Y"))
			{
				if(money < b.price)
				{
					System.out.println("돈이 부족합니다.");
				}
				
				else
					money -= b.price;
				for(int i = 0; i<item.length;i++)
				{
					if(item[i] == null)
					{
						item[i] = b;
						break;
					}
				}
				System.out.println(b.title+"을 구매 했습니다. ");
	
			}
			System.out.println();
			System.out.println("최종 잔여금 : "+ money);
			System.out.println();
	}
	
	void showItem()
	{
		System.out.println("---------장바구니----------");
		for(int i = 0; i<item.length;i++)
		{
			if(item[i] != null)
			{
				System.out.println(i + 1 + "."+item[i].title);
			}
		}
		System.out.println("-------------------------");
	}
}
