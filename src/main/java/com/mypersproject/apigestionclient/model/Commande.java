package com.mypersproject.apigestionclient.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "commandes")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ref_commande")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;
	@Temporal(TemporalType.DATE)
	private LocalDate date_commande;

	@OneToOne(mappedBy = "commande")
	private Facture facture;

	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "detailscommandes", joinColumns = @JoinColumn(name = "ref_commande"),
	inverseJoinColumns = @JoinColumn(name = "ref_product"))
	@JsonIgnore
	private List<Products> products = new ArrayList<>();



	
}
