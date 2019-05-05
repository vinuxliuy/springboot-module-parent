package com.example.demo.controller;

import com.example.demo.service.DemoService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：${DESCRITION}
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-02-24:16:50
 */
@Api(description = "Demo样例")
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private DemoService demoService;

    @GetMapping("/sayHi")
    public String sayHi(){
        logger.error("demo sayHi..................");
        return demoService.sayHi();
    }
}
