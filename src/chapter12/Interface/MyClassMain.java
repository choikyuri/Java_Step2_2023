package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {

       //X,Y MyInterface 클래스 타입의 인스턴스 변수를 선언하여 출력
		
		MyClass mClass=new MyClass();
		
		X xClass=mClass; //X 클래스 타입의 인스턴스 변수
		xClass.x();
		System.out.println("-----------------------");
		
		Y yClass=mClass; //Y 클래스 타입의 인스턴스 변수
		yClass.y();
		System.out.println("-----------------------");
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}
