package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] queue = new int[10001];
		String command = "";
		int bottom = 0;
		int top =0;
		int size =0;
		int value =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		size =Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++)
		{
			command = br.readLine();
			switch(command)
			{
			case "push":
				if(size<10000)
				{
					value = Integer.parseInt(br.readLine());
					queue[top] = value;
					top++;
					break;
				}
			case "pop":
				if(bottom>(top-1))
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(queue[bottom]);
					bottom++;
				}
				break;
			case "size":
				System.out.println(top-bottom);
				break;
			case "empty":
				if(top-bottom <= 0)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
				break;
			case "back":
				if(top-bottom <= 0)
				{
					System.out.println("-1");
				}
				else {
					System.out.println(queue[top-1]);
				}
				break;
			case "front":
				if(top-bottom <= 0)
				{
					System.out.println("-1");
				}
				else {
					System.out.println(queue[bottom]);
				}
				break;
			}
		}
				
	} 

}
