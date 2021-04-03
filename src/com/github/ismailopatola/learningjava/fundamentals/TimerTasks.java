package com.github.ismailopatola.learningjava.fundamentals;

import java.util.TimerTask;
import java.util.Calendar;
import java.util.Timer;

public class TimerTasks {
	public static void main(String[] args) {
		/**
		 *  Timer
		 *  -----
		 *  A facility for threads to schedule tasks
		 *  for future execution in a background thread
		 *  
		 *  TimerTask
		 *  ---------
		 *  A task that can be scheduled for one-time 
		 *  or repeated execution by a Timer
		 */
		
		Timer timer = new Timer();
		
		// Ex. 1, 2
//		TimerTask task  = new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("Processing.....");
//				System.out.println("Task is complete");
//			}
//		};
		
		// Ex. 3
		TimerTask task  = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter + " seconds");
					counter--;
				} else {		
					System.out.println("******HAPPY NEW YEAR*****");
					timer.cancel(); // Terminates this timer, discarding any currently scheduled tasks
				}
			}
		};
		
		
		/**
		 * Ex. 1
		 * -----
		 * link task to timer
		 */
//		timer.schedule(task, 3000); // 3s
		
		/** 
		 * Ex. 2
		 * -----
		 * run at a specific time
		 * Sat Apr 03 13:27:00 WAT 2021
		 */
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.APRIL);
		date.set(Calendar.DAY_OF_MONTH, 3);
		date.set(Calendar.HOUR_OF_DAY, 13);
		date.set(Calendar.MINUTE, 27);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
//		timer.schedule(task, date.getTime()); 
//		System.out.println(date.getTime());
		
		/**
		 * Ex. 3
		 * -----
		 * repeat a task 
		 * every second
		 */
//		timer.scheduleAtFixedRate(task, 0, 1000);
		
		/**
		 * Ex. 3.1
		 * -----
		 * repeat a task 
		 * every second
		 * at fixed date
		 */
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}
}
