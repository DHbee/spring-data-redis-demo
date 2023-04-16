package com.dharbor.redis.springdataredisdemo.repository;

import com.dharbor.redis.springdataredisdemo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @Author: psaradhi
 * Created: 16-04-2023
 */

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {

    List<Person> findByContact(String contact);

    List<Person> findByContactAndFirstName(String contact, String firstName);

    List<Person> findByContactOrFirstName(String contact, String firstName);

}
