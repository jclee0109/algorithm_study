package BJ_2579_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Test_Case = sc.nextInt();
		int i;
		int[] Score = new int[Test_Case+1];
		
		for(i=1;i<=Test_Case; i++) {
			Score[i] = sc.nextInt();
		}
		if(Test_Case == 1) System.out.print(Score[1]);
		else {
			int[] dp = new int[Test_Case+1];
			dp[0] = 0;
			dp[1] = Score[1];
			dp[2] = Score[2] + Score[1];
			for(i=3;i<=Test_Case;i++) {
				dp[i] = Math.max(Score[i] + dp[i-2], Score[i] + Score[i-1] + dp[i-3]);
			}
			System.out.print(dp[Test_Case]);
		}
	}

}
