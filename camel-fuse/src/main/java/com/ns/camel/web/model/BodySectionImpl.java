package com.ns.camel.web.model;

public class BodySectionImpl implements BodySection {
	private String content;

	public BodySectionImpl() {
		super();
		System.out.println("body...");
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
