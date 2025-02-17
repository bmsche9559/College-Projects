package reviewingJavaProgramming;
import java.util.*;

public class Question4 {
	@SuppressWarnings({ "resource" })
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.println("Please enter a palindrome");
		input = scan.nextLine();
		
		if (isPalindrome(input))
			System.out.println("Input is a palindrome");
		else
			System.out.println("Input is NOT a palindrome");
	}
	
	static boolean isPalindrome(String Input) {
		int n = Input.length();
		
		if (n==0)
			return true;
		
		return checkPalindrome(Input, 0, n-1);
	}
	
	static boolean checkPalindrome(String str, int s, int e) {
		if (s==e)
			return true;
		
		if ((str.charAt(s)) != (str.charAt(e)))
			return false;
		
		if (s < e+1)
			return checkPalindrome(str, s+1, e-1);
		
		return true;
	}
}
