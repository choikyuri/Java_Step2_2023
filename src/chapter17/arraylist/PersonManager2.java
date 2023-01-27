package chapter17.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager2 {
	public void personMgr() {
		try (var scan = new Scanner(System.in)) {
			var pArr = new ArrayList<Person2>();

			WHILE: while (true) {
				System.out.println("1. 회원추가");
				System.out.println("2. 회원탈퇴");
				System.out.println("3. 회원정보");
				System.out.println("4. 종료");
				System.out.print("항목선택 : ");

				int select;

				try {
					select = scan.nextInt();
				} catch (InputMismatchException e) {
					select = -1;
				}
				scan.nextLine();

				switch (select) {
				case 1:
					addPerson(scan, pArr);
					break;
				case 2:
					removePerson(scan, pArr);
					break;
				case 3:
					showPeople(pArr);
					break;
				case 4:
					break WHILE;
				default:
					System.out.println("잘못된 입력 값입니다.");
				}

				System.out.println("--------------");
			}
			
			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("비정상 종료");
			System.out.println(e);
		}
	}

	private void addPerson(Scanner scan, ArrayList<Person2> pArr) {
		System.out.println("---- 정보추가 ----");

		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("나이 : ");
		int age = scan.nextInt();
		scan.nextLine();

		System.out.print("전화 : ");
		String tel = scan.nextLine();

		pArr.add(new Person2(name, age, tel));
	}

	private void removePerson(Scanner scan, ArrayList<Person2> pArr) {
		System.out.println("---- 회원탈퇴 ----");

		if (pArr.isEmpty()) {
			System.out.println("탈퇴할 회원이 없습니다.");
			return;
		}

		System.out.print("탈퇴할 회원번호를 입력하세요(1 ~ " + pArr.size() + ") : ");
		int index = scan.nextInt();
		scan.nextLine();

		pArr.remove(index - 1);
	}

	private void showPeople(ArrayList<Person2> pArr) {
		System.out.println("---- 회원정보 ----");

		int i = 1;

		for (var person : pArr) {
			System.out.println(i + ". 이름 : " + person.getName());
			System.out.println(i + ". 나이 : " + person.getAge());
			System.out.println(i + ". 전화 : " + person.getTel());
			System.out.println();
			i++;
		}
	}
}