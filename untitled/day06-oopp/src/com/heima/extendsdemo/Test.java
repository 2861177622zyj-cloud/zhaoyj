package com.heima.extendsdemo;

/**
 * ClassName: Test
 * Package: com.heima.extendsdemo
 */
public class Test {
    public static void main(String[] args) {
        //创建对象,封装
        Teacher t=new Teacher();
        t.setName("张三");
        t.setSex("男");
        t.setSkill(" teach");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}
