package Operations;

public class OperationsPractice {

	public static void main(String[] args) 
	{
	int x =60,y= 20;
	
//	Arithmetic operators (+,-,*,/)
	int sum = x+y;
	int difference = x-y;
	int multiplication = x*y;
	int division = x/y;
	System.out.println("the sum of x,y is "+ sum);
	System.out.println("the difference between x and y is " + difference);
	System.out.println("the multiplication of x and y is "+multiplication);
	System.out.println("the division of x and y is "+division);

	
//	Comparison operators(>=, <=, <>, !=, ==)
	
	System.out.println(x<y);
	System.out.println(x<=y);
	
	x = 10;
	System.out.println(x<y);
	}

}
