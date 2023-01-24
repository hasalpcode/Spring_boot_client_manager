package com.mypersproject.apigestionclient.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mypersproject.apigestionclient.model.Client;

@Repository

public interface ClientRepository extends CrudRepository<Client, Long>{

	
}
