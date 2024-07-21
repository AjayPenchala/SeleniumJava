package Operations;

public class SwappingNumbers {
	
	public static void main(String[] args) 
	{
	
		
		int a=20, b=30;
		
		/* method1 
		int t;
		t=a;
		a=b;
		b=t;
		
		System.out.println("the value of a & b now are "+ a + "&" + b);
		*/
		
		/*Method2- using arithametic operators*/
		
		
		a=a+b; //a=50
		b=a-b; //b=50-30 = 20
		a=a-b; //a= 50-20=30
		
		System.out.println("the value of a & b now are "+ a + "&" + b);
		
	
		
		
	}

}
