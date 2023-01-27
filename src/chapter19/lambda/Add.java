package chapter19.lambda;



@FunctionalInterface
public interface Add {
	
	//@FunctionalInterface : 인터페이스로 구현하되 추상메소드는 하나만 존재할 수 있음
	public int add(int x, int y); 
	
	

}
