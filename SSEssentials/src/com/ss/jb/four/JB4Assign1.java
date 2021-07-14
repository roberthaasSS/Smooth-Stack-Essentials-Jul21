/**
 * 
 */
package com.ss.jb.four;

/**
 * @author Robert Haas
 *
 */
public class JB4Assign1 {
	
	private static JB4Assign1 instance = null;
	
	private JB4Assign1() {
	}
	
	public static JB4Assign1 getInstance() {
		if (instance == null) { // The first check
			synchronized (JB4Assign1.class) {
				if (instance == null) { // The second check
					instance = new JB4Assign1();
				}
			}
		}
		return instance;
	}

}
