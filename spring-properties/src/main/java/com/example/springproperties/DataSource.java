package com.example.springproperties;

public class DataSource {

  private String url;
  private int port;

  public DataSource(final String url, final int port) {
    this.url = url;
    this.port = port;
  }

  public String getUrl() {
    return url;
  }

  public int getPort() {
    return port;
  }

  @Override
  public String toString() {
    return "DataSource{" +
           "url='" + url + '\'' +
           ", port=" + port +
           '}';
  }
}
