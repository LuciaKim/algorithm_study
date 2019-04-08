import java.util.Scanner;
import java.util.Stack;

public class VpsValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Stack<Character> stack = new Stack<>();
		int mul = 1; 
		int sum = 0;
		int n = 0;
		int m = 0;
		int len = str.length();

		for (int i = 0; i < len; ++i) {
			char a = str.charAt(i);
			//여는 소괄호일 경우
			if (a == '(') {
				//여는 괄호의 개수를 증가
				n++;
				stack.push(a);
				//곱하기 함수에 계산하여 저장
				mul *= 2;
				//다음 문자가 닫는 괄호일 경우 덧셈
				if (i + 1 < len && str.charAt(i + 1) == ')') {
					sum += mul;
				}
			}
			//여는 대 괄호일 경우
			else if (a == '[') {
				//여는 대 괄호수를 증가
				m++;
				stack.push(a);
				//곱셈 변수에 저장
				mul *= 3;
				if (i + 1 < len && str.charAt(i + 1) == ']') {
					sum += mul;
				}
			}

			else if (a == ')') {
				n--;
				stack.pop();
				mul /= 2;
			} else if (a == ']') {
				m--; 
				stack.pop();
				mul /= 3;
			}
		}

		System.out.println(sum);
	}
}
