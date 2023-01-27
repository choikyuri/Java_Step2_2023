package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item{Start, Pause, Exit} // 0 1 2

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
			
			int n=scan.nextInt();
			
			Item start=Item.Start;//start에 0
			Item pause=Item.Pause;//pause에 1
			Item exit=Item.Exit;//exit에 2
			
			if(n == start.ordinal()) //n == 0
				System.out.println("게임이 시작함");
			else if(n==pause.ordinal()) //n==1
				System.out.println("게임이 일시정지됨");
			else {
				System.out.println("게임종료");
				return;
			}
			
		}

	}

}
