package f_oop2;

public class Store {
	
	public static void main(String[] args)
	{
		Customer c = new Customer(); //손님생성
		
		Product p = new Desktop();
		//product 타입 변수에 desktop을 넣는다. 
		p.info();
		c.buy(p);
		//메서드를 호출해서 바로위의 데스크탑을 넘겨준다. 
		
		p = new TV();
		p.info();
		c.buy(p);
		
		//p라는 변수에 tv도 들어가고 desktop도 들어가는 건 상속덕분이다. !!
		
		c.showItem();
		
	}//메인 메소드

}

class Product{
		String name;
		int price;
		
		//name과 price를 사용하기 위해 product 라는 클래스로 묶고있는 것이다. 
		
		Product(String name, int price)
		{
			this.name = name;
			this.price = price;
		} //생성자 선언(파라미터 : 타입 변수명)
		
		void info()
		{
			System.out.println("----------------------");
			System.out.println("상품명 : " + name);
			System.out.println("금 액 : " + price + "원");
			System.out.println("----------------------");
		} //메소드 생성
		
} //클래스생성

class Desktop extends Product{
	Desktop(){
		super("삼성컴퓨터 " , 500000); //부모클래스의 생성자 호출
	}//메소드
} //클래스생성


class TV extends Product{
	TV(){
		super("LG TV" , 1000000);
	}
}

class Customer{
	//손님생성
	int money = 200000000;
	Product[] item = new Product[10]; //장바구니
	
	void buy(Product p){
		//사는기능 메소드
		//부모클래스인 product타입으로 선언한다.
		//product타입으로 형변환이 되서 넘어간다. 
		
		if(money < p.price)
		{
			System.out.println("돈이 부족하다.");
			return;
			//void타입에서 메서드가 리턴이되면 끝나게 된다. ??
		}
		
		money -= p.price;
		
		for(int i = 0 ; i <item.length;i++)
		{
			if(item[i] == null)
			{
				item[i] =p;
				break;
			}
		}
		
		System.out.println(p.name + "을 구매했다.");
		
	} //메소드: 타입 메소드명(){}
	
	void showItem()
	{
		System.out.println("-----장바구니-----");
		for(int i = 0; i < item.length; i++)
		{
			if(item[i] != null)
			{
				System.out.println(i+1+". "+item[i].name);
			}
		}
		System.out.println("----------------");
	}//메소드
}
