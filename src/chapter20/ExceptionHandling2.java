package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	

	public static void main(String[] args) {

		FileInputStream fis=null;
		//try catch사용
		//fis=new FileInputStream("a.txt");
		
		try { //open
			fis=new FileInputStream("a.txt"); 
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			try { //close
				fis.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finally");
		}
		System.out.println("end");

	}

}
