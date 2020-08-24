package sub04;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
		
		Set<Integer> lottonum = new HashSet<Integer>();
		
		while(lottonum.size()<6)
		{ //중복된값은 허용을 하지 않으니까 그부분은 생각 하지 않는다.
			lottonum.add((int)(Math.random()*45)+1);
			//1~45까지 중복되지않은 숫자를 lottonum에 넣는다. 
		}
		System.out.println(lottonum);
		
		
		//오름차순정렬
		Set<Integer> lottonum2 = new TreeSet<Integer>();
		while(lottonum2.size()<6)
		{ //중복된값은 허용을 하지 않으니까 그부분은 생각 하지 않는다.
			lottonum2.add((int)(Math.random()*45)+1);
			//1~45까지 중복되지않은 숫자를 lottonum에 넣는다. 
		}
		System.out.println(lottonum2);
	}

}
