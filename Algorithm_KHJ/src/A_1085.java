import java.util.Scanner;

public class A_1085 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int width = -1;
		int hight = -1;
		
		//��輱 �߿� ����� ���� �����ϱ� ���� ������/2�� ���� ���� ��ġ���� ������ Ȯ��
		if( x > w/2) width = w-x;
		else width = x;
		
		if( y > h/2) hight = h-y;
		else hight = y;
		
		System.out.println( Math.min( width, hight));
	}
}
