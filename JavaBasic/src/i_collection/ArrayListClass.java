package i_collection;

import java.util.*;

public class ArrayListClass {
	//20-01-13
	public static void main(String[] args)
	{
		/*
		 * add() : 마지막 위치에 객체를 추가 
		 * get() : 지정된 위치에 객체를 반환
		 * set() : 지정된 위치에 주어진 객체를 저장(수정) ,, 새로운값이 덮어쓴다.
		 * remove() : 지정된 위치의 객체를 제거
		 * size() : 저장된 객체의 수 반환 ,,, length보단 많이 사용
		 * 
		 */
		
		//지네릭스 670p
		ArrayList<Object> list = new ArrayList<Object>();
		//<지정할 타입을 저장> 지금은 object를 넣었기 때문에 아무거나 저장할수있다. 
		
		list.add(10);
		//add라는 메소드로 값을 저장할수 있다. 
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("abc"); //0번인덱스
		list2.add("123"); //1번인덱스
		list2.add("가나다"); //2번인덱스
		list2.set(1, "456"); //set : 수정 -> 1번인덱스의 값을 456으로 변경
		
		for(int i = 0; i<list2.size();i++) 
			//length -> size 메소드를 호출
		{			
			System.out.println("1)"+list2.get(i));
			//get라는 메소드로 저장된 값을 호출 
		}
		
		list2.remove(0);
		

		//0번인덱스의 값이 삭제가 된다. 
		//리스트에 저장된 값을 삭제하면 그뒤의 모든 값의 인덱스가 당겨진다. 
		
		System.out.println();
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		
		ArrayList<Integer> list4 = new ArrayList<>();
		//list4에 int 형식의 값을 넣는다. 
		
		list4.add(10);
		list4.add(20);
		list4.add(30);
		
		list3.add(list4);
		//list4를 list3에 저장한다 .
		
		list4 = new ArrayList<>();
		list4.add(40);
		list4.add(50);
		list4.add(60);
		
		list3.add(list4);
		
		System.out.println();
		System.out.println("이차원배열 : "+list3);
		System.out.println(list4); //ArrayList의 값을 전부 출력
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 저장해 주세요 
		
		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(500);
		list5.add(600);
		list5.add(700);
		list5.add(800);
		list5.add(9000);
		
		//위에서 만든 ArrayList에 저장된 값들의 합계와 평균을 출력해주세요 
		System.out.println();
		
		int sum = 0;
		float avg = 0;
		
		for(int i = 0 ; i <list5.size();i++)
		{
			sum += list5.get(i);
		}
		
		avg = sum/list5.size();
		System.out.println();
		System.out.println("합 : " +sum+ " // 평균 : " + avg);
		
		//위에서 만든 ArrayList에 저장된 값들 중 최소값과 최대값을 출력해주세요 
		
		int min = list5.get(0);
		int max = list5.get(0);
		
		for(int i = 1; i < list5.size(); i++)
		{
			if(min > list5.get(i))
			{
				int temp = min;
				min = list5.get(i);
			}
			else if(max < list5.get(i))
			{
				int temp2 = max;
				max = list5.get(i);
			}
		}
		System.out.println("최소값 : " + min + " // 최대값 :" + max);
		
	}

}
