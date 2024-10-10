package com.bptn.course._19_MultiThreading;

public class MyThread extends Thread {
	@Override

	public void run() {
		// Loop to repeat the task 5 times
		for (int i = 0; i < 5; i++) {
			// Print the current thread name
			System.out.println("Thread: " + Thread.currentThread().getName());
		}
	}

}
