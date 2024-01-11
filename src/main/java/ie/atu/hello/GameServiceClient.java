package ie.atu.hello;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@FeignClient(name = "games-service", url = "${feign.url}")
public interface GameServiceClient {


    @PostMapping("/Game")
    String someGame(@RequestBody Games games);
}
