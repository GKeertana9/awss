package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroller {
	@ResponseBody
	@RequestMapping("/")
	public String  demo() {
		return "Hello! This springboot application was successfully deployed on cloud";
	}
}