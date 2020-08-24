package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	
	//200109	

	public static void main(String[] args) {
		// AccessModifier에 접근해보자

		AccessModifier am = new AccessModifier();

		System.out.println(am.publicVar);
		am.publicMethod();

		/*
		 * System.out.println(am.protectedVar); am.protectedMethod();
		 * 
		 * System.out.println(am.defaultVar); am.defaultMethod(); //둘은 다른 패키지에
		 * 있기 때문에 사용이 불가능
		 */
		
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}

	void protectedTest() {
		System.out.println(protectedVar);
		protectedMethod();
		// extends AccessModifier 설정 -> 상속받았으니까 된다.
	} //메소드 생성

}
