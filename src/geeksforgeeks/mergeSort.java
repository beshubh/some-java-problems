package geeksforgeeks;

import java.util.Scanner;

public class mergeSort {
public static void main(String []a) {
	 Scanner sk=new Scanner(System.in);
	 int n=sk.nextInt();
	 int arr[]=new int[n];
	 int brr[]=new int[n];
	 for(int i:arr) {
		 i=sk.nextInt();
	 }
	 for(int i:brr) {
		 i=sk.nextInt();
	 }
	 
	Merger(arr,brr);
}
static void Merger(int arr[],int []brr) {
	
	int temp[]=new int[arr.length+brr.length];
	try {
	
	for(int i=0,j=0,k=0;i<arr.length; ) {
		if(arr[i]<brr[j]) {
			temp[k]=arr[i];
			i++;
			k++;
			
		}
		else
		{
			temp[k]=brr[j];
			j++;
			k++;
		}
	}}
	catch(Exception e) {
		
	}
	for(int i:temp) {
		System.out.println(i);
	}
}
}
