package BJ_1931_LJC;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] Time = new int[N][2];
		
		for(int i = 0; i<N;i++) {
			String[] input_str = br.readLine().split(" ");
			Time[i][0] = Integer.parseInt(input_str[0]);
			Time[i][1] = Integer.parseInt(input_str[1]);
		}
		for(int i=0;i<N;i++) {
			
		}
		Arrays.sort(Time, new Comparator<int[]>(){
			@Override
			public int compare(int[] start, int[] end) {
				if(start[1] == end[1]) {
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}
		});
		int cnt = 0;
		int endtime = Time[0][1];
		for(int i = 1; i<N;i++) {
			if(Time[i][0] < endtime) {
				continue;
			}
			else {
				endtime = Time[i][1];
				cnt++;
			}
		}
		for(int i = 0; i<N;i++) {
			System.out.println(Time[i][0] + " " +Time[i][1]);
		}
		
		System.out.print(cnt);
		
	}
}