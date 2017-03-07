package com.ns.camel.web.model;

public class HeaderSectionImpl implements HeaderSection {
	private String content;

	public HeaderSectionImpl() {
		super();
		System.out.println("header...");
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
