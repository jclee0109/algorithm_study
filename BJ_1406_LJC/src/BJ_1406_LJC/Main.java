package BJ_1406_LJC;
import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack_tmp = new Stack<>();
		
		String input_first_line = br.readLine();
		for(int i = 0; i<input_first_line.length();i++) {
			stack.push(input_first_line.charAt(i));
		}
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<N;i++) {
			char tmp;
			String[] input_str = br.readLine().split(" ");
			if(input_str[0].charAt(0) == 'L'){
				if(stack.empty()) {
					continue;
				}
				else {
					tmp = stack.pop();
					stack_tmp.push(tmp);
				}
			}
			if(input_str[0].charAt(0) == 'D'){
				if(stack_tmp.empty()) {
					continue;
				}
				else {
					tmp = stack_tmp.pop();
					stack.push(tmp);
				}
			}
			if(input_str[0].charAt(0) == 'B'){
				if(stack.empty()) {
					continue;
				}
				else stack.pop();
			}
			if(input_str[0].charAt(0) == 'P'){
				stack.push(input_str[1].charAt(0));
			}
		}
		int stack_tmp_size = stack_tmp.size();
		for(int i = 0; i<stack_tmp_size;i++) {
			stack.push(stack_tmp.pop());
		}
		int stack_size = stack.size();
		for(int i = 0; i<stack_size;i++) {
			sb.append(stack.elementAt(i));
		}
		System.out.print(sb);
		
		
		br.close();
		
	}

}
