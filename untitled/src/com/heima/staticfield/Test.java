package com.heima.staticfield;

/**
 * ClassName: Test
 * Package: com.heima.staticfield
 */
public class Test {
    public static void main(String[] args) {
       Student.name="张三";
        System.out.println(Student.name);
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.getCount());
    }
}
