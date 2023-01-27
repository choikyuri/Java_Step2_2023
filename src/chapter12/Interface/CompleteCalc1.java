package chapter12.Interface;

import chapter11.Car;

//상속받아서 add/substaract 구현
public abstract class CompleteCalc1 implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substaract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	
	

}
