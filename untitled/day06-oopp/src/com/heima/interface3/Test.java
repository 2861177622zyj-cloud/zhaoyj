package com.heima.interface3;

/**
 * ClassName: Tset
 * Package: com.heima.interface3
 */
public class Test {
    public static void main(String[] args) {
        Student[] allStudent=new Student[10];
        allStudent[0]=new Student("张三",'男',100);
        allStudent[1]=new Student("李四",'女',90);
        allStudent[2]=new Student("王五",'男',80);
        allStudent[3]=new Student("赵六",'女',70);
        allStudent[4]=new Student("孙七",'男',60);
        allStudent[5]=new Student("周八",'女',50);
        allStudent[6]=new Student("吴九",'男',40);
        allStudent[7]=new Student("郑十",'女',30);
        allStudent[8]=new Student("王十一",'男',20);
        allStudent[9]=new Student("王十二",'女',10);


        ClassDataInter cadi=new ClassDataInterImpl2(allStudent);
        cadi.printAllStudentInfos();
        cadi.printAverageScore();


    }
}
