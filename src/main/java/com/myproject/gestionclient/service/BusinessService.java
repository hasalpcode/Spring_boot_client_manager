package com.myproject.gestionclient.service;

import org.springframework.stereotype.Component;

import com.myproject.gestionclient.model.HelloWorld;

@Component

public class BusinessService {

	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
}
