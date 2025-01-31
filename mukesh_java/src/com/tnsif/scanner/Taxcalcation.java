package com.tnsif.scanner;

public class Taxcalcation {
 
	 public void calucaltionTax(Person p)
	 {
		 if(p.getIncome()<=20000) {
			 p.setTax(0);
		 }
		 else if(p.getIncome()>=20000&&p.getIncome()<40000) {
			 p.setTax(5);
	}
	
		 else{
		     p.setTax(10);	 
		 }
    }
}
