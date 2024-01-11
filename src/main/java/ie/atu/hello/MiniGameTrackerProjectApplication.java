package ie.atu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MiniGameTrackerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniGameTrackerProjectApplication.class, args);
    }

}
