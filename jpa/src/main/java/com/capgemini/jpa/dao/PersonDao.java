package com.capgemini.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.person.Person;

@Repository
public interface PersonDao  extends JpaRepository<Person, Integer>{
   
}
