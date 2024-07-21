package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
		int a[][] = { {100,200}, {300,400}, {500,600}};
		
//		System.out.println(a[0][1] + " " + a[0][0]);
		
		for (int i =0; i<a.length; i++)
		{
			for (int c=0; c<a[i].length;  c++)
			{
				System.out.print(a[i][c]+ " ");
			}
			
			System.out.println();
		}

	}

}
