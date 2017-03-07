package com.ns.camel.web.model;

public class PageRequest {
	private PageDTO dto;
    private Page page;
    
	public PageDTO getDto() {
		return dto;
	}

	public void setDto(PageDTO dto) {
		this.dto = dto;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "PageRequest [dto=" + dto + ", page=" + page + "]";
	}
}
