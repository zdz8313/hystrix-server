package com.oracle.hrb.hystrixserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示熔断器 Hystrix  视频在spring cloud 4.1
 */
@RestController
public class HystrixContoller {

    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }
    @GetMapping("/error")
    public String error() throws InterruptedException {
        //休眠10秒
        Thread.sleep(10000);
        return "error";
    }
}
