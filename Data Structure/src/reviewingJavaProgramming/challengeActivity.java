package reviewingJavaProgramming;
import java.util.*;

public class challengeActivity {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string of brackets:");
		String input = scan.nextLine();
		
		if (Tester(input))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
	
	static boolean Tester(String str) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i=0; i < str.length(); i++) {
			char x = str.charAt(i);
			
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			
			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
				
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		
		return (stack.isEmpty());
	}
}
