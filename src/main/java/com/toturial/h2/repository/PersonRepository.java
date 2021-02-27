package com.toturial.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.toturial.h2.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {}