package org.apache.dubbo.springboot.demo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    @DubboReference
    private DemoService demoService;

    @Scheduled(cron="0/10 * * * * ?")
    public void consume() throws Exception {
        System.out.println("Dubbo远程调用，这里是Consumer");
        String response = demoService.sayHello("Consumer");
        System.out.println("收到provider的信息:" + response);
    }
}
