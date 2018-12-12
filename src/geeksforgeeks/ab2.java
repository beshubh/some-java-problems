package geeksforgeeks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ab2 {
public static void main(String[] args) throws FileNotFoundException {
	try(Scanner sk=new Scanner(new File("input.txt"));
			PrintWriter out= new PrintWriter("output.txt"))
	{
	long[] arr=(long[]) new long[100000];
	for(int i=0;i<3;i++) {
		arr[i]=sk.nextLong();
	}
	int n=sk.nextInt();
	for(int i=3;i<=n;i++) {
		arr[i]=arr[i-1]+arr[i-2]-arr[i-3];
	}
	 
out.print(arr[n]);
		
	}

}
}
