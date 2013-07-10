package com.ayld.app.service.impl;

import java.util.List;

import net.ayld.core.service.impl.BaseService;

import com.ayld.app.dto.LinkDto;
import com.ayld.app.service.LinksService;

public class LinksServiceImpl extends BaseService<LinkDto, Integer> implements LinksService {

	@Override
	public List<LinkDto> linksForCurrentUser() {
		return null;
	}

}
