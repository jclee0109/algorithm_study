package BJ_11057_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int mod = 10007;
		int[][] dp = new int[input+1][10];
		for(int i = 0; i<10;i++) {
			dp[0][i] = 0;
			dp[1][i] = 1;
		}
		
		for(int i = 2; i<=input;i++) {
			for(int j =0;j<10;j++) {
				dp[i][j] = 0;
				for(int k = 0;k<=j;k++) {
					dp[i][j] = (dp[i][j] + dp[i-1][k])%mod;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<10;i++) {
			sum = (sum + dp[input][i])%mod;
		}
		
		System.out.print(sum);
	}
}
