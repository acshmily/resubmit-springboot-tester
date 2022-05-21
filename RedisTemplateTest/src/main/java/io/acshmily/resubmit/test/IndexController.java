package io.acshmily.resubmit.test;

import io.github.acshmily.resubmit.announce.ReSubmit;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("")
@RestController
public class IndexController {
    @RequestMapping("")
    @ReSubmit(tts = 60L)
    public String hello(@RequestBody String s){
        redisTemplate.boundValueOps("test").set(s);
        return "hello";
    }
    @Resource
    private RedisTemplate<String,String> redisTemplate;
}
