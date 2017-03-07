package com.ns.camel.web.model;

public interface SectionFactory {
	SectionFactory instance = SectionFactoryImpl.getInstance();
}
