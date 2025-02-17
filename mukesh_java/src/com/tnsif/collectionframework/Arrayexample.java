package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayexample {
	
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("apple");
		a1.add("mango");
		a1.add("orange");
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		}
	

