package BJ_9012_LJC;
import java.io.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int Test_Case = Integer.parseInt(br.readLine());
		for(int i=0;i<Test_Case;i++) {
			String input_str = br.readLine();
			int j = 0;
			do {
				if(stack.empty()) stack.push(input_str.charAt(j));
				else {
					if(stack.peek() == input_str.charAt(j)) stack.push(input_str.charAt(j));
					else if(stack.peek() == ')') stack.push(input_str.charAt(j));
					else stack.pop();
				}
				j++;
			}while(j<input_str.length());
			if(stack.empty()) sb.append("YES" + "\n");
			else sb.append("NO" + "\n");
			stack.clear();
		}
		System.out.print(sb);*/
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int Test_Case = Integer.parseInt(br.readLine());
		for(int i=0;i<Test_Case;i++) {
			String input_str = br.readLine();
			char[] input_char = new char[input_str.length()];
			for(int j = 0 ;j<input_str.length();j++) {
				input_char[j] = input_str.charAt(j);
			}
			for(int k=0;k<input_str.length();k++) {
				if(stack.empty()) stack.push(input_char[k]);
				else {
					if(stack.peek() == input_char[k]) stack.push(input_char[k]);
					else if(stack.peek() == ')') stack.push(input_char[k]);
					else stack.pop();
				}
			}
			if(stack.empty()) sb.append("YES" + "\n");
			else sb.append("NO" + "\n");
			stack.clear();
		}
		System.out.print(sb);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int Test_Case = Integer.parseInt(br.readLine());
		for(int i=0;i<Test_Case;i++) {
			String input_str = br.readLine();
			for(int j=0;j<input_str.length();j++) {
				if(stack.empty()) stack.push(input_str.charAt(j));
				else {
					if(stack.peek() == input_str.charAt(j)) stack.push(input_str.charAt(j));
					else if(stack.peek() == ')') stack.push(input_str.charAt(j));
					else stack.pop();
				}
			}
			if(stack.empty()) sb.append("YES" + "\n");
			else sb.append("NO" + "\n");
			stack.clear();
		}
		System.out.print(sb);
	}
}
