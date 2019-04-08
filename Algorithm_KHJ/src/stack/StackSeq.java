package stack;

import java.util.Scanner;

public class StackSeq {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		
		int intLeng = scan.nextInt();
		int[] stack = new int[ intLeng];
		StringBuffer sb = new StringBuffer();
		
		boolean isSeq = true;
		int top = -1;
		int n_num = 1;
		
		for( int i = 0; i < intLeng; i++) {
			int i_num = scan.nextInt();
			
			//수열의 값까지 증가하며 배열에 값 추가
			//입력된 수가 스택에 순차 입력된 수보다 크거나 같을 때
			if( i_num >= n_num) {
				for( int j = n_num; j <= i_num; j++) {
					stack[top+1] = n_num;
					top++;
					sb.append("+\n");
					
					if( i_num == n_num) {
						sb.append("-\n");
						stack[top] = 0;
						top--;
					}
					
					n_num++;
				}
			}else {
				//입력된 수가 스택에 순차 입력된 수보다 작을 때
				if( stack[top] == i_num) {
					sb.append("-\n");
					stack[top] = 0;
					top--;
				}else {
					isSeq = false;
					break;
				}
			}
		}
		
		if( isSeq) {
			System.out.println( sb.toString());
		}else {
			System.out.println("NO");
		}
	}
}
