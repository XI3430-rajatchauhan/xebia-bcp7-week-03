package com.xebia.bcp7javaee.inputoutput;

public class CommandLine {

	public static void main(String[] args) {
		if (args.length>0) {
			System.out.println("The command line argumentsare: ");
			for (String val : args) {
				System.out.println(val);
			}
		}
		else {
			System.out.println("No command line " + " arguments found ");
		}

	}

}
