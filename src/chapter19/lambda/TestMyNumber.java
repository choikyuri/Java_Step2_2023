package chapter19.lambda;


public class TestMyNumber {
	
	public static void main(String[] args) {
		
		//인스턴스 변수방에 구현부를 저장
		MyNumber max=(x,y) -> (x>=y)? x:y;
		//구현부를 대입하여 실행함
		System.out.println(max.getMax(10, 20));
		
		
		/*
		MyNumber aa=new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max=(x>=y)? x:y;
				return max;
			}
		};
		
		//=============================
		System.out.println(aa.getMax(10, 20));
		*/
		
	}

}
