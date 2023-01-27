package chapter22;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		System.out.println("메인 클래스 시작!");
		Thread_Inter_Main t1=new Thread_Inter_Main();
		//t1.run();
		Thread mThread=new Thread(t1); //일반 클래스의 객체를 스레드로 변환
		mThread.start();
		System.out.println("메인 클래스 종료!");
	}

	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}
	
	public void first() {
		System.out.println("first() 메서드 수행!");
		second();
	}
	
	public void second() {
		System.out.println("second() 메서드 수행!");
	}

}

/*  //일반 메서드(run()) 호출
 	메인 클래스 시작!
	run() 메서드 수행!
	first() 메서드 수행!
	second() 메서드 수행!
	메인 클래스 종료!
	
	//스레드화된 클래스로(start()) 실행
	메인 클래스 시작!
	메인 클래스 종료!
	run() 메서드 수행!
	first() 메서드 수행!
	second() 메서드 수행!
 */









