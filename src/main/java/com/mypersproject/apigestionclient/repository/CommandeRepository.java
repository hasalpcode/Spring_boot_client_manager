package com.mypersproject.apigestionclient.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mypersproject.apigestionclient.model.Commande;


@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long>{	
}
