package com.ns.camel.web.model;

import java.util.ArrayList;
import java.util.List;

public class Page {
	
	private List<Section> sectionList = new ArrayList<Section>();
	
	public void addSection(Section section) {
		sectionList.add(section);
	}
	public List<Section>  getSectionList() {
		return sectionList;
	}
	@Override
	public String toString() {
		return "Page [sectionList=" + sectionList + "]";
	}

}
