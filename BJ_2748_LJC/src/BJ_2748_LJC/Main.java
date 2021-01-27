package BJ_2748_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[][] fibo = new int[3][3000];
		int digit=1;
		int carry = 0;
		int i,j;
		fibo[0][1] = 0;
		fibo[1][1] = 1;
		int tmp;
		for(i=2;i<=n;i++) {
			for(j=1;j<=digit;j++) {
				tmp = (fibo[(i-1)%3][j] + fibo[(i-2)%3][j] + carry);
				fibo[i%3][j] = tmp%10;
				
				if(tmp >= 10) {
					carry = 1;
					if(j==digit) digit++;
				}
				
				else carry = 0;
			}
		}
		
		for(i=digit; i>=1; i--) {
			sb.append(fibo[n%3][i]);
		}
		System.out.print(sb);
		
	}

}