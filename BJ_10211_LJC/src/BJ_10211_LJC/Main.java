package BJ_10211_LJC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int n = 0;
		int i,j;
		for(j = 0; j<T;j++) {
			n = Integer.parseInt(br.readLine());
			int[] input_num = new int[n];
			String[] input_str = br.readLine().split(" ");
			for(i = 0; i<n;i++) {
				input_num[i] = Integer.parseInt(input_str[i]);
			}
			int[] dp = new int[n];
			dp[0] = input_num[0];
			for(i = 1;i<n;i++) {
				if(dp[i-1] < 0) dp[i] = input_num[i];
				else dp[i] = dp[i-1] + input_num[i];
			}
			int max = -1001;
			for(i = 0;i<n;i++) {
				if(max < dp[i]) max = dp[i];
			}
			sb.append(max + "\n");
		}
		
		System.out.print(sb);
	}

}
