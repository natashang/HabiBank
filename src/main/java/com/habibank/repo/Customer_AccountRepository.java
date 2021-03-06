package com.habibank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.habibank.model.Customer_Account;

@RepositoryRestResource
public interface Customer_AccountRepository extends JpaRepository<Customer_Account, String> {
	
}