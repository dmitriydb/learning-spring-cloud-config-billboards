package ru.shanalotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BillboardsEurekaServer {

  public static void main(String[] args) {
    SpringApplication.run(BillboardsEurekaServer.class, args);
  }

}
