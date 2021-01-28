package BJ_11050_LJC;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_str = br.readLine().split(" ");
		int N = Integer.parseInt(input_str[0]);
		int K = Integer.parseInt(input_str[1]);
		int[] dp = new int[N+1];
		dp[0] = 1;
		for(int i = 1; i<=N;i++) {
			dp[i] = dp[i-1]*i;
		}
		
		 System.out.print(dp[N]/(dp[K]*dp[N-K]));
		
		br.close();
	}
	
	

}
