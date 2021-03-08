package com.universal.ecommerce.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceHelloController {
	@Autowired 
	Environment env;
	
	@GetMapping("/hello")
	public String home() throws UnknownHostException {
		return "Hello from  universalEcommerce:" + InetAddress.getLocalHost().getHostName()+" instanceId="+env.getProperty("eureka.instance.instance-id");
	}

}
