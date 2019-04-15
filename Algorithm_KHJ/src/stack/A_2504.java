package stack;

import java.util.Scanner;

public class A_2504 {
	public static void main( String[] args) {
		Scanner scan = new Scanner( System.in);
		String str = scan.next();
		char[] c_arr = str.toCharArray();
		
		for( int i = 0; i < c_arr.length; i++) {
			char c = c_arr[i];
			
			if( c == '(' || c == '[') {
			}
		}
	}
	
	public static boolean isInteger( String ctr) {
		try {
			Double.parseDouble( ctr);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void sum( String[] resultArr) {
		
	}
}
