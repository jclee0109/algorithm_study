package BJ_2293_LJC;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,k;
		String[] input_nk = br.readLine().split(" ");
		n = Integer.parseInt(input_nk[0]);
		k = Integer.parseInt(input_nk[1]);
		int[] input_num = new int[n];
		for(int i = 0; i<n;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
		}
		int[] dp = new int[k+1];
		int[][] coin = new int[n][k+1];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<k+1;j++) {
				coin[i][j] = 0;
			}
		}
		for(int i = 1; i<k+1;i++) {
			dp[i] = 0;
		}
		dp[0] = 1;
		for(int i = 1; i<k+1;i++) {
			if(i%input_num[0] == 0) {
				coin[0][i] ++;
				dp[i]++;
			}
		}
		
		for(int i = 1; i<n;i++) {
			for(int j = 1; j<k+1;j++) {
				if(j-input_num[i]<0) {
					coin[i][j] = 0;
					continue;
				}
				coin[i][j] += dp[j-input_num[i]];
				dp[j] += coin[i][j];
			}
		}
		
		System.out.print(dp[k]);
		br.close();
	}

}
