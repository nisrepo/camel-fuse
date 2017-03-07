package com.ns.camel.web.model;

public class SectionFactoryImpl implements SectionFactory {
	
	private static final SectionFactory instance = new SectionFactoryImpl();

	// private constructor to avoid client applications to use constructor
	private SectionFactoryImpl() {
	}

	public static SectionFactory getInstance() {
		return instance;
	}
	
	public HeaderSection createHeaderSection() {
		HeaderSectionImpl headerSection = new HeaderSectionImpl();
		return headerSection;
	}
	
	public BodySection createBodySection() {
		BodySectionImpl bodySection = new BodySectionImpl();
		return bodySection;
	}
	
	public FooterSection createFooterSection() {
		FooterSectionImpl footerSection = new FooterSectionImpl();
		return footerSection;
	}
}
