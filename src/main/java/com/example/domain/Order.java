package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderNumber;
	
	private String orderStatus;
	
	private List<Item> items = new ArrayList();
	
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	
	
	

}
