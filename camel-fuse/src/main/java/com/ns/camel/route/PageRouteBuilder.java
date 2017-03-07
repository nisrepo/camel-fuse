package com.ns.camel.route;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.ns.camel.enums.MainSectionType;
import com.ns.camel.processor.BodySectionProcessor;
import com.ns.camel.processor.FooterSectionProcessor;
import com.ns.camel.processor.HeaderSectionProcessor;
import com.ns.camel.processor.PageProcessor;

@Component
public class PageRouteBuilder extends SpringRouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:generatePage")
			  .setHeader("pageRequest",simple("${body}"))		 
			  .multicast()
			  .parallelProcessing()
				  .to("direct:processHeader")
				  .to("direct:processBody")
				  .to("direct:processFooter")
			  .end()
		 .bean(PageProcessor.class)
		 .end();
		
		from("direct:processHeader")
		.bean(HeaderSectionProcessor.class)
		.end();
				
		from("direct:processBody")
		.bean(BodySectionProcessor.class)
		.end();
		
		
		from("direct:processFooter")
		.bean(FooterSectionProcessor.class)
		.end();
	
	}

}
