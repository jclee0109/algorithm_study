package BJ_1011_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			long sub = N-M;
			long num=0;
			long j = 0;
			while(num<sub) {
				num+=(j+++1)/2;
			}
			sb.append(--j+"\n");
		}
		System.out.println(sb);
	} // int를 long으로 바꿔주니까 -> 시간초과도 해결 '틀렸습니다'도 해결
		
		/*
		for(int i=0;i<T;i++) {
			long M = sc.nextInt();
			long N = sc.nextInt();
			long sub = N-M;
			long j = 1;
			
			j = (long)Math.sqrt(sub);
			if(j*j - sub == 0) {
				sb.append(j*2 -1 + "\n");
				continue;
			}
			else {
				j++;
				if(sub > j*j - j) sb.append(j*2 -1 + "\n");
				else sb.append((j-1)*2 + "\n");
			}
			
		}
		System.out.println(sb);
	}*/ //success code
} //범위 때문에 long이 매우 중요한 것 같습니다.
