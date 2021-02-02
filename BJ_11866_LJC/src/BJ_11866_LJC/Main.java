package BJ_11866_LJC;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer>queue = new LinkedList<>();
		String[] input_NK = br.readLine().split(" ");
		int N = Integer.parseInt(input_NK[0]);
		int K = Integer.parseInt(input_NK[1]);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = 1; i<=N;i++) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			for(int i = 0;i<K-1;i++) {
				int tmp = queue.poll();
				queue.add(tmp);
			}
			sb.append(queue.poll()+ ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.print(sb);
		br.close();
	}

}
