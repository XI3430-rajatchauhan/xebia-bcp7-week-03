package com.xebia.bcp7javaee.switchstatement;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// for loop
		int n=10;
		for (int i=1;i<=n;i++) {
			System.out.println(i);
		}
		// while loop
		int n1;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		while(n1>0) {
			System.out.println(n1);
			n1=sc.nextInt();
		}
		// do while loop
		int n2;
		n2=sc.nextInt();
		do {
			System.out.println(n2);
			n2=sc.nextInt();
		}while(n2>0);

	}

}
