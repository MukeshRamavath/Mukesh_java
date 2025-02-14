package com.tnsif.stringdemo;

public class Immuntableexample {
	public static void main(String[] args) {
		String s1="Mukesh";
		String s2=s1;
		String s3=s2;
		
		System.out.println("before modification");
		
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		
		s1="Rathod";
		System.out.println("after modification");
		
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		
	}
}
