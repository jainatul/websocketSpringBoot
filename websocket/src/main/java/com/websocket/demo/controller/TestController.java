package com.websocket.demo.controller;

import com.websocket.demo.dto.Greeting;
import com.websocket.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  private TestService testService;

  @GetMapping(value = "/check")
  public Greeting greeting(@RequestParam String name) {
    return testService.getGreeting(name);
  }
}
