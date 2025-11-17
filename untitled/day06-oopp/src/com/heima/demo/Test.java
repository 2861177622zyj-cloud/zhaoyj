package com.heima.demo;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.heima.demo
 */
public class Test {
    public static void main(String[] args) {
       GoldCard goldCard = new GoldCard("豫R23456","张三","1234561",5000);
       pay(goldCard);
       SilverCard silverCard = new SilverCard("豫R34455","张12三","123456",5000);
        pay(silverCard);
    }
        public static void pay(Card c){
            System.out.println("请刷卡,输入消费金额");
            Scanner sc =new Scanner(System.in);//创建Scanner
            double money = sc.nextDouble();//输入金额
            c.consume(money);
        }


}
