package com.ns.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.web.model.BodySection;
import com.ns.camel.web.model.BodySectionImpl;
import com.ns.camel.web.model.Page;
import com.ns.camel.web.model.PageRequest;

public class BodySectionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("processing body!");
		PageRequest request = (PageRequest)exchange.getIn().getHeader("pageRequest");
		System.out.println("dto :" +request.getDto());
		String bodyData = request.getDto().getBodyData();
		BodySection section= new BodySectionImpl();
		section.addContent(bodyData);
		Page page = request.getPage();	
		page.addSection(section);			
	}

}
