package BJ_11058_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+1];
		if(N>=5) {
			for(int i = 0;i<=5;i++) {
				dp[i] = i;
			}
			for(int i = 6;i<=N;i++) {
				dp[i] = dp[i-3]*2;
				for(int j=4;j<i;j++) {
					dp[i] = Math.max(dp[i], dp[i-j]*(j-1));
				}
			}
			System.out.print(dp[N]);
		}
		else System.out.print(N);
	}
}
	