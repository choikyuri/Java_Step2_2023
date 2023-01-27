package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;
	
	//생성자를 통한 LinkedList객체 생성
	public MemberHashSet() {
		hashSet=new HashSet<Member2>();
	}
	
	//addMember
 	public void addMember(Member2 member) {
 		hashSet.add(member);
	}
	
	//removeMember
 	public boolean removeMember(int memberId) {
		 Iterator<Member2> ir=hashSet.iterator();
		 
		 while(ir.hasNext()) {
			 Member2 member=ir.next();
			 int tempId=member.getMemberId();
			 if(tempId == memberId) {
				 hashSet.remove(member);
				 return true;
			 }
		 }
		 System.out.println(memberId+"가 존재하지 않습니다");
		 return false;
	}
	
	//showAllMember
 	public void showAllMember() {
		for(Member2 member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
