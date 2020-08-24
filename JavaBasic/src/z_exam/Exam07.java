package z_exam;

public class Exam07 {	

	//200109
	
//		[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		/*
		 * 정의 : 조상클래스로부터 상속받은 메소드의 내용을 변경하는 것 
		 * 필요성 :  ???? 
		 */
		
//		[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
//				a. 조상의 메서드와 이름이 같아야 한다.
//				b. 매개변수의 수와 타입이 모두 같아야 한다.
//				c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
//				d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
		//A. C,D 교재328P
		


//		[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
//		위해서는 코드를 어떻게 바꾸어야 하는가?

/*class Product
{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product(int price) 
	{
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
class Tv extends Product 
{
	Tv() {
		super(0);
	} 
	
	public String toString() 
	{
		return "Tv";
	}
}
class Exercise7_5 
{
	public static void main(String[] args) 
	{
		Tv t = new Tv();
		System.out.println(t);
	}
}*/


//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?

/*
 * 조상클래스로부터 상속받은 인스턴스변수의 초기화는 조상클래스의 생성자가 처리하기 때문에 ?
 */


//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.

/*class Parent {
	int x = 100;

	Parent() {
		this(200); //순서 1 ->3 파라미터가 없는 생성자 실행 
	}

	Parent(int x) {
		this.x = x;  //순서 2  ->4 파라미터가있는 생성자 호출
	}

	int getX() {
		return x; 
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000); //순서 4  ->1 파라미터가 없는 생성자가 1번으로 실행이 된다.  -> 파라미터가 하나 있는 생성자 호출
	}

	Child(int x) {
		this.x = x; //순서5  ->2 이 안에는 super가 있을텐데 그것은 파라미터 값이 없는 super이다. 
	}
}


	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	} //출력 200
}*/

//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
//것은?
//a. public-protected-(default)-private
//b. public-(default)-protected-private
//c. (default)-public-protected-private
//d. private-protected-(default)-public

//A

//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.옳지 않은 것은? (모두 고르시오)
//a. 지역변수 - 값을 변경할 수 없다.
//b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
//c. 메서드 - 오버로딩을 할 수 없다.
//d. 멤버변수 - 값을 변경할 수 없다.

//B,D  -> C  교재 345P
//c. 메서드 - 오버로딩을 할 수 없다. -> 오버라이딩을 할수 없다. 


//[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할수 없도록 제어자를 붙이고 
//대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.

/*class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {
		if(MAX_CHANNEL > 100 || MIN_CHANNEL <=1)
		{
			return;
		}
		this.channel = channel;
		
	}
	public int getChannel() {
		
	return channel;
		
	}
	public void setVolume(int volume) {
		if(MAX_VOLUME > 100 || MIN_VOLUME <0)
		{
			return;
		}
		this.volume = volume;
	}
	public int getVolume() {
		
		return volume;
	}
}
class Exercise7_10 {
public static void main(String args[]) {
	MyTv2 t = new MyTv2();
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setVolume(20);
	System.out.println("VOL:"+t.getVolume());
}
}*/

//[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.       (xx못했다.)

/*class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) {
		if(MAX_CHANNEL > 100 || MIN_CHANNEL <0)
		{
			return;
		}
		this.channel = channel;
		
	}
	public int getChannel() {
		
	return channel;
		
	}
	public void setVolume(int volume) {
		if(MAX_VOLUME > 100 || MIN_VOLUME <0)
		{
			return;
		}
		prevChannel = this.channel;
		this.volume = volume;
	}
	public int getVolume() {
		
		return volume;
	}
	public void gotoPrevChannel()
	{
		setChannel(prevChannel);
	}
}

public static void main(String args[]) {
	MyTv2 t = new MyTv2();
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setVolume(20);
	System.out.println("VOL:"+t.getVolume());	
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
}
}*/

//[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. public은 접근제한이 전혀 없는 접근 제어자이다.
//b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
//c. 지역변수에도 접근 제어자를 사용할 수 있다.
//d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
//e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.

//C

//[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
/*
 * Math의 클래스의 다양한 메소드는 전부 static로 구현되어 있어서 따로 객체를 생성하지 않고도 사용할수있다. 
 * 
 * 클래스 내에 인스턴스 변수가 하나도 없어서 인스턴스를 생성할 필요가 없기 때문에 생성자가 private 이다.
 */

//[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
//class AirUnit extends Unit {}
//class GroundUnit extends Unit {}
//class Tank extends GroundUnit {}
//class AirCraft extends AirUnit {}
//Unit u = new GroundUnit();
//Tank t = new Tank();
//AirCraft ac = new AirCraft();

//a. u = (Unit)ac;
//b. u = ac;
//c. GroundUnit gu = (GroundUnit)u;
//d. AirUnit au = ac;
//e. t = (Tank)u;   --> 그라운드유닛을 탱크로 형변환 한다. -- 컴파일에러가 발생하지는 않지만 실행했을때 에러가 발생할것이다. 
//f. GroundUnit gu = t;

// E -- 클래스간의 상속관계를 그림으로 그려보면 쉽게 알수 있다. 

//[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
//class FireEngine extends Car implements Movable {}
//class Ambulance extends Car {}
//FireEngine fe = new FireEngine();
//a. fe instanceof FireEngine :T
//b. fe instanceof Movable : T
//c. fe instanceof Object : T
//d. fe instanceof Car : T
//e. fe instanceof Ambulance : F


//[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오. (xx못했다.)
/*abstract calss Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop(){}
}
	
class Marine extends Unit{ 
int x, y; // 현재 위치
void move(int x, int y){}
void stop() {   }
void stimPack() {  }

}
class Tank extends Unit{ 
int x, y; // 현재 위치
void move(int x, int y) {   } 
void stop() {   }
void changeMode() { }
}
class Dropship extends Unit{
int x, y; // 현재 위치
void move(int x, int y) {    }
void stop() {  }
void load() {  }
void unload() {   }
}*/


//[7-20] 다음의 코드를 실행한 결과를 적으시오.
/*class Exercise7_20 {
public static void main(String[] args) {
Parent p = new Child();
Child c = new Child();
System.out.println("p.x = " + p.x);
p.method();
System.out.println("c.x = " + c.x);
c.method();
}
}
class Parent {
int x = 100;
void method() {
System.out.println("Parent Method");
}
}
class Child extends Parent {
int x = 200;
void method() {
System.out.println("Child Method");
}
}*/
/*
 * 출력 : p.x = 100 ,, child Method // c.x = 200 ,, child Method
 */

}