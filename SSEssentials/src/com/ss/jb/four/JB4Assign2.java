/**
 * 
 */
package com.ss.jb.four;

/**
 * @author Robert Haas
 *
 */
public class JB4Assign2 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {5,6,7,8};
		
		System.out.println("Deadlock Start");
		Runnable t1 = new Runnable() { // This is the t1 thread

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					synchronized(arr1) { // Calls arr1
						Thread.sleep(100); // Sets thread to sleep
						synchronized(arr2) { // Calls arr2
							System.out.println("Thread one is running");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable t2 = new Runnable() { // This is the t2 thread

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					synchronized(arr2) { // Calls arr2
						Thread.sleep(100); // Sets thread to sleep
						synchronized(arr1) { // Calls arr1
							System.out.println("Thread two is running");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("Deadlock End");
	}
}
