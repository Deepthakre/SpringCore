package com.springcore.lifecycle;

public class Testlifec {

	 private double price ;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting priceh ");
		this.price = price;
	}

	public Testlifec() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Testlifec [price=" + price + "]";
	}
	 
	public void init() {
		System.out.println("internal inut method");
	}
	public void destroy() {
		System.out.println("internal destroy method");
	}
	
}
