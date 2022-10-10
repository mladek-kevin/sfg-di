package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

  private int instanceCount;

  public ConstructorGreetingService() {
    System.out.println("Constructor " + ++this.instanceCount);
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }

}
