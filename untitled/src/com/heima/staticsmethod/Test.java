package com.heima.staticsmethod;

/**
 * ClassName: Test
 * Package: com.heima.staticsmethod
 */
public class Test {
    public static void main(String[] args) {
        //静态方法
        Student.printHelloWorld();
        //实例方法
        Student s1=new Student();
        s1.setScore(59);
        s1.printPass();

    }
}
