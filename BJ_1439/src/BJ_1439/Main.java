package BJ_1439;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		for(int i = 0; i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				continue;
			}
			else cnt++;
		}
		System.out.print((cnt+1)/2);
	}
}
