package BJ_1541_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		int ans = 0;
		boolean there_is_minus = false;
		
		for(int i =0; i<input_str.length();i++) {
			if(Is_Operator(input_str.charAt(i))) {
				/*if(input_str.charAt(i) == '+' && !there_is_minus) {
					ans += Each_Integer(sb);
				}
				else if(input_str.charAt(i) == '+' && there_is_minus) {
					ans -= Each_Integer(sb);
				}
				else if(input_str.charAt(i) == '-' && !there_is_minus) {
					there_is_minus = true;
					ans += Each_Integer(sb);	
				}
				else {
					ans -= Each_Integer(sb);
				}
				sb.setLength(0);*/
				if(!there_is_minus) {
					ans += Each_Integer(sb);
					if(input_str.charAt(i) == '-') there_is_minus = true;
				}
				else {
					ans -= Each_Integer(sb);
				}
				sb.setLength(0);
			}
			
			else sb.append(input_str.charAt(i));
		}
		if(there_is_minus) ans -= Each_Integer(sb);
		else ans += Each_Integer(sb);
		System.out.print(ans);
		
	}
	
	public static boolean Is_Operator(char chr) {
		if(chr == '+' || chr == '-') return true;
		else return false;
	}
	
	public static int Each_Integer(StringBuilder str) {
		return Integer.parseInt(str.toString());
	}
}
