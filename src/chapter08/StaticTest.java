package chapter08;

class StVal{
	
	int a;
	static int b;
}


public class StaticTest {
	public static void main(String[] args) {
		
      StVal obj1=new StVal();
      StVal obj2=new StVal();
      
      obj1.a=10;
      obj1.b=20;
      System.out.println("obj1.a : "+obj1.a+" | obj1.b : "+obj1.b);
      obj2.a=100;
      obj2.b=200;
      System.out.println("obj2.a : "+obj2.a+" | obj2.b : "+obj2.b);	
      
      
      System.out.println("----------------------------------------");
      //static은 데이터 영역에서 공용으로 사용되므로 다른 객체에서 값을 변경하면 변경된 값이 저장됨
      System.out.println("obj1.a : "+obj1.a+" | obj1.b : "+obj1.b);
      obj2.a=100;
      obj2.b=300;
      System.out.println("obj2.a : "+obj2.a+" | obj2.b : "+obj2.b);
      System.out.println("obj1.a : "+obj1.a+" | obj1.b : "+obj1.b);
	}

}
