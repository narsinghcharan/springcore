package com.myex.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.myex.bean.MessageWriter;

public class Test {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("config/application-context.xml"));
		
		MessageWriter mw = factory.getBean("messageWriter", MessageWriter.class);
		
		mw.writeMessage("Jai Shri Ganeshay Namah");
	}

}
