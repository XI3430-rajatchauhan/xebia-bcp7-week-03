package com.xebia.bcp7javaee.inputoutput;

public class ConsoleClass {

	public static void main(String[] args) {
		String name=System.console().readLine();
		System.out.println("You entered string " + name);

	}

}
