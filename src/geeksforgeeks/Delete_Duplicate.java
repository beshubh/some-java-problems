package geeksforgeeks;

import java.util.stream.Collectors;
import java.util.*;
public class Delete_Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();
			
		 geeks g=new geeks();
			int n = g.remove_duplicate(a);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		T--;
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class geeks
{
        /*You are required to complete this function */
	int remove_duplicate(int A[])
	{
	   ArrayList<Integer> list=new ArrayList<>();
	   for(int i:A) {
		   list.add(i);
	   }
	    List<Integer> list1=new ArrayList<>(new HashSet<>(list));
	    Collections.sort(list1);
	    for(int i=0;i<list1.size();i++) {
	    	A[i]=list1.get(i);
	    }
		
		return list1.size();
	
	}
}
