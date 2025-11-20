package com.heima.demo1exception;

/**
 * ClassName: ExceptionDemo3
 * Package: com.heima.demo1exception
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        try {
            saveAge(1112);
        } catch (ItAgellegaException e) {
            e.printStackTrace();
            System.out.println("失败了");
        }
        System.out.println("程序结束。。。");
    }

    public static void saveAge(int age) throws ItAgellegaException {
        if (age < 1 || age > 100) {
            throw new ItAgellegaException("年龄非法");
        } else {
            System.out.println("年龄合法");
            System.out.println("保存年龄" + age);
        }

    }
}
