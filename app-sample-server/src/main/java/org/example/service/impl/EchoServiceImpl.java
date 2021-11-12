package org.example.service.impl;


import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.example.gateway.service.EchoService;

/**
 * Created by myy on 2021/11/11.
 */
@DubboService
@DubboComponentScan
public class EchoServiceImpl implements EchoService {


    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}
