package BJ_13305_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] input_str = new String[2][];
		long[] distance = new long[N-1];
		long[] price = new long[N];
		input_str[0] = br.readLine().split(" ");
		input_str[1] = br.readLine().split(" ");
		for(int i = 0;i<N-1;i++) {
			distance[i] = Integer.parseInt(input_str[0][i]);
		}
		price[0] = Integer.parseInt(input_str[1][0]);
		for(int i = 1;i<N;i++) {
			price[i] = Integer.parseInt(input_str[1][i]);
			if(price[i-1] < price[i]) price[i] = price[i-1];
		}
		
		/*long[] greedy_price = new long[N];
		for(int i = 0; i<N;i++) {
			greedy_price[i] = price[i];
		}
		for(int i = 0;i<N-1;i++) {
			if(greedy_price[i] < greedy_price[i+1]) {
				greedy_price[i+1] = greedy_price[i];
			}
		}*/
		
		long ans = 0;
		price[N-1] = Integer.parseInt(input_str[1][N-1]);
		for(int i = 0;i<N-1;i++) {
			ans += price[i]*distance[i];
		}
		System.out.print(ans);
	}

}
//내일 수정 필요해!!!!!!!!!!!!!!