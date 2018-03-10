package com.example.springfundamentals.service;

import com.example.springfundamentals.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundamentalsService {

  private final ServiceConfig serviceConfig;

  @Autowired
  public FundamentalsService(final ServiceConfig serviceConfig) {
    this.serviceConfig = serviceConfig;
  }

  public String getId() {
    return serviceConfig.getId();
  }

  public String getMessage() {
    return serviceConfig.getMsg();
  }
}
