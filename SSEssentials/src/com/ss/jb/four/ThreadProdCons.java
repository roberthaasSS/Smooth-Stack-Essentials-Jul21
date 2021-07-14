/**
 * 
 */
package com.ss.jb.four;

import java.util.LinkedList;

/**
 * @author Robert Haas
 *
 */
public class ThreadProdCons {
	private LinkedList<Integer> buffer = new LinkedList<>(); // This is the buffer list
	private boolean end = false;
	
	public void start(int num) throws InterruptedException {
		
		Runnable producer = new Runnable() { // This is the producer thread
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Producer(num);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable consumer = new Runnable() { // This is the consumer thread

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Consumer();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(consumer).start();	
	}
	
	public synchronized void Producer(int num) throws InterruptedException { // This is the producer method
		for (int i = 0; i < num; i++) { // Loops through the buffered list and adds numbers based on how many the user wanted
			buffer.add(i); // Adds the number to the buffered list
			System.out.println("Produced " + i);
			
			if (i == num-1) { // If index i reaches the last number, then end is set to true
				end = true;
			}
			
			notify(); // Wakes up the producer thread
			Thread.sleep(100); // Sets the producer thread to sleep
			
			while (buffer.size() == 7) { // While the buffer list is full we try to set the producer thread to wait
				try {
					System.out.println("Buffer is full\n");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public synchronized void Consumer() throws InterruptedException { // This is the consumer method
//		System.out.println();
		while (true) { // Keeps looping while there is more to be produced and consumed
			while (buffer.size() == 0) { // While the buffer list is empty we try to set the consumer thread to wait
				try {
					System.out.println("Buffer is empty\n");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			int remove = buffer.removeFirst(); // Removes the first number in the buffer list
			System.out.println("Consumed " + remove); 
			
			notify(); // Wakes up the producer thread
			Thread.sleep(100); // Sets the consumer thread to sleep
			
			if (end && buffer.size() == 0) { // If there are no more numbers to produce and the buffer list is empty, we break out of the inf. loop
				System.out.println("Buffer is empty\n");
				break;
			}
		}
		System.out.println("Bye");
	}
}
