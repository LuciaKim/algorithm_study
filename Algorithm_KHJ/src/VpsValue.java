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
			//���� �Ұ�ȣ�� ���
			if (a == '(') {
				//���� ��ȣ�� ������ ����
				n++;
				stack.push(a);
				//���ϱ� �Լ��� ����Ͽ� ����
				mul *= 2;
				//���� ���ڰ� �ݴ� ��ȣ�� ��� ����
				if (i + 1 < len && str.charAt(i + 1) == ')') {
					sum += mul;
				}
			}
			//���� �� ��ȣ�� ���
			else if (a == '[') {
				//���� �� ��ȣ���� ����
				m++;
				stack.push(a);
				//���� ������ ����
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
