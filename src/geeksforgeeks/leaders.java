package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leaders {
static BufferedReader sk = new BufferedReader(new InputStreamReader(System.in));
public static void main(String args[]) throws NumberFormatException, IOException {

int n=Integer.parseInt(sk.readLine());
 for(int i=0;i<n;i++) {
 		leaderscounter();}
 		
  
}

private static void leaderscounter() throws IOException {
	int n=Integer.parseInt(sk.readLine());
	int []arr=new int[n];
    int j=0;
String line=sk.readLine();
String[] strs=line.trim().split("\\s+");
for(int i=0;i<n;i++) {
	arr[i]=Integer.parseInt(strs[i]);
}
	for(int i=0;i<arr.length;i++) {
		for(j=i+1;j<n;) {
			if(arr[i]<arr[j]) {
		 break;
			}
			else {
				j++;}
			}
		if(j==n) {
			System.out.print(arr[i]+" ");
		}
		}
}
}

