package com.myex.producer;

public class TextMessageProducer implements IMessageProducer {

	
	public String formatMessage(String message) {
		
		return "Hello, "+message+"!";
	}

	
}
