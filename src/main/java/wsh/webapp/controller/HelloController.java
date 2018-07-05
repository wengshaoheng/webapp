package wsh.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wsh.webapp.error.WAException;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}
	
	@RequestMapping(value="/hello2")
	public String hello2() {
		return "hello";
	}
	
	@RequestMapping(value="/hello3")
	public String hello3() {
		throw new RuntimeException("test exp");
	}
	
	@RequestMapping(value="/hello4")
	public String hello4() {
		throw new WAException("test self-defined exp");
	}
}
