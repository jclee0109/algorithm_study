package BJ_9252_LJC;
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
		int max_i = L2_len;
		for(int i = 0;i<L2_len+1;i++) {
			if(dp[L1_len][i] > max) {
				max = dp[L1_len][i];
			}
		}
		int max_index = max;
		char[] ans = new char[max_index];
		int i = L1_len;
		int j = L2_len;
		while(i>0 && j>0) {
			if(L1.charAt(i-1) != L2.charAt(j-1)) {
				if(dp[i-1][j] > dp[i][j-1]) {
					i--;
					continue;
				}
				else {
					j--;
					continue;
				}
			}
			else {
				ans[max_index-1] = L1.charAt(i-1);
				i--;
				j--;
				max_index--;
				continue;
			}
		}
		/*
		for(int i = L1_len;i>0;i--) {
			for(int j = L2_len;j>0;j--) {
				if(L1.charAt(i-1) != L2.charAt(j-1)) {
					if(dp[i-1][j] > dp[i][j-1]) {
						i--;
						break;
					}
					else continue;
				}
				else {
				 i--;
				 j--;
				 ans_str.add(L1.charAt(i-1));
				 break;
				}
			}
		}
		*/
		System.out.print(max + "\n");
		for(int k = 0; k<max;k++) {
			System.out.print(ans[k]);
		}
	}

}
