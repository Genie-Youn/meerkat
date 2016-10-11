package com.genie.meerkat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {

	private Logger LOG = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHome(){
		return "index";
	}
}
