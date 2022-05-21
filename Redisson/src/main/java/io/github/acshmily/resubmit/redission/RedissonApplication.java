package io.github.acshmily.resubmit.redission;

import io.github.acshmily.resubmit.announce.EnableRedissonReSubmit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedissonReSubmit
public class RedissonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedissonApplication.class, args);
    }

}
