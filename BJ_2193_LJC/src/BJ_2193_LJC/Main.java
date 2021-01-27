package BJ_2193_LJC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, m;
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+1];
		dp[0] = 0;
		dp[1] = 1;
		
		if(N>=2) {
			for(int i = 2; i<=N;i++) {
				dp[i] = (dp[i-1]+ dp[i-2]);
			}
		}
		System.out.print(dp[N]);
		br.close();
	}

}