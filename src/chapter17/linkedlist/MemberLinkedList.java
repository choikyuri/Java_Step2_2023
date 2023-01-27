package chapter17.linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;
	
	//생성자를 통한 LinkedList객체 생성
	public MemberLinkedList() {
		linkedlist=new LinkedList<Member>();
	}
	
	//addMember2
 	public void addMember(Member Member) {
 		linkedlist.add(Member);
	}
	
	//removeMember2
 	public boolean removeMember2(int MemberId) {
		 Iterator<Member> ir=linkedlist.iterator();
		 
		 while(ir.hasNext()) {
			 Member Member=ir.next();
			 int tempId=Member.getMemberId();
			 if(tempId == MemberId) {
				 linkedlist.remove(Member);
				 return true;
			 }
		 }
		 System.out.println(MemberId+"가 존재하지 않습니다");
		 return false;
	}
	
	//showAllMember2
 	public void showAllMember() {
		for(Member Member:linkedlist) {
			System.out.println(Member);
		}
		System.out.println();
	}

}
