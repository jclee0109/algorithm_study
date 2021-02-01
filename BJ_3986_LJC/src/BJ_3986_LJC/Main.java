package BJ_3986_LJC;
import java.io.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int Test_case = Integer.parseInt(br.readLine());
		int cnt = 0;
		Stack<Character> stack = new Stack<>();
		for(int i =  0; i<Test_case; i++) {
			String input_str = br.readLine();
			for(int j = 0; j<input_str.length(); j++) {
				if(stack.empty()) stack.push(input_str.charAt(j));
				else {
					if(stack.peek() == input_str.charAt(j)) stack.pop();
					else stack.push(input_str.charAt(j));
				}
			}
			if(stack.empty()) cnt++;
			else stack.clear();
		}
		System.out.print(cnt);
		br.close();
	}
}
