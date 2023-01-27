package chapter17;

public class Member2 {
	
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;

	}
	
    //물리적 값
	@Override
	public int hashCode() {
		//memberName.hashCode() : String이므로 10진수
		//return super.hashCode(); //10진수 메모리 주소
		//방법1
		//return memberName.hashCode()+memberId;
		//방법2
		return memberId;
	}

	//논리적인 값
	/*방법1 이름과 아이디 일치
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member=(Member2)obj;
			return member.memberName.equals(memberName) && (member.memberId==memberId);
		}else {
			return false;
		}
	}*/
	//방법2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member=(Member2)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	} 

	@Override
	public String toString() {
		
		return memberName +"회원님의 아이디는 "+memberId+"입니다.";
	}

	
	
	
	
	
}
