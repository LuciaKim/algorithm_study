import java.util.Scanner;

public class A_2747_2 {
	static int[] num_arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int num = scan.nextInt();
		num_arr = new int[num+1];

		System.out.println( fib( num));
	}
	
	public static int fib(int n) {
		//����Լ��� ó��
		if( n < 1) {
			return n;
		}
		//�޸������̼� ���
		if( num_arr[n] != 0) {
			//�̹� ���� ����� ���� �� ���� ����Ѵ�.
			return num_arr[n];
		}else {
			//���� �� ���� �ƴ� ��� ����Լ��� ����Ͽ� �����Ѵ�.
			if( n == 1) {
				return num_arr[1] = 1;
			}else {
				return num_arr[n] = fib(n-2) + fib(n-1);
			}
		}
	}
} 
