package com.websocket.demo.service;


import com.websocket.demo.dto.Greeting;

public interface TestService {

  Greeting getGreeting(String name);
}
