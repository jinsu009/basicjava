package i_collection;

import java.util.*;

public class HashMapClass {
	//20-01-13
	public static void main(String[] args)
	{
		//교재 644p
		//데이터베이스와 많이 사용????
		
		/*
		 * hashmap은 인덱스 번호가 아닌 키에 저장을 한다. 
		 * 키는 순서가 없다. 
		 * put() : 지정된 키와 값을 저장
		 * get() : 지정된 키의 값을 반환 (없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거 
		 * keyset() : 저장된 모든 키를 set으로 반환 
		 */
		
		HashMap<String, String> map =  new HashMap<String, String>();
		//키와 값을 쌍으로 정해야 하기 때문에 지네릭을 2개 넣어준다. 
		//키는 일반적으로 string 타입을 넣어준다. 
		
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "홍길동");
		map.put("date", "2020-01-13 10:33");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
//		for(int i = 0; i<map.size();i++)
//		{
//		System.out.println(map.get(i));
//		}
		
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		//key는 값을 하나 저장할 수 있다. 
		//user의 값이 홍길동에서 이순신으로 바뀐다. 
		
		map.remove("user");
		//user의 값과 key값이 같이 지워진다. 
		System.out.println(map.get("user"));
		
		//저장된 모든 키를 받는 메소드
		Set<String> keys = map.keySet();
		//모든 값을 얻을수가 있다. 
		
		System.out.println();
		for(String key : keys)
		{
			String value = map.get(key);
			System.out.println(key + " : " + value);
			
		}
		
		
		//데이터베이스의 테이블을 토대로 hashmap에 담아보자 
		
		HashMap<String, String> a =  new HashMap<String, String>();  
		//해쉬맵 하나만들고 변수 선언 
		//변수안에 값들을 저장
		
		a.put("LPROD_ID","1");
		a.put("LPROD_GU","P101");
		a.put("LPROD_NM","컴퓨터제품");
		
		ArrayList<HashMap<String,String>> list = new ArrayList<>();
		//
		list.add(a);
				
		a =  new HashMap<>();
		//위에서 사용한 변수를 재활용
		//새로운 객체를 생성
		a.put("LPROD_ID","2");
		a.put("LPROD_GU","P102");
		a.put("LPROD_NM","전자제품");
		list.add(a);
		
		a =  new HashMap<>();
		a.put("LPROD_ID","3");
		a.put("LPROD_GU","P201");
		a.put("LPROD_NM","여성캐쥬얼");
		list.add(a);
		
		
		a =  new HashMap<>();
		a.put("LPROD_ID","4");
		a.put("LPROD_GU","P202");
		a.put("LPROD_NM","남성캐쥬얼");
		list.add(a);
		
		a =  new HashMap<String, String>();
		a.put("LPROD_ID","5");
		a.put("LPROD_GU","P301");
		a.put("LPROD_NM","피혁잡화");
		list.add(a);
			
	
	System.out.println();
	System.out.println("--------------------------------------------");
	for(String key : list.get(0).keySet())
		//컬럼명 = key 
		//리스트에서 key를 받아온것
		//컬럼명만 출력
	{
		System.out.print(key + "\t");
	}
	System.out.println();
	System.out.println("--------------------------------------------");
	for(int i = 0 ; i<list.size(); i++)
		{
			HashMap<String, String> m = list.get(i);
			Set<String> keySet = m.keySet();
			Iterator<String> itr = keySet.iterator();
			while(itr.hasNext())
			{
				String key = itr.next();
				String value = m.get(key);
				System.out.print(value+"\t\t");
			}
	
//	for(HashMap <String,String> m : list)
//		//리스트에서 하나씩 꺼내서 담는것 그것은 해쉬맵
//		//해쉬맵의 값을 다 출력하기위한 것 
//	{
//		for(String key : m.keySet())
//			
//		{
//			System.out.print(m.get(key)+"\t\t");
//		}
//		System.out.println();
//	}
	System.out.println("--------------------------------------------");
	
	//꼭 향상된 for문을 안써도 된다. ??? ㅠㅠ 
	
		}
	System.out.println("--------------------------------------------");
		
	}
}



