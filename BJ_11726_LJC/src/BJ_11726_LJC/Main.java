package BJ_11726_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		int mod = 10007;
		dp[0] = 1;
		dp[1] = 1;
		if(N>=2) {
			for(int i = 2; i<=N;i++) {
				dp[i] = (dp[i-1]+ dp[i-2])%mod;
			}
		}
		System.out.print(dp[N]%mod);
		br.close();
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[3];
		int mod = 10007;
		dp[0] = 1;
		dp[1] = 1;
		if(N>=2) {
			for(int i = 2; i<=N;i++) {
				dp[i%3] = (dp[(i-1)%3]+ dp[(i-2)%3])%mod;
			}
		}
		System.out.print(dp[N%3]%mod);
		br.close();
	}

}
