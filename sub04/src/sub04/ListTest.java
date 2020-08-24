package sub04;

import java.util.*;

public class ListTest {
	
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		list1.add(1);  //0번지
		list1.add(2);
		list1.add(3.0);
		list1.add(4f);
		list1.add('a');
		list1.add("b");
		list1.add(true);
		list1.add(6l);
			
//		System.out.println((Integer)list1.get(5));
		
		//object = 객체
		System.out.println((Integer)list1.get(0)+(Integer)list1.get(1));
		//제네릭 이 없어서 object이기때문에 error -> num의 type에 맞게 형변환
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		
		System.out.println(list2.get(0)+list2.get(1));
		//array에서 이미 integer로 선언했기대문에 출력문에서는 형변환을 하지 않아도 된다. 
		
		
		
		
		
	}

}
