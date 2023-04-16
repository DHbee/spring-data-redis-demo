package com.dharbor.redis.springdataredisdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: psaradhi
 * Created: 16-04-2023
 */

@RedisHash("Person")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person{
    @Id
    String id;

    @Indexed
    String firstName;

    String lastName;

    @Indexed
    String contact;

    String email;
}
