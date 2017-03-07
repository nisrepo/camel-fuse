package com.ns.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.web.model.HeaderSection;
import com.ns.camel.web.model.HeaderSectionImpl;
import com.ns.camel.web.model.Page;
import com.ns.camel.web.model.PageRequest;

public class HeaderTitleProcessor  implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("processing header title!");
		PageRequest request = (PageRequest)exchange.getIn().getHeader("pageRequest");
		System.out.println("dto :" +request.getDto());
		
		String data = request.getDto().getHeaderData();
		HeaderSection section = new HeaderSectionImpl();
		section.addContent(data);
		Page page = request.getPage();
		page.addSection(section);
		
	}
}
