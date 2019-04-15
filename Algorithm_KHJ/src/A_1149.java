import java.util.Scanner;

public class A_1149 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int h_cnt = scan.nextInt();
		int r_arr[][] = new int[h_cnt][3];
		
		for( int i=0; i < h_cnt; i++) {
			r_arr[i][0] = scan.nextInt();
			r_arr[i][1] = scan.nextInt();
			r_arr[i][2] = scan.nextInt();
		}
		//i�� �̿��� i-1,�� i+1�̱� ������ ������ 1�� ������
		for( int h_i=1; h_i < h_cnt; h_i++) {
			//���� ���� R�� ���� �� ���
			r_arr[h_i][0] = Math.min(r_arr[h_i-1][1],r_arr[h_i-1][2])+r_arr[h_i][0];
			//���� ���� G�� ���� �� ���
			r_arr[h_i][1] = Math.min(r_arr[h_i-1][0],r_arr[h_i-1][2])+r_arr[h_i][1];
			//���� ���� B�� ���� �� ���
			r_arr[h_i][2] = Math.min(r_arr[h_i-1][0],r_arr[h_i-1][1])+r_arr[h_i][2];
		}
		
		//������ ������ ���� �ݾ� �� �ּҰ��� ���Ͽ� ����Ѵ�.
		System.out.println( Math.min( Math.min( r_arr[h_cnt-1][0],r_arr[h_cnt-1][1]), r_arr[h_cnt-1][2]));
	}
}
