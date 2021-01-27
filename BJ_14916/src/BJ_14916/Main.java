package BJ_14916;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt2 = 0;
		int cnt5 = a/5;
		while(true) {
			if((a-5*cnt5)%2 == 0) {
				cnt2 = (a-5*cnt5)/2;
				System.out.print(cnt2+cnt5);
				break;
			}
			else {
				cnt5--;
				if(cnt5 < 0) {
					System.out.print(-1);
					break;
				}
			}
		}
	}
}
