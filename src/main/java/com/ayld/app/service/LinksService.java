package com.ayld.app.service;

import java.util.List;

import com.ayld.app.dto.LinkDto;

import net.ayld.core.service.CrudService;

public interface LinksService extends CrudService<LinkDto, Integer>{
	
	List<LinkDto> linksForCurrentUser();
}
