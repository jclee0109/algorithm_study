package BJ_17392_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_MN = br.readLine().split(" ");
		int N = Integer.parseInt(input_MN[0]);
		int M = Integer.parseInt(input_MN[1]);
		if(N == 0) {
			System.out.print((M+1)*(M)*(2*M+1)/6);
			System.exit(0);
		}
		String[] input_str = br.readLine().split(" ");
		
		long[] happy = new long[N+1];
		int happy_sum = 0;
		
		for(int i = 0; i<N;i++) {
			happy[i] = Integer.parseInt(input_str[i]);
			happy_sum += happy[i]+1;
		}
		
		
		if(happy_sum > M) {
			System.out.print("0");
			System.exit(0);
		}
		else {
			for(int i = 0; i<N+1;i++) {
				happy[i] = (M-happy_sum)/(N+1);
			}
			for(int i =0; i<(M-happy_sum)%(N+1);i++) {
				happy[i]++;
			}
			long sum = 0;
			for(int i = 0; i<N+1;i++) {
				sum += (happy[i])*(happy[i]+1)*(2*happy[i]+1)/6;
			}
			System.out.print(sum);
		}
		br.close();
	}

}
