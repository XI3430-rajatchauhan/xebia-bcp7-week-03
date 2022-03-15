package com.xebia.bcp7javaee.enumeration;

enum Color {
	RED, BLUE, YELLOW;
}

public class Enumeration {

	public static void main(String[] args) {
		Color color=Color.RED;
		if (color==color.RED) {
			System.out.println("it is red color");
		}
		else if (color==color.BLUE) {
			System.out.println("it is blue color");
		}
		else if (color==color.YELLOW) {
			System.out.println("it is yellow color");
		}
	}

}
