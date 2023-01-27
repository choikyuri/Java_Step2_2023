package chapter21.inputstrean;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws IOException {
         /*
         try(FileInputStream fis=new FileInputStream("input.txt") ) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
         
		FileInputStream fis=null;
         
         try{
        	 fis=new FileInputStream("input.txt");
 			System.out.println((char)fis.read());
 			System.out.println((char)fis.read());
 			System.out.println((char)fis.read());
 		} catch (IOException e) {
 			e.printStackTrace();
 		}finally {
 			try {
				fis.close();
			} catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
 		}
         System.out.println("end");

	}

}
