package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.domain.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@RequestMapping(method = RequestMethod.GET)
	public Order getOrders() {
		return stubOrders();
	}

	private Order stubOrders() {
		Order order = new Order();
		order.setOrderNumber(123456);
		order.setOrderStatus("Created");
		List<Item> items = new ArrayList<>();
		items.add(new Item(245678, 25, "Red Thread - Length 100m"));
		items.add(new Item(43876, 15, "Green Thread - Length 50m"));
		items.add(new Item(12345, 20, "Blue Thread - Length 80m"));
		order.setItems(items);
		return order;
	}

}