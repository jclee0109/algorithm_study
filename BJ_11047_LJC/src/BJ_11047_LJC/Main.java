package BJ_11047_LJC;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException { 
		// TODO Auto-generated method stub 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N,K; 
		String[] input_str = br.readLine().split(" "); 
		N = Integer.parseInt(input_str[0]); 
		K = Integer.parseInt(input_str[1]); 
		int max_index = 0; 
		int[] value_of_coins = new
		int[N];
		for(int i = 0;i<N;i++) { value_of_coins[i] =
				Integer.parseInt(br.readLine()); 
				if(value_of_coins[i] > K) { max_index = i; }
		}
  
		int ans = 0;
  
		while(K!=0) { 
			for(int i = max_index-1; i>=0;i--) {
				if(value_of_coins[i] <= K){
					ans += K/value_of_coins[i]; 
					K -= (K/value_of_coins[i])*value_of_coins[i];
					max_index = i; 
					break;
					}
				}
			}
		System.out.print(N);
  
  }

}
 
/*
 * import java.io.*; public class Main {
 * 
 * public static void main(String[] args) throws IOException { // TODO
 * Auto-generated method stub BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in)); int N,K; String[] input_str =
 * br.readLine().split(" "); N = Integer.parseInt(input_str[0]); K =
 * Integer.parseInt(input_str[1]); int[] value_of_coins = new int[N]; for(int i
 * = 0;i<N;i++) { value_of_coins[i] = Integer.parseInt(br.readLine()); }
 * 
 * int index = N; int ans = 0; while(K!=0) { for(int i = index-1; i>=0;i--) {
 * if(value_of_coins[i] <= K) { ans += K/value_of_coins[i]; K -=
 * K/value_of_coins[i]*value_of_coins[i]; index = i; break; } } }
 * System.out.print(ans);
 * 
 * }
 * 
 * }
 */