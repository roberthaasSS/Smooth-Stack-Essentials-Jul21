/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;

/**
 * @author Robert Haas
 *
 */
public class JB5Lambdas1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Hello", "SS", "Java", "Stream", "Apple"}; // The array to test
		
		System.out.println("Sorted by length\n" + Arrays.asList(length(words)) + "\n");
		System.out.println("Sorted by reverse length\n" + Arrays.asList(reverseLength(words)) + "\n");
		System.out.println("Sorted alphabetically\n" + Arrays.asList(alphabetically(words)) + "\n");
		System.out.println("Sorted by strings that contain e\n" + Arrays.asList(containE(words)) + "\n");
		System.out.println("Sorted by strings that contain e using static helper\n" + Arrays.asList(containEStatic(words)) + "\n");
	}
	
	public static String[] length(String[] words) { // Returns the array sorted by length
		Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
		return words;
	}
	
	public static String[] reverseLength(String[] words) { // Returns the array sorted by reverse length
		Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
		return words;
	}
	
	public static String[] alphabetically(String[] words) { // Returns the array sorted alphabetically
		Arrays.sort(words);
		return words;
	}
	
	public static String[] containE(String[] words) { // Returns the array sorted on if the string contains e or not
		Arrays.sort(words, (s1, s2) -> {
			if (s1.toLowerCase().contains("e") && !s2.toLowerCase().contains("e")) { // If s1 contains e and s2 doesn't it returns s1 > s2
				return -1;
			}
			
			else if (!s1.toLowerCase().contains("e") && s2.toLowerCase().contains("e")) { // If 2 contains e and s1 it returns s2 > s1
				return 1;
			}
			
			else { // If neither contains e or both contain e sorts alphabetically
				if (s1.charAt(0) < s2.charAt(0)) { 
					return -1;
				}
				else if (s1.charAt(0) > s2.charAt(0)) {
					return 1;
				}
			}
			return 0;
		});
		return words;
	}

	public static String[] containEStatic(String[] words) { // Returns the array sorted on if the string contains e or not using a static helper
		Arrays.sort(words, (s1, s2) -> helper(s1, s2));
		return words;
	}
	
	public static int helper(String s1, String s2) { // Static helper for finding strings that contain e in  the array
		if (s1.toLowerCase().contains("e") && !s2.toLowerCase().contains("e")) {
			return -1;
		}
		
		else if (!s1.toLowerCase().contains("e") && s2.toLowerCase().contains("e")) {
			return 1;
		}
		
		else {
			if (s1.charAt(0) < s2.charAt(0)) {
				return -1;
			}
			else if (s1.charAt(0) > s2.charAt(0)) {
				return 1;
			}
		}
		return 0;
	}
}
