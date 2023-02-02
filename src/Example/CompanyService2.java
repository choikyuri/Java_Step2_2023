package Example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CompanyService2 {
	
	List<CompanyBasics> companyList;
	private static Scanner s;
	
	public CompanyService2() {
		companyList = new ArrayList<>();
		s = new Scanner(System.in);
	}
	
	public Scanner getScanner() {
		if(s == null) 
			s = new Scanner(System.in);
		
		return s;
	}
	
	public void saveWorker() {
		companyList.add(getCompanyBasicInfo(""));
	}
	
	public void search() {
		
		boolean searched = false;
		
		if(companyList.size() == 0) {
			System.out.println("저장되어있는 직원 정보가 없습니다");
			return;
		}
		
		CompanyBasics search = getCompanyBasicInfo("only name");
		
		Iterator<CompanyBasics> ir = companyList.iterator();
		
		while(ir.hasNext()) {
			CompanyBasics c = ir.next();
			if(c.equals(search)) {
				System.out.println(c);
				searched = true;
			}
		}
		
		if(!searched) {
			System.out.println(search.getName() + "이라는 직원은 없습니다");
		}
	}
	
	public CompanyBasics getCompanyBasicInfo(String option) {
		String name = "";
		String part = "";
		String addr = "";
		String birthday = "";
		
		//입력받기
		System.out.print("이름 : ");
		name = s.next();
		if(!"only name".equals(option)) {
			System.out.print("부서 : ");
			part = s.next();
			System.out.print("주소 : ");
			addr = s.next();
			System.out.print("생일 : ");
			birthday = s.next();
		}
		
		return new CompanyBasics(name, part, addr, birthday);
	}

}
