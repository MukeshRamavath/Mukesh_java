package com.tnsif.lambdaexpression;

public class Withlambda {

		public static void main(String[] args) {
			Myinterface ob =()->{System.out.println("welcome to lambda expression");};
			
			ob.show();
		}
}
