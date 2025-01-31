package com.tnsif.constructordemo;

public class Parameterdemo {

	Parameterdemo(){
		System.out.println("defalut");
	}
	Parameterdemo(int a){
		System.out.println("one paramter");
	}
	Parameterdemo(int a,String b){
		System.out.println("2 parameter");
	}
	
	public static void main(String[] args) {
		Parameterdemo d=new Parameterdemo();
		Parameterdemo d1=new Parameterdemo(1,"minnu");
		Parameterdemo d2=new Parameterdemo(7);
	}
}
