package BJ_11055_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int i,j;
		n = Integer.parseInt(br.readLine());
		String[] input_str = new String[n];
		input_str = br.readLine().split(" ");
		int[] input_num = new int[n];
		int[] dp = new int [n];
		for(i=0;i<n;i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
			dp[i] = input_num[i];
		}
		
		for(i=1; i<n; i++) {
			for(j=0 ; j<i; j++) {
				if(input_num[i] > input_num[j] && dp[j] + input_num[i]>dp[i]) {
					dp[i] = dp[j] + input_num[i];
				}
			}
		}
		int max = 0;
		for(i = 0; i<n; i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		
		System.out.printf("%d", max);
	}

}
