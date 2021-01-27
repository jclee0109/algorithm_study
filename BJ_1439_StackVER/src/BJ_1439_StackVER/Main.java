package BJ_1439_StackVER;
import java.util.Stack;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stack.push(s.charAt(0));
		for(int i = 1; i<s.length();i++) {
			if(s.charAt(i-1)!=s.charAt(i)) stack.push(s.charAt(i));
			else continue;
		}
		System.out.print(stack.size()/2);
	}
}