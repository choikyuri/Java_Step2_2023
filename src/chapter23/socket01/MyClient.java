package chapter23.socket01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

           Socket s=new Socket("172.16.10.12",3000);

	}

}
