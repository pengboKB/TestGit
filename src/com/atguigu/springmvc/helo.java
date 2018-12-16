package com.atguigu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helo {
    @RequestMapping("hello")
	public String get(){
		return "success";
	}
}
