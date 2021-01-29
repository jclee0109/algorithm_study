package BJ_1676_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i =1; Math.pow(5, i) <= N; i++) {
			cnt += N/Math.pow(5, i);
		}
		System.out.print(cnt);
		
	}

}
