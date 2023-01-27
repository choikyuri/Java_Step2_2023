package chapter21.inputstrean;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest05 {

	public static void main(String[] args){
		
		try(FileOutputStream fos=new FileOutputStream("resource.txt", true); //저장
				FileInputStream fis=new FileInputStream("resource.txt")) {
			//쓰기
			fos.write(71); //A 대응되는 문자로 저장
			fos.write(72); //B 대응되는 문자로 저장
			fos.write(73); //C 대응되는 문자로 저장
			//읽기
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}





