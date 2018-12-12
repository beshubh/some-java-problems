package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class minDistance {
public static void main(String[] args) {
	Scanner sk=new Scanner(System.in);
	 int minDis=0;
	 int temprary=0;
	int n=sk.nextInt();
	int [] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sk.nextInt();
		
	}
 List<Integer> list=new ArrayList<>();
 for(int i:arr) {
	 list.add(i);
 }
 
 int a=sk.nextInt();
 int b=sk.nextInt();
 if(!list.contains(a)||!list.contains(b)){
	 System.out.print(-1);
	 System.exit(0);
 }
 int start=Arrays.binarySearch(arr,a);
 int end=Arrays.binarySearch(arr,b);
 int minimum=Math.abs(arr[start]-arr[start+1]);
 for(int i=start;i<end;i++) {
	 if(Math.abs(arr[start]-arr[start+1])<=minimum) {
		 minimum=Math.abs(arr[start]-arr[start+1]);
	 }
 }
 System.out.println(minimum);

}
}
