package cn.tulingxueyuan.controller;

import cn.tulingxueyuan.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private int port;

    private String stockServiceUrl = "http://localhost:8010";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String addOrder(Long goodsId){
        try {
            // 注释
            URI uri = UriComponentsBuilder.fromHttpUrl(stockServiceUrl)
                    .path("/stock/reduce")
                    .queryParam("goodsId", goodsId)
                    .build()
                    .toUri();
            String result = restTemplate.getForObject(uri, String.class);
            return "下单成功" + port + "--" + result;
        } catch (RestClientException e) {
            return "下单失败，库存服务不可用";
        }
    }

    /**
     * 删除订单接口
     */
    @RequestMapping("/del")
    public String deleteOrder(Long orderId){
        return "删除订单"+orderId+"成功";
    }

    /**
     * 查询订单接口
     */
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
     * 订单列表接口2
     */
    @RequestMapping("/list")
    public List<Order> listOrder() {
        Order order = new Order();
        order.setId(1L);
        order.setNumber("25020001");
        order.setMoney(100d);
        List<Order> list = new ArrayList<>();
        list.add(order);
        return list;
    }

    /**
     * 测试方法
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
