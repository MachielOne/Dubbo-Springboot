package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoService;
@DubboService
public class ProviderService implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("Dubbo远程调用，这里是Provider");
        return "Hello," + name;
    }
}
