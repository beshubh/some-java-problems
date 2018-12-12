package geeksforgeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class pairsOfPrime {
public static void main(String arhs[]) {
	Scanner sk=new Scanner(System.in);
	int T=sk.nextInt();
	for(int i=0;i<T;i++) {
	primePairs(sk);
	System.out.println();
	 }
	}

private static void primePairs(Scanner sk) {
	int n=sk.nextInt();
	 ArrayList<Integer> list=new ArrayList();
	
	 for(int i=2;i<=n;i++) {
		 if(isPrime(i)) {
			 list.add(i);
		 }
	 }
	 for(int i=0;i<list.size();i++) {
		
		 for(int j=0;j<list.size();j++) {
		 if(list.get(i)*list.get(j)<=n) {
			 System.out.print(list.get(i)+" "+list.get(j)+" ");
		
		 }
		 }
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
