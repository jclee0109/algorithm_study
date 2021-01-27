package BJ_15991_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int mod = 1000000009;
		int[] input_num = new int[T];
		int max = 0;
		for(int i = 0; i<T;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
			if(max < input_num[i]) max = input_num[i];
		}
		int[] dp = new int[max+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		for(int i = 6; i<=max; i++) {
			dp[i] = ((dp[i-2] + dp[i-4])%mod+ dp[i-6])%mod;
		}
		for(int i = 0; i<T;i++) {
			sb.append(dp[input_num[i]] + "\n");
		}
		System.out.print(sb);
	}
}
