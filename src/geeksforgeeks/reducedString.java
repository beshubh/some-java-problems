package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class reducedString {
	public static Integer max(Integer n1,Integer n2) {
		return Integer.compare(n1,n2);
	}
	public static void main(String ars[]) {
		List<Integer > list=new ArrayList();
		for(int i=1;i<=10;i++) {
		list.add(i);
		}

		}
		static boolean isPrime(int n) {
				for(int i=2;i<Math.sqrt(n);i++) {
						if(n%i==0) {
							return false;
									}
												}	
		return true;
		}
		}
