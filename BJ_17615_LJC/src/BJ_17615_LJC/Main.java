package BJ_17615_LJC;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException { // TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input_str = br.readLine();
		int index_end = N+1;
		int index_start = 0;
		int start_num_red = 0;
		int end_num_red = 0;
		int start_num_blue = 0;
		int end_num_blue = 0;
		boolean if_all_same_color = true;
		for(int i = N-1; i>=1; i--) {
			if(input_str.charAt(i) != input_str.charAt(i-1)) {
				index_end = i;
				if_all_same_color = false;
				break;
			}
		}
		for(int i = 1; i<=N-1; i++) {
			if(input_str.charAt(i) != input_str.charAt(i-1)) {
				index_start = i;
				if_all_same_color = false;
				break;
			}
		}
		
		if(if_all_same_color) {
			System.out.print("0");
			System.exit(0);
		}
	
		for(int i = index_end-1; i>=0;i--) {
			if(input_str.charAt(i) == 'R') end_num_red++;
			else end_num_blue++;
		}
	
	
		for(int i = index_start; i<N;i++) {
			if(input_str.charAt(i) == 'R') start_num_red++;
			else start_num_blue++;
		}
		
		System.out.print(Math.min(Math.min(start_num_red, start_num_blue),Math.min(end_num_red, end_num_blue)));
		
		
	}
	 
}
