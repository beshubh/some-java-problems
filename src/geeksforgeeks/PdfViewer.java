package geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class PdfViewer {
	public static void main(String[] args) {
		Integer[] h= {1 ,3, 1, 3, 1 ,4 ,1 ,3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
		String d="zaba";
		System.out.println(pdfviewr(h,d));
	}

	private static int pdfviewr(Integer[] h,String d) {
		HashMap<Character,Integer> hashmap=new HashMap<>();
		int j=0;
		for(char i='a';i<='z';i++) {
			 hashmap.put(i,h[j]);
			j++;
		}

        ArrayList<Integer> rh=new ArrayList<>();
		 for(int i=0;i<d.length();i++) {
			 rh.add(hashmap.get(d.charAt(i)));
		 }
		 int max=rh.stream().max(Integer::compare).get();
		return max*d.length();
	}

}
