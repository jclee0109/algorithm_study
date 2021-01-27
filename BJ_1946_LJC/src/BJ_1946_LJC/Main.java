package BJ_1946_LJC;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Test_Case = Integer.parseInt(br.readLine());
		for(int i = 0; i<Test_Case;i++) {
			int applicant = Integer.parseInt(br.readLine());
			int[][] rank_of_applicant = new int[applicant][2];
			for(int j = 0; j<applicant;j++) {
				String[] input_str = br.readLine().split(" ");
				rank_of_applicant[j][0] = Integer.parseInt(input_str[0]);
				rank_of_applicant[j][1] = Integer.parseInt(input_str[1]);
			}
			
			Arrays.sort(rank_of_applicant, new Comparator<int[]>() {
				@Override
				public int compare(int[] test1, int[] test2) {
					return test1[0]-test2[0];
				}
			});
			int pass_num = 0;
			int min_rank = applicant;
			for(int j = 0; j<applicant;j++) {
				if(rank_of_applicant[j][1] <= min_rank) {
					pass_num++;
					min_rank = rank_of_applicant[j][1];
				}
			}
			
			sb.append(pass_num + "\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
