package z_exam;

public class Exam06 {

	// [6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
	/*
	 * public class SutdaCard { int num; boolean isKwang; }
	 */

	// [6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서
	// 실행결과와 같은 결과를 얻도록 하시오.

	/*
	 * public static void main(String[] args) { SutdaCard card1 = new
	 * SutdaCard(3, false); SutdaCard card2 = new SutdaCard();
	 * 
	 * System.out.println(card1.info()); System.out.println(card2.info()); }
	 * 
	 * class SutdaCard { int num; boolean isKwang;
	 * 
	 * SutdaCard (int num, boolean isKwang) { this.num = num; this.isKwang =
	 * isKwang; } SutdaCard () { this(1,true); // this.num = 1; // this.isKwang
	 * = true; } String info() { return num + (isKwang? "k":""); }
	 */
/*
	// [6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
	// [6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드  getTotal()과 getAverage()를 추가하시오.
	// [6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		// s.name = "홍길동";
		// s.ban = 1;
		// s.no = 1;
		// s.kor = 100;
		// s.eng = 60;
		// s.math = 76;
		// System.out.println("이름:"+s.name);
		// System.out.println("총점:"+s.getTotal());
		// System.out.println("평균:"+s.getAverage());

		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	int getTotal() {

		return kor + eng + math;
	}

	float getAverage() {

		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + math + "," + eng
				+ "," + getTotal() + "," + getAverage();
	}*/
	
//	[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
//	[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
	
// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	/*static double getDistance(int x, int y, int x1, int y1) 
	{
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		
	}
	public static void main(String args[]) 
	{
		System.out.println(getDistance(1,1,2,2));
	}*/
		


//	[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
// 기본메소드를 찾을수 없습니다 라는 오류 발생 - 동작이 안된다. 
/*class MyPoint 
	{
		int x;
		int y;
		
		MyPoint(int x, int y) 
		{
			this.x = x;
			this.y = y;
		}
		double getDistance(int x1, int y1) 
		{
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		}
		
	}
	class Exercise6_7 
	{
		public static void main(String args[]) 
		{
			MyPoint p = new MyPoint(1,1);
			// p와 (2,2)의 거리를 구한다.
			System.out.println(p.getDistance(2,2));
		}
	}*/

//[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.

/*
 * 클래스 변수(Static 변수) :width, height
 * 인스턴스 변수 : kind, num
 * 지역 변수 : k,n,card,args[]
 */

//[6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//      (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
/*	
   class Marine {
		int x=0, y=0; // Marine의 위치좌표(x,y)
		int hp = 60; // 현재 체력
		int weapon = 6; // 공격력
		int armor = 0; // 방어력
	void weaponUp() {
		weapon++;
	}
	void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	}
	A. 공격력,방어력 //void weaponUp()//void armorUp()
	*/


//[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)*
//a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//b. 생성자는 객체를 생성하기 위한 것이다.
//c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
//e. 생성자는 오버로딩 할 수 없다.

//A. B,E

//[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)*
//a. 객체 자신을 가리키는 참조변수이다.
//b. 클래스 내에서라면 어디서든 사용할 수 있다.
//c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
//d. 클래스 메서드 내에서는 사용할 수 없다.

//A.  B - 인스턴스메서드에서만 사용가능

//[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
//a. 메서드의 이름이 같아야 한다.
//b. 매개변수의 개수나 타입이 달라야 한다.
//c. 리턴타입이 달라야 한다.
//d. 매개변수의 이름이 달라야 한다.

//A. 

//[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)*
//long add(int a, int b) { return a+b;}

//a. long add(int x, int y) { return x+y;}
//b. long add(long a, long b) { return a+b;}
//c. int add(byte a, byte b) { return a+b;}
//d. int add(long a, int b) { return (int)(a+b);}

//A. B,C,D

//[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)*
//a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
//b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
//c.초기화 블럭보다 생성자가 먼저 수행된다.
//d.명시적 초기화를 제일 우선적으로 고려해야 한다.
//e.클래스변수보다 인스턴스변수가 먼저 초기화된다.

//A. 

//[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
//a. 기본값-명시적초기화-초기화블럭-생성자
//b. 기본값-명시적초기화-생성자-초기화블럭
//c. 기본값-초기화블럭-명시적초기화-생성자
//d. 기본값-초기화블럭-생성자-명시적초기화

//A. A

//[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. 자동 초기화되므로 별도의 초기화가 필요없다.
//b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
//d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.*****

//A. A,E*****

//[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
//a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
//b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
//c. method2메서드를 호출한 것은 main메서드이다.
//d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
//e. main-method2-method1-println의 순서로 호출되었다.
//f. 현재 실행중인 메서드는 println 뿐이다.

//A. B,C*****(X -> 호출스택의 제일 위에 있는 메서드가 현재 수행중인 메서드이며, 호출스택 안의나머지 메서드들은 대기상태이다.),

//[6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그이유를 설명하시오.
//A-ERROR : 상단에서 이미 INT로 선언하고 초기값이 설정되어 있어서 
//B-ERROR : STATIC이 붙은 메서드에서는 사용할수 없다.
//C-NON-ERROR : STATIC이 붙어있지 않아서 사용할수 있다.
//D-ERROR : STATIC이 붙은 메서드에서는 사용할수 없다.
//E-NON-ERROR : STATIC이 붙어있지 않아서 사용할수 있다.

//[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
//public static void change(String str) {
//str += "456";
//}
//public static void main(String[] args)
//{
//String str = "ABC123";
//System.out.println(str);
//change(str);
//System.out.println("After change:"+str);
//}

	//스트링은 변경이가해졌을때 새로운 걸 만든다.????
	//string class는 배열이 들어있다. 
	//같은 주소를 넘겨받아 주소는 같지만 
	//새로운 객체를 생성했으므로 주소가다시 달라진다.
	//

//[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
	
	/*private static int[] shuffle(int[] original) {
		
		return null;
	}

	public static void main(String[] args)
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
*/
	
//	[6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	/*private static boolean isNumber(String str) 
	{
		
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i) < '0' || str.charAt(i) > '9')
			{
				return false;
			}		
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}*/

//	[6-23] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	/*private static int max(int[] data) 
	{
		if(data == null || data.length==0)
		{
			return -99999;
		}
		int max = data[0];
		
		for(int i  =1;i<data.length;i++)
		{
			if(max<data[i])
			{
				max = data[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args)
	{
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값:"+max(data));
	System.out.println("최대값:"+max(null));
	System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
	}
*/
	
//	[6-24] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	private static int abs(int value) {
		
		return value >= 0 ? value : -value;
	}
	
	public static void main(String[] args)
	{
	int value = 5;
	System.out.println(value+"의 절대값:"+abs(value));
	value = -10;
	System.out.println(value+"의 절대값:"+abs(value));
	}


	
	
}

