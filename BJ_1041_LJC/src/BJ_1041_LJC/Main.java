package BJ_1041_LJC;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		long[] dice_num = new long[6];
		String[] input_str = br.readLine().split(" ");
		for(int i = 0; i<6;i++) {
			dice_num[i] = Integer.parseInt(input_str[i]);
		}
		long[] min_dice = new long[3];
		long ans = 0;
		if(N==1) {
			Arrays.sort(dice_num);
			for(int i = 0;i<5;i++) {
				ans += dice_num[i];
			}
			System.out.print(ans);
			System.exit(0);
		}
		
		for(int i = 0; i<3;i++) {
			min_dice[i] = Math.min(dice_num[i], dice_num[5-i]);
		}
		Arrays.sort(min_dice);
		
		long sum = 0;
		sum += ((N-2)*(N-1)*4 + (N-2)*(N-2))*min_dice[0];
		sum += ((N-1)*4 + (N-2)*4)*(min_dice[0]+min_dice[1]);
		sum += 4*(min_dice[0] + min_dice[1] + min_dice[2]);
		
		System.out.print(sum);
		br.close();
	}

}
