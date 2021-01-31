package BJ_4949_LJC;
import java.io.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		while(true) {
			String[] input_str = br.readLine().split("");
			if(input_str[0].charAt(0) == '.') break;
			else {
				for(int i = 0; i<input_str.length;i++) {
					if(input_str[i].charAt(0) == '(') {
						stack.push('(');
					}
					else if(input_str[i].charAt(0) == ')') {
						if(stack.empty()) {
							stack.push(')');
							break;
						}
						else{
							if(stack.peek() == '(') stack.pop();
							else {
								break;
							}
						}
					}
					else if(input_str[i].charAt(0) == '[') {
						stack.push('[');
					}
					else if(input_str[i].charAt(0) == ']') {
						if(stack.empty()) {
							stack.push(']');
							break;
						}
						else{
							if(stack.peek() == '[') stack.pop();
							else {
								break;
							}
						}
					}
				}
				if(stack.empty()) System.out.println("yes");
				else {
					System.out.println("no");
					stack.clear();
				}
			}
		}
		br.close();
			
		
		
	}

}
