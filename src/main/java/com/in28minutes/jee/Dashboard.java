package com.in28minutes.jee;


import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Dashboard {

	@RequestMapping(value = "/getCount")
	@ResponseBody
	Counter getCount() {
		Counter c = new Counter(20, 30, 35, 40);
		
		return c;
	}
}
