import java.util.Scanner;
import java.util.Stack;

public class VpsValue2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		String str = scan.next();
		char[] c_arr = str.toCharArray();
		Stack<String> st = new Stack<>();
		int sum = 0;
		
		for( int i = 0; i < c_arr.length; i++) {
			char c = c_arr[i];
			
			if( c == '(' || c == '[') {
				st.push( String.valueOf( c));
			}else if( c == ')') {
				if( c_arr[i-1] == '(') {
					st.pop();
					st.push("2");
				}else {
					for( int j = 0; j < st.size(); j++) {
						if( isInteger( st.peek())) {
							sum += Integer.valueOf( st.peek());
						}
					}
				}
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
}
