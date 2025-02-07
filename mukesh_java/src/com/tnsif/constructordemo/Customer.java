package com.tnsif.constructordemo;

public class Customer {

	private String customername;
	private int Customerid;
	private String customeradress;
	
	Customer(){
		System.out.println("default");
	}

	public Customer(String customername, int customerid, String customeradress) {
		super();
		this.customername = customername;
		this.Customerid = customerid;
		this.customeradress = customeradress;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomeradress() {
		return customeradress;
	}

	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", Customerid=" + Customerid + ", customeradress="
				+ customeradress + "]";
	}
}