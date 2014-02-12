package com.jhenson.web.rest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("myObj", Lists.newArrayList("Hello", ", ", "World"));
		return "hello";
	}
	
	//Defaults to GET request
	@RequestMapping(value="/helloWorld2")
	public @ResponseBody List<String> helloWorld2() {
		return Lists.newArrayList("Hello", "World");
	}
	
	@RequestMapping(value="/helloWorld3/{myId}")
	public @ResponseBody List<String> helloWorld2(@RequestParam String id,
			@PathVariable String myId) {
		return Lists.newArrayList(id, myId);
	}
	
	@RequestMapping(value="/helloWorld3/{myId}/hi")
	public @ResponseBody String helloWorld2(@PathVariable String myId) {
		return myId;
	}
}
