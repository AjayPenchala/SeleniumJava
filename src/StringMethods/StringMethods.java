package StringMethods;

import java.util.Arrays;

public class StringMethods {
	
	public static void main (String[] Args) {
		
		String s = "Welcome";
		
		String s2 = "welcome";
		System.out.println(s.equalsIgnoreCase(s2));
		
		s = "Hello Ajay, Focus on your goal, idiot...";
		
		System.out.println(s.replace("Ajay", "Jhansi").replace("Focus", "focus"));
		
		System.out.println(s.substring(6, 10));
		
		System.out.println(s.toLowerCase());
		
		String s3= "ajaykumar.penchala@gmail.com";
		
//		String a[] = s3.split("[.@]");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(Arrays.toString(a));
		
		String a[]=s3.split("@");
		System.out.println(a[0]);
		String a2[]=s3.split(".");
		
	}

}
