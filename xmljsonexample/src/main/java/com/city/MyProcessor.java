package com.city;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor{

	public void process(Exchange arg0) throws Exception {
		
	
		arg0.getOut().setBody("<root><id>1</id><name>sundar</name><role>architect</role></root>");
		
	}

}
