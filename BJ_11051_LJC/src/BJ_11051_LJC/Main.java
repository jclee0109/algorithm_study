package BJ_11051_LJC;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_str = br.readLine().split(" ");
		int N = Integer.parseInt(input_str[0]);
		int K = Integer.parseInt(input_str[1]);
		/*int[] dp = new int[N+1];
		dp[0] = 1;
		for(int i = 1; i<=N;i++) {
			dp[i] = (dp[i-1]%10007)*i;
		}
		
		System.out.print(dp[N]/(dp[K]*dp[N-K]));
		*/
		
		int[][] dp = new int[N+1][N+1];
		for(int i =0; i<N+1;i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}
		/*
		for(int i = 2; i<N+1;i++) {
			for(int j = 1; j<i;j++) {
				dp[i][j] = 0;
				for(int k = j-1; k<i;k++) {
					dp[i][j] = (dp[i][j] + dp[k][j-1])%10007;
				}
			}
		}*/
		for(int i = 2; i<N+1;i++) {
			for(int j = 1; j<i;j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%10007;
			}
		}
		
		System.out.print(dp[N][K]);
		
		br.close();
		
	}

}
