package com.heima.demo1exception;

import java.util.Scanner;

/**
 * ClassName: ExceptionDemo4
 * Package: com.heima.demo1exception
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");

        double price = 0;
        while (true) {
            try {
                price = userInputPrice();
                System.out.println("价格是：" + price);
                break;
            } catch (Exception e) {
                System.out.println("失败了");
            }
        }
        System.out.println("程序结束。。。");
    }


    public static double userInputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        return price;
    }
}
