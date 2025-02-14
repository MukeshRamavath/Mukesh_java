package com.tnsif.stringdemo;

public class Testimmutable {
	 
	public static void main(String[] args) {
		 String s=("Mukesh");
		  s.concat("Rathod");
		  
		 System.out.println(s);
		s=s.concat("Rathod");
		System.out.println(s);
	}
}
