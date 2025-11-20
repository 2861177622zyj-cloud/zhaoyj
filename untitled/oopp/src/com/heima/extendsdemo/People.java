package com.heima.extendsdemo;

/**
 * ClassName: People
 * Package: com.heima.extendsdemo
 */
//父类
    //继承的好处：代码复用
public class People {
    private String name;
    private String sex;
    //父类
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
