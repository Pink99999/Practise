package com.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	private Logger logger=LoggerFactory.getLogger(WebController.class);
	
	@GetMapping("/home")
	public String home() {
		logger.info("home method executed fine!");
		String msg="Welcome Devyani!";
		return msg;
	}
	
	@GetMapping("/greet")
	public String greet() {
		logger.info("greet method executed fine!");
		String msg="Good Morning!";
		return msg;
	}
	
}
