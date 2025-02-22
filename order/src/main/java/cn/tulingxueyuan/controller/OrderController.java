package cn.tulingxueyuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String addOrder(){
        String result = restTemplate.getForObject("http://localhost:8010/stock/reduce", String.class);
        return "下单成功" + port + "--" + result;
    }

    @RequestMapping("/get")
    public String getOrder(long orderId){
        StringBuilder json = new StringBuilder();
        json.append("{")
                .append("\"orderId\"").append(":").append(orderId).append(",")
                .append("\"number\"").append(":").append("202502180001").append(",")
                .append("\"money\"").append(":").append("100.0")
                .append("}");
        return json.toString();
    }

    /**
     * 测试方法
     * @return
     */
    public String test(){
        return "success";
    }
}
