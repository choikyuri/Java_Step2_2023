package chapter19.lambda;

public class TestAdd {

	public static void main(String[] args) {
		//Lambda : 메소드 이름이 없음 구현부만 존재함
		Add addF=(x,y)->x+y;
		System.out.println(addF.add(3, 5));

	}

}
