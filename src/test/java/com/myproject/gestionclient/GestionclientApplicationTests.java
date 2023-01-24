package com.myproject.gestionclient;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myproject.gestionclient.service.BusinessService;

@SpringBootTest
class GestionclientApplicationTests {
	
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetHelloWorld() {
		String expected = "Hello hasalp";
		
		String result = bs.getHelloWorld().getValue();
		
		assertEquals(expected, result);
	}
	

}
