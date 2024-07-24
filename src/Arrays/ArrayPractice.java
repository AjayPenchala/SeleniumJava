package Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
	
		int a[] = {23,34,56,1998,534534};
		
		int search_array =534534;
		
		boolean result=false;
		for (int x:a) {
			
			if (x==search_array)
			{
				System.out.println("element found");
				result=true;
				break;
			}
			
			if (result=false) {
				System.out.println("element not found");
			}
		}
		
	}
}