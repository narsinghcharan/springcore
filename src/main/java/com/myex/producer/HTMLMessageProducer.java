package com.myex.producer;

public class HTMLMessageProducer implements IMessageProducer {

	public String formatMessage(String message1) {

		return "<HTML><HEAD></HEAD><BODY> "+ message1 + "</BODY></HTML>";
	}

}
