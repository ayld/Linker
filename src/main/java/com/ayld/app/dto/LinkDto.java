package com.ayld.app.dto;

import net.ayld.core.dto.BaseDto;

public class LinkDto extends BaseDto<Integer>{

	private String url;
	private String ownerProfileUrl;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOwnerProfileUrl() {
		return ownerProfileUrl;
	}

	public void setOwnerProfileUrl(String ownerProfileUrl) {
		this.ownerProfileUrl = ownerProfileUrl;
	}

	private static final long serialVersionUID = -4286305548023900411L;
}
