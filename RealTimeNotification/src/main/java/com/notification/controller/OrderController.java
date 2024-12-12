package com.notification.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

	@MessageMapping("/order/status")
	@SendTo("/topic/order")
	public OrderUpdate sendOrderUpdate(OrderUpdate orderUpdate) {
		return orderUpdate;
	}
	
	
}
