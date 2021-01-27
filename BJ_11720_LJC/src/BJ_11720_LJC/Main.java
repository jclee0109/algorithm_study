package BJ_11720_LJC;
import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int	sum = 0;
		for(int i = 0; i<N;i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.print(sum);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input_str = br.readLine().split("");
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum+=Integer.parseInt(input_str[i]);
		}
		System.out.print(sum);
		
	}

}
