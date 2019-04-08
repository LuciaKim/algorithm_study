package queue;

import java.util.Scanner;

public class QueueImple {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int commLeng = scan.nextInt();
		int[] queue = new int[ commLeng];
		int front = -1;
		int end = -1;
		
		
		for( int i = 0; i < commLeng; i++) {
			String comm = scan.next();
			
			switch ( comm) {
			case "push":
				queue[++end] = scan.nextInt();
				if( front == -1) front = 0;
				break;
			case "pop":
				if( empty( front, end)) {
					System.out.println(-1);
				}else {
					System.out.println(queue[front]);
					front++;
				}
				break;
			case "size":
				if( empty( front, end)) {
					System.out.println( 0);
				}else {
					System.out.println( (end-front)+1);
				}
				break;
			case "empty":
				if( front == -1 || (front-1) == end) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "front":
				if( empty( front, end)) {
					System.out.println(-1);
				}else {
					System.out.println( queue[front]);
				}
				break;
			case "back":
				if( empty( front, end)) {
					System.out.println(-1);
				}else {
					System.out.println( queue[end]);
				}
				break;
			}
		}
	}
	
	public static boolean empty( int front, int end) {
		if( front == -1 || (front-1) == end) {
			return true;
		}
		else {
			return false;
		}
	}
}
