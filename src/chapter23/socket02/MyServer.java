package chapter23.socket02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	
	ServerSocket ss;
	
	public MyServer() {
		
		try {
			ss=new ServerSocket(3001);
			System.out.println("서버 시작!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new MyServer().start();

	}

	   //Thread 
		@Override
		public void run() {	
			while(true) {
				try {
					Socket s=ss.accept(); //접속 대기
					BufferedReader reader=new BufferedReader(new InputStreamReader(s.getInputStream()));
					
					String msg=reader.readLine(); //접속자 메세지
					String ip=s.getInetAddress().getHostAddress();
					System.out.println(ip+" : "+msg);
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}//run
	
	}
}



