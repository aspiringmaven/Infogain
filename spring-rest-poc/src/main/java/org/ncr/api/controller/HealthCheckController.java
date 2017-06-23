package org.ncr.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {
	
	private static final String MESSAGE = "Up and Running";
	
	@RequestMapping(value="/")
	@ResponseBody
	public String hello() {
		return MESSAGE;
	}
	
}
