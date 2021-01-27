package BJ_1783_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_str = br.readLine().split(" ");
		int N = Integer.parseInt(input_str[0]);
		int M = Integer.parseInt(input_str[1]);
		int ans = 0;
		if(N==1) {
			ans=1;
		}
		else {
			if(N<=2) {
				ans = Math.min(4, (M+1)/2);
			}
			else {
				if(M>=7) {
					ans = M-2;
				}
				else {
					ans = Math.min(4, M);
				}
			}
		}
		System.out.print(ans);
		
		
	}

}
