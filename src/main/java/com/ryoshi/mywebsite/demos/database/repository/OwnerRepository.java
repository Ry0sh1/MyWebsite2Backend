package com.ryoshi.mywebsite.demos.database.repository;


import com.ryoshi.mywebsite.demos.database.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {



}

