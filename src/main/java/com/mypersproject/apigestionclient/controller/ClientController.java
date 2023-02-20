package com.mypersproject.apigestionclient.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mypersproject.apigestionclient.model.Client;
import com.mypersproject.apigestionclient.service.ClientService;

import jakarta.transaction.Transactional;

@RestController

@Transactional
public class ClientController {

	@Autowired
	private ClientService cService;
	
	@GetMapping("/clients")
	public Iterable<Client> index(){
		return cService.getAllClient();
	}

	@GetMapping("/client/{id}")
	public Optional<Client> show(@PathVariable Long id){
		return cService.getClient(id);
	}
	
	@PostMapping("/create_client")
	public Client store(@RequestBody Client client){
		return cService.saveClient(client);
	}

	@DeleteMapping("/client/{id}")
	public boolean destroy(@PathVariable Long id){
		cService.deleteClient(id);
		return true;
	}
	
}
