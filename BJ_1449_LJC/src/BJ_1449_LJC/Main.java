package BJ_1449_LJC;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_NL = br.readLine().split(" ");
		int N = Integer.parseInt(input_NL[0]);
		int L = Integer.parseInt(input_NL[1]);
		
		String[] input_str = br.readLine().split(" ");
		int[] drain = new int[N];
		for(int i = 0; i<N;i++) {
			drain[i] = Integer.parseInt(input_str[i]);
		}
		Arrays.parallelSort(drain);
		
		double now_place = 0;
		int cnt = 0;
		for(int i = 0;i<N;i++) {
			if(drain[i] > now_place) {
				cnt++;
				now_place = drain[i] + L - 0.5;
			}
			else continue;
		}
		
		System.out.print(cnt);
	}

}
