package com.tnsif.collectionframework;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
		
		ob.push(22);
		ob.push(33);
		ob.push(45);
		
		System.out.println("stack element" +ob);
		
		//peek is used to print last element of stack
		
		System.out.println(ob.peek());
		
		if(ob.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("not empty");
		}
		
		System.out.println(ob.search(45));
		
		System.out.println(ob.search(22));
	}
}
