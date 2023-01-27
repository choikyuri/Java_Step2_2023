package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들수 없다
		//Computer c1=new Computer(); 
		//Computer c3=new NoteBook();
		
		Computer c2=new DeskTop();
		Computer c4=new MyNoteBook();
		c2.typing(); //DeskTop
		c2.display(); //DeskTop
		c4.display(); //NoteBook
		c4.typing(); //MyNoteBook

	}

}
