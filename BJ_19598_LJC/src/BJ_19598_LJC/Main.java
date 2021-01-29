package BJ_19598_LJC;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		for(int i = 0; i<N;i++) {
			String[] input_str = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(input_str[0]);
			time[i][1] = Integer.parseInt(input_str[1]);
		}
		array_sort(time);
		int ans_cnt=0;
		while(time[0][0] != 2147483647) {
			check_time(time, N);
			ans_cnt++;
		}
		System.out.print(ans_cnt);
		
	}
	
	public static int[][] array_sort(int[][] a){
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] start, int[] end) {
				if(start[1] == end[1]) {
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}
		});
		return a;
	}
	
	public static int[][] check_time(int[][] a, int N){
		int max = 2147483647;
		boolean there_is_nothing_to_add = true;
		int endtime = a[0][1];
		for(int i = 0; i<N-1;i++) {
			if(a[i][0] == a[i][1]) break;
			else{
				if(endtime <= a[i+1][0]) {
					a[i][0] =max;
					a[i][1] = max;
					a[i+1][0] = max;
					a[i+1][1] = max;
					there_is_nothing_to_add = false;
					endtime = a[i+1][1];
				}
				else continue;
			}
		}
		if(there_is_nothing_to_add) {
			a[0][0] = max;
			a[0][1] = max;
		}
		return array_sort(a);
	}
	
}
