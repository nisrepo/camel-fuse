package com.ns.camel.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.enums.MainSectionType;

public class PageProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		List<MainSectionType> mainSectionList = new ArrayList<MainSectionType>();
		mainSectionList.add(MainSectionType.HEADER);
		mainSectionList.add(MainSectionType.BODY);
		mainSectionList.add(MainSectionType.FOOTER);
		exchange.getIn().setBody(mainSectionList);		
	}
	
}
