package com.uaf.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profStatus")
public class ProfStatus {
  @Id
  private String id;

  private EProfStatus name;

  public ProfStatus() {

  }

  public ProfStatus(EProfStatus name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EProfStatus getName() {
    return name;
  }

  public void setName(EProfStatus name) {
    this.name = name;
  }
}
