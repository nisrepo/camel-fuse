package com.ns.camel.web.model;

public class FooterSectionImpl implements FooterSection{
	private String content;	
	
	public FooterSectionImpl() {
		super();
		System.out.println("footer...");
	}
	
	@Override
	public void addContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return this.content;
	}
}
