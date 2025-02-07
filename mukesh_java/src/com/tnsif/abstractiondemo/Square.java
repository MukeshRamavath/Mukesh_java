package com.tnsif.abstractiondemo;

public class Square extends Shape{

	private float side;
	
	public void Shape() {
		 side=2.0f;
	}
	public Square(float side) {
	this.side=side;
	}
	
	void calarea() {
	 super.area=side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	public static void main(String[] args) {
		Square p=new Square(5.0f);
		System.out.println(p);
		p.calarea();
		p.show();
	}
	}
