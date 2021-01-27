package BJ_15990_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Test_Case = Integer.parseInt(br.readLine());
		int[] input_num = new int[Test_Case +1];
		int max = 0;
		for(int i = 1;i<Test_Case+1;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
			if(max < input_num[i]) max = input_num[i];
		}
		input_num[0] = 0;
		int mod = 1000000009;
		int[][] dp = new int[max+1][4];
		for(int i =0;i<=max;i++) {
			dp[i][0] = 0;
		}
		for(int i = 0; i<4;i++) {
			for(int j =0;j<4;j++) {
				dp[i][j] = 0;
			}
		}
		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][3] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		for(int i=4;i<=max;i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3])%mod;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3])%mod;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2])%mod;
		}
		for(int i = 1; i<=Test_Case;i++) {
			int sum = ((dp[input_num[i]][1] + dp[input_num[i]][2])%mod + dp[input_num[i]][3])%mod;
			sb.append(sum + "\n");
			sum = 0;
		}
		System.out.print(sb);
	}

}
