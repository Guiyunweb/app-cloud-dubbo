package org.example.client.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.gateway.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myy on 2021/11/11.
 */
@RestController
public class EchoController {

    @DubboReference
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(String message) {
        return echoService.echo(message);
    }

    @GetMapping("*")
    public String Not() {
        return "404";
    }

}
