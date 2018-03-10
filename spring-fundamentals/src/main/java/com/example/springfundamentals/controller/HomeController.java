package com.example.springfundamentals.controller;

import com.example.springfundamentals.service.FundamentalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final FundamentalsService service;

  @Value("${controller.msg}")
  private String controllerMsg;

  @Autowired
  public HomeController(final FundamentalsService service) {
    this.service = service;
  }


  @RequestMapping("/")
  public String home() {
    return controllerMsg;
  }

  @RequestMapping("/service")
  public String service() {
    return String.format("Message: %s<br/>From: %s", service.getMessage(), service.getId());
  }
}
