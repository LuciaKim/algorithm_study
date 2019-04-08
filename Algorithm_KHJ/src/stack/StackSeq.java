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
			
			//������ ������ �����ϸ� �迭�� �� �߰�
			//�Էµ� ���� ���ÿ� ���� �Էµ� ������ ũ�ų� ���� ��
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
				//�Էµ� ���� ���ÿ� ���� �Էµ� ������ ���� ��
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
