package geeksforgeeks;

public class InsertionSort {
public static void main(String[] args) {
	int arr[]= {5,4,2,6,1,3};
	int i=arr.length;
  insertionSort(arr,i);
	
}
static void insertionSort(int arr[], int length) {
   
	int i, j, tmp;  
	  for (i = 1; i < length; i++) {
		  	j = i;
		  	while (j > 0 && arr[j - 1] > arr[j]) {
		  	   tmp = arr[j];
		       arr[j] = arr[j - 1];
		       arr[j - 1] = tmp;
		       j--;}
		  	
}
	  for(int f=0;f<arr.length;f++)
	  System.out.println(arr[f]);
 
}
}
