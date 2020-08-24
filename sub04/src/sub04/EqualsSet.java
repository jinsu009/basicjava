package sub04;

import java.util.*;

public class EqualsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1 = new Member("1","mimi");
		Member member2 = new Member("1","i");
		Member member3 = new Member("3","mimi");
		
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(member1);
		memberSet.add(member2);
		
		System.out.println(memberSet);
	}

}
