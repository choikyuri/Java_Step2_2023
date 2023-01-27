package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		//순서 O, 중복 O
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
	    //팀원들의 정보
		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박시훤");
		Member memberHong=new Member(1004, "홍길동");
		//회원가입
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		
		memberLinkedList.showAllMember();
		
		Member memberKim=new Member(1003, "김서우");
		memberLinkedList.addMember(memberKim);
			
		memberLinkedList.showAllMember();

	}

}
