package Example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyService {

	// Scanner기능을 사용하기 위해 객체 생성
    Scanner sc = new Scanner(System.in);
 
    // CompanyBasics 클래스를 사용하기 위해 객체 생성
    CompanyBasics cb = new CompanyBasics();
 
    // CompanyBasics객체만 담을 수 있는 ArrayList 생성
    ArrayList<CompanyBasics> csarr = new ArrayList<CompanyBasics>();
 
    // 직원 한명의 값 전달 메서드
    public void saveWorker()
    {
        // savaWorker메서드 안에서 새로 생성해주지 않으면 ArrayList에 넣어줄때
        // 모든값이 마지막에 입력한 값으로 일괄변경 되기 때문에 생성해준다.
        CompanyBasics cb = new CompanyBasics();
 
        // 입력받는 타입이 다르면 예외처리를 해주기위해 try-catch문 사용
        try 
        {
            System.out.print("등록할 직원의 이름을 입력하세요 : ");
            // Scanner로 입력받은 값을 setName메서드를 이용해서 넣어주기
            String name = sc.next();
            cb.setName(name);
            System.out.print("등록할 직원의 부서를 입력하세요 : ");
            String part = sc.next();
            cb.setPart(part);
            System.out.print("등록할 직원의 주소를 입력하세요 : ");
            String addr = sc.next();
            cb.setAddr(addr);
            System.out.print("등록할 직원의 생일을 입력하세요 : ");
            String birthday = sc.next();
            cb.setBirthday(birthday);
            csarr.add(cb);
        }
        catch (InputMismatchException e) 
        {
            sc.nextLine();
            System.out.println("문자를 입력하세요.");
        }
        
        
    }   
     
   
    public void search() 
    {
        try 
        {
            if (csarr.size() == 0)
            {
                throw new IndexOutOfBoundsException("저장되있는 직원 정보가 없습니다.");
            }
 
            try
            {
                System.out.println("찾으려는 직원의 이름을 입력하세요 : ");
                // 찾으려는 직원의 이름을 입력받고 name2에 저장
                String name2 = sc.next();
 
                for (int i = 0; i < csarr.size(); i++) 
                {
                    // ArrayList에 저장되있는 값들의 Name을 불러오기
                    cb = csarr.get(i);
                    cb.getName();
 
                    // ArrayList의 Name과 입력한 Name2가 같으면
                    // 그 Name의 정보를 모두 출력
                    if (name2.equals(cb.getName())) 
                    {
                        //outputTitle();
                        //System.out.println(cb);
                        System.out.println(csarr.get(i));
                    }
                }
            } 
            catch (InputMismatchException e) 
            {
                sc.nextLine();
                System.out.println("문자를 입력하세요.");
            }
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
 
    } 
    
	/*
	 * public void outputTitle() { System.out.println("이름\t부서\t주소\t생일"); }
	 */
    
    public void outpub() 
    {
        int cnt = 1;
        try
        {
            if (csarr.size() == 0) 
            {
                throw new IndexOutOfBoundsException("저장되있는 직원 정보가 없습니다.");
            }
            for (int i = 0; i < csarr.size(); i++) 
            {
 
                System.out.print(cnt + "번째 입사자 ");
 
                // ArrayList에 저장된 모든 객체 출력해서 보여주기
                System.out.println(csarr.get(i));
                cnt = cnt + 1;
            }
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
