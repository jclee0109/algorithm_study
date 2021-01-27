package BJ_10826_LJC;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(Fibonacci(n));
	}
	
	public static int Fibonacci(int x) {
		if(x == 0) return 0;
		else if(x == 1) return 1;
		else return Fibonacci(x-1) + Fibonacci(x-2);
	}
}