package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;


import chapter17.Member2;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer, String>();
	}
	
	public void addMember(Member2 member) {
		
		hashMap.put(member.getMemberId(), member.getMemberName());
	}
	
	
	//removeMember
	 	public boolean removeMember(int memberId) {
			 
			 while(hashMap.containsKey(memberId)) {
				 hashMap.remove(memberId);
					 return true;
				 }
			 System.out.println(memberId+"가 존재하지 않습니다");
			 return false;
		}
		
		//showAllMember
	 	public void showAllMember() {
	 		
	 		Iterator<Integer> ir=hashMap.keySet().iterator();
			while(ir.hasNext()) {
				int key=ir.next();
				String member=hashMap.get(key);
				System.out.println(member);
			}
			System.out.println();
		}
}

