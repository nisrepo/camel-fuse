package com.ns.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.web.model.FooterSection;
import com.ns.camel.web.model.FooterSectionImpl;
import com.ns.camel.web.model.Page;
import com.ns.camel.web.model.PageRequest;

public class FooterSectionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("processing footer!");
		PageRequest request = (PageRequest)exchange.getIn().getHeader("pageRequest");
		System.out.println("dto :" +request.getDto());
		String data = request.getDto().getFooterData();	
	    FooterSection section= new FooterSectionImpl();
	    section.addContent(data);
		Page page = request.getPage();	
		page.addSection(section);		
	}

}
