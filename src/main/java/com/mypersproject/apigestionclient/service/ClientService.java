package com.mypersproject.apigestionclient.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypersproject.apigestionclient.model.Client;
import com.mypersproject.apigestionclient.repository.ClientRepository;

import lombok.Data;

@Data
@Service

public class ClientService {
	@Autowired
	private ClientRepository cRepository;
	
	public Optional<Client> getClient(final Long id){
		return cRepository.findById(id);
	}
	
	public Iterable<Client> getAllClient(){
		return cRepository.findAll();
	}
	
	public void deleteClient(final Long id){
		 cRepository.deleteById(id);
	}
	
	public Client saveClient(Client client) {
        Client savedClient = cRepository.save(client);
        return savedClient;
    }

}
