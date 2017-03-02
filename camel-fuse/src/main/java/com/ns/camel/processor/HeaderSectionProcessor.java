package com.ns.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.web.model.PageRequest;

public class HeaderSectionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("processing header!");
		PageRequest request = (PageRequest)exchange.getIn().getHeader("pageRequest");
		System.out.println("dto :" +request.getDto());
		
	}

}
