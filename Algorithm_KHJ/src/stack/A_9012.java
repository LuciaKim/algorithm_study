package stack;

import java.util.Scanner;

public class A_9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		
		int strLeng = scan.nextInt();
		
		for( int i = 0; i < strLeng; i++) {
			String str = scan.next();
			char[] chr = new char[str.length()];
			int top = -1;
			boolean result = true;
			
			for( int j = 0; j < str.length(); j++) {
				
				if( str.charAt(j) == '(') {
					chr[top+1] = str.charAt(j);
					top++;
				}else if( str.charAt(j) == ')') {
					if( top != -1 && chr[top] == '(') {
						top--;
					}else {
						result = false;
						break;
					}
				}
			}
			
			if( result && top == -1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
