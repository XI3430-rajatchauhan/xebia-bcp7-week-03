package com.xebia.bcp7javaee.switchstatement;
import java.util.Scanner;

public class BranchingConditions {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		n1=sc.nextInt();
		System.out.println("Enter your second number");
		n2=sc.nextInt();
		if (n1>n2) {
			System.out.println(n1 + " " + "is greater than" + " " + n2);
		}
		else {
			System.out.println(n2 + " " + "is greater than" + " " + n1);
		}
			

	}

}
