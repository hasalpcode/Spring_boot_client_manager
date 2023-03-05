package com.mypersproject.apigestionclient.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ref_product")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "date_exp")
	private Date date_exp;

	@ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
	private List<Commande> commandes = new ArrayList<>();
	
}
