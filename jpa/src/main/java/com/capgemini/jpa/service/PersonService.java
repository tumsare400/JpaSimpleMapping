package com.capgemini.jpa.service;

import com.capgemini.jpa.person.Person;

public interface PersonService {
	
	public void addNew(Person person);
	public Person findAll(int id);

}
