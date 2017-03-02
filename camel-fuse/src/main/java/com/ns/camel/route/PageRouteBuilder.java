package com.ns.camel.route;

import org.apache.camel.spring.SpringRouteBuilder;

import com.ns.camel.enums.MainSectionType;
import com.ns.camel.processor.BodySectionProcessor;
import com.ns.camel.processor.FooterSectionProcessor;
import com.ns.camel.processor.HeaderSectionProcessor;
import com.ns.camel.processor.PageProcessor;

public class PageRouteBuilder extends SpringRouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("direct:generatePage")
		 .setHeader("pageRequest",simple("${body}"))
		 .bean(PageProcessor.class)
		 .end();
		
		/*
		 .multicast()
		  .choice()
		  	.when(body().isEqualTo(MainSectionType.HEADER))
                .log("${body}")	  	     
		  		.bean(HeaderSectionProcessor.class)
		  	.when(body().isEqualTo(MainSectionType.BODY))
		  	     .log("${body}")	 
		  		.bean(BodySectionProcessor.class)	
		  	.when(body().isEqualTo(MainSectionType.FOOTER))
		  	    .log("${body}")	 
		  		.bean(FooterSectionProcessor.class)	
		  .end()//end of choice
		 .end();
		*/
	}

}
