package com.myproject.gestionclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.gestionclient.model.HelloWorld;
import com.myproject.gestionclient.service.BusinessService;

@SpringBootApplication
public class GestionclientApplication implements CommandLineRunner{

	@Autowired
	private BusinessService bs;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionclientApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

}
