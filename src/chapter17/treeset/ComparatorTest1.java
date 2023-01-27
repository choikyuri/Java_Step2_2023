package chapter17.treeset;


import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {

	public static void main(String[] args) {

          //default로 오버라이딩 되어 있는 String / Integer
		  Set<String> set=new TreeSet<String>();
		  set.add("aaa");
		  set.add("ccc");
		  set.add("bbb");
		  
		  System.out.println(set);
		  

	}

}
