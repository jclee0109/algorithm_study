package BJ_2004_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_str = br.readLine().split(" ");
		int n = Integer.parseInt(input_str[0]);
		int m = Integer.parseInt(input_str[1]);
		System.out.print(Math.min(cnt_5(n) - cnt_5(m) - cnt_5(n-m), cnt_2(n) - cnt_2(m) - cnt_2(n-m)));
		
		
	}
	public static int cnt_5(int n) {
		int cnt=0;
		for(int i =1; Math.pow(5, i) <= n; i++) {
			cnt += n/Math.pow(5, i);
		}
		return cnt;
	}
	public static int cnt_2(int n) {
		int cnt=0;
		for(int i =1; Math.pow(2, i) <= n; i++) {
			cnt += n/Math.pow(2, i);
		}
		return cnt;
	}
}
