package geeksforgeeks;
/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
	
		
		for(int f=0;f<T;f++){
		   long  n=Long.parseLong(br.readLine());
		   long  sum=0;
		   ArrayList<Integer> list=new ArrayList<Integer>();
		   for(int i=2;i<=n;i++){
		       list.add(i);
		   }
		   sum=list.stream().filter(e->isPrime(e)).mapToInt(e->e).sum();
		   System.out.println(sum);
		}
		
	}
	private static boolean isPrime(int a) {
	boolean b=true;
	for(int i=2;i<=Math.sqrt(a);i++) {
		if(a%i==0) {
			b= false;
		}
	}
	return b;
}
}
