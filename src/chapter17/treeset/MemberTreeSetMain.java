package chapter17.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		
		Member3 memberPark=new Member3(1003, "박서훤");
		Member3 memberLee=new Member3(1001, "이지원");
		Member3 memberSon=new Member3(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();

	}

}
