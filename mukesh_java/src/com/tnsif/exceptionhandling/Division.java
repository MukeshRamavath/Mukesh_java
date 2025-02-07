package com.tnsif.exceptionhandling;

public class Division {
	public static void division() {
		int a=7 ,b=0 ,c;
		
		try {
			System.out.println("mittu");
			c=a/b;
			System.out.println("division "+c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught "+e.getMessage());
		}
		catch(Exception j) {
			System.out.println(j.getMessage());
		}
	}

}
