package sub04;

import java.util.*;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> set = new HashSet<Integer>();
		//교재 631p 
		
		//abstract 사용이유 : property...프로펄티... 값이 들어가 있어성.....(교재 658p)
		//순서가 없기때문에 특별한 값을 추출할수 없다. ... 
		
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(0);
		
		System.out.println(set);
		System.out.println(set.toString());
		//굳이 tostring을 하지 않아도 배열의 값이 출력된다. 
		
		Iterator<Integer> it = set.iterator();
		//interface라서 못사용??
		
		
		int sum = 0;
		
		//set안에 값이 없을때 까지 꺼내야 하므로 while문 사용
		while(it.hasNext())
		{
			sum += it.next();
			System.out.println("while : " + sum);
		}
		
		System.out.println(sum);
	
		
		//lotto
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		for(int i = 1; i<lotto.size();i++)
		{
			
			lotto.add((int)(Math.random()*45)+40); 
//			scores[i][j+1] = (int)(Math.random()*51)+50;		
		}		
		System.out.println(lotto.toString());
		for(int j = 1; j<7;j++)
		{
			System.out.print(j+"\t");
		}
	}

}
