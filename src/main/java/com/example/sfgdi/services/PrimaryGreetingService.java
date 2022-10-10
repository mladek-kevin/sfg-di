package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  private int instanceCount;

  public PrimaryGreetingService() {
    System.out.println("Primary " + ++this.instanceCount);
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - Primary";
  }

}
