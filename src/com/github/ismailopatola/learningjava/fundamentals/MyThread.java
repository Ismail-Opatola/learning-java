package com.github.ismailopatola.learningjava.fundamentals;

public class MyThread extends Thread {

	@Override
	public void run() {
		if (this.isDaemon()) {
			System.out.println("This is a daemon thread that's running");
		} else {
			System.out.println("This user thread is running");			
		}
	}
}
