package BJ_15988_LJC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Test_Case = Integer.parseInt(br.readLine());
		int[] input_num = new int[Test_Case];
		int max = 0;
		int mod = 1000000009;
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
					dp[j] = ((dp[j-1] + dp[j-2])%mod + dp[j-3])%mod;
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