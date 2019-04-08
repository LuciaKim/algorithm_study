package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class QueuePrint {
	
	public static void main( String[] args) {
		Scanner scan = new Scanner( System.in);
		int commLeng = scan.nextInt();
		
		for( int i = 0; i < commLeng; i++) {
			int arr_leng = scan.nextInt();
			int target_position = scan.nextInt();
			int out_cnt = 1;
			
			LinkedList<int[]> list = new LinkedList<int[]>();
			
			for( int j = 0; j < arr_leng; j++) {
				list.add( new int[] {j,scan.nextInt()});
			}
			
			if( list.size() <= 1) {
				System.out.println( out_cnt);
			}else {
				for( int j = 0; j < list.size();) {
					boolean bigger = true;
					for( int f = 1; f < list.size(); f++) {
						int[] tmp = list.get( j);
						if( list.get( j)[1] < list.get( f)[1]) {
							bigger = false;
							list.removeFirst();
							list.add( tmp);
							break;
						}
					}
					if( bigger) {
						if( target_position == list.get( j)[0]) {
							System.out.println( out_cnt);
							break;
						}
						list.removeFirst();
						out_cnt++;
					}
				}
			}
		}
	}
}
