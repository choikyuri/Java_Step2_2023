package chapter15;

public class StringTest1 {

	public static void main(String[] args) {

		String javaStr=new String("java "); //heap 
		String androidStr=new String(" androidStr"); //heap
		System.out.println(javaStr); //toSting
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr)); //16진수
		
		javaStr=javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); //16진수
		
		

	}

}
