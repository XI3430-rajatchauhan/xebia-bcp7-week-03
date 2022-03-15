package com.xebia.bcp7javaee.hashmap;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Pyhton");
		map.put(2, "Java");
		map.put(3, "C++");
		map.put(4,"Javascript");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}

}
