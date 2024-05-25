package top.alexmmd.buzzchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BuzzChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuzzChatApplication.class, args);
    }

}
