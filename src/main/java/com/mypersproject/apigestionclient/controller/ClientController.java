package com.mypersproject.apigestionclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypersproject.apigestionclient.model.Client;
import com.mypersproject.apigestionclient.service.ClientService;

@RestController


public class ClientController {

	@Autowired
	private ClientService cService;
	
	@GetMapping("/clients")
	public Iterable<Client> index(){
		return cService.getAllClient();
	}
	
	@PostMapping("/create_client")
	public Client store(Client client){
		return cService.saveClient(client);
	}
	
}
