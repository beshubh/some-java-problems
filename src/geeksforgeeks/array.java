package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class array {
public static void main(String[] args) throws IOException{
//	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("Enter the size ");
//	int a=Integer.parseInt(reader.readLine());
//	int arr[]=new int[100];
//System.out.println("Enter the elements");
//	for(int j=0;j<a;j++) {
//		arr[j]=Integer.parseInt(reader.readLine());
//	}
//    System.out.println("Enter index:");
//    int b=Integer.parseInt(reader.readLine());
//    
//    
//    System.out.println("Enter the element to insert");
//    int ele=Integer.parseInt(reader.readLine());
//    int i=0;
//    for(i=a;i>b;i--) {
//    	arr[i+1]=arr[i];
//    }
//    arr[b]=ele;
//    for(int j=0;j<a;j++) {
//    	System.out.println(arr[j]);
//    }
	int arr[]= {1,2,3,4,5};
    System.out.println(Arrays.binarySearch(arr,0,arr.length,5));

	
}
}
