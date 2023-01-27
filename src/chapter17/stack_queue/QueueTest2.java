package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Message> messageQueue=new LinkedList<Message>();
		//offer : 입력
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김유신"));
		messageQueue.offer(new Message("sendKakaotalk", "이순신"));
		
		//poll : 출력
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
				break;
			}
		}

	}

}
