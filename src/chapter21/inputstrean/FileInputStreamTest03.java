package chapter21.inputstrean;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args){
      
         try(FileInputStream fis=new FileInputStream("input2.txt")){

        	 byte[] bs=new byte[10]; //버퍼로 활용
        	 
 			 int i;
 			 while((i=fis.read(bs)) != -1) {
 				 //버퍼읽기 : 10개씩 가베지값 출력
 				 for(byte b:bs) {
 					 System.out.print((char)b+" ");
 				 }//10개 출력 완료
 				System.out.println(" : "+i+"바이트 읽음");
 			 }
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
         System.out.println("end");

	}

}
