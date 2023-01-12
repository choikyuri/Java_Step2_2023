package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		// 관광객 등록
		
		Scanner scan=new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n=scan.nextInt();
		
		//초기화를 통하여 메모리 확보 및 고객생성 (Guide의 객체)
		Guide guide=new Guide(n);
		
		System.out.println("관광객 등록");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+". 이름 : ");
			String name=scan.next();
			guide.guest[i].setName(name);
			
			System.out.print((i+1)+". 성별 : ");
			guide.guest[i].setGender(scan.next()); 
			
		}
		//----------------------------------
		//1,2,3선택시 기능 구현
	outer : while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");

			int select=scan.nextInt();
			
			switch (select) {
			case 1:
					for(int i=0;i<n;i++) {
						System.out.println((i+1)+". 이름 : "+guide.guest[i].getName());
						System.out.println((i+1)+". 성별 : "+guide.guest[i].getGender());
						System.out.println((i+1)+". 이름 : "+guide.guest[i].getPoint());
					}
					break;
			case 2:
					System.out.print("어디로 변경하시겠습니까? ");
					Guide.point=scan.next();
					System.out.println(Guide.point+"로 목적지 변경");
					System.out.println("-----------------------------");
					break;
			case 3:
					System.out.println("종료");
					break outer;
			}//switch
		}//while

	}//main

}//class
