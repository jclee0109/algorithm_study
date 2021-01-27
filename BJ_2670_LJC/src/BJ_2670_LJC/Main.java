package BJ_2670_LJC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] input_num = new double[N+1];
		input_num[0] = 0;
		for(int i = 1; i<=N;i++) {
			input_num[i] = Double.parseDouble(br.readLine());
		}
		double[] dp = new double[N+1];
		dp[0] = 1;
		for(int i = 1; i<N+1;i++) {
			if(dp[i-1] <= 1) {
				dp[i] = input_num[i];
			}
			else dp[i] = dp[i-1]*input_num[i];
		}
		double max = 0;
		for(int i = 1; i<N+1;i++) {
			if(max < dp[i]) max = dp[i];
		}
		System.out.printf("%.3f", max);	
		
	}
}
