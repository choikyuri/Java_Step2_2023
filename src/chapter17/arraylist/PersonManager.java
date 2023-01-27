package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종  료");
			System.out.print("항목선택 : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			//if switch
			switch (select) {
			
			case 1: //정보추가
				p = new Person();//정보를 추가할때마다 Person객체를 						    새로 생성한다.
				
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(scan.next());
				
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				
				System.out.print("전화 : ");
				p.setTel(scan.next());
		//==============================================================		
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");

			System.out.println("---------------------------------");
				break;
				
			case 2: //정보삭제
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 이름 : ");
				String name = scan.next();
				
				for(int i = 0; i < personArr.size(); i++){
					
					if((personArr.get(i).getName()).equals(name)){
						personArr.remove(i);//personArr의 i번째 정보를 삭제한다.
						System.out.println(name + "의 정보를 삭제했습니다.");
						break;
						
					}else{
						
						if(i + 1 == personArr.size())
							System.out.println(name + "이 존재하지 않습니다.");
					}
				}
				
				break;
				
			case 3: //전체정보
			      System.out.println("--------전체정보--------");
			      System.out.println("등록인원 " + personArr.size() + "명");
				/*		      
			      for(int i = 0; i < personArr.size(); i++){
					System.out.println("이름 : " + personArr.get(i).getName());

					System.out.println("나이 : " + personArr.get(i).getAge());

					System.out.println("번호 : " + personArr.get(i).getTel());
					System.out.println("--------------------");
				}*/

				//for문 대신 Iterator를 이용한 while문 사용 가능
				Iterator<Person> it = personArr.iterator();
				while(it.hasNext()){ 
					p = it.next();
					System.out.println("이름 : " + p.getName());
					System.out.println("나이 : " + p.getAge());
					System.out.println("번호 : " + p.getTel());	
					System.out.println("---------------------");
				}
				break;
				
				default:
					System.out.println("프로그램 종료");
					return;
			}
		}
	}

}
