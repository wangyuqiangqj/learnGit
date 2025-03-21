package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.model.Order;
import cn.tulingxueyuan.service.OrderService;

public class OrderServiceImpl implements OrderService {
    
    @Override
    public void add(Order order) {
        System.out.println("保存订单：" + order.getNumber());
    }

    @Override
    public void del(Long orderId) {
        System.out.println("删除单据："+orderId);
    }

    @Override
    public Order get(Long orderId) {
        if (null==orderId){
            return null;
        }
        Order order = new Order();
        order.setId(orderId);
        order.setNumber("25020001");
        order.setMoney(100d);
        return order;
    }
}
