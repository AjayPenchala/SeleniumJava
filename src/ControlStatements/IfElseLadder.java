package ControlStatements;

public class IfElseLadder {
	
	public static void main(String[] args)
	{
	
	int marks =73;
	
	if (marks>=75)
	{
		System.out.println("Student has passed in Distinction");
	}
	
	else if (marks<75 && marks>=60)
	{
		System.out.println("Student has passed in Firstclass");
	}
	
	else if (marks<60 && marks>=50)
	{
		System.out.println("Student has passed in Secondclass");
	}
	
	else if (marks<50 && marks>=35)
	{
		System.out.println("Student has passed in Thirdclass");
	}
	
	else
	{
		System.out.println("Student has failed");
	}
	}

}
