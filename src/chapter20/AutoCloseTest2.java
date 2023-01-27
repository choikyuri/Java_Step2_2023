package chapter20;

public class AutoCloseTest2 {
	
	
	public static void main(String[] args) {
		
		AutoCloseObj obj=new AutoCloseObj();
	    //자바 9부터 밖에서 선언 가능
		try(obj){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분 입니다.");
		}
	}

}
