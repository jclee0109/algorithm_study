package BJ_1699_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int j=1;j<=N;j++) {
			int min = 100001;
			for(int i = 1; i*i<=j;i++) {
				if(min > dp[j-i*i] + 1) {
					min = dp[j-i*i] + 1;
				}
				else continue;
			}
			dp[j] = min;
		}
		System.out.print(dp[N]);
		
	}

}
