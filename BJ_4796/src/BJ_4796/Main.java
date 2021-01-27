package BJ_4796;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if(L==0&&P==0&&V==0) break;
			else {
				int w = V/P;
				int ans = L*w + Math.min(V%P, L);
				System.out.print("Case " + cnt + ": " );
				System.out.print(ans+"\n");
				cnt++;
			}
		}
	}
}
