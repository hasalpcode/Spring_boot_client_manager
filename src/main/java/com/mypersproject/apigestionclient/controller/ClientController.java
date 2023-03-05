package com.mypersproject.apigestionclient.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mypersproject.apigestionclient.model.Client;
import com.mypersproject.apigestionclient.service.ClientService;

import jakarta.transaction.Transactional;

@RestController

@Transactional
public class ClientController {

	@Autowired
	private ClientService cService;
	// private PlatformTransactionManager ptm;

	
	@RequestMapping(value ="/clients",method=RequestMethod.GET)
	public Iterable<Client> index(){
		return cService.getAllClient();
	}

	@RequestMapping(value ="/clients/{id}",method=RequestMethod.GET)
	public Optional<Client> show(@PathVariable Long id){
		return cService.getClient(id);
	}
	
	@RequestMapping(value ="/clients",method=RequestMethod.POST)
	public Client store(@RequestBody Client client){
		return cService.saveClient(client);
	}

	@RequestMapping(value ="/client/{id}",method=RequestMethod.DELETE)
	public boolean destroy(@PathVariable Long id){
		cService.deleteClient(id);
		return true;
	}
	

}
