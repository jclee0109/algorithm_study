package BJ_1225_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_str = br.readLine().split(" ");
		/*long ans = 0;
		for(int i = 0; i<input_str[0].length();i++) {
			for(int j = 0; j<input_str[1].length();j++) {
				ans += (input_str[0].charAt(i)-'0')*(input_str[1].charAt(j)-'0');	
			}
		}*/
		long sum1 = 0;
		long sum2 = 0;
		for(int i = 0; i<input_str[0].length();i++) {
			sum1 += input_str[0].charAt(i)-'0';
		}
		for(int i = 0; i<input_str[1].length();i++) {
			sum2 += input_str[1].charAt(i)-'0';
		}
		System.out.print(sum1*sum2);
	}
}
