package com.mypersproject.apigestionclient.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypersproject.apigestionclient.model.Commande;
import com.mypersproject.apigestionclient.repository.CommandeRepository;

import lombok.Data;

@Data
@Service
public class CommandeService {
	@Autowired
	private CommandeRepository cRepository;
	
	public Optional<Commande> getCommande(final Long id){
		return cRepository.findById(id);
	}
	
	public Iterable<Commande> getAllCommande(){
		return cRepository.findAll();
	}
	
	public void deleteCommande(final Long id){
		cRepository.deleteById(id);
	}
	
	public Commande saveCommande(Commande commande) {
        Commande savedClient = cRepository.save(commande);
        return savedClient;
    }

}
