package chapter11;

public class AdvencedLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump를 합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 불가능 합니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****중급자 입니다*****");
		
	}

}
