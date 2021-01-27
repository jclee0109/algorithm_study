package BJ_9251_LJC;
import java.io.*;
import java.util.Vector;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Character> ans_str = new Vector<>();
		String L1 = br.readLine();
		String L2 = br.readLine();
		int L1_len = L1.length();
		int L2_len = L2.length();
		int[][] dp = new int[L1_len+1][L2_len+1];
		for(int i = 0;i <L1_len+1;i++) {
			dp[i][0] = 0;
		}
		for(int i = 0;i <L2_len+1;i++) {
			dp[0][i] = 0;
		}
		
		for(int i=1;i<L1_len+1;i++) {
			for(int j = 1;j<L2_len+1;j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				if(L1.charAt(i-1) == L2.charAt(j-1)) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
					
				}
				else continue;
			}
		}
		int max = 0;
		int max_i = 0;
		for(int i = 0;i<L2_len+1;i++) {
			if(dp[L1_len][i] > max) {
				max = dp[L1_len][i];
				max_i = i;
			}
		}
		System.out.print(max);
	}

}
