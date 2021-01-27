package BJ_11053_LJC;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j;
		int[] A = new int[N+1];
		for(i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		int[] dp = new int[N+1];
		for(i=1;i<=N;i++) {
			dp[i] = 0;
		}
		for(i=0;i<N;i++) {
			for(j=i-1;j>=0;j--) {
				if(A[j] < A[i]) dp[i] = Math.max(dp[i], dp[j]);
			}
			dp[i]++;
		}
		int dp_Max = 1;
		for(i=1;i<=N;i++) {
			if(dp_Max <= dp[i]) dp_Max = dp[i];
		}
		System.out.print(dp_Max);
	}

}
