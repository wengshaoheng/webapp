package wsh.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wsh.webapp.error.WAException;

@Controller
public class HelloController {
	
	@Autowired
	StringRedisTemplate strRedisTmpl;
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello() {
		ValueOperations<String, String> vo = strRedisTmpl.opsForValue();
		vo.set("wengshaoheng", "{mars}");
		for (int i = 0; i < 20; ++i) {
			vo.set(String.valueOf(i), "@#$@#"+i);
		}
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
