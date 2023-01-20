package com.Springconfiguration.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/configInfo")
	public void configGetMethod() {
		System.out.println("my server port is " + serverPort);
	}
}
