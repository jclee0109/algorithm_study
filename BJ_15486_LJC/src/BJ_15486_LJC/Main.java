package BJ_15486_LJC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        clt();
	}
	public static void clt() {
		System.out.print(", ");
	}
}
class clt{
	clt(){};
	public static void main() {
		
	}
	
}