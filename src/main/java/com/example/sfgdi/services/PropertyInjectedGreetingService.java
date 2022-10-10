package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

  private int instanceCount;

  public PropertyInjectedGreetingService() {
    System.out.println("Property " + ++this.instanceCount);
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - Property";
  }

}
