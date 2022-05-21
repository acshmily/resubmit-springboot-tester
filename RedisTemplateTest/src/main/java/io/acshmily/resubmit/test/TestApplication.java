package io.acshmily.resubmit.test;

import io.github.acshmily.resubmit.announce.EnableRedisTemplateReSubmit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisTemplateReSubmit
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
