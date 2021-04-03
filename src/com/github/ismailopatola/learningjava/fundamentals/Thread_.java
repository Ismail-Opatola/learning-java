package com.github.ismailopatola.learningjava.fundamentals;

public class Thread_ {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Thread
		 * ------
		 * A thread od execution in a program (kind of like a virtual CPU)
		 * The JVM allows an application to have multiple threads running concurrently
		 * Each thread can execute parts of your code in parallel with the main thread
		 * Each thread has a priority.
		 * Threads with higher priority are executed in perference compared to the threads with a lower priority
		 * 
		 * The Java Virtual Machine continues to execute threads until either of the following occurs
		 * 1. The exit method of class Runtime has been called
		 * 2. All user threads have died
		 * 
		 * When a JVM starts up, there is a thread which calls the main method
		 * This thread is called "main"
		 * 
		 * 2 types of threads
		 * ------------------
		 * User threads
		 * Daemon threads
		 * 
		 * Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
		 * JVM terminates itself when all user threads (non-daemon threads) finish their exeution
		 */
		
//		// check how many threads are running 
//		System.out.println(Thread.activeCount());
//		// GET name of current running thread
//		System.out.println(Thread.currentThread().getName());
//		// CHANGE current thread name
//		Thread.currentThread().setName("MAINNNNN");
//		// check the priority of the current running thread
//		System.out.println(Thread.currentThread().getPriority());
//		// ChANGE thread priority
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
//		// check current thread is alive
//		System.out.println(Thread.currentThread().isAlive());
		
//		// make your program sleep for a given ammount of time
//		for (int i = 3; i > 0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		System.out.println("You're done!");
	
		MyThread thread2 = new MyThread();		
//		thread2.start();	
//		System.out.println(thread2.isAlive());
//		System.out.println(thread2.getName());
//		thread2.setName("2nd thread");
//		System.out.println(thread2.getName());
//		System.out.println(thread2.getPriority());
		/**
		 *  Note: 
		 *  by default thread2 inherits the priority of the thread that creates its
		 *  i.e if we set our main/currentThread priority to 10
		 *  	thread2 priority would also be 10
		 *  	untill we set a different priority for thread2 
		 */
//		thread2.setPriority(10);
//		System.out.println(thread2.getPriority());
//		System.out.println(Thread.activeCount());
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		thread2.start();	
		
		
		
	}

}
