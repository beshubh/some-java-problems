package geeksforgeeks;
import java.math.BigInteger;
import java.util.Scanner;
/*package whatever //do not write package name here */



public class triangles {
	public static void main (String[] args) {
	 Scanner sk=new Scanner (System.in);
       int T=sk.nextInt();
       while(T>0){
           long n=sk.nextLong();
//           long []arr=new long[(int) n];
//           for(long i=0;i<n;i++){
//               arr[(int) i]=sk.nextLong();
//           }
//           
           
     BigInteger b=BigInteger.valueOf(n);
     //n!
     BigInteger res=fact(b);
     long rs=3;
     //r!
     BigInteger r=fact(BigInteger.valueOf(3));
//     BigInteger nMinusr=fact(res.subtract(BigInteger.valueOf(3)));
     long nr=n-rs;
     //(n-r)!
     BigInteger nminusr=fact(BigInteger.valueOf(nr));
     // r!*(n-r)!
     BigInteger lower=r.multiply(nminusr);
     BigInteger total=res.divide(lower);
    System.out.println(total);
           
       }
	}

 private static BigInteger fact (BigInteger x) {
	 if(x==BigInteger.ZERO||x==BigInteger.ONE) {
		 return BigInteger.ONE;
	 }
	return x.multiply(fact(x.subtract(BigInteger.ONE))); 
 }
}