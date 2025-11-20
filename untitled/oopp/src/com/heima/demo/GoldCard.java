package com.heima.demo;

/**
 * ClassName: GoldCard
 * Package: com.heima.demo
 */
public class GoldCard extends  Card{
    public GoldCard(String card, String name, String phone, double money) {
        super(card, name, phone, money); // 调用父类构造函数
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费："+money);
        System.out.println("优惠后的价格为"+money*0.8);
        if(getMoney()<money*0.8){
            System.out.println("您余额是"+getMoney()+"余额不足请充钱");
            return;
        }
        setMoney(getMoney()-money*0.8);        //更新金卡的余额

        //判断消费如果大于200，调用独有功能打印洗车票
        if (money*0.8>=200){
            printTicket();
        }
        else {
            System.out.println("没有达到消费200，没有打印洗车票");
        }
    }

    public void printTicket(){
        System.out.println("打印洗车票");
    }

}
