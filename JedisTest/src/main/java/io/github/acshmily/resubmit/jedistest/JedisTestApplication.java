package io.github.acshmily.resubmit.jedistest;

import io.github.acshmily.resubmit.announce.EnableJedisReSubmit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJedisReSubmit
public class JedisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JedisTestApplication.class, args);
    }

}
