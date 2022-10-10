package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

  private int instanceCount;

  public SetterInjectedGreetingService() {
    System.out.println("Setter " + ++this.instanceCount);
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - Setter";
  }

}
