package self;

import java.util.*;

class ArrayListP {
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList(10);
		//배열크기가 10인 arraylist 생성
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		//list1의 인덱스 1번부터 4번까지의 값을 list2에 반환하여 출력
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		//list1과 list2의 값들을 정렬
		
		System.out.println("(1) list1.containsAll(list2) : " + list1.containsAll(list2));
		//list1이 list2의 모든 요소를 포함하고 있을때만 true
		
		
		
		list2.add("b");
		list2.add("c");
		//list2에 b와 c를 추가함
		
		list2.add(3,"a");
		//list2의 3번째 인덱스 위치에 a를 넣는다. 
		
		print(list1, list2);
		//출력해보면 원래는 0,2,4,b,c,a 가 나와야 하지만 
		//3번째 인덱스에 a를 넣었으므로 0,2,4,a,b,c,가 된다. 
		
		list2.set(3, "aa");
		print(list1, list2);
		//list2의 3번째 인덱스의 값을 aa로 바꾸어 넣는다. 
		
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. 
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다. 
		for(int i = list2.size()-1; i >= 0; i--)
		{
			if(list1.contains(list2.get(i)))
					{
						list2.remove(i);
					}
		}
		print(list1, list2);
		
	}
	
	static void print (ArrayList list1, ArrayList list2)
	{
		System.out.println("list1 > " + list1);
		System.out.println("list2 > " + list2);
	}
}


