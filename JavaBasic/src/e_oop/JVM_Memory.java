package e_oop;

public class JVM_Memory {
	/*
	 * 2020-01-06
	 * 
	 * << JVM(Java Virtual Machine) >>
	 *  - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 *  - 운영체제 -> JVM -> 자바프로그램
	 *  - 장점 : 운영체제에 상관없이 실행할 수 있다. 
	 *  - 단점 : 속도가 느리다.
	 *  
	 *  << JVM 메모리 구조 >>
	 *   - Method Area : 클래스가 저장된다. 
	 *   - Call Stack : 현재 호출되어 있는 메서드가 저장된다. 
	 *   - Heap : 객체가 저장된다. 
	 *   
	 *   
	 *   << Method Area : 클래스  >>
	 *   
	 *   ex) staticclass 실행 --->   math.random();을 사용할때
	 *   
	 *   (1)
	 *   Math
	 *   random()
	 *   
	 *   (3)
	 *   system
	 *   out
	 *   
	 *   (5)
	 *   ClassMemeber
	 *   classVar (클래스 변수 값이 들어있다. -> 클래스 변수 변경 으로 바뀜)
	 *   classMethod()
	 *   
	 *   //static이 붙었기때문에 같이 저장이 된다. 
	 *   
	 *   << Call Stack : 실행중인 메서드 >> -> 실행 된 후 삭제 
	 *   
	 *   (2)
	 *   main 메소드가 실행
	 *   main메소드 안에 있는 random() -> 전부 실행 된 후 삭제 된다. 
	 *   
	 *   (4)
	 *   println() -> 실행 된 후 삭제 
	 *  
	 *   (6)
	 *   println() -> 실행 된 후 삭제 
	 *   
	 *   (8)
	 *   println() -> 실행 된 후 삭제 
	 *   instanceMethod -> 실행 된 후 삭제 
	 *   
	 *   (9)
	 *   classVar 출력 -> println() -> 실행 된 후 삭제 
	 *   
	 *   (10)
	 *   classMethod() -> 실행 된 후 삭제 
	 *   
	 *   << Heap : 객체 >>
	 *   (7)
	 *   cm1(classmember) 객체 생성 
	 *   -> instancevar(인스턴스 변수 값이 들어있다.) 호출
	 *   -> instanceMethod
	 *   
	 *   (11)
	 *   cm2(classmember)
	 *   -> instancevar("인스턴스 변수 변경" 값이 들어있다.) 호출
	 *   -> instanceMethod
	 *   
	 *   
	 */
	
	

}
