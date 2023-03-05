package com.mypersproject.apigestionclient.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mypersproject.apigestionclient.model.Commande;
import com.mypersproject.apigestionclient.service.CommandeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CommandeController {
	@Autowired
	private CommandeService cmdService;

	@RequestMapping(value ="/commandes",method=RequestMethod.GET)
	public Iterable<Commande> index(){
		return cmdService.getAllCommande();
	}

	@RequestMapping(value ="/commandes/{id}",method=RequestMethod.GET)
	public Optional<Commande> show(@PathVariable Long id){
		return cmdService.getCommande(id);
	}
	
	@RequestMapping(value ="/commandes",method=RequestMethod.POST)
	public Commande store(@RequestBody Commande commande){
		return cmdService.saveCommande(commande);
	}

	@RequestMapping(value ="/commandes/{id}",method=RequestMethod.DELETE)
	public boolean destroy(@PathVariable Long id){
		cmdService.deleteCommande(id);
		return true;
	}
	

	// @PutMapping("/editCommande/{id}")
	// public ResponseEntity<?> update(@RequestBody Commande commande) {
	// 	try {
	// 		return new ResponseEntity<>("Update Result", HttpStatus.OK);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	// 	}
	// }

	// @DeleteMapping("/destroyCommande/{id}")
	// public ResponseEntity<?> destroy(@PathVariable Integer id) {
	// 	try {
	// 		return new ResponseEntity<>("Destroy Result", HttpStatus.OK);
	// 	} catch (Exception e) {
	// 		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	// 	}
	// }
}

