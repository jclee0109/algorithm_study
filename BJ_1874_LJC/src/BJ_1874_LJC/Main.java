package BJ_1874_LJC;
import java.util.Stack;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] input_num = new int[n];
		for(int i = 0;i<n;i++) {
			input_num[i] =Integer.parseInt(br.readLine());
		}
		int now= 0;
		for(int i = 0; i<n;i++) {
			if(input_num[i] > now) {
				for(int j = now+1; j<=input_num[i]; j++) {
					stack.push(j);
					sb.append("+" + "\n");
				}
				stack.pop();
				sb.append("-" + "\n");
				now = input_num[i];
			}
			else {
				int a = stack.pop();
				if(a != input_num[i]) {
					System.out.println("NO");
					System.exit(0);
				}
				else {
					sb.append("-" + "\n");
				}
			}
		}
		System.out.print(sb);
		br.close();
	}

}
