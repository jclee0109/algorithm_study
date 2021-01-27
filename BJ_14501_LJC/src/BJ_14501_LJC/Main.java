package BJ_14501_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Time = new int[N+2];
		int[] Price = new int[N+2];
		Time[0] = 0;
		Price[0] = 1;
		for(int i = 1; i<=N;i++) {
			String[] input_string = br.readLine().split(" ");
			Time[i] = Integer.parseInt(input_string[0]);
			Price[i] = Integer.parseInt(input_string[1]);
		}
		
		long[] dp = new long[N+2];
		for(int i = 0; i<=N+1;i++) dp[i] = 0;
		for(int i = N; i>0;i--) {
			if(i + Time[i] > N+1) {
                dp[i] = dp[i+1];
				continue;
			}
			else {
				for(int j=Time[i];j+i<=N+1;j++)
					if(i+j + Time[i+j] > N+1) continue;
					else {
						if(Price[i] + dp[j + i] > dp[i+1]) {
							dp[i] = Price[i] + dp[j + i]; 
						}
						else dp[i] = dp[i+1];
						break;
					}		
			}
		}
        System.out.print(dp[1]);
	}
}
	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Time = new int[N+1];
		int[] Price = new int[N+1];
		Time[0] = 0;
		Price[0] = 1;
		for(int i = 1; i<=N;i++) {
			String[] input_string = br.readLine().split(" ");
			Time[i] = Integer.parseInt(input_string[0]);
			Price[i] = Integer.parseInt(input_string[1]);
		}
		
		long[] dp = new long[N+2];
		for(int i = 0; i<=N+1;i++) dp[i] = 0;
		for(int i = N; i>0;i--) {
			int next = i + Time[i];
			int flag = 0;
			if(i + Time[i] > N+1) {
				continue;
			}
			else{
				for(int j = 1; j+i<=N;j++) {
					if(i + j + Time[i +j] > N+1) break;
					else {
						if(Price[i] + dp[j+i] > dp[i+1]) {
							dp[i] = Price[i] + dp[j+i];
						}
						else {
							dp[i] = dp[i+1];
						}
					}
				}
			}
		}
        System.out.print(dp[1]);
        
	}*/


/*
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Time = new int[N+1];
		int[] Price = new int[N+1];
		Time[0] = 0;
		Price[0] = 1;
		for(int i = 1; i<=N;i++) {
			Time[i] = sc.nextInt();
			Price[i] = sc.nextInt();
		}
		
		long[] dp = new long[N+2];
		for(int i = 0; i<=N+1;i++) dp[i] = 0;
		for(int i = N; i>0;i--) {
			{
				if(i + Time[i] > N+1) {
					continue;
				}
				else {
					if(Price[i] + dp[Time[i] + i] > dp[i+1]) {
						dp[i] = Price[i] + dp[Time[i] + i]; 
					}
					else dp[i] = dp[i+1];
				}
			}
		}
		System.out.print(dp[1]);
	}
}
*/
