package dev.tolga.springeazyschoolrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "dev.tolga.springeazyschoolrest.proxy")
public class SpringEazyschoolRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEazyschoolRestApplication.class, args);
    }

}
