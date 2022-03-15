package com.xebia.bcp7javaee.arraylist;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Ferrari");
		System.out.println("ArrayList: " + cars);
		String element=cars.set(2, "Maruti");
		System.out.println("Updated ArrayList is: " + cars);
	}

}
