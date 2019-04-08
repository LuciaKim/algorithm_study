package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Josephus {
	public static void main( String[] args) {
		Scanner scan = new Scanner( System.in);
		int commLeng = scan.nextInt();
		int term = scan.nextInt()-1;
		int cnt = 1;
		int[] josephus_result = new int[commLeng];
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for( int i = 1; i <= commLeng; i++) {
			list.add(i);
		}
		
		josephus_result = josepush( term, list);
		StringBuilder sb = new StringBuilder("<");
		
		for( int i = 0; i < josephus_result.length; i++) {
			sb.append(josephus_result[i]);
			if( i != josephus_result.length-1) sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}
	
	public static int[] josepush( int term, LinkedList<Integer> list) {
		int[] result = new int[list.size()];
		int result_leng = 0;
		while ( list.size() != 0) {
			int position = 0;
			for( int i = 0; i < term; i++) {
				list.add( list.removeFirst());
			}
			result[result_leng] = list.removeFirst();
			result_leng++;
		}
		return result;
	}
}
