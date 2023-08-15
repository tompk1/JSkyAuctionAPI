package me.tompk1.jsa.moulberry;

public class MoulBerryAuction {
	String name;
	double price;
	
	public MoulBerryAuction(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
