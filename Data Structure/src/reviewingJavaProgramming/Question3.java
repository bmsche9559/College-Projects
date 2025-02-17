package reviewingJavaProgramming;
import java.util.*;

public class Question3 {
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String input;
		
		System.out.println("Please enter a string of characters.");
		input = scan.nextLine();
		
		if (Tester(input))
			System.out.println("The string "+input+" has all unique letters.");
		else
			System.out.println("The string "+input+" has duplicate letters.");
	}
	public static boolean Tester(String Input) {
		for (int i=0; i < Input.length(); i++) {
			for (int j=i+1; j < Input.length(); j++) {
				if (Input.charAt(i) == Input.charAt(j))
					return false;
			}
		}
		return true;	
	}
}
