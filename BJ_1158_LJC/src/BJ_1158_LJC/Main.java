package BJ_1158_LJC;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] input_str = br.readLine().split(" ");
		int N = Integer.parseInt(input_str[0]);
		int K = Integer.parseInt(input_str[1]);
		for(int i = 1;i<=N;i++) {
			queue.add(i);
		}
		sb.append("<");
		while(!queue.isEmpty()) {
			for(int i = 0; i<K-1;i++) {
				int tmp = queue.poll();
				queue.add(tmp);
			}
			sb.append(queue.poll() + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.print(sb);
	}

}
