package diner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import diner.Application;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Application {

  public static void main(final String[] args) 
  {
    SpringApplication.run(Application.class, args);
  }

}