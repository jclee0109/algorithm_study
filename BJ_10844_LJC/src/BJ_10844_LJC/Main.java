package BJ_10844_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mod = 1000000000;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] dp = new int[N+1][10];
		dp[1][0] = 0;
		for(int i = 1;i<=9;i++) {
			dp[1][i] = 1;
		}
		for(int i = 2;i<=N;i++) {
			for(int j = 1;j<=8;j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%mod;
			}
			dp[i][0] = dp[i-1][1]%mod;
			dp[i][9] = dp[i-1][8]%mod;
		}
		long ans=0;
		for(int i = 0;i<=9;i++) {
			if(ans>=mod)
			ans += dp[N][i]%mod;
			else ans += dp[N][i];
		}
		
		System.out.print(ans%mod);
	}

}
