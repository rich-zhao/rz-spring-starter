package com.richardz.rest.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richardz.rest.model.Person;

//spring repositories are all interfaces
@Repository
public interface PersonRepository extends JpaRepository<Person, UUID>{
    
}
