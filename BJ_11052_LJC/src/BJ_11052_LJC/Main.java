package BJ_11052_LJC;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class Main {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j,k;
		int[] price = new int[N+1];
		int[][] dp = new int[N+1][N+1];
		price[0] = 0;
		for(i=1;i<=N;i++) {
			price[i] = sc.nextInt();
		}
		for(i=0;i<=N;i++) {
			dp[i][0] = 0;
		}
		for(i=0;i<=N;i++) {
			dp[0][i] = 0;
		}
		for(j=1;j<=N;j++) {
			for(i=j;i<=N;i++) {
				dp[i][j] = Math.max(price[j] + dp[i-j][j], dp[i][j-1]);
			}
			for(k=j;k<=N;k++) {
				dp[j][k] = dp[j][j];
			}
		}
		
		for(i=0;i<=N;i++) {
			for(j=0;j<=N;j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print(dp[N][N]);
		
	}*/
	static int[] price;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i,j,k;
		int[][] dp = new int[N+1][N+1];
		String[] input_string = br.readLine().split(" ");
		price = new int[N + 1];
		for(i = 0; i < N; i++) {
			price[i+1] = Integer.parseInt(input_string[i]);
		}
		
		
		for(i=0;i<=N;i++) {
			dp[i][0] = 0;
		}
		for(i=0;i<=N;i++) {
			dp[0][i] = 0;
		}
		for(j=1;j<=N;j++) {
			for(i=j;i<=N;i++) {
				dp[i][j] = Math.max(price[j] + dp[i-j][j], dp[i][j-1]);
			}
			for(k=j;k<=N;k++) {
				dp[j][k] = dp[j][j];
			}
		}
		
		for(i=0;i<=N;i++) {
			for(j=0;j<=N;j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print(dp[N][N]);
		br.close();
		
	}

}
