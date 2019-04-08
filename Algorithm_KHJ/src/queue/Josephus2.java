package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		Queue<Integer> jo = new LinkedList<Integer>();
		int m = input.nextInt();
		int q[] = new int[n];
		for(int i=0; i<n; i++){
			q[i] = i+1;
		}
		boolean check = true;
		int tc = 0; //totalCheck
		int count =1;
		int	index = 0; //q[n]
		while(check){
			for(int j=0; j<n; j++){
				if(q[j]==-1){
					tc++;
				}
			}
			if(tc==n){
				check=false;
			}
			tc=0;
			index++;
			if(index==n){
				index = 0;
			}
			if(q[index]!=-1){
				count++;
			}
			if(count%m==0){
				if(q[index]!=-1){
					jo.offer(q[index]);
				}
				q[index]=-1;
			}

		}
		System.out.print("<"+jo.poll());
		while(!jo.isEmpty()){
			System.out.print(", "+jo.poll());
		}
		System.out.println(">");
	}
}
