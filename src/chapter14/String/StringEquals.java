package chapter14.String;

public class StringEquals {

	public static void main(String[] args) {

		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1 == str2); //heap 메모리가 같은지 반환
		System.out.println(str1.equals(str2)); //heap 메모리가 같은지 반환
		
		//상수풀
		String str="abc";
		String str3="abc";
		
		System.out.println(str == str3);
		
		//Boxing : 기본 타입값을 포장해서 객체로 만듬
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2); //heap메모리 
		System.out.println(i1.equals(i2));

	}

}
