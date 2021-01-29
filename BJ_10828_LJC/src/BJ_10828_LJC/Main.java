package BJ_10828_LJC;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N;i++) {
			String[] input_str = br.readLine().split(" ");
			if(input_str[0].equals("push")) {
				stack.push(Integer.parseInt(input_str[1]));
				input_str[1] = "";
			}
			else if(input_str[0].equals("top")) {
				stack.top();
			}
			else if(input_str[0].equals("pop")) {
				stack.pop();
			}
			else if(input_str[0].equals("size")) {
				stack.size();
			}
			else stack.isEmpty();
		}
		stack.print_sb();
		
	}

}
/*
class Stack {
	int top;
	int [] stack;
	int size;
	public Stack() {
		stack = new int[10000000];
		top = -1;
	}
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int item) {
		stack[++top] = item;
	}
	
	public int pop() {
		if(top == -1) return -1;
		int tmp = stack[top];
		stack[top--] = 0;
		return tmp;
	}
	
	public int top() {
		if(top==-1) return -1;
		return stack[top];
		
	}
	
	public int size() {
		return top+1;
	}
	public int search(int item) {
		for(int i = 0; i<=top;i++) {
			if(stack[i] == item) return i;
		}
		return -1;
	}
	public int isEmpty() {
		if(top < 0) return 1;
		else return 0;
	}
	
}
*/
class Stack {
	int top;
	int [] stack;
	int size;
	StringBuilder sb = new StringBuilder();
	public Stack() {
		stack = new int[10000000];
		top = -1;
	}
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int item) {
		stack[++top] = item;
	}
	
	public void pop() {
		if(top <= -1) {
			sb.append("-1"+ "\n");
		}
		else {
			int tmp = stack[top];
			stack[top--] = 0;
			sb.append(tmp+ "\n");
		}
		
	}
	
	public void top() {
		if(top<=-1) {
			sb.append("-1" + "\n");
		}
		else sb.append(stack[top]+ "\n");
		
	}
	
	public void size() {
		sb.append(top+1+ "\n");
	}
	public int search(int item) {
		for(int i = 0; i<=top;i++) {
			if(stack[i] == item) return i;
		}
		return -1;
	}
	public void isEmpty() {
		if(top < 0) {
			sb.append("1"+ "\n");
		}
		else {
			sb.append("0"+ "\n");
		}
	}
	public void print_sb(){
		System.out.print(sb);
	}
	
}