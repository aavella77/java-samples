import java.lang.Math;
// Write a function to check if the input string is a palindrome. Return true if it is and false if not.

// Examples of palindrome strings (they can contain spaces)
// 1. MaIam
// 2. A nut for a jar of tuna (Anutfora j aroftuna)
// 3. Niagara. O roar again! (Niagara O roaragain)

public class Palindrome {
	
boolean isPalindrome(String str) {
	String str1;
	char[] arrayChar = new char[str.length()];

	str1 = str.toLowerCase();
		
	int len=0;
	for (int i=0; i < str.length(); i++){
		if (str1.charAt(i) != ' ') {
			arrayChar[len]=str1.charAt(i);
			System.out.print(arrayChar[i]);
			len++;
		}
	}
	System.out.println(" len: " + len);
	
	int j=len;
	boolean stillPalindrome = true;
	for (int i=0; i < Math.abs(len/2); i++) {
		System.out.println("Comparing " + arrayChar[i] + " " + arrayChar[j-1] + " i:" + i + " j-1:" + j);
		if (arrayChar[i] == arrayChar[j-1]) {
			stillPalindrome = true;
		} else {
			stillPalindrome = false;
		}
		j--;
	}
	
	return stillPalindrome;
}
	

	public static void main (String[] args){
		boolean result;
		Palindrome p = new Palindrome();
		
		result = p.isPalindrome("MaIam");
		System.out.println(": " + result);
		result = p.isPalindrome("A nut for a jar of tuna");
		System.out.println(": " + result);
		result = p.isPalindrome("Hello");
		System.out.println(": " + result);
		result = p.isPalindrome("Mama");
		System.out.println(": " + result);
	}
}
