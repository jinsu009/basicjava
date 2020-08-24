package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AnonymousClass {	

	//200109
	
	public static void main(String[] args) {
		 //익명클래스 교재 410p
		//하나의 부모클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스 
		//주로 GUI를 만들때 사용
		//GUI :  그림을 보고 상용하는 것 
		//CUI/CLI : CONSOL창 처럼 글씨만 보고 사용하는 것 
		
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			
			//addActionListener를 상속받은 자식클래스 
			//기능을 추가할때 익명클래스를 사용한다. 
			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("버튼을 누르면 실행");
				
			}
		}//익명클래스 : 메소드를 상속받아 구현한것 !!
		//이기능은 여기서만 사용하고 다른곳에서 부르지도 않기 때문에 사용한다. -- 고급자바에서 ..??
		
		);
		
	}

}