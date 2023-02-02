package chapter23.socket01;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	//필드 
	ServerSocket ss; //선언
	
	//생성자
	public MyServer() {
		
		try {
			//클라이언트가 접속할때 필요한 포트 번호를 반드시 지정해야하며
			//서비스 포트번호는 3000번대를 사용하는 것이 일반적이다
			ss=new ServerSocket(3000); //서버 준비완료
			System.out.println("서버 완료!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//생성자
	
	@Override
	public void run() {
		
		while(true) {
			//접속자가 올때까지 기다림
			try {
				Socket s=ss.accept();// 접속자를 받아들임	
				String ip=s.getInetAddress().getHostAddress();
				System.out.println(ip +"님 왔다 감!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		MyServer ms=new MyServer();
		ms.start();
		
		//new MyServer().start();
		
	}

}





