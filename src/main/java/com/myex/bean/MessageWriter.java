package com.myex.bean;

import com.myex.producer.IMessageProducer;

public class MessageWriter {
 
	public MessageWriter() {
		super();
	}

	private IMessageProducer messageProducer = null;
	
	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public void writeMessage(String message){
				
		String formattedData = messageProducer.formatMessage(message);
		System.out.println(formattedData);
	}
}


/*
IOC is a principle which talks about Collaborating the objects(beans) and managing the 
dependencies and managing the life cycle of the it(objects).

there are 2 ways using which IOC can collaborate the object(beans):-

1) dependency lookup
	a) dependency pull
	b) contextual dependency lookup 

2) dependency injection
	a) constructor injection
	b) setter injection
	
*/