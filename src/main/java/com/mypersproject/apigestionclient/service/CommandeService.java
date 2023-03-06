package com.mypersproject.apigestionclient.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mypersproject.exceptions.CommandeException;

import com.mypersproject.apigestionclient.model.Commande;
import com.mypersproject.apigestionclient.repository.CommandeRepository;
import com.mypersproject.apigestionclient.repository.ClientRepository;


import lombok.Data;

@Data
@Service
public class CommandeService {
	@Autowired
	private CommandeRepository cRepository;

	
	public Commande getCommande(final Long id){
		Commande commande_id;
		try {
			commande_id =  cRepository.findById(id).orElse(null);

		} catch (Exception e) {
			// TODO: handle exception
			throw new CommandeException("not found test ");
		}
		if (commande_id == null) {
			throw new CommandeException("not found test ");
		}
		return commande_id;
	}
	
	public Iterable<Commande> getAllCommande(){
		Iterable commandes;
		try {
			commandes = cRepository.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			throw new CommandeException("not found test ");
		}
		return commandes;
	}
	
	public void deleteCommande(final Long id){
		cRepository.deleteById(id);
	}
	
	public Commande saveCommande(Commande commande) {
        Commande savedClient = cRepository.save(commande);
        return savedClient;
    }

}
