package BJ_2133_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		dp[0] = 1;
		for(int i = 2; i<=N;i+=2) {
			dp[i] = 3*(dp[i-2]);
			for(int j = 2; i-2*j >= 0; j++) {
				dp[i] += 2*dp[i-2*j];
			}
		}
		System.out.print(dp[N]);
		br.close();
	}
}