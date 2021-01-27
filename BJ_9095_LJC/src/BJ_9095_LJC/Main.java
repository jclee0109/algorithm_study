package BJ_9095_LJC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test_Case = Integer.parseInt(br.readLine());
		
	
		for(int i =0;i<Test_Case;i++) {
			int input_num = Integer.parseInt(br.readLine());
			long[] dp = new long[input_num+1];
			dp[0] = 1;
			dp[1] = 1;
			if(input_num == 1) {
				System.out.print(dp[input_num] + "\n");
				continue;
			}
			dp[2] = 2;
			if(input_num>=3) {
				for(int j = 3;j<=input_num;j++) {
					dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
				}
			}
			System.out.print(dp[input_num] + "\n");
		}
		br.close();
	}
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Test_Case = Integer.parseInt(br.readLine());
		int[] input_num = new int[Test_Case];
		int max = 0;
		
		for(int i =0;i<Test_Case;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
			if(input_num[i] > max) max = input_num[i];
		}
		long[] dp = new long[max+1];
		
		if(max == 1) {
			dp[0] = 1;
			dp[1] = 1;
		}
		if(max >= 2) {
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 2;
			if(max>=3) {
				for(int j = 3;j<=max;j++) {
					dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
				}
			}
		}
		
		
		for(int i = 0; i<Test_Case;i++) {
			sb.append(dp[input_num[i]] + "\n");
		}
		System.out.print(sb);
		br.close();
	}

}
