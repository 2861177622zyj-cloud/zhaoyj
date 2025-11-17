package com.heima.javabean;

/**
 * ClassName: Student
 * Package: com.heima.javabean
 */
public class Student {
    private String name;
    private int age;
    private char sex;

    private int Chinese;
    private int Math;

    public Student() {
    }

    public Student(String name, int age, char sex, int chinese, int math) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        Chinese = chinese;
        Math = math;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getChinese() {
        return Chinese;
    }
    public void setChinese(int chinese) {
        Chinese = chinese;
    }
    public int getMath() {
        return Math;
    }
    public void setMath(int math) {
        Math = math;
    }
}
