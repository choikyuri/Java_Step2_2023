package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now=new Date();
		//System.out.println(now);
		String strNow1=now.toString(); //toString : 객체(heap) => String의 타입 
		System.out.println("----------DATA---------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2=sdf.format(now); //
		//String strNow2=sdf.toString(); //객체 반환(heap)
		System.out.println("----------SimpleDateFormat---------");
		System.out.println(strNow2);

	}

}
