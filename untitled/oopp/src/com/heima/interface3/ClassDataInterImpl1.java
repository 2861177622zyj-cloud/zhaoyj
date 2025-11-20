package com.heima.interface3;

/**
 * ClassName: ClassDataInterImpl1
 * Package: com.heima.interface3
 */
public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;//存储送进来的所有学生信息
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        for(int i=0;i<students.length;i++){
            Student s=students[i];
            System.out.println("姓名："+s.getName()+"，性别" + "："+s.getSex()+"，成绩："+s.getScore());

        }
    }

    @Override
    public void printAverageScore() {
        double sum=0;
        for(int i=0;i<students.length;i++){
            Student s=students[i];
            sum+=s.getScore();
        }
        System.out.println("全班平均成绩为："+sum/students.length);

    }
}
