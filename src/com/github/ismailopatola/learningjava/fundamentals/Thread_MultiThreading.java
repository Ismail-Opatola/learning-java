package com.github.ismailopatola.learningjava.fundamentals;

public class Thread_MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * MultiThreading
		 * --------------
		 * Process of executing multiple threads simultaneously
		 * Helps maximum utilization of CPU
		 * Threads are independent, they don't affect the execution of other threads.
		 * An exception in one thread will not interrupt other threads
		 * useful fr serving multiple clients, multiplayer games, or other mutually independent tasks
		 * 
		 * 2 way to create a thread
		 * ------------------------
		 * + create a subclass of the Thread Class
		 * + create a class that implement Runnable Interface, pass the instance to a Thread Class 
		 */
		
		MyThread2 thread1 = new MyThread2();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
//		thread1.start();
//		thread2.start();
		
//		System.out.println(1/0); // (main thread) throws error, (thread1, thread2) unaffected 

		/**
		 *  wait for thread1 to complete 
		 *  before thread2 starts
		 */
//		thread1.start();
//		thread1.join();
//		thread2.start();	
		
		/**
		 *  wait 3s after thread1 to starts 
		 *  before thread2 starts
		 */
//		thread1.start();
//		thread1.join(3000);
//		thread2.start();		
		
		/**
		 * Daemon threads
		 */
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		thread1.start();
		thread2.start();
		System.out.println(1/0); // (main thread) throws error, (thread1, thread2) terminated 
		
	}

}
