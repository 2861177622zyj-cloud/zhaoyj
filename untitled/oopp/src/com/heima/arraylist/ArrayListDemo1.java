package com.heima.arraylist;

import java.util.ArrayList;

/**
 * ClassName: ArrayList
 * Package: com.heima.arraylist
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建对象，代表集合容器
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        list.add("张三");
        list.add("张ss");
        list.add("java");
        list.add("sansa");
        list.add("lisi");
        list.add("li");
        list.add("1");
        System.out.println(list);

        //查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        //删除数据
        list.remove(0);
        System.out.println(list);
        //修改数据
        list.set(2,"张三");
        System.out.println(list);
    }
}
