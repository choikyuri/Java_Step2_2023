package chapter17.hashset;


import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//순서 O, 중복 O
		MemberHashSet  memberHashSet=new MemberHashSet();
		
	    //팀원들의 정보
		Member2 memberLee=new Member2(1001, "이지원");
		Member2 memberSon=new Member2(1002, "손민국");
		Member2 memberPark=new Member2(1003, "박시훤");
		Member2 memberHong=new Member2(1004, "홍길동");
		//회원가입
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		//방법1
		//Member2 memberKim=new Member2(1003, "박시훤");
		//방법2
		Member2 memberKim=new Member2(1003, "김진수");
		memberHashSet.addMember(memberKim);
			
		memberHashSet.showAllMember();

	}


}
