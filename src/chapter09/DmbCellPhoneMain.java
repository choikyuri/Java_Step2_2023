package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone=new DmbCellPhone("Java폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.model);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		//CellPhone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕!! 점심은 뭐먹을까? ");
		dmbCellPhone.sendVoice("아무꺼나 ");
		dmbCellPhone.hangUp();
		System.out.println();
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(5);
		dmbCellPhone.turnOffDmb();

	}

}
