package com.uaf.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "status")
public class Status {
  @Id
  private String id;

  private EStatus name;

  public Status() {

  }

  public Status(EStatus name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EStatus getName() {
    return name;
  }

  public void setName(EStatus name) {
    this.name = name;
  }
}
