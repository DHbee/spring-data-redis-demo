package com.dharbor.redis.springdataredisdemo.service;

import com.dharbor.redis.springdataredisdemo.model.Person;
import com.dharbor.redis.springdataredisdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 16-04-2023
 */

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
    }

    public List<Person> getPersonByContact(String contact){
        return personRepository.findByContact(contact);
    }

    public List<Person> getPersonByContactWithFirstName(String contact, String firstName){
        return personRepository.findByContactAndFirstName(contact, firstName);
    }

    public List<Person> getPersonByContactOrFirstName(String contact, String firstName){
        return personRepository.findByContactOrFirstName(contact, firstName);
    }
}
