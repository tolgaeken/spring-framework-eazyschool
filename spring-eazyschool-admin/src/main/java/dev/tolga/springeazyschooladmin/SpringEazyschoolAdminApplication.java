package dev.tolga.springeazyschooladmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringEazyschoolAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEazyschoolAdminApplication.class, args);
    }

}
