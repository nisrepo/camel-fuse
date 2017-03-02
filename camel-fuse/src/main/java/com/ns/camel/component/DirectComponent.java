package com.ns.camel.component;

import com.ns.camel.web.model.PageRequest;

public interface DirectComponent {
	
//mapped to end-point :- direct:generatePage	
public String generatePage(PageRequest request);

}
