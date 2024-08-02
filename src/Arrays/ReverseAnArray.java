package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main (String[] args) {
	
		int a[] = {23,45,29,20,19};
		
		for (int i=a.length-1; i>=0; i--) {
			
			System.out.println(a[i]);
			
		}
		
		String s[]= {"abdul", "raghu", "ajay"};
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
	}
}
