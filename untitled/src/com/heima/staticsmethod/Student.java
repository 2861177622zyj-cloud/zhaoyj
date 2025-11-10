package com.heima.staticsmethod;

/**
 * ClassName: Student
 * Package: com.heima.staticsmethod
 */
public class Student {

    private double score;
    //静态方法
    public static  void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    //实例方法
    public void printPass(){
        System.out.println(score>=60?"通过":"未通过");
    }
    public void setScore(double score){
        this.score=score;
    }
}
