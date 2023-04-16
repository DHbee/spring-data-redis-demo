package com.dharbor.redis.springdataredisdemo.controller;

import com.dharbor.redis.springdataredisdemo.model.Person;
import com.dharbor.redis.springdataredisdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 16-04-2023
 */

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.GET, value="fetch")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @RequestMapping(method = RequestMethod.GET, value="byContact/{contact}")
    public List<Person> getPersonByContact(@PathVariable("contact") String contact){
        return personService.getPersonByContact(contact);
    }

    @RequestMapping(method = RequestMethod.GET, value="byContactAndFirstName/{contact}/{firstName}")
    public List<Person> getPersonByContactAndFirstName(@PathVariable("contact") String contact,
                                           @PathVariable("firstName") String firstName){
        return personService.getPersonByContactWithFirstName(contact, firstName);
    }

    @RequestMapping(method = RequestMethod.GET, value="byContactOrFirstName/{contact}/{firstName}")
    public List<Person> getPersonByContactOrFirstName(@PathVariable("contact") String contact,
                                           @PathVariable("firstName") String firstName){
        return personService.getPersonByContactOrFirstName(contact, firstName);
    }
}
