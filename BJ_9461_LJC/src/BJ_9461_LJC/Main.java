package BJ_9461_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int Test_Case = sc.nextInt();
		int i;
		int[] input_num = new int[Test_Case+1];
		int input_max = 0;
		for(i=1;i<=Test_Case;i++) {
			input_num[i] = sc.nextInt();
			if(input_num[i] > input_max) input_max = input_num[i];
		}
		/*if(input_max <= 5) {
			input_max += 5; 
		}
		long[] dp = new long[input_max +1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		for(int j = 6;j<=input_max;j++) {
			dp[j] = dp[j-1] + dp[j-5];
		}
		for(i=1;i<=Test_Case;i++) {
			sb.append(dp[input_num[i]] + "\n");
		}
		System.out.print(sb);
		*/
		for(i=1;i<=Test_Case;i++) {
			sb.append(dp(input_num[i]) + "\n");
		}
		System.out.print(sb);
	}
	
	public static long dp(int n) {
		if(n>5) return dp(n-1) + dp(n-5);
		else if(n==5 || n==4) return 2;
		else if(n==0) return 0;
		else return 1;
	}
}
