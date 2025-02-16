package cn.tulingxueyuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/reduce")
    public String reduce(Integer goodsId){
        return "扣减商品["+goodsId+"]库存成功"+port;
    }
}
