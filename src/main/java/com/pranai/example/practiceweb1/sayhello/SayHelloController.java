package com.pranai.example.practiceweb1.sayhello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SayHelloController {

	@RequestMapping("hello")
	public String sayHello() {
		return "Welcome";
	}
}
