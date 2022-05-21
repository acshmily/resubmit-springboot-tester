package io.github.acshmily.resubumit.cachetemplatetest;

import io.acshmily.cachetemplate.client.announce.EnableCacheTemplate;
import io.github.acshmily.resubmit.announce.EnableCacheTemplateReSubmit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCacheTemplate
@EnableCacheTemplateReSubmit
public class CacheTemplateTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheTemplateTestApplication.class, args);
    }

}
