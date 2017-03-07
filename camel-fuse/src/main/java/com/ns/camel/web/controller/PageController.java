package com.ns.camel.web.controller;

import org.apache.camel.Produce;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ns.camel.component.DirectComponent;
import com.ns.camel.web.model.Page;
import com.ns.camel.web.model.PageDTO;
import com.ns.camel.web.model.PageRequest;

@RestController
@RequestMapping("/ns/camel/api/v1")
public class PageController {

	@Produce(uri="direct:generatePage")
	private DirectComponent mainDirectComponent;
	
	@RequestMapping(value="/documents", method=RequestMethod.GET)
	public String generatePage(){
		PageRequest request= new PageRequest();
		PageDTO dto= new PageDTO();
		dto.setHeaderData("HEADER SECTION");
		dto.setBodyData("BODY SECTION");
		dto.setFooterData("FOOTER SECTION");
		request.setDto(dto);
		Page page=new Page();
		request.setPage(page);
		
		return mainDirectComponent.generatePage(request);
	}
}
