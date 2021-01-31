package BJ_10773_LJC;
import java.io.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[] input_num = new int[K];
		Stack<Integer> stack = new Stack<>();
		for(int i =0 ;i<K;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
			if(input_num[i] == 0) stack.pop();
			else stack.push(input_num[i]);
		}
		int sum = 0;
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		for(Integer i : stack) {
			sum+=i;
		}

		System.out.print(sum);
		
		br.close();
		
	}

}