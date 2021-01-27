package BJ_1912_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] input_num = new int[n];
		String[] input_str = br.readLine().split(" ");
		for(int i = 0; i<n;i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}
		int[] dp = new int[n];
		dp[0] = input_num[0];
		for(int i = 1;i<n;i++) {
			if(dp[i-1] < 0) dp[i] = input_num[i];
			else dp[i] = dp[i-1] + input_num[i];
		}
		int max = -1001;
		for(int i = 0;i<n;i++) {
			if(max < dp[i]) max = dp[i];
		}
		System.out.print(max);
	}

}
