package com.xebia.bcp7javaee.hashset;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		List<String> languages=new ArrayList<String>();
		languages.add("Pyhton");
		languages.add("Java");
		languages.add("C++");
		languages.add("Javascript");
		HashSet<String> language=new HashSet<String>(languages);
		System.out.println("HsshSet elements are: ");
		for (String ob : language) {
			System.out.println(ob);
		}
		

	}

}
