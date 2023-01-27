package chapter10;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 //방법1
		CalculatorExam[] calculators = {new CalcPlus(), new CalcMinus()};
		
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		//getClass().getSimpleName() : 클래스명 가져오기
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
		*/
		
		//방법2
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
		int plus=calc(new CalcPlus(), a,b); //Calc c1=new CalcPlus();
		System.out.println("두 수의 합 : "+plus);
		
		int minus=calc(new CalcMinus(), a,b); //Calc c1=new CalcPlus();
		System.out.println("두 수의 차 : "+minus);
		/*
		//방법3
		System.out.println("두 수의 합 : "+calc(new CalcPlus(), a,b));
		System.out.println("두 수의 차 : "+calc(new CalcMinus(), a,b));
        */
	}
	
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
