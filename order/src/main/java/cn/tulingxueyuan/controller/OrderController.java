package cn.tulingxueyuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/add")
    public String addOrder(){
        return "下单成功" + port;
    }
}
