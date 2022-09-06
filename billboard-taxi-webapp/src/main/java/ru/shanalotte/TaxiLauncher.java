package ru.shanalotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TaxiLauncher {

  public static void main(String[] args) {
    SpringApplication.run(TaxiLauncher.class, args);
  }

}
