package geeksforgeeks;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class rotate {
	public static void main (String[] args) throws IOException {
	  BufferedReader sk=new BufferedReader(new InputStreamReader(System.in));
	  int T=Integer.parseInt(sk.readLine());
	  while(T>0){
	      int N=Integer.parseInt(sk.readLine());
	      int a=Integer.parseInt(sk.readLine());
	      int arr[]=new int[N];
	      for(int i=0;i<N;i++){
	          arr[i]=Integer.parseInt(sk.readLine());
	      }
	      int temp[]=new int[a];
	      for(int i=0;i<a;i++){
	          temp[i]=arr[i];
	      }
	      for(int i=0;i<N-a;i++){
	          arr[i]=arr[i+a];
	      }
	      for(int i=N-a,j=0;i<N;i++){
	          arr[i]=temp[j];
	          j++;
	      }
	      for(int i=0;i<N;i++){
	          System.out.print(arr[i]+" ");
	      }
	      System.out.println();
	      T--;
	  }
	}
}
