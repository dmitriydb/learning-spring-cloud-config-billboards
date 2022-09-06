package shanalotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdsLauncher {

  public static void main(String[] args) {
    SpringApplication.run(AdsLauncher.class, args);
  }

}
