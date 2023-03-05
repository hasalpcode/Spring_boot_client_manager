package com.mypersproject.apigestionclient.model;


import java.io.Serializable;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ref_client")
	private Long id;
	@Column(name = "nom", length=25)
	private String nom;
	@Column(name = "prenom", length=100)
	private String prenom;
	private String telephone;
	private String adresse; 

	@OneToMany(cascade = CascadeType.ALL,mappedBy="client",fetch = FetchType.LAZY)
	@JsonIgnore
	@JsonSetter	
	private  Collection<Commande> commandes;
	
}
