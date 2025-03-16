package cn.tulingxueyuan.model;

import java.io.Serializable;

public class Order implements Serializable {

    /**
     * 主键
     * 测试git fetch命令，本行在远程仓库直接添加
     * 执行git fetch命令后，会把origin/master的更新拉取到本地，可以使用git checkout remotes/origin/master命令切换到本地的远程仓库分支查看更改，
     * 然后再在本地的master分支执行git merge remotes/origin/master命令，把远程仓库的更改合并到本地的master分支上
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
