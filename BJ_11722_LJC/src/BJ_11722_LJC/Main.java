package BJ_11722_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n;
		int i,j;
		n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] dp = new int [n];
		String[] input_str = new String[n];
		input_str = (br.readLine().split(" "));
		for(i=0;i<n;i++) {
			a[i] = Integer.parseInt(input_str[i]);
			dp[i] = 0;
		}
		dp[0] = 1;
		for(i=1; i<n; i++) {
			for(j=0 ; j<i; j++) {
				if(a[i] < a[j] && dp[j] >dp[i]) {
					dp[i] = dp[j];
				}
				else continue;
			}
			dp[i] += 1;
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
