package com.base.admin.controller;

import com.base.security.config.IgnoreUrlsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Test")
public class TestController implements ApplicationListener {
    @Autowired
    public IgnoreUrlsConfig ignoreUrlsConfig;

    Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/enter")
    public String enter(){
        return "enter is here";
    }

    @ResponseBody
    @GetMapping(value = "/testUrls")
    public String testUrls() {
        StringBuffer s = new StringBuffer();
        for (String url : ignoreUrlsConfig.getUrls()) {
            s.append(url + "  |  ");
        }
        return s.toString();
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("TestController has been load");
    }
}
