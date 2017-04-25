package com.example.domain;

public class Item {
	
	private int itemNumber;

	private int price;
	
	private String discription;
	
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Item(int itemNumber, int price, String discription) {
		super();
		this.itemNumber = itemNumber;
		this.price = price;
		this.discription = discription;
	}

	public Item() {
		super();
	}
	
}
