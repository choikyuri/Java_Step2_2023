package chapter14.Wrapper;

import javax.swing.JOptionPane;

public class WrapperTest {

	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		char ch=65; //A
		double num1, num2;
		
		//Wrapper : 기본타입을 객체로 포장
		//언박싱 wrapper
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		if(num2 != 0) {
			System.out.println(num1/num2);
		}
		
		//isDigit : 숫자인지 판단
		
		if(Character.isDigit(ch))
			System.out.println(ch +"는 숫자입니다.");
		else
			System.out.println(ch+"는 문자입니다");

	}

}
