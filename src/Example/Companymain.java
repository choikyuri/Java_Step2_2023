package Example;

import java.util.Scanner;

public class Companymain {

	public static void main(String[] args)
    {
        // Scanner기능을 사용하기 위해 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // CompanyService 클래스를 사용하기 위해 객체 생성
        CompanyService cs = new CompanyService();
        
        //while문 탈출용도로 사용할 boolean 선언
        boolean bo = true;
        
        // 직원관리 프로그램을 종료전까지 반복 동작 시키기 위해 while문 사용
        while(bo)
        {
            System.out.println("1. 등록");
            System.out.println("2. 검색");
            System.out.println("3. 종료");
            System.out.print(">>> ");
            
            // switch-case문을 사용하기 위해 key값 입력받기
            int key = sc.nextInt();
            
            // 원하는 case문을 사용하기 위해 입력받은 key값 넣어주기
            switch(key)
            {
            case 1: // 등록
                cs.saveWorker();
                break;
         
            case 2: // 검색
                cs.search();
                break;
                
            case 3: // 종료
                System.out.println("프로그램 종료");
                bo = false;
                break;
            }
        }
    }
}
