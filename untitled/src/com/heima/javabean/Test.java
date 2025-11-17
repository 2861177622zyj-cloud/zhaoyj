package com.heima.javabean;

/**
 * ClassName: Test
 * Package: com.heima.javabean
 */
public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setSex('男');
        s1.setChinese(80);
        s1.setMath(90);

        System.out.print(s1.getName());
        System.out.print(s1.getAge());
        System.out.print(s1.getSex());
        System.out.print(s1.getChinese());
        System.out.print(s1.getMath());

        Student s2=new Student("王五", 19, '女',20,30);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());



        StudentSOperator operator =new StudentSOperator(s1);
        operator .printTotalScore();
        operator .printAverageScore();

    }
}
