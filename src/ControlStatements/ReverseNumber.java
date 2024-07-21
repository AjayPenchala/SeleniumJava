package ControlStatements;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int i =121;
		int rev=0;
		
		while(i!=0) {
			int digit = i%10;
			rev=rev*10+digit;
			i/=10;
		}
		
		System.out.println("reverse of i is "+ rev);
		
	}

}
