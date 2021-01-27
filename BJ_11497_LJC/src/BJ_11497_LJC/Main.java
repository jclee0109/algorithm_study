package BJ_11497_LJC;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			String[] input_str = br.readLine().split(" ");
			int[] length = new int[N];
			for(int j =0; j<N;j++) {
				length[j] = Integer.parseInt(input_str[j]);
			}
			Arrays.sort(length);
			int[] greedy = new int[N];
			
			for(int j=0;j<N;j++) {
				if(j%2 == 0) {
					greedy[j/2] = length[j];
				}
				else {
					greedy[N-(j+1)/2] = length[j];
				}
			}
			int ans = greedy[N-1] - greedy[1];
			for(int j=0; j<N-1; j++) {
				if(ans < Math.abs(greedy[j+1] - greedy[j])) {
					ans = Math.abs(greedy[j+1] - greedy[j]);
				}
			}
			sb.append(ans + "\n");
		}
		System.out.print(sb);
		br.close();
		
	}

}
