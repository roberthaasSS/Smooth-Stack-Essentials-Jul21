/**
 * 
 */
package com.ss.jb.five;

/**
 * @author Robert Haas
 *
 */
public class JB5Assign5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 2, 5, 2};
		System.out.print(groupSumClump(0, arr, 4));
	}
	
	public static boolean groupSumClump(int index, int[] arr, int val) {
		int i = index;
		int adj = val;
		
		if (index >= arr.length) {
			return val == 0;
		}

		while (i < arr.length && arr[index] == arr[i]) {
			adj -= arr[index];
			i++;
		}
		
		if(groupSumClump(i, arr, adj)) {
			return true;
		}
		
		else if(groupSumClump(i, arr, val)) {
			return true;
		}
		
		return false;
	}
}
