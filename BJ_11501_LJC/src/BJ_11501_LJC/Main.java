package BJ_11501_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Test_Case = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<Test_Case;i++) {
			int N = Integer.parseInt(br.readLine());
			String[] input_str = br.readLine().split(" ");
			int[] price = new int[N];
			int[] max_price = new int[N];
			for(int j=0;j<N;j++) {
				price[j] = Integer.parseInt(input_str[j]);
				max_price[j] = price[j];
			}
			int now_max = max_price[N-1];
			for(int j=N-1; j>=1;j--) {
				if(max_price[j] > max_price[j-1]) {
					max_price[j-1] = now_max;
				}
				else {
					now_max = max_price[j-1];
				}
			}
			long sum = 0;
			for(int j=0;j<N;j++) {
				sum = sum - price[j] + max_price[j];
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}

}
