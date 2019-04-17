package com.capgemini.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpa.dao.PersonDao;
import com.capgemini.jpa.person.Person;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonDao dao;

	@Override
	public void addNew(Person person) {

		dao.save(person);

	}

	@Override
	public Person findAll(int id) {
		Person person = dao.findById(id).get();
		return person;
	}
}
