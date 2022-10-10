package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {

    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
    MyController myController = (MyController) ctx.getBean("myController");

    System.out.println("-------------- No Injection ----------------------");
    String greeting = myController.sayHello();
    System.out.println(greeting);

    System.out.println("-------------- Property Injection ----------------------");
    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean(
        "propertyInjectedController");
    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("-------------- Setter Injection ----------------------");
    SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(
        "setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());

    System.out.println("-------------- Constructor Injection ----------------------");
    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(
        "constructorInjectedController");
    System.out.println(constructorInjectedController.getGreeting());

    System.out.println("-------------- I18n Injection ----------------------");
    I18nController i18nController = (I18nController) ctx.getBean("i18nController");
    System.out.println(i18nController.sayHello());
  }

}
