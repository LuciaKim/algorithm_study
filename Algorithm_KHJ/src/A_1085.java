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
		
		//경계선 중에 가까운 것을 추출하기 위해 꼭지점/2의 수가 현재 위치보다 작은지 확인
		if( x > w/2) width = w-x;
		else width = x;
		
		if( y > h/2) hight = h-y;
		else hight = y;
		
		System.out.println( Math.min( width, hight));
	}
}
