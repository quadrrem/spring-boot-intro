package com.example.springfundamentals.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "service")
@Component
public class ServiceConfig {

  private String id;
  private String msg;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(final String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "ServiceConfig{" +
           "id='" + id + '\'' +
           ", msg='" + msg + '\'' +
           '}';
  }
}

