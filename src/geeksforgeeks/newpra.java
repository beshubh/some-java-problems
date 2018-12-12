package geeksforgeeks;

 /*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	 Scanner sk= new Scanner(System.in);
	  int T=sk.nextInt();
	  while(T>0){
	      long arr[]=new long[200];
	      long n=sk.nextLong();
	     for(int i=0;i<n;i++){
	         arr[i]=sk.nextLong();
	     }
	   buildTournmin(n,arr);
	   System.out.print(arr[1]+" ");
	   System.out.print(nextMin(n,arr)+"\n");
	  }
	}
	private static long nextMin(long n,long[] tournament){
	    long next=maxi(tournament[2],tournament[3]);
	    int i=2;
            while(i<2*n-1){
	        if(tournament[i]>tournament[i+1]){
	            next=mini(tournament[i+1],next);
	            i=2*i;
	        }
	        else 
	        next=mini(tournament[i],next);
	        i=2*(i+1);}
	        return next;
	        
	    }
	    
	    
	 private static void buildTournmin(long n, long[] tournament) {
        for(long i=2*n-2;i>1;i=i-2)
        {
           tournament[(int) (i/2)]=mini(tournament[(int) i],tournament[(int) (i+1)]);
        }
        
    }
     private static long maxi(long a,long b){
        if(a>b)return a;
        else
            return b;
    }
    private static long mini(long a,long b){
        if(a<b) return a;
        else return b;
    }
}