package com.websocket.demo.service.impl;

import com.websocket.demo.dto.Greeting;
import com.websocket.demo.repository.GreetingRepository;
import com.websocket.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

  @Autowired
  private GreetingRepository greetingRepository;



  @Override
  public Greeting getGreeting(String name){
    Greeting greeting =  new Greeting(name);
    return greetingRepository.save(greeting);
  }
}
