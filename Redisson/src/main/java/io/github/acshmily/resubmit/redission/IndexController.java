package io.github.acshmily.resubmit.redission;

import io.github.acshmily.resubmit.announce.ReSubmit;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class IndexController {
    @RequestMapping("")
    @ReSubmit(tts = 60L)
    public String hello(@RequestBody String s) {

        return s;
    }
}