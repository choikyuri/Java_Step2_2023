package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {
	
	//멤버변수(전역) 
	private static final int MAX=3;

	public static void main(String[] args) {
        //지역변수
		int num=0; 
		
		for(int i=0;i<MAX;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			
			if(num > MAX)
				System.out.println("입력값이 3보다 더 큽니다");
			else
				System.out.println("입력값이 3보다 크지 않습니다");
		}

	}

}
