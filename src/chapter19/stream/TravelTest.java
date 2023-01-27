package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
            //가방
            List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
            
            //객체 생성
            TravelCustomer customerLee=new TravelCustomer("이순신",30,28000);
            TravelCustomer customerKim=new TravelCustomer("김유신",20,35000);
            TravelCustomer customerHong=new TravelCustomer("홍길동",18,25000);
            
            //추가
            customerList.add(customerLee);
            customerList.add(customerKim);
            customerList.add(customerHong);
            
            System.out.println("==고객 명단 추가된 순서대로 출력==");
            //map : 데이터를 특정조건에 해당하는 값으로 변환해 줌
            customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
            //mapToInt : int형 자료로 변환
            int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
            System.out.println("총 수입 : "+total);
            //filter : 특정 조건에 맞는 데이터만 걸러낸다
            System.out.println("==20세 이상의 고객의 이름을 정렬하여 출력==");
            customerList.stream().filter(c -> c.getAge() >= 20). 
					              map(c -> c.getName()).sorted().
					              forEach(s->System.out.println(s));
            

	}

}








