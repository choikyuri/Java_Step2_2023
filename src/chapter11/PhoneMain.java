package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone=new Phone();//(X)
		
		SmartPhone smartPhone=new SmartPhone("김유신");
		
		System.out.println(smartPhone.owner+"님");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();

	}

}
