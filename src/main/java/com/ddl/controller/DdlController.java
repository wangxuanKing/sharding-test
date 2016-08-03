package com.ddl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddl.service.DdlService;

@Controller
public class DdlController {
	
	@Autowired
	private DdlService ddlService;
	
	@RequestMapping("insert")
	public void testInsert(){
		ddlService.testInsert();
	}

}
