package chapter18.treemap;


import java.util.Iterator;
import java.util.TreeMap;


import chapter17.treeset.Member3;

public class MemberTreeMap {
	
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer, String>();
	}
	
	public void addMember(Member3 member) {
		
		treeMap.put(member.getMemberId(), member.getMemberName());
	}
	
	
	//removeMember
	 	public boolean removeMember(int memberId) {
			 
			 while(treeMap.containsKey(memberId)) {
				 treeMap.remove(memberId);
					 return true;
				 }
			 System.out.println(memberId+"가 존재하지 않습니다");
			 return false;
		}
		
		//showAllMember
	 	public void showAllMember() {
	 		
	 		Iterator<Integer> ir=treeMap.keySet().iterator();
			while(ir.hasNext()) {
				int key=ir.next();
				String member=treeMap.get(key);
				System.out.println(member);
			}
			System.out.println();
		}
}

