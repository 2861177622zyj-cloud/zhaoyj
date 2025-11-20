package com.heima.demo;

/**
 * ClassName: SilverCard
 * Package: com.heima.demo
 */
public class SilverCard extends Card{
    public SilverCard(String card,String name, String phone, double money) {
        super(card, name, phone, money); // 调用父类构造函数
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格为" + money * 0.9);
        //更新银卡的余额
        if(getMoney()<money*0.9){
            System.out.println("您余额是"+getMoney()+"余额不足请充钱");
            return;
        }
        setMoney(getMoney() - money * 0.9);

    }
}
