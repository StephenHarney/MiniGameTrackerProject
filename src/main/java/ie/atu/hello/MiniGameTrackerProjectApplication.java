package ie.atu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MiniGameTrackerProject1Application {


    public static void main(String[] args) {
        SpringApplication.run(MiniGameTrackerProject1Application.class, args);
    }

}
