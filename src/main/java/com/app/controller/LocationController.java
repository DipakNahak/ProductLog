package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.ILocationService;

@Controller
public class LocationController {
	@Autowired
	private ILocationService serv;
	
	@RequestMapping("/locReg")
	private String showLocationreg(){
		return "LocationReg";
	}
	
}
