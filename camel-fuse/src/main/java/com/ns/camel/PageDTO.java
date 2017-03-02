package com.ns.camel;

public class PageDTO {
	private String headerData;
	private String bodyData;
	private String footerData;

	public String getHeaderData() {
		return headerData;
	}

	public void setHeaderData(String headerData) {
		this.headerData = headerData;
	}

	public String getBodyData() {
		return bodyData;
	}

	public void setBodyData(String bodyData) {
		this.bodyData = bodyData;
	}

	public String getFooterData() {
		return footerData;
	}

	public void setFooterData(String footerData) {
		this.footerData = footerData;
	}

	@Override
	public String toString() {
		return "PageDTO [headerData=" + headerData + ", bodyData=" + bodyData + ", footerData=" + footerData + "]";
	}

}
