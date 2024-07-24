package Arrays;

public class FindDuplicateArray {

	public static void main(String[] args) {
	
		int a[]= {10,20,30,10,10,20,10,20};
		
		int num =30;
		
		int dup_count=0;
		
		for (int x:a) {
			
			if (x==num) {
				dup_count++;
				
			}
			
		}
		System.out.println(dup_count);
	}

}
