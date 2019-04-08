package stack;

import java.util.Scanner;

public class Stack {
	static int[] stack;
	static int top = -1;
	
	public static void main(String[] args) {
		Stack stackObj = new Stack();
		Scanner sc = new Scanner(System.in);
		int commInt = sc.nextInt();
		stack = new int[ commInt];
		
		for( int i = 0; i < commInt; i++) {
			String command = sc.next();
			
			switch ( command) {
			case "push":
				stackObj.push( sc.nextInt());
				break;
			case "pop":
				stackObj.pop();
				break;
			case "size":
				stackObj.size();
				break;
			case "empty":
				stackObj.empty();
				break;
			case "top":
				stackObj.top();
				break;
			default:
				break;
			}
		}
	}
	
	private void push( int num) {
		if( stack.length != top) {
			stack[ top+1] = num;
			top++;
		}
	}
	
	private void pop() {
		if( top == -1) {
			System.out.println( -1);
		}else {
			System.out.println( stack[top]);
			top--;
		}
	}
	
	private void size() {
		System.out.println( top+1);
	}
	
	private void empty() {
		System.out.println( top == -1 ? 1 : 0);
	}
	
	private void top() {
		if( top == -1) {
			System.out.println( -1);
		}else {
			System.out.println( stack[top]);
		}
	}
}
