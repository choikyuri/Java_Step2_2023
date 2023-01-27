package chapter13;

public class LocalInner1 {
	
	int a=100;
	
	//innerTest 함수 정의
	public void innerTest(int n) {
		
		int b=200;//지역변수
		final int c=n; //상수
		//-----------------------------------------
		//innerTest()함수 내부에 지역클래스 작성
		class Inner{
			//Local내부 클래스는 외부 클래스의 멤버변수와 상수들만 접근할 수 있다
			public void getData() {
				System.out.println("int a : "+a);
				//System.out.println("int b : "+b);//오류
				System.out.println("int c : "+c);
			}
			
		}//Local 내부 클래스 
		//-------------------------------------------------------------
		//함수내부에 있는 클래스라고해도 함수만 호출하면 결과가 자동으로 나오는 것이 아니라
		//객체를 만들어서 사용해야한다
		Inner i=new Inner();
		i.getData();
		
	}//method
	
	public static void main(String[] args) {
		LocalInner1 outer=new LocalInner1(); //메인 클래스 객체
		outer.innerTest(500);
	}

}
