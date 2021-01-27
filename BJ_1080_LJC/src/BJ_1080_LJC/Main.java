package BJ_1080_LJC;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input_AB = br.readLine().split(" ");
		final int A = Integer.parseInt(input_AB[0]);
		final int B = Integer.parseInt(input_AB[1]);
		
		int[][] matrix1 = new int[A][B];
		int[][] matrix2 = new int[A][B];
		
		
		
		
		for(int i = 0;i<A;i++) {
			String[] input_str = br.readLine().split("");
			for(int j = 0;j<B;j++) {
				matrix1[i][j] = Integer.parseInt(input_str[j]);
			}
		}
		for(int i = 0;i<A;i++) {
			String[] input_str = br.readLine().split("");
			for(int j = 0;j<B;j++) {
				matrix2[i][j] = Integer.parseInt(input_str[j]);
			}
		}
		if(A<3 || B<3) {
			for(int i = 0;i<A;i++) {
				for(int j = 0;j<B;j++) {
					if(matrix1[i][j] == matrix2[i][j]) continue;
					else {
						System.out.print(-1);
						System.exit(0);
					}
				}
			}
			System.out.print(0);
			System.exit(0);
			
		}
		//input
		int cnt = 0;
		for(int  i = 0; i<=A-3; i++) {
			for(int j = 0; j<=B-3; j++) {
				if(matrix1[i][j] == matrix2[i][j]) {
					continue;
				}
				
				else {
					for(int k1 = 0; k1<3; k1++) {
						for(int k2 =0; k2<3; k2++) {
							if(matrix1[k1 + i][k2 + j] == 0) matrix1[k1+i][k2+j] = 1;
							else matrix1[k1 + i][k2+j] = 0;
						}
					}
					cnt++;
				}
			}
		}
		
		Loop1:
		for(int i = A-3; i<A;i++) {
			for(int j = B-3;j<B;j++) {
				if(matrix1[i][j] != matrix2[i][j]) {
					cnt = -1;
					break Loop1;
				}
			}
		}
		System.out.print(cnt);
			
		
	}

}
