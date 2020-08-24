package f_oop2.ex_abstract;

public abstract class Animal {	

	//200109	
	
	//동물이 공통적으로 가지고 있는 기능 : 달려가는 메소드 ,, 짖는/울음소리를 내는 메소드
	
	void run() //네발달린 동물이라면 달려가는 모습은 모두 같을것이다. 
	{
		System.out.println("달려간다.");
	}
	
	abstract void bark();
	//동물들의 울음소리는 모두 다를것이므로 추상메소드로 만들어준다.
	//각각의 동물들의 클래스를 선언해 동물마다 다른 구현부를 작성해보자.

}

class Dog extends Animal
{
	@Override
	void bark()
	{
		System.out.println("멍멍!!!!");
	}
}

class Cat extends Animal
{
	@Override
	void bark()
	{
		System.out.println("나옹!");
	}
	
}

class Crow extends Animal
{
	@Override
	void bark()
	{
		System.out.println("까악!");
	}
}