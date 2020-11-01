package com.uaf.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "yesNo")
public class YesNo {
  @Id
  private String id;

  private EYesNo name;

  public YesNo() {

  }

  public YesNo(EYesNo name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EYesNo getName() {
    return name;
  }

  public void setName(EYesNo name) {
    this.name = name;
  }
}
