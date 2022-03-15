package com.xebiabcp7java.threads;
class MyThread1 implements Runnable {
	public void run() {
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
		System.out.println("I am a thread 1");
	}
}
class MyThread2 implements Runnable {
	public void run() {
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
		System.out.println("I am a thread 2");
	}
}

public class Threads {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		Thread t3=new Thread(t1);
		MyThread2 t2=new MyThread2();
		Thread t4=new Thread(t2);
		t3.start();
		t4.start();

	}

}
