package chapter22;

public class DaeMonThread_Main implements Runnable{
	
	static boolean autoSave=false; //자동저장기능 잠김
	

	public static void main(String[] args) {
		// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 스레드로 활용 가능하다
		DaeMonThread_Main dm=new DaeMonThread_Main();
		Thread t=new Thread(dm);//스레드 객체로 변환
		
		//데몬스레드로 설정 : 메인이 종료되면 함께 종료됨
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=15;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
			
			if(i==3) //3초 뒤에 저장모드로 전환
				autoSave=true;
		}

	}
   //3초마다 저장을 무한반복
	@Override
	public void run() {
          
		while(true) {
			
			try {
				Thread.sleep(3000); //3초마다
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			
			if(autoSave==true) {
				System.out.println("자동저장 됩니다");
			}
		}

	}

}














