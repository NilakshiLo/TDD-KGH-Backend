package com.tdd.kgh;


import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Dashboard {

	@RequestMapping(value = "/getCount")
	@ResponseBody
	Counter getCount( HttpServletResponse  response) {
		Counter c = new Counter(44, 30, 35, 40);
		response.setHeader("Access-Control-Allow-Origin", "*");
		return c;
	}
	@RequestMapping(value = "/getName")
	@ResponseBody
	JSONObject getname( HttpServletResponse  response) {
		JSONObject jsonObj = new JSONObject();
		response.setHeader("Access-Control-Allow-Origin", "*");
		jsonObj.put("name", "Amey Deshpande");
		return jsonObj;
	}
}
