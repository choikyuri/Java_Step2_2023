package chapter21.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    //입출력 클래스 중에서 유일하게 입출력이 동시에 가능한 클래스
	//포인터를 이용하여 동시에 입출력이 가능하다
	//다양한 자료형 메소드 제공
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf=new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);//4
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		rf.writeDouble(3.14);//8
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		rf.writeUTF("눈이옵니다");//한글자당 3바이트 3*5+2(null)=17
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		
		int i=rf.readInt();
		Double d=rf.readDouble();
		String u=rf.readUTF();
		
		System.out.println("-----------");
		System.out.println("파일 포인터의 위치 : "+rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(u);

	}

}





