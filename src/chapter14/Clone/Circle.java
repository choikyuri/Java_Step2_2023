package chapter14.Clone;

public class Circle implements Cloneable{
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		//생성자를 통해서 다른 클래스의 객체 생성
		point=new Point(x, y);
		this.radius=radius;
	}
    //클래스의 객체 복사
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		
		return "원점은 "+point+"이고, "+"반지름은 "+radius+"입니다.";
	}
	
	
	

}
