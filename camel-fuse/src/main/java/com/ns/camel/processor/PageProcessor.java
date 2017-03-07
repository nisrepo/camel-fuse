package com.ns.camel.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ns.camel.web.model.Page;
import com.ns.camel.web.model.PageRequest;
import com.ns.camel.web.model.Section;

public class PageProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("processing PageProcessor!");
		PageRequest request = (PageRequest)exchange.getIn().getHeader("pageRequest");
		//System.out.println("page :" + request.getPage());
		Page page = request.getPage();
		List<Section> sectionList = page.getSectionList();
		String content = getContent(sectionList);
		System.out.println("Page Content: " + content);
	}
	public String getContent(List<Section> sectionList) {
		StringBuilder builder = new StringBuilder(); 
		for(Section section: sectionList){
			builder.append("[<b>" + section.getContent() + "</b>]\n");
		}
		return builder.toString();
	}
}
