package BJ_2294_LJC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		Arrays.sort(input_num);
		int[] dp = new int[k+1];
		int[][] coin = new int[n][k+1];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<k+1;j++) {
				coin[i][j] = 0;
			}
		}
		for(int i = 0; i<k+1;i++) {
			dp[i] = 0;
		}
		int max = 10001;
		for(int i = 0; i<k+1;i++) {
			if(i%input_num[0]==0) {
				coin[0][i] = i/input_num[0];
				dp[i] = coin[0][i];
			}
			else {
				coin[0][i] = 0;
				dp[i] = max;
			}
		}
		for(int i = 1; i<n;i++) {
			if(input_num[i]==input_num[i-1]) continue;
			for(int j = 1; j<k+1;j++) {
				if(j-input_num[i] < 0) continue;
				coin[i][j] = dp[j-input_num[i]] + 1;
				if(coin[i][j] < dp[j]) dp[j] = coin[i][j];
			}
		}
		if(dp[k] >= max) System.out.print(-1);
		else System.out.print(dp[k]);
	}

}

/*
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
		*/
