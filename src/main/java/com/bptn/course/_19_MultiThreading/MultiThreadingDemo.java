package com.bptn.course._19_MultiThreading;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		// Create instances of MyThread
		// method stub
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());

		t1.start();
		t2.start();

	}
}
