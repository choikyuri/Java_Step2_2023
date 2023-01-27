package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String>  hashMap=new HashMap<Key, String>();
		
		System.err.println(hashMap);
		
		//식별키의 객체를 이용하여 이름을 반환
		hashMap.put(new Key(1), "홍길동");
		System.err.println(hashMap);
		
		hashMap.put(new Key(1), "홍길동");
		System.err.println(hashMap);
		
		

	}

}
