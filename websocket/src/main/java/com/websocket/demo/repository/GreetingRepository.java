package com.websocket.demo.repository;

import com.websocket.demo.dto.Greeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends MongoRepository<Greeting, String> {

  Greeting findByContent(String name);

}
