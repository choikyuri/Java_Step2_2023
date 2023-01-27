package chapter20;

public class AutoCloseTest1 {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj1=new AutoCloseObj()) {
			throw new Exception(); //예외발생
		} catch (Exception e) {
			System.out.println("예외 부분 입니다");
		}

	}

}
