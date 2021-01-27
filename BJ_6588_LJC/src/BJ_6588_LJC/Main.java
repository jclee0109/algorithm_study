package BJ_6588_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] input = new int[100000];
		int stage = 0;
		int i,j=0;
		int max = 0;
		int stage_max = 0;
		while(true) {
			input[stage] = sc.nextInt();
			if(input[stage] == 0) {
				stage_max = stage;
				break;
			}
			if(max<= input[stage]) max = input[stage];
			stage++;
		}
		boolean[] testprime = new boolean[max];
		for(i=0;i<max;i++) testprime[i] = true;
		testprime[0] = false;
		testprime[1] = false;
		testprime[2] = true;
		int k = 0;
		int[] prime = new int[100000];
		for(i=2;i*i<max;i++) {
			if(testprime[i]) {
				prime[k] = i;
				k++;
				for(j=2;j*i<max;j++) {
					testprime[i*j] = false;
				}
			}
		}
		int primelen = k;

		for(int n =0; n<stage_max; n++) {
			for(i=1;i<=primelen;i++) {
				if(testprime[input[n] - prime[i]]) {
					sb.append(input[n] + " = " + prime[i] + " + " + (input[n] - prime[i]) + '\n');
					break;
				}
			}
		}
		
		System.out.print(sb);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] input = new int[100000];
		int stage = 0;
		int i,j=0;
		int max = 0;
		int stage_max = 0;
		while(true) {
			input[stage] = sc.nextInt();
			if(input[stage] == 0) {
				stage_max = stage;
				break;
			}
			if(max<= input[stage]) max = input[stage];
			stage++;
		}
		boolean[] testprime = new boolean[max];
		for(i=0;i<max;i++) testprime[i] = true;
		testprime[0] = false;
		testprime[1] = false;
		testprime[2] = true;
		int k = 0;
		int[] prime = new int[100000];
		for(i=2;i<max;i++) {
			if(i*i<=max){
				if(testprime[i]) {
					prime[k] = i;
					k++;
					for(j=2;j*i<max;j++) {
						testprime[i*j] = false;
					}
				}
			}
			else if(testprime[i]) {
				prime[k] = i;
				k++;
			}
			
		}
		int primelen = k;
		
		for(int n =0; n<=stage_max; n++) {
			Loop1:
			for(i=1;i<=primelen;i++) {
				int mid=0;
				int left = 0;
				int right = primelen;
				while(right>=left) {
					mid = (right + left)/2;
					if(input[n]-prime[i] == prime[mid]) {
						sb.append(input[n] + " = " + prime[i] + " + " + prime[mid] + '\n');
						break Loop1;
					}
					else {
						if(input[n]-prime[i] < prime[mid]) {
							right = mid - 1;
						}
						else left = mid + 1;
					}	
				}
			}
		}
		
		System.out.print(sb);
		
		
		/*int i;
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			for(i=3; i<=n/2;i+=2) {
				if(testprime[i] && testprime[n-i]) {
					sb.append(n + " = " + i + " + " + (n-i) + '\n');
					break;
				}
				else continue;
			}
			if(i == n/2 + 2) sb.append("Goldbach's conjecture is wrong.\n");
		}
		System.out.print(sb);
		*/
		
		/*int[] input = new int[100000];
		int stage = 0;
		int i,j;
		int max = 0;
		int stage_max = 0;
		while(true) {
			input[stage] = sc.nextInt();
			if(input[stage] == 0) {
				stage_max = stage;
				break;
			}
			if(max<= input[stage]) max = input[stage];
			stage++;
		}
		boolean[] testprime = new boolean[max+1];
		for(i=0;i<max+1;i++) testprime[i] = true;
		testprime[0] = false;
		testprime[1] = false;
		testprime[2] = true;
		for(i=2;i*i<max+1;i++) {
			if(testprime[i]) {
				for(j=2;j*i<=max;j++) {
					testprime[i*j] = false;
				}
			}
		}
		for(stage=0;stage<stage_max; stage++) {
			for(i=3; i<=input[stage]/2;i+=2) {
				if(testprime[i] && testprime[input[stage]-i]) {
					sb.append(input[stage] + " = " + i + " + " + (input[stage]-i) + '\n');
					break;
				}
				else continue;
			}
			if(i == input[stage]/2 + 2) sb.append("Goldbach's conjecture is wrong.\n");
			
			i++;
		}
		
		System.out.print(sb);
		*/
		
		/*
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			boolean[] testprime = new boolean[n+1];
			int i,j;
			for(i=0;i<n+1;i++) testprime[i] = true;
			testprime[0] = false;
			testprime[1] = false;
			testprime[2] = true;
			for(i=2;i*i<n+1;i++) {
				if(testprime[i]) {
					for(j=2;j*i<=n;j++) {
						testprime[i*j] = false;
					}
				}
			}
			for(i=3; i<=n/2;i+=2) {
				if(testprime[i] && testprime[n-i]) {
					sb.append(n + " = " + i + " + " + (n-i) + '\n');
					break;
				}
				else continue;
			}
			if(i == n/2 + 2) sb.append("Goldbach's conjecture is wrong.\n");
		}
		System.out.print(sb);*/
		
	}

}
