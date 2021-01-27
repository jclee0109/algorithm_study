package BJ_1463_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int[] dp = new int[input_num+1];
		dp[1] = 0;
		if(input_num >= 2) dp[2] = 1;
		for(int i = 3; i<= input_num; i++) {
			int num_mod3 = i%3;
			int num_mod2 = i%2;
			if(num_mod3 == 0 && num_mod2 == 0) {
				dp[i] = Math.min(Math.min(dp[i/3], dp[i/2]),dp[i-1]) + 1;
			}
			else if(num_mod3 != 0 && num_mod2 == 0) {
				dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
			}
			else if(num_mod3 == 0 && num_mod2 != 0) {
				dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
			}
			else {
				dp[i] = dp[i - 1] + 1;
			}
		}
		System.out.print(dp[input_num]);
		
	}

}
