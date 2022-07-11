package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
	@RequestMapping("/Welcome")
	public String welcomePage()
	{
		return "<h1>Welcome BATMAN</h1>";
	}
	@RequestMapping("/home")
	public String homePage()
	{
		String html ="<div>Bruce Wayne is the BatMan of Gowtham City </div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="madurai") String city)
	{
		return "<h1>Welcome to Temple City " + city + "</h1>";
	}
}
