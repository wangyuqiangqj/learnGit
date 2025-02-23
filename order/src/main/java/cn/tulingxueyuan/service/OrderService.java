package cn.tulingxueyuan.service;

import cn.tulingxueyuan.model.Order;

public interface OrderService {

    void add(Order order);

    void del(Long orderId);

    Order get(Long orderId);
}
