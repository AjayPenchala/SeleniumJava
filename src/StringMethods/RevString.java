package StringMethods;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer s = new StringBuffer("Hello world");
		//Example 1
		String s = "Welcome";
		
		String rev = "";
		
		char a[] = s.toCharArray();
		
		for (int i=s.length()-1; i>=0; i--) {
			
			rev = rev + a[i];
		}
		
		System.out.println(rev);
		
		//Example 2
		StringBuffer string = new StringBuffer ("Hello world");
		
		System.out.println(string.reverse());
		
		//Example 3
		
		String c = "Ni Gudda";
		
		String reverse = "";
		
		for (int j= c.length()-1; j>=0; j--) {
			
			reverse = reverse+c.charAt(j);
		}
		
		System.out.println(reverse);
		
		//example 4
		
		StringBuilder o = new StringBuilder("Na karma");
		System.out.println(o.reverse());
		
		
	}

	}
