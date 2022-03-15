package com.xebia.bcp7.annotations;
@FunctionalInterface
interface myFunctionalInterface {
	void thisMethod();
}
class Phone {
	public void showTime() {
		System.out.println("Time is 8am");
	}
	public void on() {
		System.out.println("Turning on phone...");
	}
	
}
class NewPhone extends Phone {
	@Override
	public void showTime() {
		System.out.println("Time is 8PM");
	}
	@Deprecated
	public int sum(int a, int b) {
		return a+b;
	}
}

public class Annotation {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		NewPhone phone=new NewPhone();
		phone.showTime();
		phone.sum(5,6);
		
		

	}

}
