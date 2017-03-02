package com.ns.camel.web.model;

import com.ns.camel.PageDTO;

public class PageRequest {
	private PageDTO dto;

	public PageDTO getDto() {
		return dto;
	}

	public void setDto(PageDTO dto) {
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "PageRequest [dto=" + dto + "]";
	}

}
