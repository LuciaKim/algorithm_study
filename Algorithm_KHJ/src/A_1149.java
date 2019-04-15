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
		//i의 이웃은 i-1,과 i+1이기 때문에 기준을 1로 지정함
		for( int h_i=1; h_i < h_cnt; h_i++) {
			//현재 집이 R이 선택 될 경우
			r_arr[h_i][0] = Math.min(r_arr[h_i-1][1],r_arr[h_i-1][2])+r_arr[h_i][0];
			//현재 집이 G가 선택 될 경우
			r_arr[h_i][1] = Math.min(r_arr[h_i-1][0],r_arr[h_i-1][2])+r_arr[h_i][1];
			//현재 집이 B가 선택 될 경우
			r_arr[h_i][2] = Math.min(r_arr[h_i-1][0],r_arr[h_i-1][1])+r_arr[h_i][2];
		}
		
		//마지막 집까지 계산된 금액 중 최소값을 구하여 출력한다.
		System.out.println( Math.min( Math.min( r_arr[h_cnt-1][0],r_arr[h_cnt-1][1]), r_arr[h_cnt-1][2]));
	}
}
