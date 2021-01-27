package BJ_1932_LJC;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i,j;
		int[][] dp = new int[n+1][n+1];
		String[][] str = new String[n+1][n+1];
		for(i=1;i<=n;i++) {
			str[i] = br.readLine().split(" "); 
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				dp[i][j] = Integer.parseInt(str[i][j-1]);
			}
		}
		
		for(i=2;i<n+1;i++) {
			for(j=1;j<=i;j++) {
				/*if(dp[i-1][j-1]>dp[i-1][j]) {
					dp[i][j] += dp[i-1][j-1];
				}
				else {
					dp[i][j] += dp[i-1][j];
				}*/
				dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		int ans = dp[n][0];
		for(i=1;i<n+1;i++) {
			if(dp[n][i] > ans) {
				ans = dp[n][i];
			}
		}
		System.out.printf("%d", ans);
		
	}

}
