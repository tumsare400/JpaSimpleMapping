package com.capgemini.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpa.person.Person;
import com.capgemini.jpa.service.PersonService;

@RestController
public class PersonController {
    
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public void update() {
		Person person = new Person(1,"Ashlesha");
		service.addNew(person);	
		
	}
	
	@RequestMapping("/get")
	public Person getPerson (){		
		Person person = service.findAll(1);
		return person;
	}
}
