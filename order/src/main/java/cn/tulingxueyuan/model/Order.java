package cn.tulingxueyuan.model;

import java.io.Serializable;

public class Order implements Serializable {

    /**
     * 主键
     * 测试git fetch命令，本行在远程仓库直接添加
     */
    private Long id;
    /**
     * 单号
     */
    private String number;
    /**
     * 订单金额
     */
    private Double money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
