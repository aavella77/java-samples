import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * File: StringLetters.java
 * Usage: java StringLetters
 * Input File: Store it at C:\string.txt
 * Author: Alejandro Avella
 * Email: alejandroavella77@yahoo.com
 * Date: 12/18/2011
 */

public class StringLetters {
	public static final int MAX = 1024;

	/* This program takes a string stored in a file in C:\string.txt
	 * (e.g. "This is a short sentence.")
	 * and returns a string consisting of the number of characters
	 * in each word (including punctuation), with spaces separating the numbers
	 * (e.g.,"4 2 1 5 9").
	 */
	
	public static void main (String[] args) {
        // Reading string from a file located in the Hard Drive at C:\ 	
        BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("C:\\string.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
        	String str;
        	str = in.readLine();
        	//System.out.println(str);
            int len = str.length();
            char[] charArray = new char[len];
            int[] outputArray = new int[MAX];
            int words = 0;
            
            // put original string in an 
            // array of chars
            for (int i = 0; i < len; i++) {
                charArray[i] = str.charAt(i);
            }
            
            // Initialize the output Array
            for (int i = 0; i < 1024; i++) {
                outputArray[i] = 0;
            }
            
            // For each character in the input string
            for (int i = 0; i < len; i++) {
            	// While a character is found increment the output array
            	if (charArray[i] != ' ') {
            		//System.out.println("Analyzing letter " + charArray[i]);
            		outputArray[words]++;
            		//System.out.println("Output Array[" + words + "]=" + outputArray[words]);
            	//if a space is found increment the number of words
            	}else {
            		words++;
            		//System.out.println("Found a word # " + words );
            	}
            }

            // Print the outpyt
            for (int i = 0; i <= words; i++) {
            	System.out.print(outputArray[i] + " ");
            }	 
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    	

}
