package com.example.dao;

import java.util.List;

import com.example.model.Person;

public interface PersonDao 
{
	List<Person> findAll();
	Person findById(Long id);
	void create(Person person);
	void update(Person person);
	void delete(Long id);
}
