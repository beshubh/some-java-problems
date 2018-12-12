package geeksforgeeks;

import java.util.Scanner;

public class binaryS {
	 static int A[]=new int[4];
	static int n;
	 static int binarySearch(int val){
	         int left=0;
	         int right=n;
	         int mid=(left+right)/2;
	        while(left<right){
	        if(A[mid]==val){
	            return mid;
	        }
	         if(A[mid]>val){
	           right=mid-1;
	        }
	        if(A[mid]<val){
	             left=mid+1;
	        }
	    } 
	    return 0;
	 }
	 public static void main(String[] args) {
		 Scanner sk=new Scanner(System.in);
		 System.out.println("Enter the size ");
		 n=sk.nextInt();
		 System.out.println("Enter the elements");
		 for(int i=0;i<n;i++) {
			 A[i]=sk.nextInt();
			 
		 }
		 System.out.println(binarySearch(6));
		 
	}
}
