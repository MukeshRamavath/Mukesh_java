package com.tnsif.scanner;

public class Person {
	private String name; // declaration
	private int income;
	private int tax;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
 public String toString() {
	 return "Preson[name="+ name +",income="+ income +",tax="+ tax+"]";
 }

}
