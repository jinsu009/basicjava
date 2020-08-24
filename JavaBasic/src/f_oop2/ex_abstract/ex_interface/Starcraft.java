package f_oop2.ex_abstract.ex_interface;

public class Starcraft {	

	//200109	

	public static void main(String[] args) {
	
		//저그 테란 프로토스 
		//테란 scv 의 기능 기계유닛 수리 , 건물짓기 , 미네랄채광
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
		//scv.repair(marine); 
		//Repairble을 상속받지 않아서 오류가 난다. 
		scv.repair(tank); 
		scv.repair(dropship); 
		scv.repair(scv); 
	}

}

//유닛들이 공통적으로 가지고 있는 속성을 부모클래스로 만들어보자
class Unit 
{
	int hp; //현재체력
	final int MAX_HP;// 최대 체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}//생성자 
}

class Marine extends Unit
{
	//부모클래스의 생성자를 보면 파라미터가 있는데 그것을 클래스에 넣어주어야 한다. 
	Marine()
	{
		super(40);
	}//생성자를 선언해서 파라미터값을 넣어준다. 
	//마린의 체력은 40
}//인간이니까 scv가 수리할수없다. 

class Tank extends Unit implements Repairble
{
	Tank()
	{
		super(150);
	}
	//탱크의 체력은 150
}

class Dropship extends Unit implements Repairble
{
	Dropship()
	{
		super(125);
	}
}

class SCV extends Unit implements Repairble
{
	SCV()
	{
		super(60);
	}
	
	//수리의 기능을 가지는 메소드를 만들어보자 
	void repair(Repairble r)
	{
		//파라미터로 받은 유닛을 수리할것이다. 
		//마린을 제외한 탱크와 드롭쉽만 받아야한다. -- 이럴때 interface사용
		if(r instanceof Unit) 
			//instanceof :
			//unit 으로 형변환이 가능한지 확인
		{
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP)
			{
				u.hp++;
			}
		}
	}
}

interface Repairble
{
	//이타입을 scv 안에 repair의 메소드안에 상속해준다. 
	//아무런 멤버가 없어서 파라미터를 받아와 봤자 아무것도 할수없기 때문에 형변환을 해줘야 한다. 유닛으로!!!
}//인터페이스 생성 하고 scv와 scv가 치료할수있는 탱크와 드롭쉽에게 상속해준다. 