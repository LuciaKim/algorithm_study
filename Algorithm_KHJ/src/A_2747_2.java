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
		//재귀함수로 처리
		if( n < 1) {
			return n;
		}
		//메모이제이션 방법
		if( num_arr[n] != 0) {
			//이미 계산된 수라면 저장 된 값을 출력한다.
			return num_arr[n];
		}else {
			//저장 된 값이 아닐 경우 재귀함수로 계산하여 리턴한다.
			if( n == 1) {
				return num_arr[1] = 1;
			}else {
				return num_arr[n] = fib(n-2) + fib(n-1);
			}
		}
	}
} 
