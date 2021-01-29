package BJ_2981_LJC;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] input_num = new int[N];
		for(int i = 0; i<N;i++) {
			input_num[i] = Integer.parseInt(br.readLine());
		}
		/*Queue<Integer> queue = new LinkedList<>();
		int[] minus = new int[N];
		for(int i = 1; i<N;i++) {
			minus[i] = input_num[i] - input_num[i-1];
			queue.add(minus[i]);
		}
		while(true) {
			int a = queue.poll();
			int b = queue.poll();
			queue.offer(gcd(a,b));
			if(queue.size() == 1) {
				break;
			}
		}
		
		*/
		Arrays.sort(input_num);
		int gcd_val = input_num[1] - input_num[0];
		for(int i = 2; i<N; i++) {
			gcd_val = gcd(gcd_val, input_num[i] - input_num[i-1]);
		}
		
		for(int i = 2; i<=gcd_val;i++) {
			if(gcd_val%i == 0) {
				sb.append(i + " ");
			}
		}
		
		System.out.print(sb);
		br.close();
	}
	
		public static int[] gcd(int[] a) {
			int min = find_min(a);
			for (int i = 0; i < a.length; i++) {
				a[i] %= min;
			}
			return a;
		}

		public static int find_min(int[] a) {
			int min = 1000000001;
			for (int i = 0; i < a.length; i++) {
				if (min > a[i] && a[i] > 0)
					min = a[i];
			}
			return min;
		}
		/*int greedy = 0;
	
		for(int j =0; j<input_num[0]-1; j++){
			greedy = input_num[0] - j;
			boolean possible = true;
			for(int i = 1; i<N;i++) {
				gcd[i] = input_num[i] - j;
				if(gcd(gcd[i], greedy)== 1) {
					possible = false;
					break;
				}
				else {
					greedy = gcd(gcd[i], greedy);
				}
			}
			if(possible) {
				sb.append(greedy + " ");
			}
		}
		boolean possible2 = true;
		for(int i =1; i<N;i++) {
			if(input_num[i]%input_num[0] != 0) {
				possible2 = false;
				break;
			}
			else {
				continue;
			}
		}
		if(possible2) sb.append(input_num[0]);
		System.out.print(sb);*/
		
		/*
		for(int i = 2; i<=input_num[0];i++) {
			int mod = input_num[0] % i;
			boolean possible = true;
			for(int j=0;j<N;j++) {
				if(gcd(i, input_num[j]-mod) != i) {
					possible = false;
					break;
				}
				else {
					continue;
				}
			}
			if(possible) sb.append(i + " ");
		}*/
		/*
		int gcd_tot = input_num[1] - input_num[0];
		for(int i = 0; i<N-2;i++) {
			gcd_tot = gcd(gcd_tot, input_num[i+2]-input_num[i+1]);
		}
		for(int i = 2; i<=gcd_tot/2 || i<=input_num[0];i++) {
			if(gcd_tot%i == 0) {
				sb.append(i + " ");
			}
		}*/
		
		
		/*while(true) {
			min = find_min(minus);
			int sum = 0;
			for(int i = 0; i<N; i++) {
				minus[i] %= min;
				sum += minus[i];
			}
			if(sum == 0) {
				ans = min;
				break;
			}
			else continue;
		}*/
		
		
		
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
		/*if(a==0 || b==0) {
			if(a==0) return b;
			else return a;
		}
		else {
			if(a>b) return gcd(a-b*(a/b), b);
			else return gcd(a, b-a*(b/a));
		}*/
}
