package com.example.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {

  private String appName;
  private String appDescription;
  private String adminFirstName;
  private String adminLastName;
  private String adminEmail;

  public String getAppName() {
    return appName;
  }

  public void setAppName(final String appName) {
    this.appName = appName;
  }

  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(final String appDescription) {
    this.appDescription = appDescription;
  }

  public String getAdminFirstName() {
    return adminFirstName;
  }

  public void setAdminFirstName(final String adminFirstName) {
    this.adminFirstName = adminFirstName;
  }

  public String getAdminLastName() {
    return adminLastName;
  }

  public void setAdminLastName(final String adminLastName) {
    this.adminLastName = adminLastName;
  }

  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(final String adminEmail) {
    this.adminEmail = adminEmail;
  }

  @Override
  public String toString() {
    return "MyAppConfig{" +
           "appName='" + appName + '\'' +
           ", appDescription='" + appDescription + '\'' +
           ", adminFirstName='" + adminFirstName + '\'' +
           ", adminLastName='" + adminLastName + '\'' +
           ", adminEmail='" + adminEmail + '\'' +
           '}';
  }
}
