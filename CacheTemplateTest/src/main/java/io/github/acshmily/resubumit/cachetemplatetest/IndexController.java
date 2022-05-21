package io.github.acshmily.resubumit.cachetemplatetest;

import io.acshmily.cachetemplate.client.service.CacheTemplate;
import io.github.acshmily.resubmit.announce.ReSubmit;
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

        return "hello";
    }
    @Resource
    private CacheTemplate cacheTemplate;

}
