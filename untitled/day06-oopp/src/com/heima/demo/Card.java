package com.heima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Card
 * Package: com.heima.demo
 */
@Data//添加getter和setter方法
@NoArgsConstructor//添加无参构造方法
@AllArgsConstructor//添加有参构造方法
public class Card {
    private String carTd;//卡号
    private String name;
    private String phone;
    private double money;//金额
    //预存
    public void deposit(double  money){
        this.money+=money;//添加金额

    }
    //消费
    public void consume(double money){
        this.money-=money;//减去金额
    }
}
